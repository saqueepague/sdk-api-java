package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaProdutosRecargaRespProducts;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações da resposta da requisição de consulta de produtos disponíveis de recarga para o cartão informado pelo cliente.
 */
@ApiModel(description = "Informações da resposta da requisição de consulta de produtos disponíveis de recarga para o cartão informado pelo cliente.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-26T17:53:50.941Z[GMT]")
public class InfConsultaProdutosRecargaResp   {
  @JsonProperty("products")
  @Valid
  private List<InfConsultaProdutosRecargaRespProducts> products = new ArrayList<InfConsultaProdutosRecargaRespProducts>();

  public InfConsultaProdutosRecargaResp products(List<InfConsultaProdutosRecargaRespProducts> products) {
    this.products = products;
    return this;
  }

  public InfConsultaProdutosRecargaResp addProductsItem(InfConsultaProdutosRecargaRespProducts productsItem) {
    this.products.add(productsItem);
    return this;
  }

  /**
   * Identificador e nomes dos produtos disponíveis para o cartão.
   * @return products
  **/
  @ApiModelProperty(required = true, value = "Identificador e nomes dos produtos disponíveis para o cartão.")
  @NotNull
  @Valid
  public List<InfConsultaProdutosRecargaRespProducts> getProducts() {
    return products;
  }

  public void setProducts(List<InfConsultaProdutosRecargaRespProducts> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaProdutosRecargaResp infConsultaProdutosRecargaResp = (InfConsultaProdutosRecargaResp) o;
    return Objects.equals(this.products, infConsultaProdutosRecargaResp.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaProdutosRecargaResp {\n");
    
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

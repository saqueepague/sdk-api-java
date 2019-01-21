package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaTitulosCapitalizacaoRespProdutos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações da requisição de consulta de produtos de título de capitalização.
 */
@ApiModel(description = "Informações da requisição de consulta de produtos de título de capitalização.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfConsultaTitulosCapitalizacaoResp   {
  @JsonProperty("produtos")
  @Valid
  private List<InfConsultaTitulosCapitalizacaoRespProdutos> produtos = null;

  public InfConsultaTitulosCapitalizacaoResp produtos(List<InfConsultaTitulosCapitalizacaoRespProdutos> produtos) {
    this.produtos = produtos;
    return this;
  }

  public InfConsultaTitulosCapitalizacaoResp addProdutosItem(InfConsultaTitulosCapitalizacaoRespProdutos produtosItem) {
    if (this.produtos == null) {
      this.produtos = new ArrayList<InfConsultaTitulosCapitalizacaoRespProdutos>();
    }
    this.produtos.add(produtosItem);
    return this;
  }

  /**
   * Produtos de título de capitalização disponíveis.
   * @return produtos
  **/
  @ApiModelProperty(value = "Produtos de título de capitalização disponíveis.")

  @Valid

  public List<InfConsultaTitulosCapitalizacaoRespProdutos> getProdutos() {
    return produtos;
  }

  public void setProdutos(List<InfConsultaTitulosCapitalizacaoRespProdutos> produtos) {
    this.produtos = produtos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaTitulosCapitalizacaoResp infConsultaTitulosCapitalizacaoResp = (InfConsultaTitulosCapitalizacaoResp) o;
    return Objects.equals(this.produtos, infConsultaTitulosCapitalizacaoResp.produtos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(produtos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaTitulosCapitalizacaoResp {\n");
    
    sb.append("    produtos: ").append(toIndentedString(produtos)).append("\n");
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


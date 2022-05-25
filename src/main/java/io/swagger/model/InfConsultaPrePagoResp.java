package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaPrePagoRespProdutos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações de retorno da consulta de produtos para recarga de pré-pago.
 */
@ApiModel(description = "Informações de retorno da consulta de produtos para recarga de pré-pago.")
@Validated
public class InfConsultaPrePagoResp   {
  @JsonProperty("produtos")
  @Valid
  private List<InfConsultaPrePagoRespProdutos> produtos = new ArrayList<InfConsultaPrePagoRespProdutos>();

  public InfConsultaPrePagoResp produtos(List<InfConsultaPrePagoRespProdutos> produtos) {
    this.produtos = produtos;
    return this;
  }

  public InfConsultaPrePagoResp addProdutosItem(InfConsultaPrePagoRespProdutos produtosItem) {
    this.produtos.add(produtosItem);
    return this;
  }

  /**
   * Lista de produtos de recarga pré-pago disponíveis para a área/DDD.
   * @return produtos
  **/
  @ApiModelProperty(required = true, value = "Lista de produtos de recarga pré-pago disponíveis para a área/DDD.")
  @NotNull
  @Valid
  public List<InfConsultaPrePagoRespProdutos> getProdutos() {
    return produtos;
  }

  public void setProdutos(List<InfConsultaPrePagoRespProdutos> produtos) {
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
    InfConsultaPrePagoResp infConsultaPrePagoResp = (InfConsultaPrePagoResp) o;
    return Objects.equals(this.produtos, infConsultaPrePagoResp.produtos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(produtos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPrePagoResp {\n");
    
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

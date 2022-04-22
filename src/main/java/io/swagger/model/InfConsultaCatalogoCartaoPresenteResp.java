package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaCatalogoCartaoPresenteRespProdutos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações da resposta da requisição de consulta de produtos disponíveis para a compra de Cartão presente.
 */
@ApiModel(description = "Informações da resposta da requisição de consulta de produtos disponíveis para a compra de Cartão presente.")
@Validated
public class InfConsultaCatalogoCartaoPresenteResp   {
  @JsonProperty("produtos")
  @Valid
  private List<InfConsultaCatalogoCartaoPresenteRespProdutos> produtos = new ArrayList<InfConsultaCatalogoCartaoPresenteRespProdutos>();

  public InfConsultaCatalogoCartaoPresenteResp produtos(List<InfConsultaCatalogoCartaoPresenteRespProdutos> produtos) {
    this.produtos = produtos;
    return this;
  }

  public InfConsultaCatalogoCartaoPresenteResp addProdutosItem(InfConsultaCatalogoCartaoPresenteRespProdutos produtosItem) {
    this.produtos.add(produtosItem);
    return this;
  }

  /**
   * Identificador e nomes dos produtos disponíveis.
   * @return produtos
  **/
  @ApiModelProperty(required = true, value = "Identificador e nomes dos produtos disponíveis.")
  @NotNull
  @Valid
  public List<InfConsultaCatalogoCartaoPresenteRespProdutos> getProdutos() {
    return produtos;
  }

  public void setProdutos(List<InfConsultaCatalogoCartaoPresenteRespProdutos> produtos) {
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
    InfConsultaCatalogoCartaoPresenteResp infConsultaCatalogoCartaoPresenteResp = (InfConsultaCatalogoCartaoPresenteResp) o;
    return Objects.equals(this.produtos, infConsultaCatalogoCartaoPresenteResp.produtos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(produtos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaCatalogoCartaoPresenteResp {\n");
    
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

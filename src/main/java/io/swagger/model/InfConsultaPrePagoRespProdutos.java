package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InfConsultaPrePagoRespProdutos
 */
@Validated
public class InfConsultaPrePagoRespProdutos   {
  @JsonProperty("nomeOperadora")
  private String nomeOperadora = null;

  @JsonProperty("valorMinimo")
  private String valorMinimo = null;

  @JsonProperty("valorMaximo")
  private String valorMaximo = null;

  @JsonProperty("idProduto")
  private String idProduto = null;

  public InfConsultaPrePagoRespProdutos nomeOperadora(String nomeOperadora) {
    this.nomeOperadora = nomeOperadora;
    return this;
  }

  /**
   * Nome da operadora de telefonia.
   * @return nomeOperadora
  **/
  @ApiModelProperty(example = "CLARO", value = "Nome da operadora de telefonia.")

@Pattern(regexp="^.+$")   public String getNomeOperadora() {
    return nomeOperadora;
  }

  public void setNomeOperadora(String nomeOperadora) {
    this.nomeOperadora = nomeOperadora;
  }

  public InfConsultaPrePagoRespProdutos valorMinimo(String valorMinimo) {
    this.valorMinimo = valorMinimo;
    return this;
  }

  /**
   * Valor mínimo de recarga para este produto, expresso em centavos.
   * @return valorMinimo
  **/
  @ApiModelProperty(example = "1000", value = "Valor mínimo de recarga para este produto, expresso em centavos.")

@Pattern(regexp="^\\d{3}\\d*$")   public String getValorMinimo() {
    return valorMinimo;
  }

  public void setValorMinimo(String valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  public InfConsultaPrePagoRespProdutos valorMaximo(String valorMaximo) {
    this.valorMaximo = valorMaximo;
    return this;
  }

  /**
   * Valor máximo de recarga para este produto, expresso em centavos.
   * @return valorMaximo
  **/
  @ApiModelProperty(example = "1500", value = "Valor máximo de recarga para este produto, expresso em centavos.")

@Pattern(regexp="^\\d{3}\\d*$")   public String getValorMaximo() {
    return valorMaximo;
  }

  public void setValorMaximo(String valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  public InfConsultaPrePagoRespProdutos idProduto(String idProduto) {
    this.idProduto = idProduto;
    return this;
  }

  /**
   * Código que identifica o produto de recarga da operadora de telefonia.
   * @return idProduto
  **/
  @ApiModelProperty(example = "CLARO", value = "Código que identifica o produto de recarga da operadora de telefonia.")

@Pattern(regexp="^.+$")   public String getIdProduto() {
    return idProduto;
  }

  public void setIdProduto(String idProduto) {
    this.idProduto = idProduto;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaPrePagoRespProdutos infConsultaPrePagoRespProdutos = (InfConsultaPrePagoRespProdutos) o;
    return Objects.equals(this.nomeOperadora, infConsultaPrePagoRespProdutos.nomeOperadora) &&
        Objects.equals(this.valorMinimo, infConsultaPrePagoRespProdutos.valorMinimo) &&
        Objects.equals(this.valorMaximo, infConsultaPrePagoRespProdutos.valorMaximo) &&
        Objects.equals(this.idProduto, infConsultaPrePagoRespProdutos.idProduto);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeOperadora, valorMinimo, valorMaximo, idProduto);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPrePagoRespProdutos {\n");
    
    sb.append("    nomeOperadora: ").append(toIndentedString(nomeOperadora)).append("\n");
    sb.append("    valorMinimo: ").append(toIndentedString(valorMinimo)).append("\n");
    sb.append("    valorMaximo: ").append(toIndentedString(valorMaximo)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
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

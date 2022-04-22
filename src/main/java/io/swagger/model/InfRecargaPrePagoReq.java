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
 * Informações da requisição de recarga de celular Pré-Pago.
 */
@ApiModel(description = "Informações da requisição de recarga de celular Pré-Pago.")
@Validated
public class InfRecargaPrePagoReq   {
  @JsonProperty("nomeOperadora")
  private String nomeOperadora = null;

  @JsonProperty("valorRecarga")
  private String valorRecarga = null;

  @JsonProperty("ddd")
  private String ddd = null;

  @JsonProperty("telefone")
  private String telefone = null;

  public InfRecargaPrePagoReq nomeOperadora(String nomeOperadora) {
    this.nomeOperadora = nomeOperadora;
    return this;
  }

  /**
   * Nome da operadora de telefonia para recarga.
   * @return nomeOperadora
  **/
  @ApiModelProperty(example = "CLARO", required = true, value = "Nome da operadora de telefonia para recarga.")
  @NotNull

@Pattern(regexp="^.*$")   public String getNomeOperadora() {
    return nomeOperadora;
  }

  public void setNomeOperadora(String nomeOperadora) {
    this.nomeOperadora = nomeOperadora;
  }

  public InfRecargaPrePagoReq valorRecarga(String valorRecarga) {
    this.valorRecarga = valorRecarga;
    return this;
  }

  /**
   * Valor de recarga a ser solicitado para operadora de telefonia.
   * @return valorRecarga
  **/
  @ApiModelProperty(example = "000000005000", required = true, value = "Valor de recarga a ser solicitado para operadora de telefonia.")
  @NotNull

@Pattern(regexp="^\\d{12}$")   public String getValorRecarga() {
    return valorRecarga;
  }

  public void setValorRecarga(String valorRecarga) {
    this.valorRecarga = valorRecarga;
  }

  public InfRecargaPrePagoReq ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }

  /**
   * Código da área do telefone favorecido.
   * @return ddd
  **/
  @ApiModelProperty(example = "51", required = true, value = "Código da área do telefone favorecido.")
  @NotNull

@Pattern(regexp="^\\d{2}$")   public String getDdd() {
    return ddd;
  }

  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  public InfRecargaPrePagoReq telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }

  /**
   * número do telefone, sem DDD, favorecido da operação de recarga.
   * @return telefone
  **/
  @ApiModelProperty(example = "982041311", required = true, value = "número do telefone, sem DDD, favorecido da operação de recarga.")
  @NotNull

@Pattern(regexp="^\\d+$")   public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfRecargaPrePagoReq infRecargaPrePagoReq = (InfRecargaPrePagoReq) o;
    return Objects.equals(this.nomeOperadora, infRecargaPrePagoReq.nomeOperadora) &&
        Objects.equals(this.valorRecarga, infRecargaPrePagoReq.valorRecarga) &&
        Objects.equals(this.ddd, infRecargaPrePagoReq.ddd) &&
        Objects.equals(this.telefone, infRecargaPrePagoReq.telefone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeOperadora, valorRecarga, ddd, telefone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfRecargaPrePagoReq {\n");
    
    sb.append("    nomeOperadora: ").append(toIndentedString(nomeOperadora)).append("\n");
    sb.append("    valorRecarga: ").append(toIndentedString(valorRecarga)).append("\n");
    sb.append("    ddd: ").append(toIndentedString(ddd)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
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

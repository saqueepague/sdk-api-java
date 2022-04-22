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
 * Informações da requisição de consulta de produtos de recarga de celular Pré-Pago.
 */
@ApiModel(description = "Informações da requisição de consulta de produtos de recarga de celular Pré-Pago.")
@Validated
public class InfConsultaCatalogoCartaoPresenteReq   {
  @JsonProperty("ddd")
  private String ddd = null;

  @JsonProperty("telefone")
  private String telefone = null;

  @JsonProperty("cpf")
  private String cpf = null;

  public InfConsultaCatalogoCartaoPresenteReq ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }

  /**
   * Código da área do número de celular.
   * @return ddd
  **/
  @ApiModelProperty(example = "51", value = "Código da área do número de celular.")

@Pattern(regexp="^\\d{2}$")   public String getDdd() {
    return ddd;
  }

  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  public InfConsultaCatalogoCartaoPresenteReq telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }

  /**
   * número do telefone sem DDD.
   * @return telefone
  **/
  @ApiModelProperty(example = "982041311", value = "número do telefone sem DDD.")

@Pattern(regexp="^\\d+$")   public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public InfConsultaCatalogoCartaoPresenteReq cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * número de cpf do comprador. (11 dígitos)
   * @return cpf
  **/
  @ApiModelProperty(example = "12345678901", value = "número de cpf do comprador. (11 dígitos)")

@Pattern(regexp="^\\d{11}$")   public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaCatalogoCartaoPresenteReq infConsultaCatalogoCartaoPresenteReq = (InfConsultaCatalogoCartaoPresenteReq) o;
    return Objects.equals(this.ddd, infConsultaCatalogoCartaoPresenteReq.ddd) &&
        Objects.equals(this.telefone, infConsultaCatalogoCartaoPresenteReq.telefone) &&
        Objects.equals(this.cpf, infConsultaCatalogoCartaoPresenteReq.cpf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddd, telefone, cpf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaCatalogoCartaoPresenteReq {\n");
    
    sb.append("    ddd: ").append(toIndentedString(ddd)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
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

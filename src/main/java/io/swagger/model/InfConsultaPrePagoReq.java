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
 * Informações da requisição de consulta de produtos de recarga de celular pré-pago.
 */
@ApiModel(description = "Informações da requisição de consulta de produtos de recarga de celular pré-pago.")
@Validated
public class InfConsultaPrePagoReq   {
  @JsonProperty("ddd")
  private String ddd = null;

  @JsonProperty("telefone")
  private String telefone = null;

  public InfConsultaPrePagoReq ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }

  /**
   * Código da área do número de celular.
   * @return ddd
  **/
  @ApiModelProperty(example = "51", required = true, value = "Código da área do número de celular.")
  @NotNull

@Pattern(regexp="^\\d{2}$")   public String getDdd() {
    return ddd;
  }

  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  public InfConsultaPrePagoReq telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }

  /**
   * Número do telefone sem DDD.
   * @return telefone
  **/
  @ApiModelProperty(example = "982041311", value = "Número do telefone sem DDD.")

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
    InfConsultaPrePagoReq infConsultaPrePagoReq = (InfConsultaPrePagoReq) o;
    return Objects.equals(this.ddd, infConsultaPrePagoReq.ddd) &&
        Objects.equals(this.telefone, infConsultaPrePagoReq.telefone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(ddd, telefone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPrePagoReq {\n");
    
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

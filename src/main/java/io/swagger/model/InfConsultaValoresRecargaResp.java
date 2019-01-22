package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaValoresRecargaRespValores;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações da resposta de consulta de todos os possíveis produtos e valores de recarga de cartão de transporte ou pré-pago na rede. Traz uma lista de todos os produtos e seus valores para depois serem filtrados pelo cartão do usuário.
 */
@ApiModel(description = "Informações da resposta de consulta de todos os possíveis produtos e valores de recarga de cartão de transporte ou pré-pago na rede. Traz uma lista de todos os produtos e seus valores para depois serem filtrados pelo cartão do usuário.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

public class InfConsultaValoresRecargaResp   {
  @JsonProperty("valores")
  private InfConsultaValoresRecargaRespValores valores = null;

  public InfConsultaValoresRecargaResp valores(InfConsultaValoresRecargaRespValores valores) {
    this.valores = valores;
    return this;
  }

  /**
   * Get valores
   * @return valores
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public InfConsultaValoresRecargaRespValores getValores() {
    return valores;
  }

  public void setValores(InfConsultaValoresRecargaRespValores valores) {
    this.valores = valores;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaValoresRecargaResp infConsultaValoresRecargaResp = (InfConsultaValoresRecargaResp) o;
    return Objects.equals(this.valores, infConsultaValoresRecargaResp.valores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaValoresRecargaResp {\n");
    
    sb.append("    valores: ").append(toIndentedString(valores)).append("\n");
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


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaPrePagoResp;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultaPrePagoResp
 */
@Validated
public class ConsultaPrePagoResp   {
  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("InfConsultaPrePago")
  private InfConsultaPrePagoResp infConsultaPrePago = null;

  public ConsultaPrePagoResp infTransacao(InfTransacaoResp infTransacao) {
    this.infTransacao = infTransacao;
    return this;
  }

  /**
   * Get infTransacao
   * @return infTransacao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public InfTransacaoResp getInfTransacao() {
    return infTransacao;
  }

  public void setInfTransacao(InfTransacaoResp infTransacao) {
    this.infTransacao = infTransacao;
  }

  public ConsultaPrePagoResp terminal(Terminal terminal) {
    this.terminal = terminal;
    return this;
  }

  /**
   * Get terminal
   * @return terminal
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public Terminal getTerminal() {
    return terminal;
  }

  public void setTerminal(Terminal terminal) {
    this.terminal = terminal;
  }

  public ConsultaPrePagoResp infConsultaPrePago(InfConsultaPrePagoResp infConsultaPrePago) {
    this.infConsultaPrePago = infConsultaPrePago;
    return this;
  }

  /**
   * Get infConsultaPrePago
   * @return infConsultaPrePago
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public InfConsultaPrePagoResp getInfConsultaPrePago() {
    return infConsultaPrePago;
  }

  public void setInfConsultaPrePago(InfConsultaPrePagoResp infConsultaPrePago) {
    this.infConsultaPrePago = infConsultaPrePago;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaPrePagoResp consultaPrePagoResp = (ConsultaPrePagoResp) o;
    return Objects.equals(this.infTransacao, consultaPrePagoResp.infTransacao) &&
        Objects.equals(this.terminal, consultaPrePagoResp.terminal) &&
        Objects.equals(this.infConsultaPrePago, consultaPrePagoResp.infConsultaPrePago);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, infConsultaPrePago);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaPrePagoResp {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    infConsultaPrePago: ").append(toIndentedString(infConsultaPrePago)).append("\n");
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

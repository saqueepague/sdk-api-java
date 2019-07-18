package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfRecargaPrePagoReq;
import io.swagger.model.InfTransacaoReq;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecargaPrePagoReq
 */
@Validated
public class RecargaPrePagoReq   {
  @JsonProperty("InfTransacao")
  private InfTransacaoReq infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("InfRecargaPrePago")
  private InfRecargaPrePagoReq infRecargaPrePago = null;

  public RecargaPrePagoReq infTransacao(InfTransacaoReq infTransacao) {
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
  public InfTransacaoReq getInfTransacao() {
    return infTransacao;
  }

  public void setInfTransacao(InfTransacaoReq infTransacao) {
    this.infTransacao = infTransacao;
  }

  public RecargaPrePagoReq terminal(Terminal terminal) {
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

  public RecargaPrePagoReq infRecargaPrePago(InfRecargaPrePagoReq infRecargaPrePago) {
    this.infRecargaPrePago = infRecargaPrePago;
    return this;
  }

  /**
   * Get infRecargaPrePago
   * @return infRecargaPrePago
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public InfRecargaPrePagoReq getInfRecargaPrePago() {
    return infRecargaPrePago;
  }

  public void setInfRecargaPrePago(InfRecargaPrePagoReq infRecargaPrePago) {
    this.infRecargaPrePago = infRecargaPrePago;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecargaPrePagoReq recargaPrePagoReq = (RecargaPrePagoReq) o;
    return Objects.equals(this.infTransacao, recargaPrePagoReq.infTransacao) &&
        Objects.equals(this.terminal, recargaPrePagoReq.terminal) &&
        Objects.equals(this.infRecargaPrePago, recargaPrePagoReq.infRecargaPrePago);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, infRecargaPrePago);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecargaPrePagoReq {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    infRecargaPrePago: ").append(toIndentedString(infRecargaPrePago)).append("\n");
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

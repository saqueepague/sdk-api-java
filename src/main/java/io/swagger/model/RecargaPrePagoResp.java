package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfRecargaPrePagoResp;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecargaPrePagoResp
 */
@Validated
public class RecargaPrePagoResp   {
  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("InfRecargaPrePago")
  private InfRecargaPrePagoResp infRecargaPrePago = null;

  public RecargaPrePagoResp infTransacao(InfTransacaoResp infTransacao) {
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

  public RecargaPrePagoResp terminal(Terminal terminal) {
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

  public RecargaPrePagoResp infRecargaPrePago(InfRecargaPrePagoResp infRecargaPrePago) {
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
  public InfRecargaPrePagoResp getInfRecargaPrePago() {
    return infRecargaPrePago;
  }

  public void setInfRecargaPrePago(InfRecargaPrePagoResp infRecargaPrePago) {
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
    RecargaPrePagoResp recargaPrePagoResp = (RecargaPrePagoResp) o;
    return Objects.equals(this.infTransacao, recargaPrePagoResp.infTransacao) &&
        Objects.equals(this.terminal, recargaPrePagoResp.terminal) &&
        Objects.equals(this.infRecargaPrePago, recargaPrePagoResp.infRecargaPrePago);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, infRecargaPrePago);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecargaPrePagoResp {\n");
    
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

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaSaqueResp;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultaSaqueResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

public class ConsultaSaqueResp   {
  @JsonProperty("InfConsultaSaque")
  private InfConsultaSaqueResp infConsultaSaque = null;

  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  public ConsultaSaqueResp infConsultaSaque(InfConsultaSaqueResp infConsultaSaque) {
    this.infConsultaSaque = infConsultaSaque;
    return this;
  }

  /**
   * Get infConsultaSaque
   * @return infConsultaSaque
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public InfConsultaSaqueResp getInfConsultaSaque() {
    return infConsultaSaque;
  }

  public void setInfConsultaSaque(InfConsultaSaqueResp infConsultaSaque) {
    this.infConsultaSaque = infConsultaSaque;
  }

  public ConsultaSaqueResp infTransacao(InfTransacaoResp infTransacao) {
    this.infTransacao = infTransacao;
    return this;
  }

  /**
   * Get infTransacao
   * @return infTransacao
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfTransacaoResp getInfTransacao() {
    return infTransacao;
  }

  public void setInfTransacao(InfTransacaoResp infTransacao) {
    this.infTransacao = infTransacao;
  }

  public ConsultaSaqueResp terminal(Terminal terminal) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaSaqueResp consultaSaqueResp = (ConsultaSaqueResp) o;
    return Objects.equals(this.infConsultaSaque, consultaSaqueResp.infConsultaSaque) &&
        Objects.equals(this.infTransacao, consultaSaqueResp.infTransacao) &&
        Objects.equals(this.terminal, consultaSaqueResp.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infConsultaSaque, infTransacao, terminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaSaqueResp {\n");
    
    sb.append("    infConsultaSaque: ").append(toIndentedString(infConsultaSaque)).append("\n");
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
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


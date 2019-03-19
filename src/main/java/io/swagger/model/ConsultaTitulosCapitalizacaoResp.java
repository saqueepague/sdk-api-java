package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaTitulosCapitalizacaoResp;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultaTitulosCapitalizacaoResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-19T14:13:24.289Z[GMT]")
public class ConsultaTitulosCapitalizacaoResp   {
  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("InfConsultaTitulosCapitalizacao")
  private InfConsultaTitulosCapitalizacaoResp infConsultaTitulosCapitalizacao = null;

  public ConsultaTitulosCapitalizacaoResp infTransacao(InfTransacaoResp infTransacao) {
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

  public ConsultaTitulosCapitalizacaoResp terminal(Terminal terminal) {
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

  public ConsultaTitulosCapitalizacaoResp infConsultaTitulosCapitalizacao(InfConsultaTitulosCapitalizacaoResp infConsultaTitulosCapitalizacao) {
    this.infConsultaTitulosCapitalizacao = infConsultaTitulosCapitalizacao;
    return this;
  }

  /**
   * Get infConsultaTitulosCapitalizacao
   * @return infConsultaTitulosCapitalizacao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public InfConsultaTitulosCapitalizacaoResp getInfConsultaTitulosCapitalizacao() {
    return infConsultaTitulosCapitalizacao;
  }

  public void setInfConsultaTitulosCapitalizacao(InfConsultaTitulosCapitalizacaoResp infConsultaTitulosCapitalizacao) {
    this.infConsultaTitulosCapitalizacao = infConsultaTitulosCapitalizacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaTitulosCapitalizacaoResp consultaTitulosCapitalizacaoResp = (ConsultaTitulosCapitalizacaoResp) o;
    return Objects.equals(this.infTransacao, consultaTitulosCapitalizacaoResp.infTransacao) &&
        Objects.equals(this.terminal, consultaTitulosCapitalizacaoResp.terminal) &&
        Objects.equals(this.infConsultaTitulosCapitalizacao, consultaTitulosCapitalizacaoResp.infConsultaTitulosCapitalizacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, infConsultaTitulosCapitalizacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaTitulosCapitalizacaoResp {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    infConsultaTitulosCapitalizacao: ").append(toIndentedString(infConsultaTitulosCapitalizacao)).append("\n");
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

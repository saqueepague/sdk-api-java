package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CriptoResp;
import io.swagger.model.InfExtratoResp;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ExtratoResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class ExtratoResp   {
  @JsonProperty("Cripto")
  private CriptoResp cripto = null;

  @JsonProperty("InfExtrato")
  private InfExtratoResp infExtrato = null;

  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  public ExtratoResp cripto(CriptoResp cripto) {
    this.cripto = cripto;
    return this;
  }

  /**
   * Get cripto
   * @return cripto
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CriptoResp getCripto() {
    return cripto;
  }

  public void setCripto(CriptoResp cripto) {
    this.cripto = cripto;
  }

  public ExtratoResp infExtrato(InfExtratoResp infExtrato) {
    this.infExtrato = infExtrato;
    return this;
  }

  /**
   * Get infExtrato
   * @return infExtrato
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public InfExtratoResp getInfExtrato() {
    return infExtrato;
  }

  public void setInfExtrato(InfExtratoResp infExtrato) {
    this.infExtrato = infExtrato;
  }

  public ExtratoResp infTransacao(InfTransacaoResp infTransacao) {
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

  public ExtratoResp terminal(Terminal terminal) {
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
    ExtratoResp extratoResp = (ExtratoResp) o;
    return Objects.equals(this.cripto, extratoResp.cripto) &&
        Objects.equals(this.infExtrato, extratoResp.infExtrato) &&
        Objects.equals(this.infTransacao, extratoResp.infTransacao) &&
        Objects.equals(this.terminal, extratoResp.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cripto, infExtrato, infTransacao, terminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ExtratoResp {\n");
    
    sb.append("    cripto: ").append(toIndentedString(cripto)).append("\n");
    sb.append("    infExtrato: ").append(toIndentedString(infExtrato)).append("\n");
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


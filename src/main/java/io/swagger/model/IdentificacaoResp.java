package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CriptoResp;
import io.swagger.model.InfIdentificacaoResp;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * IdentificacaoResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

public class IdentificacaoResp   {
  @JsonProperty("Cripto")
  private CriptoResp cripto = null;

  @JsonProperty("InfIdentificacao")
  private InfIdentificacaoResp infIdentificacao = null;

  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  public IdentificacaoResp cripto(CriptoResp cripto) {
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

  public IdentificacaoResp infIdentificacao(InfIdentificacaoResp infIdentificacao) {
    this.infIdentificacao = infIdentificacao;
    return this;
  }

  /**
   * Get infIdentificacao
   * @return infIdentificacao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public InfIdentificacaoResp getInfIdentificacao() {
    return infIdentificacao;
  }

  public void setInfIdentificacao(InfIdentificacaoResp infIdentificacao) {
    this.infIdentificacao = infIdentificacao;
  }

  public IdentificacaoResp infTransacao(InfTransacaoResp infTransacao) {
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

  public IdentificacaoResp terminal(Terminal terminal) {
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
    IdentificacaoResp identificacaoResp = (IdentificacaoResp) o;
    return Objects.equals(this.cripto, identificacaoResp.cripto) &&
        Objects.equals(this.infIdentificacao, identificacaoResp.infIdentificacao) &&
        Objects.equals(this.infTransacao, identificacaoResp.infTransacao) &&
        Objects.equals(this.terminal, identificacaoResp.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cripto, infIdentificacao, infTransacao, terminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificacaoResp {\n");
    
    sb.append("    cripto: ").append(toIndentedString(cripto)).append("\n");
    sb.append("    infIdentificacao: ").append(toIndentedString(infIdentificacao)).append("\n");
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


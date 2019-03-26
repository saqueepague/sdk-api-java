package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfAutenticacaoReq;
import io.swagger.model.InfTransacaoReq;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AutenticacaoReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-26T13:22:47.638Z[GMT]")
public class AutenticacaoReq   {
  @JsonProperty("InfTransacao")
  private InfTransacaoReq infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("InfAutenticacao")
  private InfAutenticacaoReq infAutenticacao = null;

  public AutenticacaoReq infTransacao(InfTransacaoReq infTransacao) {
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

  public AutenticacaoReq terminal(Terminal terminal) {
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

  public AutenticacaoReq infAutenticacao(InfAutenticacaoReq infAutenticacao) {
    this.infAutenticacao = infAutenticacao;
    return this;
  }

  /**
   * Get infAutenticacao
   * @return infAutenticacao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public InfAutenticacaoReq getInfAutenticacao() {
    return infAutenticacao;
  }

  public void setInfAutenticacao(InfAutenticacaoReq infAutenticacao) {
    this.infAutenticacao = infAutenticacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutenticacaoReq autenticacaoReq = (AutenticacaoReq) o;
    return Objects.equals(this.infTransacao, autenticacaoReq.infTransacao) &&
        Objects.equals(this.terminal, autenticacaoReq.terminal) &&
        Objects.equals(this.infAutenticacao, autenticacaoReq.infAutenticacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, infAutenticacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutenticacaoReq {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    infAutenticacao: ").append(toIndentedString(infAutenticacao)).append("\n");
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

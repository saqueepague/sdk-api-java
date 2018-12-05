package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfCompraTitulosCapitalizacaoReq;
import io.swagger.model.InfTransacaoReq;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompraTitulosCapitalizacaoReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class CompraTitulosCapitalizacaoReq   {
  @JsonProperty("InfTransacao")
  private InfTransacaoReq infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("InfCompraTitulosCapitalizacao")
  private InfCompraTitulosCapitalizacaoReq infCompraTitulosCapitalizacao = null;

  public CompraTitulosCapitalizacaoReq infTransacao(InfTransacaoReq infTransacao) {
    this.infTransacao = infTransacao;
    return this;
  }

  /**
   * Get infTransacao
   * @return infTransacao
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfTransacaoReq getInfTransacao() {
    return infTransacao;
  }

  public void setInfTransacao(InfTransacaoReq infTransacao) {
    this.infTransacao = infTransacao;
  }

  public CompraTitulosCapitalizacaoReq terminal(Terminal terminal) {
    this.terminal = terminal;
    return this;
  }

  /**
   * Get terminal
   * @return terminal
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Terminal getTerminal() {
    return terminal;
  }

  public void setTerminal(Terminal terminal) {
    this.terminal = terminal;
  }

  public CompraTitulosCapitalizacaoReq infCompraTitulosCapitalizacao(InfCompraTitulosCapitalizacaoReq infCompraTitulosCapitalizacao) {
    this.infCompraTitulosCapitalizacao = infCompraTitulosCapitalizacao;
    return this;
  }

  /**
   * Get infCompraTitulosCapitalizacao
   * @return infCompraTitulosCapitalizacao
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfCompraTitulosCapitalizacaoReq getInfCompraTitulosCapitalizacao() {
    return infCompraTitulosCapitalizacao;
  }

  public void setInfCompraTitulosCapitalizacao(InfCompraTitulosCapitalizacaoReq infCompraTitulosCapitalizacao) {
    this.infCompraTitulosCapitalizacao = infCompraTitulosCapitalizacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CompraTitulosCapitalizacaoReq compraTitulosCapitalizacaoReq = (CompraTitulosCapitalizacaoReq) o;
    return Objects.equals(this.infTransacao, compraTitulosCapitalizacaoReq.infTransacao) &&
        Objects.equals(this.terminal, compraTitulosCapitalizacaoReq.terminal) &&
        Objects.equals(this.infCompraTitulosCapitalizacao, compraTitulosCapitalizacaoReq.infCompraTitulosCapitalizacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, infCompraTitulosCapitalizacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompraTitulosCapitalizacaoReq {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    infCompraTitulosCapitalizacao: ").append(toIndentedString(infCompraTitulosCapitalizacao)).append("\n");
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


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfCompraTitulosCapitalizacaoResp;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * CompraTitulosCapitalizacaoResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-26T13:22:47.638Z[GMT]")
public class CompraTitulosCapitalizacaoResp   {
  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("InfCompraTitulosCapitalizacao")
  private InfCompraTitulosCapitalizacaoResp infCompraTitulosCapitalizacao = null;

  public CompraTitulosCapitalizacaoResp infTransacao(InfTransacaoResp infTransacao) {
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

  public CompraTitulosCapitalizacaoResp terminal(Terminal terminal) {
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

  public CompraTitulosCapitalizacaoResp infCompraTitulosCapitalizacao(InfCompraTitulosCapitalizacaoResp infCompraTitulosCapitalizacao) {
    this.infCompraTitulosCapitalizacao = infCompraTitulosCapitalizacao;
    return this;
  }

  /**
   * Get infCompraTitulosCapitalizacao
   * @return infCompraTitulosCapitalizacao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public InfCompraTitulosCapitalizacaoResp getInfCompraTitulosCapitalizacao() {
    return infCompraTitulosCapitalizacao;
  }

  public void setInfCompraTitulosCapitalizacao(InfCompraTitulosCapitalizacaoResp infCompraTitulosCapitalizacao) {
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
    CompraTitulosCapitalizacaoResp compraTitulosCapitalizacaoResp = (CompraTitulosCapitalizacaoResp) o;
    return Objects.equals(this.infTransacao, compraTitulosCapitalizacaoResp.infTransacao) &&
        Objects.equals(this.terminal, compraTitulosCapitalizacaoResp.terminal) &&
        Objects.equals(this.infCompraTitulosCapitalizacao, compraTitulosCapitalizacaoResp.infCompraTitulosCapitalizacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, infCompraTitulosCapitalizacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CompraTitulosCapitalizacaoResp {\n");
    
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

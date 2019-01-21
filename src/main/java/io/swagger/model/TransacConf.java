package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CriptoResp;
import io.swagger.model.InfTransacaoConf;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * TransacConf
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class TransacConf   {
  @JsonProperty("Cripto")
  private CriptoResp cripto = null;

  @JsonProperty("InfTransacao")
  private InfTransacaoConf infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  public TransacConf cripto(CriptoResp cripto) {
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

  public TransacConf infTransacao(InfTransacaoConf infTransacao) {
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

  public InfTransacaoConf getInfTransacao() {
    return infTransacao;
  }

  public void setInfTransacao(InfTransacaoConf infTransacao) {
    this.infTransacao = infTransacao;
  }

  public TransacConf terminal(Terminal terminal) {
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
    TransacConf transacConf = (TransacConf) o;
    return Objects.equals(this.cripto, transacConf.cripto) &&
        Objects.equals(this.infTransacao, transacConf.infTransacao) &&
        Objects.equals(this.terminal, transacConf.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cripto, infTransacao, terminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TransacConf {\n");
    
    sb.append("    cripto: ").append(toIndentedString(cripto)).append("\n");
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


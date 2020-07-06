package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CriptoResp;
import io.swagger.model.InfSimulacaoEmprestimoResp;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * SimulacaoEmprestimoResp
 */
@Validated
public class SimulacaoEmprestimoResp   {
  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("Cripto")
  private CriptoResp cripto = null;

  @JsonProperty("InfSimulacaoEmprestimo")
  private InfSimulacaoEmprestimoResp infSimulacaoEmprestimo = null;

  public SimulacaoEmprestimoResp infTransacao(InfTransacaoResp infTransacao) {
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

  public SimulacaoEmprestimoResp terminal(Terminal terminal) {
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

  public SimulacaoEmprestimoResp cripto(CriptoResp cripto) {
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

  public SimulacaoEmprestimoResp infSimulacaoEmprestimo(InfSimulacaoEmprestimoResp infSimulacaoEmprestimo) {
    this.infSimulacaoEmprestimo = infSimulacaoEmprestimo;
    return this;
  }

  /**
   * Get infSimulacaoEmprestimo
   * @return infSimulacaoEmprestimo
  **/
  @ApiModelProperty(value = "")

  @Valid
  public InfSimulacaoEmprestimoResp getInfSimulacaoEmprestimo() {
    return infSimulacaoEmprestimo;
  }

  public void setInfSimulacaoEmprestimo(InfSimulacaoEmprestimoResp infSimulacaoEmprestimo) {
    this.infSimulacaoEmprestimo = infSimulacaoEmprestimo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SimulacaoEmprestimoResp simulacaoEmprestimoResp = (SimulacaoEmprestimoResp) o;
    return Objects.equals(this.infTransacao, simulacaoEmprestimoResp.infTransacao) &&
        Objects.equals(this.terminal, simulacaoEmprestimoResp.terminal) &&
        Objects.equals(this.cripto, simulacaoEmprestimoResp.cripto) &&
        Objects.equals(this.infSimulacaoEmprestimo, simulacaoEmprestimoResp.infSimulacaoEmprestimo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, cripto, infSimulacaoEmprestimo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SimulacaoEmprestimoResp {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    cripto: ").append(toIndentedString(cripto)).append("\n");
    sb.append("    infSimulacaoEmprestimo: ").append(toIndentedString(infSimulacaoEmprestimo)).append("\n");
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

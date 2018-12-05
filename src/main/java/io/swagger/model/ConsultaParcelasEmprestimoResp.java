package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CriptoResp;
import io.swagger.model.InfConsultaParcelasEmprestimoResp;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultaParcelasEmprestimoResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class ConsultaParcelasEmprestimoResp   {
  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("Cripto")
  private CriptoResp cripto = null;

  @JsonProperty("InfConsultaParcelasEmprestimo")
  private InfConsultaParcelasEmprestimoResp infConsultaParcelasEmprestimo = null;

  public ConsultaParcelasEmprestimoResp infTransacao(InfTransacaoResp infTransacao) {
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

  public ConsultaParcelasEmprestimoResp terminal(Terminal terminal) {
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

  public ConsultaParcelasEmprestimoResp cripto(CriptoResp cripto) {
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

  public ConsultaParcelasEmprestimoResp infConsultaParcelasEmprestimo(InfConsultaParcelasEmprestimoResp infConsultaParcelasEmprestimo) {
    this.infConsultaParcelasEmprestimo = infConsultaParcelasEmprestimo;
    return this;
  }

  /**
   * Get infConsultaParcelasEmprestimo
   * @return infConsultaParcelasEmprestimo
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfConsultaParcelasEmprestimoResp getInfConsultaParcelasEmprestimo() {
    return infConsultaParcelasEmprestimo;
  }

  public void setInfConsultaParcelasEmprestimo(InfConsultaParcelasEmprestimoResp infConsultaParcelasEmprestimo) {
    this.infConsultaParcelasEmprestimo = infConsultaParcelasEmprestimo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaParcelasEmprestimoResp consultaParcelasEmprestimoResp = (ConsultaParcelasEmprestimoResp) o;
    return Objects.equals(this.infTransacao, consultaParcelasEmprestimoResp.infTransacao) &&
        Objects.equals(this.terminal, consultaParcelasEmprestimoResp.terminal) &&
        Objects.equals(this.cripto, consultaParcelasEmprestimoResp.cripto) &&
        Objects.equals(this.infConsultaParcelasEmprestimo, consultaParcelasEmprestimoResp.infConsultaParcelasEmprestimo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, cripto, infConsultaParcelasEmprestimo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaParcelasEmprestimoResp {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    cripto: ").append(toIndentedString(cripto)).append("\n");
    sb.append("    infConsultaParcelasEmprestimo: ").append(toIndentedString(infConsultaParcelasEmprestimo)).append("\n");
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


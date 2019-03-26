package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CriptoResp;
import io.swagger.model.InfConsultaLimitesEmprestimoResp;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultaLimitesEmprestimoResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-26T13:22:47.638Z[GMT]")
public class ConsultaLimitesEmprestimoResp   {
  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("Cripto")
  private CriptoResp cripto = null;

  @JsonProperty("InfConsultaLimitesEmprestimo")
  private InfConsultaLimitesEmprestimoResp infConsultaLimitesEmprestimo = null;

  public ConsultaLimitesEmprestimoResp infTransacao(InfTransacaoResp infTransacao) {
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

  public ConsultaLimitesEmprestimoResp terminal(Terminal terminal) {
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

  public ConsultaLimitesEmprestimoResp cripto(CriptoResp cripto) {
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

  public ConsultaLimitesEmprestimoResp infConsultaLimitesEmprestimo(InfConsultaLimitesEmprestimoResp infConsultaLimitesEmprestimo) {
    this.infConsultaLimitesEmprestimo = infConsultaLimitesEmprestimo;
    return this;
  }

  /**
   * Get infConsultaLimitesEmprestimo
   * @return infConsultaLimitesEmprestimo
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public InfConsultaLimitesEmprestimoResp getInfConsultaLimitesEmprestimo() {
    return infConsultaLimitesEmprestimo;
  }

  public void setInfConsultaLimitesEmprestimo(InfConsultaLimitesEmprestimoResp infConsultaLimitesEmprestimo) {
    this.infConsultaLimitesEmprestimo = infConsultaLimitesEmprestimo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaLimitesEmprestimoResp consultaLimitesEmprestimoResp = (ConsultaLimitesEmprestimoResp) o;
    return Objects.equals(this.infTransacao, consultaLimitesEmprestimoResp.infTransacao) &&
        Objects.equals(this.terminal, consultaLimitesEmprestimoResp.terminal) &&
        Objects.equals(this.cripto, consultaLimitesEmprestimoResp.cripto) &&
        Objects.equals(this.infConsultaLimitesEmprestimo, consultaLimitesEmprestimoResp.infConsultaLimitesEmprestimo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, cripto, infConsultaLimitesEmprestimo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaLimitesEmprestimoResp {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    cripto: ").append(toIndentedString(cripto)).append("\n");
    sb.append("    infConsultaLimitesEmprestimo: ").append(toIndentedString(infConsultaLimitesEmprestimo)).append("\n");
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

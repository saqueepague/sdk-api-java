package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CriptoResp;
import io.swagger.model.InfComprovantePagamento;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultaComprovantesResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class ConsultaComprovantesResp   {
  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("Cripto")
  private CriptoResp cripto = null;

  @JsonProperty("InfComprovantes")
  @Valid
  private List<InfComprovantePagamento> infComprovantes = null;

  public ConsultaComprovantesResp infTransacao(InfTransacaoResp infTransacao) {
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

  public ConsultaComprovantesResp terminal(Terminal terminal) {
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

  public ConsultaComprovantesResp cripto(CriptoResp cripto) {
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

  public ConsultaComprovantesResp infComprovantes(List<InfComprovantePagamento> infComprovantes) {
    this.infComprovantes = infComprovantes;
    return this;
  }

  public ConsultaComprovantesResp addInfComprovantesItem(InfComprovantePagamento infComprovantesItem) {
    if (this.infComprovantes == null) {
      this.infComprovantes = new ArrayList<InfComprovantePagamento>();
    }
    this.infComprovantes.add(infComprovantesItem);
    return this;
  }

  /**
   * Listagem com todos os comprovantes de pagamentos disponíveis para reimpressão.
   * @return infComprovantes
  **/
  @ApiModelProperty(value = "Listagem com todos os comprovantes de pagamentos disponíveis para reimpressão.")

  @Valid

  public List<InfComprovantePagamento> getInfComprovantes() {
    return infComprovantes;
  }

  public void setInfComprovantes(List<InfComprovantePagamento> infComprovantes) {
    this.infComprovantes = infComprovantes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaComprovantesResp consultaComprovantesResp = (ConsultaComprovantesResp) o;
    return Objects.equals(this.infTransacao, consultaComprovantesResp.infTransacao) &&
        Objects.equals(this.terminal, consultaComprovantesResp.terminal) &&
        Objects.equals(this.cripto, consultaComprovantesResp.cripto) &&
        Objects.equals(this.infComprovantes, consultaComprovantesResp.infComprovantes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, cripto, infComprovantes);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaComprovantesResp {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    cripto: ").append(toIndentedString(cripto)).append("\n");
    sb.append("    infComprovantes: ").append(toIndentedString(infComprovantes)).append("\n");
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


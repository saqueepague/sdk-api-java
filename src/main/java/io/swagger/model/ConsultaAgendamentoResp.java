package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CriptoResp;
import io.swagger.model.InfAgendamentoReq;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultaAgendamentoResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class ConsultaAgendamentoResp   {
  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("Cripto")
  private CriptoResp cripto = null;

  @JsonProperty("InfoAgendamentos")
  @Valid
  private List<InfAgendamentoReq> infoAgendamentos = null;

  public ConsultaAgendamentoResp infTransacao(InfTransacaoResp infTransacao) {
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

  public ConsultaAgendamentoResp terminal(Terminal terminal) {
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

  public ConsultaAgendamentoResp cripto(CriptoResp cripto) {
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

  public ConsultaAgendamentoResp infoAgendamentos(List<InfAgendamentoReq> infoAgendamentos) {
    this.infoAgendamentos = infoAgendamentos;
    return this;
  }

  public ConsultaAgendamentoResp addInfoAgendamentosItem(InfAgendamentoReq infoAgendamentosItem) {
    if (this.infoAgendamentos == null) {
      this.infoAgendamentos = new ArrayList<InfAgendamentoReq>();
    }
    this.infoAgendamentos.add(infoAgendamentosItem);
    return this;
  }

  /**
   * Listagem com todos pagamentos que estão agendados.
   * @return infoAgendamentos
  **/
  @ApiModelProperty(value = "Listagem com todos pagamentos que estão agendados.")

  @Valid

  public List<InfAgendamentoReq> getInfoAgendamentos() {
    return infoAgendamentos;
  }

  public void setInfoAgendamentos(List<InfAgendamentoReq> infoAgendamentos) {
    this.infoAgendamentos = infoAgendamentos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaAgendamentoResp consultaAgendamentoResp = (ConsultaAgendamentoResp) o;
    return Objects.equals(this.infTransacao, consultaAgendamentoResp.infTransacao) &&
        Objects.equals(this.terminal, consultaAgendamentoResp.terminal) &&
        Objects.equals(this.cripto, consultaAgendamentoResp.cripto) &&
        Objects.equals(this.infoAgendamentos, consultaAgendamentoResp.infoAgendamentos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, cripto, infoAgendamentos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaAgendamentoResp {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    cripto: ").append(toIndentedString(cripto)).append("\n");
    sb.append("    infoAgendamentos: ").append(toIndentedString(infoAgendamentos)).append("\n");
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


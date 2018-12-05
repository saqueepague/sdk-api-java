package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Cartao;
import io.swagger.model.InfAgendamentoReq;
import io.swagger.model.InfTransacaoReq;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * AgendamentoIdentificaoReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class AgendamentoIdentificaoReq   {
  @JsonProperty("InfTransacao")
  private InfTransacaoReq infTransacao = null;

  @JsonProperty("Cartao")
  private Cartao cartao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("InfAgendamento")
  private InfAgendamentoReq infAgendamento = null;

  public AgendamentoIdentificaoReq infTransacao(InfTransacaoReq infTransacao) {
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

  public AgendamentoIdentificaoReq cartao(Cartao cartao) {
    this.cartao = cartao;
    return this;
  }

  /**
   * Get cartao
   * @return cartao
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Cartao getCartao() {
    return cartao;
  }

  public void setCartao(Cartao cartao) {
    this.cartao = cartao;
  }

  public AgendamentoIdentificaoReq terminal(Terminal terminal) {
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

  public AgendamentoIdentificaoReq infAgendamento(InfAgendamentoReq infAgendamento) {
    this.infAgendamento = infAgendamento;
    return this;
  }

  /**
   * Get infAgendamento
   * @return infAgendamento
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfAgendamentoReq getInfAgendamento() {
    return infAgendamento;
  }

  public void setInfAgendamento(InfAgendamentoReq infAgendamento) {
    this.infAgendamento = infAgendamento;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AgendamentoIdentificaoReq agendamentoIdentificaoReq = (AgendamentoIdentificaoReq) o;
    return Objects.equals(this.infTransacao, agendamentoIdentificaoReq.infTransacao) &&
        Objects.equals(this.cartao, agendamentoIdentificaoReq.cartao) &&
        Objects.equals(this.terminal, agendamentoIdentificaoReq.terminal) &&
        Objects.equals(this.infAgendamento, agendamentoIdentificaoReq.infAgendamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, cartao, terminal, infAgendamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AgendamentoIdentificaoReq {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    infAgendamento: ").append(toIndentedString(infAgendamento)).append("\n");
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


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Cartao;
import io.swagger.model.InfConsultaPagamentoReq;
import io.swagger.model.InfTransacaoReq;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultaPagamentoReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

public class ConsultaPagamentoReq   {
  @JsonProperty("Cartao")
  private Cartao cartao = null;

  @JsonProperty("InfConsultaPagamento")
  private InfConsultaPagamentoReq infConsultaPagamento = null;

  @JsonProperty("InfTransacao")
  private InfTransacaoReq infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  public ConsultaPagamentoReq cartao(Cartao cartao) {
    this.cartao = cartao;
    return this;
  }

  /**
   * Get cartao
   * @return cartao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Cartao getCartao() {
    return cartao;
  }

  public void setCartao(Cartao cartao) {
    this.cartao = cartao;
  }

  public ConsultaPagamentoReq infConsultaPagamento(InfConsultaPagamentoReq infConsultaPagamento) {
    this.infConsultaPagamento = infConsultaPagamento;
    return this;
  }

  /**
   * Get infConsultaPagamento
   * @return infConsultaPagamento
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public InfConsultaPagamentoReq getInfConsultaPagamento() {
    return infConsultaPagamento;
  }

  public void setInfConsultaPagamento(InfConsultaPagamentoReq infConsultaPagamento) {
    this.infConsultaPagamento = infConsultaPagamento;
  }

  public ConsultaPagamentoReq infTransacao(InfTransacaoReq infTransacao) {
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

  public ConsultaPagamentoReq terminal(Terminal terminal) {
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
    ConsultaPagamentoReq consultaPagamentoReq = (ConsultaPagamentoReq) o;
    return Objects.equals(this.cartao, consultaPagamentoReq.cartao) &&
        Objects.equals(this.infConsultaPagamento, consultaPagamentoReq.infConsultaPagamento) &&
        Objects.equals(this.infTransacao, consultaPagamentoReq.infTransacao) &&
        Objects.equals(this.terminal, consultaPagamentoReq.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartao, infConsultaPagamento, infTransacao, terminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaPagamentoReq {\n");
    
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    infConsultaPagamento: ").append(toIndentedString(infConsultaPagamento)).append("\n");
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


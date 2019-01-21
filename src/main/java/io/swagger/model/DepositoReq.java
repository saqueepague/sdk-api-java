package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Cartao;
import io.swagger.model.Cripto;
import io.swagger.model.InfDepositoReq;
import io.swagger.model.InfTransacaoReq;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * DepositoReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class DepositoReq   {
  @JsonProperty("Cartao")
  private Cartao cartao = null;

  @JsonProperty("Cripto")
  private Cripto cripto = null;

  @JsonProperty("InfDeposito")
  private InfDepositoReq infDeposito = null;

  @JsonProperty("InfTransacao")
  private InfTransacaoReq infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  public DepositoReq cartao(Cartao cartao) {
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

  public DepositoReq cripto(Cripto cripto) {
    this.cripto = cripto;
    return this;
  }

  /**
   * Get cripto
   * @return cripto
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Cripto getCripto() {
    return cripto;
  }

  public void setCripto(Cripto cripto) {
    this.cripto = cripto;
  }

  public DepositoReq infDeposito(InfDepositoReq infDeposito) {
    this.infDeposito = infDeposito;
    return this;
  }

  /**
   * Get infDeposito
   * @return infDeposito
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public InfDepositoReq getInfDeposito() {
    return infDeposito;
  }

  public void setInfDeposito(InfDepositoReq infDeposito) {
    this.infDeposito = infDeposito;
  }

  public DepositoReq infTransacao(InfTransacaoReq infTransacao) {
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

  public DepositoReq terminal(Terminal terminal) {
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
    DepositoReq depositoReq = (DepositoReq) o;
    return Objects.equals(this.cartao, depositoReq.cartao) &&
        Objects.equals(this.cripto, depositoReq.cripto) &&
        Objects.equals(this.infDeposito, depositoReq.infDeposito) &&
        Objects.equals(this.infTransacao, depositoReq.infTransacao) &&
        Objects.equals(this.terminal, depositoReq.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartao, cripto, infDeposito, infTransacao, terminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DepositoReq {\n");
    
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    cripto: ").append(toIndentedString(cripto)).append("\n");
    sb.append("    infDeposito: ").append(toIndentedString(infDeposito)).append("\n");
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


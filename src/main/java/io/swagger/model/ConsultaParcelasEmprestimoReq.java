package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Cartao;
import io.swagger.model.InfConsultaParcelasEmprestimoReq;
import io.swagger.model.InfTransacaoReq;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultaParcelasEmprestimoReq
 */
@Validated
public class ConsultaParcelasEmprestimoReq   {
  @JsonProperty("InfTransacao")
  private InfTransacaoReq infTransacao = null;

  @JsonProperty("Cartao")
  private Cartao cartao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("InfConsultaParcelasEmprestimo")
  private InfConsultaParcelasEmprestimoReq infConsultaParcelasEmprestimo = null;

  public ConsultaParcelasEmprestimoReq infTransacao(InfTransacaoReq infTransacao) {
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

  public ConsultaParcelasEmprestimoReq cartao(Cartao cartao) {
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

  public ConsultaParcelasEmprestimoReq terminal(Terminal terminal) {
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

  public ConsultaParcelasEmprestimoReq infConsultaParcelasEmprestimo(InfConsultaParcelasEmprestimoReq infConsultaParcelasEmprestimo) {
    this.infConsultaParcelasEmprestimo = infConsultaParcelasEmprestimo;
    return this;
  }

  /**
   * Get infConsultaParcelasEmprestimo
   * @return infConsultaParcelasEmprestimo
  **/
  @ApiModelProperty(value = "")

  @Valid
  public InfConsultaParcelasEmprestimoReq getInfConsultaParcelasEmprestimo() {
    return infConsultaParcelasEmprestimo;
  }

  public void setInfConsultaParcelasEmprestimo(InfConsultaParcelasEmprestimoReq infConsultaParcelasEmprestimo) {
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
    ConsultaParcelasEmprestimoReq consultaParcelasEmprestimoReq = (ConsultaParcelasEmprestimoReq) o;
    return Objects.equals(this.infTransacao, consultaParcelasEmprestimoReq.infTransacao) &&
        Objects.equals(this.cartao, consultaParcelasEmprestimoReq.cartao) &&
        Objects.equals(this.terminal, consultaParcelasEmprestimoReq.terminal) &&
        Objects.equals(this.infConsultaParcelasEmprestimo, consultaParcelasEmprestimoReq.infConsultaParcelasEmprestimo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, cartao, terminal, infConsultaParcelasEmprestimo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaParcelasEmprestimoReq {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
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

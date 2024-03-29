package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Cartao;
import io.swagger.model.InfTransacaoReq;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultaFavorecidoReq
 */
@Validated
public class ConsultaFavorecidoReq   {
  @JsonProperty("InfTransacao")
  private InfTransacaoReq infTransacao = null;

  @JsonProperty("Cartao")
  private Cartao cartao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  public ConsultaFavorecidoReq infTransacao(InfTransacaoReq infTransacao) {
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

  public ConsultaFavorecidoReq cartao(Cartao cartao) {
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

  public ConsultaFavorecidoReq terminal(Terminal terminal) {
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
    ConsultaFavorecidoReq consultaFavorecidoReq = (ConsultaFavorecidoReq) o;
    return Objects.equals(this.infTransacao, consultaFavorecidoReq.infTransacao) &&
        Objects.equals(this.cartao, consultaFavorecidoReq.cartao) &&
        Objects.equals(this.terminal, consultaFavorecidoReq.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, cartao, terminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaFavorecidoReq {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
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

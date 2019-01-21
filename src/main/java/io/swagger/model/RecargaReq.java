package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Cartao;
import io.swagger.model.Cripto;
import io.swagger.model.InfRecargaReq;
import io.swagger.model.InfTransacaoReq;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * RecargaReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class RecargaReq   {
  @JsonProperty("Cartao")
  private Cartao cartao = null;

  @JsonProperty("Cripto")
  private Cripto cripto = null;

  @JsonProperty("InfRecarga")
  private InfRecargaReq infRecarga = null;

  @JsonProperty("InfTransacao")
  private InfTransacaoReq infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  public RecargaReq cartao(Cartao cartao) {
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

  public RecargaReq cripto(Cripto cripto) {
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

  public RecargaReq infRecarga(InfRecargaReq infRecarga) {
    this.infRecarga = infRecarga;
    return this;
  }

  /**
   * Get infRecarga
   * @return infRecarga
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public InfRecargaReq getInfRecarga() {
    return infRecarga;
  }

  public void setInfRecarga(InfRecargaReq infRecarga) {
    this.infRecarga = infRecarga;
  }

  public RecargaReq infTransacao(InfTransacaoReq infTransacao) {
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

  public RecargaReq terminal(Terminal terminal) {
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
    RecargaReq recargaReq = (RecargaReq) o;
    return Objects.equals(this.cartao, recargaReq.cartao) &&
        Objects.equals(this.cripto, recargaReq.cripto) &&
        Objects.equals(this.infRecarga, recargaReq.infRecarga) &&
        Objects.equals(this.infTransacao, recargaReq.infTransacao) &&
        Objects.equals(this.terminal, recargaReq.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cartao, cripto, infRecarga, infTransacao, terminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecargaReq {\n");
    
    sb.append("    cartao: ").append(toIndentedString(cartao)).append("\n");
    sb.append("    cripto: ").append(toIndentedString(cripto)).append("\n");
    sb.append("    infRecarga: ").append(toIndentedString(infRecarga)).append("\n");
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


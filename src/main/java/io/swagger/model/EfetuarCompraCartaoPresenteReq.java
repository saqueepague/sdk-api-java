package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfEfetuarCompraCartaoPresenteReq;
import io.swagger.model.InfTransacaoReq;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EfetuarCompraCartaoPresenteReq
 */
@Validated
public class EfetuarCompraCartaoPresenteReq   {
  @JsonProperty("InfTransacao")
  private InfTransacaoReq infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("InfEfetuarCompraCartaoPresente")
  private InfEfetuarCompraCartaoPresenteReq infEfetuarCompraCartaoPresente = null;

  public EfetuarCompraCartaoPresenteReq infTransacao(InfTransacaoReq infTransacao) {
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

  public EfetuarCompraCartaoPresenteReq terminal(Terminal terminal) {
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

  public EfetuarCompraCartaoPresenteReq infEfetuarCompraCartaoPresente(InfEfetuarCompraCartaoPresenteReq infEfetuarCompraCartaoPresente) {
    this.infEfetuarCompraCartaoPresente = infEfetuarCompraCartaoPresente;
    return this;
  }

  /**
   * Get infEfetuarCompraCartaoPresente
   * @return infEfetuarCompraCartaoPresente
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public InfEfetuarCompraCartaoPresenteReq getInfEfetuarCompraCartaoPresente() {
    return infEfetuarCompraCartaoPresente;
  }

  public void setInfEfetuarCompraCartaoPresente(InfEfetuarCompraCartaoPresenteReq infEfetuarCompraCartaoPresente) {
    this.infEfetuarCompraCartaoPresente = infEfetuarCompraCartaoPresente;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    EfetuarCompraCartaoPresenteReq efetuarCompraCartaoPresenteReq = (EfetuarCompraCartaoPresenteReq) o;
    return Objects.equals(this.infTransacao, efetuarCompraCartaoPresenteReq.infTransacao) &&
        Objects.equals(this.terminal, efetuarCompraCartaoPresenteReq.terminal) &&
        Objects.equals(this.infEfetuarCompraCartaoPresente, efetuarCompraCartaoPresenteReq.infEfetuarCompraCartaoPresente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, infEfetuarCompraCartaoPresente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EfetuarCompraCartaoPresenteReq {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    infEfetuarCompraCartaoPresente: ").append(toIndentedString(infEfetuarCompraCartaoPresente)).append("\n");
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

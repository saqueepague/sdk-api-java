package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfEfetuarCompraCartaoPresenteResp;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * EfetuarCompraCartaoPresenteResp
 */
@Validated
public class EfetuarCompraCartaoPresenteResp   {
  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("InfEfetuarCompraCartaoPresente")
  private InfEfetuarCompraCartaoPresenteResp infEfetuarCompraCartaoPresente = null;

  public EfetuarCompraCartaoPresenteResp infTransacao(InfTransacaoResp infTransacao) {
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

  public EfetuarCompraCartaoPresenteResp terminal(Terminal terminal) {
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

  public EfetuarCompraCartaoPresenteResp infEfetuarCompraCartaoPresente(InfEfetuarCompraCartaoPresenteResp infEfetuarCompraCartaoPresente) {
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
  public InfEfetuarCompraCartaoPresenteResp getInfEfetuarCompraCartaoPresente() {
    return infEfetuarCompraCartaoPresente;
  }

  public void setInfEfetuarCompraCartaoPresente(InfEfetuarCompraCartaoPresenteResp infEfetuarCompraCartaoPresente) {
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
    EfetuarCompraCartaoPresenteResp efetuarCompraCartaoPresenteResp = (EfetuarCompraCartaoPresenteResp) o;
    return Objects.equals(this.infTransacao, efetuarCompraCartaoPresenteResp.infTransacao) &&
        Objects.equals(this.terminal, efetuarCompraCartaoPresenteResp.terminal) &&
        Objects.equals(this.infEfetuarCompraCartaoPresente, efetuarCompraCartaoPresenteResp.infEfetuarCompraCartaoPresente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, infEfetuarCompraCartaoPresente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class EfetuarCompraCartaoPresenteResp {\n");
    
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

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaCatalogoCartaoPresenteResp;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultaCatalogoCartaoPresenteResp
 */
@Validated
public class ConsultaCatalogoCartaoPresenteResp   {
  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("InfConsultaCatalogoCartaoPresente")
  private InfConsultaCatalogoCartaoPresenteResp infConsultaCatalogoCartaoPresente = null;

  public ConsultaCatalogoCartaoPresenteResp infTransacao(InfTransacaoResp infTransacao) {
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

  public ConsultaCatalogoCartaoPresenteResp terminal(Terminal terminal) {
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

  public ConsultaCatalogoCartaoPresenteResp infConsultaCatalogoCartaoPresente(InfConsultaCatalogoCartaoPresenteResp infConsultaCatalogoCartaoPresente) {
    this.infConsultaCatalogoCartaoPresente = infConsultaCatalogoCartaoPresente;
    return this;
  }

  /**
   * Get infConsultaCatalogoCartaoPresente
   * @return infConsultaCatalogoCartaoPresente
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public InfConsultaCatalogoCartaoPresenteResp getInfConsultaCatalogoCartaoPresente() {
    return infConsultaCatalogoCartaoPresente;
  }

  public void setInfConsultaCatalogoCartaoPresente(InfConsultaCatalogoCartaoPresenteResp infConsultaCatalogoCartaoPresente) {
    this.infConsultaCatalogoCartaoPresente = infConsultaCatalogoCartaoPresente;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaCatalogoCartaoPresenteResp consultaCatalogoCartaoPresenteResp = (ConsultaCatalogoCartaoPresenteResp) o;
    return Objects.equals(this.infTransacao, consultaCatalogoCartaoPresenteResp.infTransacao) &&
        Objects.equals(this.terminal, consultaCatalogoCartaoPresenteResp.terminal) &&
        Objects.equals(this.infConsultaCatalogoCartaoPresente, consultaCatalogoCartaoPresenteResp.infConsultaCatalogoCartaoPresente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, infConsultaCatalogoCartaoPresente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaCatalogoCartaoPresenteResp {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    infConsultaCatalogoCartaoPresente: ").append(toIndentedString(infConsultaCatalogoCartaoPresente)).append("\n");
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

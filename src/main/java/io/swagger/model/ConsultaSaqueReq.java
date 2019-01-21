package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.Cripto;
import io.swagger.model.InfConsultaSaqueReq;
import io.swagger.model.InfTransacaoReq;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultaSaqueReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class ConsultaSaqueReq   {
  @JsonProperty("Cripto")
  private Cripto cripto = null;

  @JsonProperty("InfConsultaSaque")
  private InfConsultaSaqueReq infConsultaSaque = null;

  @JsonProperty("InfTransacao")
  private InfTransacaoReq infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  public ConsultaSaqueReq cripto(Cripto cripto) {
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

  public ConsultaSaqueReq infConsultaSaque(InfConsultaSaqueReq infConsultaSaque) {
    this.infConsultaSaque = infConsultaSaque;
    return this;
  }

  /**
   * Get infConsultaSaque
   * @return infConsultaSaque
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public InfConsultaSaqueReq getInfConsultaSaque() {
    return infConsultaSaque;
  }

  public void setInfConsultaSaque(InfConsultaSaqueReq infConsultaSaque) {
    this.infConsultaSaque = infConsultaSaque;
  }

  public ConsultaSaqueReq infTransacao(InfTransacaoReq infTransacao) {
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

  public ConsultaSaqueReq terminal(Terminal terminal) {
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
    ConsultaSaqueReq consultaSaqueReq = (ConsultaSaqueReq) o;
    return Objects.equals(this.cripto, consultaSaqueReq.cripto) &&
        Objects.equals(this.infConsultaSaque, consultaSaqueReq.infConsultaSaque) &&
        Objects.equals(this.infTransacao, consultaSaqueReq.infTransacao) &&
        Objects.equals(this.terminal, consultaSaqueReq.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cripto, infConsultaSaque, infTransacao, terminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaSaqueReq {\n");
    
    sb.append("    cripto: ").append(toIndentedString(cripto)).append("\n");
    sb.append("    infConsultaSaque: ").append(toIndentedString(infConsultaSaque)).append("\n");
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


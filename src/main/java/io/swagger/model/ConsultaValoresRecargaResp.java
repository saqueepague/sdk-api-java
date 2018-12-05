package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CriptoResp;
import io.swagger.model.InfConsultaValoresRecargaResp;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultaValoresRecargaResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class ConsultaValoresRecargaResp   {
  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("Cripto")
  private CriptoResp cripto = null;

  @JsonProperty("InfConsultaValoresRecarga")
  private InfConsultaValoresRecargaResp infConsultaValoresRecarga = null;

  public ConsultaValoresRecargaResp infTransacao(InfTransacaoResp infTransacao) {
    this.infTransacao = infTransacao;
    return this;
  }

  /**
   * Get infTransacao
   * @return infTransacao
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfTransacaoResp getInfTransacao() {
    return infTransacao;
  }

  public void setInfTransacao(InfTransacaoResp infTransacao) {
    this.infTransacao = infTransacao;
  }

  public ConsultaValoresRecargaResp terminal(Terminal terminal) {
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

  public ConsultaValoresRecargaResp cripto(CriptoResp cripto) {
    this.cripto = cripto;
    return this;
  }

  /**
   * Get cripto
   * @return cripto
  **/
  @ApiModelProperty(value = "")

  @Valid

  public CriptoResp getCripto() {
    return cripto;
  }

  public void setCripto(CriptoResp cripto) {
    this.cripto = cripto;
  }

  public ConsultaValoresRecargaResp infConsultaValoresRecarga(InfConsultaValoresRecargaResp infConsultaValoresRecarga) {
    this.infConsultaValoresRecarga = infConsultaValoresRecarga;
    return this;
  }

  /**
   * Get infConsultaValoresRecarga
   * @return infConsultaValoresRecarga
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfConsultaValoresRecargaResp getInfConsultaValoresRecarga() {
    return infConsultaValoresRecarga;
  }

  public void setInfConsultaValoresRecarga(InfConsultaValoresRecargaResp infConsultaValoresRecarga) {
    this.infConsultaValoresRecarga = infConsultaValoresRecarga;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaValoresRecargaResp consultaValoresRecargaResp = (ConsultaValoresRecargaResp) o;
    return Objects.equals(this.infTransacao, consultaValoresRecargaResp.infTransacao) &&
        Objects.equals(this.terminal, consultaValoresRecargaResp.terminal) &&
        Objects.equals(this.cripto, consultaValoresRecargaResp.cripto) &&
        Objects.equals(this.infConsultaValoresRecarga, consultaValoresRecargaResp.infConsultaValoresRecarga);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, cripto, infConsultaValoresRecarga);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaValoresRecargaResp {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    cripto: ").append(toIndentedString(cripto)).append("\n");
    sb.append("    infConsultaValoresRecarga: ").append(toIndentedString(infConsultaValoresRecarga)).append("\n");
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


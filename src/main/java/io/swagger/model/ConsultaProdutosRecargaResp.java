package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CriptoResp;
import io.swagger.model.InfConsultaProdutosRecargaResp;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultaProdutosRecargaResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class ConsultaProdutosRecargaResp   {
  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  @JsonProperty("Cripto")
  private CriptoResp cripto = null;

  @JsonProperty("InfConsultaProdutosRecarga")
  private InfConsultaProdutosRecargaResp infConsultaProdutosRecarga = null;

  public ConsultaProdutosRecargaResp infTransacao(InfTransacaoResp infTransacao) {
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

  public ConsultaProdutosRecargaResp terminal(Terminal terminal) {
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

  public ConsultaProdutosRecargaResp cripto(CriptoResp cripto) {
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

  public ConsultaProdutosRecargaResp infConsultaProdutosRecarga(InfConsultaProdutosRecargaResp infConsultaProdutosRecarga) {
    this.infConsultaProdutosRecarga = infConsultaProdutosRecarga;
    return this;
  }

  /**
   * Get infConsultaProdutosRecarga
   * @return infConsultaProdutosRecarga
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfConsultaProdutosRecargaResp getInfConsultaProdutosRecarga() {
    return infConsultaProdutosRecarga;
  }

  public void setInfConsultaProdutosRecarga(InfConsultaProdutosRecargaResp infConsultaProdutosRecarga) {
    this.infConsultaProdutosRecarga = infConsultaProdutosRecarga;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaProdutosRecargaResp consultaProdutosRecargaResp = (ConsultaProdutosRecargaResp) o;
    return Objects.equals(this.infTransacao, consultaProdutosRecargaResp.infTransacao) &&
        Objects.equals(this.terminal, consultaProdutosRecargaResp.terminal) &&
        Objects.equals(this.cripto, consultaProdutosRecargaResp.cripto) &&
        Objects.equals(this.infConsultaProdutosRecarga, consultaProdutosRecargaResp.infConsultaProdutosRecarga);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infTransacao, terminal, cripto, infConsultaProdutosRecarga);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaProdutosRecargaResp {\n");
    
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    cripto: ").append(toIndentedString(cripto)).append("\n");
    sb.append("    infConsultaProdutosRecarga: ").append(toIndentedString(infConsultaProdutosRecarga)).append("\n");
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


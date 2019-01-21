package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações sobre o boleto da CIP.
 */
@ApiModel(description = "Informações sobre o boleto da CIP.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfConsultaPagamentoRespCip   {
  @JsonProperty("NumeroIdentificacaoConsultaPagamento")
  private String numeroIdentificacaoConsultaPagamento = null;

  @JsonProperty("tipoValorAceito")
  private String tipoValorAceito = null;

  @JsonProperty("valorAbatimento")
  private String valorAbatimento = null;

  @JsonProperty("valorJurosCalculado")
  private String valorJurosCalculado = null;

  @JsonProperty("valorMaximoPermitidoPagamento")
  private String valorMaximoPermitidoPagamento = null;

  @JsonProperty("valorMinimoPermitidoPagamento")
  private String valorMinimoPermitidoPagamento = null;

  @JsonProperty("valorMultaCalculadada")
  private String valorMultaCalculadada = null;

  public InfConsultaPagamentoRespCip numeroIdentificacaoConsultaPagamento(String numeroIdentificacaoConsultaPagamento) {
    this.numeroIdentificacaoConsultaPagamento = numeroIdentificacaoConsultaPagamento;
    return this;
  }

  /**
   * Número de identificação da consulta.
   * @return numeroIdentificacaoConsultaPagamento
  **/
  @ApiModelProperty(required = true, value = "Número de identificação da consulta.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getNumeroIdentificacaoConsultaPagamento() {
    return numeroIdentificacaoConsultaPagamento;
  }

  public void setNumeroIdentificacaoConsultaPagamento(String numeroIdentificacaoConsultaPagamento) {
    this.numeroIdentificacaoConsultaPagamento = numeroIdentificacaoConsultaPagamento;
  }

  public InfConsultaPagamentoRespCip tipoValorAceito(String tipoValorAceito) {
    this.tipoValorAceito = tipoValorAceito;
    return this;
  }

  /**
   * Tipo de valor aceito.
   * @return tipoValorAceito
  **/
  @ApiModelProperty(required = true, value = "Tipo de valor aceito.")
  @NotNull


  public String getTipoValorAceito() {
    return tipoValorAceito;
  }

  public void setTipoValorAceito(String tipoValorAceito) {
    this.tipoValorAceito = tipoValorAceito;
  }

  public InfConsultaPagamentoRespCip valorAbatimento(String valorAbatimento) {
    this.valorAbatimento = valorAbatimento;
    return this;
  }

  /**
   * Valor do abatimento calculado (12 dígitos, incluindo centavos).
   * @return valorAbatimento
  **/
  @ApiModelProperty(example = "000000000499", required = true, value = "Valor do abatimento calculado (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValorAbatimento() {
    return valorAbatimento;
  }

  public void setValorAbatimento(String valorAbatimento) {
    this.valorAbatimento = valorAbatimento;
  }

  public InfConsultaPagamentoRespCip valorJurosCalculado(String valorJurosCalculado) {
    this.valorJurosCalculado = valorJurosCalculado;
    return this;
  }

  /**
   * Valor dos juros calculados (12 dígitos, incluindo centavos).
   * @return valorJurosCalculado
  **/
  @ApiModelProperty(example = "000000000499", required = true, value = "Valor dos juros calculados (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValorJurosCalculado() {
    return valorJurosCalculado;
  }

  public void setValorJurosCalculado(String valorJurosCalculado) {
    this.valorJurosCalculado = valorJurosCalculado;
  }

  public InfConsultaPagamentoRespCip valorMaximoPermitidoPagamento(String valorMaximoPermitidoPagamento) {
    this.valorMaximoPermitidoPagamento = valorMaximoPermitidoPagamento;
    return this;
  }

  /**
   * Valor máximo de pagamento (12 dígitos, incluindo centavos).
   * @return valorMaximoPermitidoPagamento
  **/
  @ApiModelProperty(example = "000000050000", required = true, value = "Valor máximo de pagamento (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValorMaximoPermitidoPagamento() {
    return valorMaximoPermitidoPagamento;
  }

  public void setValorMaximoPermitidoPagamento(String valorMaximoPermitidoPagamento) {
    this.valorMaximoPermitidoPagamento = valorMaximoPermitidoPagamento;
  }

  public InfConsultaPagamentoRespCip valorMinimoPermitidoPagamento(String valorMinimoPermitidoPagamento) {
    this.valorMinimoPermitidoPagamento = valorMinimoPermitidoPagamento;
    return this;
  }

  /**
   * Valor mínimo de pagamento (12 dígitos, incluindo centavos).
   * @return valorMinimoPermitidoPagamento
  **/
  @ApiModelProperty(example = "000000000500", required = true, value = "Valor mínimo de pagamento (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValorMinimoPermitidoPagamento() {
    return valorMinimoPermitidoPagamento;
  }

  public void setValorMinimoPermitidoPagamento(String valorMinimoPermitidoPagamento) {
    this.valorMinimoPermitidoPagamento = valorMinimoPermitidoPagamento;
  }

  public InfConsultaPagamentoRespCip valorMultaCalculadada(String valorMultaCalculadada) {
    this.valorMultaCalculadada = valorMultaCalculadada;
    return this;
  }

  /**
   * Valor da multa calculada (12 dígitos, incluindo centavos).
   * @return valorMultaCalculadada
  **/
  @ApiModelProperty(example = "000000000499", required = true, value = "Valor da multa calculada (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValorMultaCalculadada() {
    return valorMultaCalculadada;
  }

  public void setValorMultaCalculadada(String valorMultaCalculadada) {
    this.valorMultaCalculadada = valorMultaCalculadada;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaPagamentoRespCip infConsultaPagamentoRespCip = (InfConsultaPagamentoRespCip) o;
    return Objects.equals(this.numeroIdentificacaoConsultaPagamento, infConsultaPagamentoRespCip.numeroIdentificacaoConsultaPagamento) &&
        Objects.equals(this.tipoValorAceito, infConsultaPagamentoRespCip.tipoValorAceito) &&
        Objects.equals(this.valorAbatimento, infConsultaPagamentoRespCip.valorAbatimento) &&
        Objects.equals(this.valorJurosCalculado, infConsultaPagamentoRespCip.valorJurosCalculado) &&
        Objects.equals(this.valorMaximoPermitidoPagamento, infConsultaPagamentoRespCip.valorMaximoPermitidoPagamento) &&
        Objects.equals(this.valorMinimoPermitidoPagamento, infConsultaPagamentoRespCip.valorMinimoPermitidoPagamento) &&
        Objects.equals(this.valorMultaCalculadada, infConsultaPagamentoRespCip.valorMultaCalculadada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numeroIdentificacaoConsultaPagamento, tipoValorAceito, valorAbatimento, valorJurosCalculado, valorMaximoPermitidoPagamento, valorMinimoPermitidoPagamento, valorMultaCalculadada);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPagamentoRespCip {\n");
    
    sb.append("    numeroIdentificacaoConsultaPagamento: ").append(toIndentedString(numeroIdentificacaoConsultaPagamento)).append("\n");
    sb.append("    tipoValorAceito: ").append(toIndentedString(tipoValorAceito)).append("\n");
    sb.append("    valorAbatimento: ").append(toIndentedString(valorAbatimento)).append("\n");
    sb.append("    valorJurosCalculado: ").append(toIndentedString(valorJurosCalculado)).append("\n");
    sb.append("    valorMaximoPermitidoPagamento: ").append(toIndentedString(valorMaximoPermitidoPagamento)).append("\n");
    sb.append("    valorMinimoPermitidoPagamento: ").append(toIndentedString(valorMinimoPermitidoPagamento)).append("\n");
    sb.append("    valorMultaCalculadada: ").append(toIndentedString(valorMultaCalculadada)).append("\n");
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


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
public class InfConsultaPagamentoRespCip   {
  @JsonProperty("valorJurosCalculado")
  private String valorJurosCalculado = null;

  @JsonProperty("valorMultaCalculadada")
  private String valorMultaCalculadada = null;

  @JsonProperty("valorAbatimento")
  private String valorAbatimento = null;

  @JsonProperty("tipoValorAceito")
  private String tipoValorAceito = null;

  @JsonProperty("valorMinimoPermitidoPagamento")
  private String valorMinimoPermitidoPagamento = null;

  @JsonProperty("valorMaximoPermitidoPagamento")
  private String valorMaximoPermitidoPagamento = null;

  public InfConsultaPagamentoRespCip valorJurosCalculado(String valorJurosCalculado) {
    this.valorJurosCalculado = valorJurosCalculado;
    return this;
  }

  /**
   * Valor dos juros calculados (12 dígitos, incluindo centavos).
   * @return valorJurosCalculado
  **/
  @ApiModelProperty(example = "000000000499", value = "Valor dos juros calculados (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$")   public String getValorJurosCalculado() {
    return valorJurosCalculado;
  }

  public void setValorJurosCalculado(String valorJurosCalculado) {
    this.valorJurosCalculado = valorJurosCalculado;
  }

  public InfConsultaPagamentoRespCip valorMultaCalculadada(String valorMultaCalculadada) {
    this.valorMultaCalculadada = valorMultaCalculadada;
    return this;
  }

  /**
   * Valor da multa calculada (12 dígitos, incluindo centavos).
   * @return valorMultaCalculadada
  **/
  @ApiModelProperty(example = "000000000499", value = "Valor da multa calculada (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$")   public String getValorMultaCalculadada() {
    return valorMultaCalculadada;
  }

  public void setValorMultaCalculadada(String valorMultaCalculadada) {
    this.valorMultaCalculadada = valorMultaCalculadada;
  }

  public InfConsultaPagamentoRespCip valorAbatimento(String valorAbatimento) {
    this.valorAbatimento = valorAbatimento;
    return this;
  }

  /**
   * Valor em abatimentos calculado (12 dígitos, incluindo centavos).
   * @return valorAbatimento
  **/
  @ApiModelProperty(example = "000000000499", value = "Valor em abatimentos calculado (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$")   public String getValorAbatimento() {
    return valorAbatimento;
  }

  public void setValorAbatimento(String valorAbatimento) {
    this.valorAbatimento = valorAbatimento;
  }

  public InfConsultaPagamentoRespCip tipoValorAceito(String tipoValorAceito) {
    this.tipoValorAceito = tipoValorAceito;
    return this;
  }

  /**
   * Tipo de valor aceito: 1 - Qualquer valor, 2 - Entre mínimo e máximo, 3 - Somente valor a pagar calculado e 4 - A partir do valor mínimo.
   * @return tipoValorAceito
  **/
  @ApiModelProperty(example = "3", value = "Tipo de valor aceito: 1 - Qualquer valor, 2 - Entre mínimo e máximo, 3 - Somente valor a pagar calculado e 4 - A partir do valor mínimo.")

@Pattern(regexp="^\\d{1}$")   public String getTipoValorAceito() {
    return tipoValorAceito;
  }

  public void setTipoValorAceito(String tipoValorAceito) {
    this.tipoValorAceito = tipoValorAceito;
  }

  public InfConsultaPagamentoRespCip valorMinimoPermitidoPagamento(String valorMinimoPermitidoPagamento) {
    this.valorMinimoPermitidoPagamento = valorMinimoPermitidoPagamento;
    return this;
  }

  /**
   * Valor mínimo permitido de pagamento (12 dígitos, incluindo centavos).
   * @return valorMinimoPermitidoPagamento
  **/
  @ApiModelProperty(example = "000000000500", value = "Valor mínimo permitido de pagamento (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$")   public String getValorMinimoPermitidoPagamento() {
    return valorMinimoPermitidoPagamento;
  }

  public void setValorMinimoPermitidoPagamento(String valorMinimoPermitidoPagamento) {
    this.valorMinimoPermitidoPagamento = valorMinimoPermitidoPagamento;
  }

  public InfConsultaPagamentoRespCip valorMaximoPermitidoPagamento(String valorMaximoPermitidoPagamento) {
    this.valorMaximoPermitidoPagamento = valorMaximoPermitidoPagamento;
    return this;
  }

  /**
   * Valor máximo permitido de pagamento (12 dígitos, incluindo centavos).
   * @return valorMaximoPermitidoPagamento
  **/
  @ApiModelProperty(example = "000000050000", value = "Valor máximo permitido de pagamento (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$")   public String getValorMaximoPermitidoPagamento() {
    return valorMaximoPermitidoPagamento;
  }

  public void setValorMaximoPermitidoPagamento(String valorMaximoPermitidoPagamento) {
    this.valorMaximoPermitidoPagamento = valorMaximoPermitidoPagamento;
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
    return Objects.equals(this.valorJurosCalculado, infConsultaPagamentoRespCip.valorJurosCalculado) &&
        Objects.equals(this.valorMultaCalculadada, infConsultaPagamentoRespCip.valorMultaCalculadada) &&
        Objects.equals(this.valorAbatimento, infConsultaPagamentoRespCip.valorAbatimento) &&
        Objects.equals(this.tipoValorAceito, infConsultaPagamentoRespCip.tipoValorAceito) &&
        Objects.equals(this.valorMinimoPermitidoPagamento, infConsultaPagamentoRespCip.valorMinimoPermitidoPagamento) &&
        Objects.equals(this.valorMaximoPermitidoPagamento, infConsultaPagamentoRespCip.valorMaximoPermitidoPagamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valorJurosCalculado, valorMultaCalculadada, valorAbatimento, tipoValorAceito, valorMinimoPermitidoPagamento, valorMaximoPermitidoPagamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPagamentoRespCip {\n");
    
    sb.append("    valorJurosCalculado: ").append(toIndentedString(valorJurosCalculado)).append("\n");
    sb.append("    valorMultaCalculadada: ").append(toIndentedString(valorMultaCalculadada)).append("\n");
    sb.append("    valorAbatimento: ").append(toIndentedString(valorAbatimento)).append("\n");
    sb.append("    tipoValorAceito: ").append(toIndentedString(tipoValorAceito)).append("\n");
    sb.append("    valorMinimoPermitidoPagamento: ").append(toIndentedString(valorMinimoPermitidoPagamento)).append("\n");
    sb.append("    valorMaximoPermitidoPagamento: ").append(toIndentedString(valorMaximoPermitidoPagamento)).append("\n");
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

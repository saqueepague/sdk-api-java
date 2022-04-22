package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaPagamentoRespCip;
import io.swagger.model.InfConsultaPagamentoRespCodBarras;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações da resposta da requisição de consulta de pagamento.
 */
@ApiModel(description = "Informações da resposta da requisição de consulta de pagamento.")
@Validated
public class InfConsultaPagamentoResp   {
  @JsonProperty("valor")
  private String valor = null;

  @JsonProperty("cedente")
  private String cedente = null;

  @JsonProperty("dataPagamento")
  private String dataPagamento = null;

  @JsonProperty("mensagem")
  private String mensagem = null;

  @JsonProperty("desconto")
  private String desconto = null;

  @JsonProperty("codBarras")
  private InfConsultaPagamentoRespCodBarras codBarras = null;

  @JsonProperty("cip")
  private InfConsultaPagamentoRespCip cip = null;

  /**
   * Aceita pagamento parcial (00 = não, 00 = sim).
   */
  public enum AceitaPagamentoParcialEnum {
    _00("00"),
    
    _01("01");

    private String value;

    AceitaPagamentoParcialEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AceitaPagamentoParcialEnum fromValue(String text) {
      for (AceitaPagamentoParcialEnum b : AceitaPagamentoParcialEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("aceitaPagamentoParcial")
  private AceitaPagamentoParcialEnum aceitaPagamentoParcial = null;

  @JsonProperty("valorMinimo")
  private String valorMinimo = null;

  public InfConsultaPagamentoResp valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Valor do pagamento (12 dígitos, incluindo centavos).
   * @return valor
  **/
  @ApiModelProperty(example = "000000005000", required = true, value = "Valor do pagamento (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$")   public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public InfConsultaPagamentoResp cedente(String cedente) {
    this.cedente = cedente;
    return this;
  }

  /**
   * Cedente (beneficiário).
   * @return cedente
  **/
  @ApiModelProperty(example = "Saque e Pague", required = true, value = "Cedente (beneficiário).")
  @NotNull

  public String getCedente() {
    return cedente;
  }

  public void setCedente(String cedente) {
    this.cedente = cedente;
  }

  public InfConsultaPagamentoResp dataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
    return this;
  }

  /**
   * Data de pagamento atualizada pelo parceiro (AAAAMMDD).
   * @return dataPagamento
  **/
  @ApiModelProperty(example = "20181122", required = true, value = "Data de pagamento atualizada pelo parceiro (AAAAMMDD).")
  @NotNull

@Pattern(regexp="^\\d{8}$")   public String getDataPagamento() {
    return dataPagamento;
  }

  public void setDataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  public InfConsultaPagamentoResp mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }

  /**
   * Mensagem informativa quanto é alteração de valores e/ou data de pagamento pelo paceiro.
   * @return mensagem
  **/
  @ApiModelProperty(example = "Esta &eacute; uma mensagem para exibi&ccedil;&atilde;o em tela.", value = "Mensagem informativa quanto é alteração de valores e/ou data de pagamento pelo paceiro.")

  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  public InfConsultaPagamentoResp desconto(String desconto) {
    this.desconto = desconto;
    return this;
  }

  /**
   * Valor de desconto (12 dígitos, incluindo centavos).
   * @return desconto
  **/
  @ApiModelProperty(example = "000000000499", required = true, value = "Valor de desconto (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$")   public String getDesconto() {
    return desconto;
  }

  public void setDesconto(String desconto) {
    this.desconto = desconto;
  }

  public InfConsultaPagamentoResp codBarras(InfConsultaPagamentoRespCodBarras codBarras) {
    this.codBarras = codBarras;
    return this;
  }

  /**
   * Get codBarras
   * @return codBarras
  **/
  @ApiModelProperty(value = "")

  @Valid
  public InfConsultaPagamentoRespCodBarras getCodBarras() {
    return codBarras;
  }

  public void setCodBarras(InfConsultaPagamentoRespCodBarras codBarras) {
    this.codBarras = codBarras;
  }

  public InfConsultaPagamentoResp cip(InfConsultaPagamentoRespCip cip) {
    this.cip = cip;
    return this;
  }

  /**
   * Get cip
   * @return cip
  **/
  @ApiModelProperty(value = "")

  @Valid
  public InfConsultaPagamentoRespCip getCip() {
    return cip;
  }

  public void setCip(InfConsultaPagamentoRespCip cip) {
    this.cip = cip;
  }

  public InfConsultaPagamentoResp aceitaPagamentoParcial(AceitaPagamentoParcialEnum aceitaPagamentoParcial) {
    this.aceitaPagamentoParcial = aceitaPagamentoParcial;
    return this;
  }

  /**
   * Aceita pagamento parcial (00 = não, 00 = sim).
   * @return aceitaPagamentoParcial
  **/
  @ApiModelProperty(example = "01", value = "Aceita pagamento parcial (00 = não, 00 = sim).")

  public AceitaPagamentoParcialEnum getAceitaPagamentoParcial() {
    return aceitaPagamentoParcial;
  }

  public void setAceitaPagamentoParcial(AceitaPagamentoParcialEnum aceitaPagamentoParcial) {
    this.aceitaPagamentoParcial = aceitaPagamentoParcial;
  }

  public InfConsultaPagamentoResp valorMinimo(String valorMinimo) {
    this.valorMinimo = valorMinimo;
    return this;
  }

  /**
   * Valor mínimo do pagamento (12 dígitos, incluindo centavos).
   * @return valorMinimo
  **/
  @ApiModelProperty(example = "000000000500", value = "Valor mínimo do pagamento (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$")   public String getValorMinimo() {
    return valorMinimo;
  }

  public void setValorMinimo(String valorMinimo) {
    this.valorMinimo = valorMinimo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaPagamentoResp infConsultaPagamentoResp = (InfConsultaPagamentoResp) o;
    return Objects.equals(this.valor, infConsultaPagamentoResp.valor) &&
        Objects.equals(this.cedente, infConsultaPagamentoResp.cedente) &&
        Objects.equals(this.dataPagamento, infConsultaPagamentoResp.dataPagamento) &&
        Objects.equals(this.mensagem, infConsultaPagamentoResp.mensagem) &&
        Objects.equals(this.desconto, infConsultaPagamentoResp.desconto) &&
        Objects.equals(this.codBarras, infConsultaPagamentoResp.codBarras) &&
        Objects.equals(this.cip, infConsultaPagamentoResp.cip) &&
        Objects.equals(this.aceitaPagamentoParcial, infConsultaPagamentoResp.aceitaPagamentoParcial) &&
        Objects.equals(this.valorMinimo, infConsultaPagamentoResp.valorMinimo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valor, cedente, dataPagamento, mensagem, desconto, codBarras, cip, aceitaPagamentoParcial, valorMinimo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPagamentoResp {\n");
    
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    cedente: ").append(toIndentedString(cedente)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
    sb.append("    desconto: ").append(toIndentedString(desconto)).append("\n");
    sb.append("    codBarras: ").append(toIndentedString(codBarras)).append("\n");
    sb.append("    cip: ").append(toIndentedString(cip)).append("\n");
    sb.append("    aceitaPagamentoParcial: ").append(toIndentedString(aceitaPagamentoParcial)).append("\n");
    sb.append("    valorMinimo: ").append(toIndentedString(valorMinimo)).append("\n");
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

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações da resposta de requisição de agendamento de pagameto.
 */
@ApiModel(description = "Informações da resposta de requisição de agendamento de pagameto.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfAgendamentoResp   {
  @JsonProperty("codigoBarras")
  private String codigoBarras = null;

  /**
   * Forma de entrada do código de barras (0 = escaneado, 1 = digitado)
   */
  public enum ModoEntradaEnum {
    _0("0"),
    
    _1("1");

    private String value;

    ModoEntradaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModoEntradaEnum fromValue(String text) {
      for (ModoEntradaEnum b : ModoEntradaEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("modoEntrada")
  private ModoEntradaEnum modoEntrada = null;

  @JsonProperty("cedente")
  private String cedente = null;

  @JsonProperty("dataPagamento")
  private String dataPagamento = null;

  /**
   * Flag que indica se houve alteração (00 = não, 01 = sim).
   */
  public enum ModificadoEnum {
    _00("00"),
    
    _01("01");

    private String value;

    ModificadoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModificadoEnum fromValue(String text) {
      for (ModificadoEnum b : ModificadoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("modificado")
  private ModificadoEnum modificado = null;

  @JsonProperty("valorNominal")
  private String valorNominal = null;

  @JsonProperty("valorJurosCalculado")
  private String valorJurosCalculado = null;

  @JsonProperty("valorMultaCalculadada")
  private String valorMultaCalculadada = null;

  @JsonProperty("valorAbatimento")
  private String valorAbatimento = null;

  @JsonProperty("valorTotal")
  private String valorTotal = null;

  @JsonProperty("recibo")
  private String recibo = null;

  public InfAgendamentoResp codigoBarras(String codigoBarras) {
    this.codigoBarras = codigoBarras;
    return this;
  }

  /**
   * Código de barras (44 dígitos).
   * @return codigoBarras
  **/
  @ApiModelProperty(example = "84729304827364829301567829304562229483471004", value = "Código de barras (44 dígitos).")

@Pattern(regexp="^\\d{44}$") 
  public String getCodigoBarras() {
    return codigoBarras;
  }

  public void setCodigoBarras(String codigoBarras) {
    this.codigoBarras = codigoBarras;
  }

  public InfAgendamentoResp modoEntrada(ModoEntradaEnum modoEntrada) {
    this.modoEntrada = modoEntrada;
    return this;
  }

  /**
   * Forma de entrada do código de barras (0 = escaneado, 1 = digitado)
   * @return modoEntrada
  **/
  @ApiModelProperty(example = "0", value = "Forma de entrada do código de barras (0 = escaneado, 1 = digitado)")


  public ModoEntradaEnum getModoEntrada() {
    return modoEntrada;
  }

  public void setModoEntrada(ModoEntradaEnum modoEntrada) {
    this.modoEntrada = modoEntrada;
  }

  public InfAgendamentoResp cedente(String cedente) {
    this.cedente = cedente;
    return this;
  }

  /**
   * Cedente (até 40 caracteres).
   * @return cedente
  **/
  @ApiModelProperty(example = "Cedente", value = "Cedente (até 40 caracteres).")

@Pattern(regexp="^.{0,40}$") 
  public String getCedente() {
    return cedente;
  }

  public void setCedente(String cedente) {
    this.cedente = cedente;
  }

  public InfAgendamentoResp dataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
    return this;
  }

  /**
   * Data de pagamento atualizada pelo host (AAAAMMDD).
   * @return dataPagamento
  **/
  @ApiModelProperty(example = "20181122", value = "Data de pagamento atualizada pelo host (AAAAMMDD).")

@Pattern(regexp="^\\d{8}$") 
  public String getDataPagamento() {
    return dataPagamento;
  }

  public void setDataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  public InfAgendamentoResp modificado(ModificadoEnum modificado) {
    this.modificado = modificado;
    return this;
  }

  /**
   * Flag que indica se houve alteração (00 = não, 01 = sim).
   * @return modificado
  **/
  @ApiModelProperty(example = "00", value = "Flag que indica se houve alteração (00 = não, 01 = sim).")


  public ModificadoEnum getModificado() {
    return modificado;
  }

  public void setModificado(ModificadoEnum modificado) {
    this.modificado = modificado;
  }

  public InfAgendamentoResp valorNominal(String valorNominal) {
    this.valorNominal = valorNominal;
    return this;
  }

  /**
   * Valor nominal do documento (12 dígitos, incluindo centavos).
   * @return valorNominal
  **/
  @ApiModelProperty(example = "000000005000", value = "Valor nominal do documento (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getValorNominal() {
    return valorNominal;
  }

  public void setValorNominal(String valorNominal) {
    this.valorNominal = valorNominal;
  }

  public InfAgendamentoResp valorJurosCalculado(String valorJurosCalculado) {
    this.valorJurosCalculado = valorJurosCalculado;
    return this;
  }

  /**
   * Valor dos juros calculados (12 dígitos, incluindo centavos).
   * @return valorJurosCalculado
  **/
  @ApiModelProperty(example = "000000000499", value = "Valor dos juros calculados (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getValorJurosCalculado() {
    return valorJurosCalculado;
  }

  public void setValorJurosCalculado(String valorJurosCalculado) {
    this.valorJurosCalculado = valorJurosCalculado;
  }

  public InfAgendamentoResp valorMultaCalculadada(String valorMultaCalculadada) {
    this.valorMultaCalculadada = valorMultaCalculadada;
    return this;
  }

  /**
   * Valor da multa calculada (12 dígitos, incluindo centavos).
   * @return valorMultaCalculadada
  **/
  @ApiModelProperty(example = "000000000499", value = "Valor da multa calculada (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getValorMultaCalculadada() {
    return valorMultaCalculadada;
  }

  public void setValorMultaCalculadada(String valorMultaCalculadada) {
    this.valorMultaCalculadada = valorMultaCalculadada;
  }

  public InfAgendamentoResp valorAbatimento(String valorAbatimento) {
    this.valorAbatimento = valorAbatimento;
    return this;
  }

  /**
   * Valor de abatimento/desconto calculado (12 dígitos, incluindo centavos).
   * @return valorAbatimento
  **/
  @ApiModelProperty(example = "000000000499", value = "Valor de abatimento/desconto calculado (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getValorAbatimento() {
    return valorAbatimento;
  }

  public void setValorAbatimento(String valorAbatimento) {
    this.valorAbatimento = valorAbatimento;
  }

  public InfAgendamentoResp valorTotal(String valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }

  /**
   * Valor total calculado (12 dígitos, incluindo centavos).
   * @return valorTotal
  **/
  @ApiModelProperty(example = "000000005499", value = "Valor total calculado (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(String valorTotal) {
    this.valorTotal = valorTotal;
  }

  public InfAgendamentoResp recibo(String recibo) {
    this.recibo = recibo;
    return this;
  }

  /**
   * Recibo imprimível do agendamento. Linhas com 48 posições separadas por '@'.
   * @return recibo
  **/
  @ApiModelProperty(example = "             TEU BILHETE ANTECIPADO             @                036200005433591                @               13/10/2018  20:24               @           VALOR DA RECARGA: R$ 48,00           @                 TAXAS: R$ 2,00                 @              TOTAL PAGO: R$ 50,00              @   OS CRÉDITOS ADQUIRIDOS ESTARÃO DISPONÍVEIS   @      NOS VALIDADORES DOS ÔNIBUS DA REGIÃO      @     METROPOLITANA QUE ACEITAM O CARTÃO TEU     @ OU NAS CATRACAS DO METRÔ, NOS SEGUINTES PRAZOS @            RECARGAS ATÉ O MEIO DIA:            @ CRÉDITOS DISPONÍVEIS NO DIA SEGUINTE DA COMPRA @           RECARGAS APÓS O MEIO DIA:           @   CRÉDITOS DISPONÍVEIS EM 48H APÓS A COMPRA   ", value = "Recibo imprimível do agendamento. Linhas com 48 posições separadas por '@'.")

@Pattern(regexp="^[^@]{0,48}(\\@[^@]{0,48})*$") 
  public String getRecibo() {
    return recibo;
  }

  public void setRecibo(String recibo) {
    this.recibo = recibo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfAgendamentoResp infAgendamentoResp = (InfAgendamentoResp) o;
    return Objects.equals(this.codigoBarras, infAgendamentoResp.codigoBarras) &&
        Objects.equals(this.modoEntrada, infAgendamentoResp.modoEntrada) &&
        Objects.equals(this.cedente, infAgendamentoResp.cedente) &&
        Objects.equals(this.dataPagamento, infAgendamentoResp.dataPagamento) &&
        Objects.equals(this.modificado, infAgendamentoResp.modificado) &&
        Objects.equals(this.valorNominal, infAgendamentoResp.valorNominal) &&
        Objects.equals(this.valorJurosCalculado, infAgendamentoResp.valorJurosCalculado) &&
        Objects.equals(this.valorMultaCalculadada, infAgendamentoResp.valorMultaCalculadada) &&
        Objects.equals(this.valorAbatimento, infAgendamentoResp.valorAbatimento) &&
        Objects.equals(this.valorTotal, infAgendamentoResp.valorTotal) &&
        Objects.equals(this.recibo, infAgendamentoResp.recibo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigoBarras, modoEntrada, cedente, dataPagamento, modificado, valorNominal, valorJurosCalculado, valorMultaCalculadada, valorAbatimento, valorTotal, recibo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfAgendamentoResp {\n");
    
    sb.append("    codigoBarras: ").append(toIndentedString(codigoBarras)).append("\n");
    sb.append("    modoEntrada: ").append(toIndentedString(modoEntrada)).append("\n");
    sb.append("    cedente: ").append(toIndentedString(cedente)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
    sb.append("    modificado: ").append(toIndentedString(modificado)).append("\n");
    sb.append("    valorNominal: ").append(toIndentedString(valorNominal)).append("\n");
    sb.append("    valorJurosCalculado: ").append(toIndentedString(valorJurosCalculado)).append("\n");
    sb.append("    valorMultaCalculadada: ").append(toIndentedString(valorMultaCalculadada)).append("\n");
    sb.append("    valorAbatimento: ").append(toIndentedString(valorAbatimento)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
    sb.append("    recibo: ").append(toIndentedString(recibo)).append("\n");
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


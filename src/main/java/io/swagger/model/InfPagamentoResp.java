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
 * InfPagamentoResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfPagamentoResp   {
  @JsonProperty("valor")
  private String valor = null;

  @JsonProperty("cedente")
  private String cedente = null;

  @JsonProperty("dataPagamento")
  private String dataPagamento = null;

  @JsonProperty("mensagem")
  private String mensagem = null;

  @JsonProperty("qtdeViasComprovante")
  private String qtdeViasComprovante = null;

  @JsonProperty("desconto")
  private String desconto = null;

  /**
   * Informa se foi usado o novo sistema de cobrança de contas (00 = não, 01 = sim).
   */
  public enum SistemaCobrancaEnum {
    _00("00"),
    
    _01("01");

    private String value;

    SistemaCobrancaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SistemaCobrancaEnum fromValue(String text) {
      for (SistemaCobrancaEnum b : SistemaCobrancaEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sistemaCobranca")
  private SistemaCobrancaEnum sistemaCobranca = null;

  @JsonProperty("cupom")
  private String cupom = null;

  @JsonProperty("recibo")
  private String recibo = null;

  public InfPagamentoResp valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Valor atualizado pelo host (12 dígitos, incluindo centavos).
   * @return valor
  **/
  @ApiModelProperty(example = "000000005000", value = "Valor atualizado pelo host (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public InfPagamentoResp cedente(String cedente) {
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

  public InfPagamentoResp dataPagamento(String dataPagamento) {
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

  public InfPagamentoResp mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }

  /**
   * Mensagem informativa quanto à alteração de valores e/ou data de pagamento pelo host.
   * @return mensagem
  **/
  @ApiModelProperty(value = "Mensagem informativa quanto à alteração de valores e/ou data de pagamento pelo host.")


  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }

  public InfPagamentoResp qtdeViasComprovante(String qtdeViasComprovante) {
    this.qtdeViasComprovante = qtdeViasComprovante;
    return this;
  }

  /**
   * Quantidade de vias para impressão do Comprovante.
   * @return qtdeViasComprovante
  **/
  @ApiModelProperty(example = "1", value = "Quantidade de vias para impressão do Comprovante.")

@Pattern(regexp="^\\d+$") 
  public String getQtdeViasComprovante() {
    return qtdeViasComprovante;
  }

  public void setQtdeViasComprovante(String qtdeViasComprovante) {
    this.qtdeViasComprovante = qtdeViasComprovante;
  }

  public InfPagamentoResp desconto(String desconto) {
    this.desconto = desconto;
    return this;
  }

  /**
   * Valor do desconto (12 dígitos, incluindo centavos).
   * @return desconto
  **/
  @ApiModelProperty(example = "000000000499", value = "Valor do desconto (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getDesconto() {
    return desconto;
  }

  public void setDesconto(String desconto) {
    this.desconto = desconto;
  }

  public InfPagamentoResp sistemaCobranca(SistemaCobrancaEnum sistemaCobranca) {
    this.sistemaCobranca = sistemaCobranca;
    return this;
  }

  /**
   * Informa se foi usado o novo sistema de cobrança de contas (00 = não, 01 = sim).
   * @return sistemaCobranca
  **/
  @ApiModelProperty(example = "01", value = "Informa se foi usado o novo sistema de cobrança de contas (00 = não, 01 = sim).")


  public SistemaCobrancaEnum getSistemaCobranca() {
    return sistemaCobranca;
  }

  public void setSistemaCobranca(SistemaCobrancaEnum sistemaCobranca) {
    this.sistemaCobranca = sistemaCobranca;
  }

  public InfPagamentoResp cupom(String cupom) {
    this.cupom = cupom;
    return this;
  }

  /**
   * Cupom no mesmo formato do comprovante. Linhas com 48 posições separadas por '@'.
   * @return cupom
  **/
  @ApiModelProperty(example = "             TEU BILHETE ANTECIPADO             @                036200005433591                @               13/10/2018  20:24               @           VALOR DA RECARGA: R$ 48,00           @                 TAXAS: R$ 2,00                 @              TOTAL PAGO: R$ 50,00              @   OS CRÉDITOS ADQUIRIDOS ESTARÃO DISPONÍVEIS   @      NOS VALIDADORES DOS ÔNIBUS DA REGIÃO      @     METROPOLITANA QUE ACEITAM O CARTÃO TEU     @ OU NAS CATRACAS DO METRÔ, NOS SEGUINTES PRAZOS @            RECARGAS ATÉ O MEIO DIA:            @ CRÉDITOS DISPONÍVEIS NO DIA SEGUINTE DA COMPRA @           RECARGAS APÓS O MEIO DIA:           @   CRÉDITOS DISPONÍVEIS EM 48H APÓS A COMPRA   ", value = "Cupom no mesmo formato do comprovante. Linhas com 48 posições separadas por '@'.")

@Pattern(regexp="^[^@]{0,48}(\\@[^@]{0,48})*$") 
  public String getCupom() {
    return cupom;
  }

  public void setCupom(String cupom) {
    this.cupom = cupom;
  }

  public InfPagamentoResp recibo(String recibo) {
    this.recibo = recibo;
    return this;
  }

  /**
   * Recibo de pagamento ou agendamento. Linhas com 48 posições separadas por '@'.
   * @return recibo
  **/
  @ApiModelProperty(example = "             TEU BILHETE ANTECIPADO             @                036200005433591                @               13/10/2018  20:24               @           VALOR DA RECARGA: R$ 48,00           @                 TAXAS: R$ 2,00                 @              TOTAL PAGO: R$ 50,00              @   OS CRÉDITOS ADQUIRIDOS ESTARÃO DISPONÍVEIS   @      NOS VALIDADORES DOS ÔNIBUS DA REGIÃO      @     METROPOLITANA QUE ACEITAM O CARTÃO TEU     @ OU NAS CATRACAS DO METRÔ, NOS SEGUINTES PRAZOS @            RECARGAS ATÉ O MEIO DIA:            @ CRÉDITOS DISPONÍVEIS NO DIA SEGUINTE DA COMPRA @           RECARGAS APÓS O MEIO DIA:           @   CRÉDITOS DISPONÍVEIS EM 48H APÓS A COMPRA   ", value = "Recibo de pagamento ou agendamento. Linhas com 48 posições separadas por '@'.")

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
    InfPagamentoResp infPagamentoResp = (InfPagamentoResp) o;
    return Objects.equals(this.valor, infPagamentoResp.valor) &&
        Objects.equals(this.cedente, infPagamentoResp.cedente) &&
        Objects.equals(this.dataPagamento, infPagamentoResp.dataPagamento) &&
        Objects.equals(this.mensagem, infPagamentoResp.mensagem) &&
        Objects.equals(this.qtdeViasComprovante, infPagamentoResp.qtdeViasComprovante) &&
        Objects.equals(this.desconto, infPagamentoResp.desconto) &&
        Objects.equals(this.sistemaCobranca, infPagamentoResp.sistemaCobranca) &&
        Objects.equals(this.cupom, infPagamentoResp.cupom) &&
        Objects.equals(this.recibo, infPagamentoResp.recibo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valor, cedente, dataPagamento, mensagem, qtdeViasComprovante, desconto, sistemaCobranca, cupom, recibo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfPagamentoResp {\n");
    
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    cedente: ").append(toIndentedString(cedente)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
    sb.append("    qtdeViasComprovante: ").append(toIndentedString(qtdeViasComprovante)).append("\n");
    sb.append("    desconto: ").append(toIndentedString(desconto)).append("\n");
    sb.append("    sistemaCobranca: ").append(toIndentedString(sistemaCobranca)).append("\n");
    sb.append("    cupom: ").append(toIndentedString(cupom)).append("\n");
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


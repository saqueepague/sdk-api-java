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
 * InfPagamentoResp
 */
@Validated
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

  @JsonProperty("recibo")
  private String recibo = null;

  public InfPagamentoResp valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Valor atualizado pelo parceiro (12 dígitos, incluindo centavos).
   * @return valor
  **/
  @ApiModelProperty(example = "000000005000", required = true, value = "Valor atualizado pelo parceiro (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$")   public String getValor() {
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

  public InfPagamentoResp dataPagamento(String dataPagamento) {
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

  public InfPagamentoResp mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }

  /**
   * Mensagem informativa quanto à alteração de valores e/ou data de pagamento pelo paceiro.
   * @return mensagem
  **/
  @ApiModelProperty(example = "Esta &eacute; uma mensagem para exibi&ccedil;&atilde;o em tela.", value = "Mensagem informativa quanto à alteração de valores e/ou data de pagamento pelo paceiro.")

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
  @ApiModelProperty(example = "1", required = true, value = "Quantidade de vias para impressão do Comprovante.")
  @NotNull

@Pattern(regexp="^\\d+$")   public String getQtdeViasComprovante() {
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
  @ApiModelProperty(example = "000000000499", required = true, value = "Valor do desconto (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$")   public String getDesconto() {
    return desconto;
  }

  public void setDesconto(String desconto) {
    this.desconto = desconto;
  }

  public InfPagamentoResp recibo(String recibo) {
    this.recibo = recibo;
    return this;
  }

  /**
   * Recibo da transação de pagamento. Linhas com 48 posições separadas por \"@\".
   * @return recibo
  **/
  @ApiModelProperty(example = "@            COMPROVANTE DE PAGAMENTO            @                                                @ CEDENTE: 008 BANCO SAQUE E PAGUE               @ VALOR..: 263,85                                @ DATA DO PAGAMENTO.: 29/01/2019                 @ CODIGO DE BARRAS                               @@   84600000000-3 25850072001-1                 @   10357244475-5 01192190121-8                  @", required = true, value = "Recibo da transação de pagamento. Linhas com 48 posições separadas por \"@\".")
  @NotNull

@Pattern(regexp="^[^@]{0,48}(\\@[^@]{0,48})*$")   public String getRecibo() {
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
        Objects.equals(this.recibo, infPagamentoResp.recibo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valor, cedente, dataPagamento, mensagem, qtdeViasComprovante, desconto, recibo);
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

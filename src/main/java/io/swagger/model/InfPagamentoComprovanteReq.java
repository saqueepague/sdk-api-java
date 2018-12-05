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
 * Informações da requisição de comprovante de pagamento.
 */
@ApiModel(description = "Informações da requisição de comprovante de pagamento.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfPagamentoComprovanteReq   {
  @JsonProperty("cedente")
  private String cedente = null;

  @JsonProperty("dataVencimento")
  private String dataVencimento = null;

  @JsonProperty("dataPagamento")
  private String dataPagamento = null;

  @JsonProperty("valorTotal")
  private String valorTotal = null;

  @JsonProperty("recibo")
  private String recibo = null;

  public InfPagamentoComprovanteReq cedente(String cedente) {
    this.cedente = cedente;
    return this;
  }

  /**
   * Nome do cedente do pagamento (até 40 caracteres).
   * @return cedente
  **/
  @ApiModelProperty(example = "Cedente", value = "Nome do cedente do pagamento (até 40 caracteres).")

@Pattern(regexp="^.{0,40}$") 
  public String getCedente() {
    return cedente;
  }

  public void setCedente(String cedente) {
    this.cedente = cedente;
  }

  public InfPagamentoComprovanteReq dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }

  /**
   * Data de vencimento do pagamento (AAAAMMDD).
   * @return dataVencimento
  **/
  @ApiModelProperty(example = "20181122", value = "Data de vencimento do pagamento (AAAAMMDD).")

@Pattern(regexp="^\\d{8}$") 
  public String getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public InfPagamentoComprovanteReq dataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
    return this;
  }

  /**
   * Data de agendamento do pagamento (AAAAMMDD).
   * @return dataPagamento
  **/
  @ApiModelProperty(example = "20181122", value = "Data de agendamento do pagamento (AAAAMMDD).")

@Pattern(regexp="^\\d{8}$") 
  public String getDataPagamento() {
    return dataPagamento;
  }

  public void setDataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  public InfPagamentoComprovanteReq valorTotal(String valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }

  /**
   * Valor total do pagamento (12 dígitos, incluindo centavos).
   * @return valorTotal
  **/
  @ApiModelProperty(example = "000000005000", value = "Valor total do pagamento (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(String valorTotal) {
    this.valorTotal = valorTotal;
  }

  public InfPagamentoComprovanteReq recibo(String recibo) {
    this.recibo = recibo;
    return this;
  }

  /**
   * Recibo com informações do pagamento. Linhas com 48 posições separadas por '@'.
   * @return recibo
  **/
  @ApiModelProperty(example = "             TEU BILHETE ANTECIPADO             @                036200005433591                @               13/10/2018  20:24               @           VALOR DA RECARGA: R$ 48,00           @                 TAXAS: R$ 2,00                 @              TOTAL PAGO: R$ 50,00              @   OS CRÉDITOS ADQUIRIDOS ESTARÃO DISPONÍVEIS   @      NOS VALIDADORES DOS ÔNIBUS DA REGIÃO      @     METROPOLITANA QUE ACEITAM O CARTÃO TEU     @ OU NAS CATRACAS DO METRÔ, NOS SEGUINTES PRAZOS @            RECARGAS ATÉ O MEIO DIA:            @ CRÉDITOS DISPONÍVEIS NO DIA SEGUINTE DA COMPRA @           RECARGAS APÓS O MEIO DIA:           @   CRÉDITOS DISPONÍVEIS EM 48H APÓS A COMPRA   ", value = "Recibo com informações do pagamento. Linhas com 48 posições separadas por '@'.")

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
    InfPagamentoComprovanteReq infPagamentoComprovanteReq = (InfPagamentoComprovanteReq) o;
    return Objects.equals(this.cedente, infPagamentoComprovanteReq.cedente) &&
        Objects.equals(this.dataVencimento, infPagamentoComprovanteReq.dataVencimento) &&
        Objects.equals(this.dataPagamento, infPagamentoComprovanteReq.dataPagamento) &&
        Objects.equals(this.valorTotal, infPagamentoComprovanteReq.valorTotal) &&
        Objects.equals(this.recibo, infPagamentoComprovanteReq.recibo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cedente, dataVencimento, dataPagamento, valorTotal, recibo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfPagamentoComprovanteReq {\n");
    
    sb.append("    cedente: ").append(toIndentedString(cedente)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
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


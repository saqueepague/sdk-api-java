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
 * Informações sobre o comprovante de pagamento e o recibo de pagamento a ser impresso.
 */
@ApiModel(description = "Informações sobre o comprovante de pagamento e o recibo de pagamento a ser impresso.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfReimpressaoComprovanteResp   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("cedente")
  private String cedente = null;

  @JsonProperty("dataVencimento")
  private String dataVencimento = null;

  @JsonProperty("dataPagamento")
  private String dataPagamento = null;

  @JsonProperty("valor")
  private String valor = null;

  @JsonProperty("recibo")
  private String recibo = null;

  public InfReimpressaoComprovanteResp id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identificação do comprovante de pagamento.
   * @return id
  **/
  @ApiModelProperty(example = "047382754927145", value = "Identificação do comprovante de pagamento.")

@Pattern(regexp="^\\d+$") 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InfReimpressaoComprovanteResp cedente(String cedente) {
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

  public InfReimpressaoComprovanteResp dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }

  /**
   * Data de vencimento do Boleto/Título (AAAAMMDD).
   * @return dataVencimento
  **/
  @ApiModelProperty(example = "20181122", value = "Data de vencimento do Boleto/Título (AAAAMMDD).")

@Pattern(regexp="^\\d{8}$") 
  public String getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public InfReimpressaoComprovanteResp dataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
    return this;
  }

  /**
   * Data em que o Boleto/Título foi pago (AAAAMMDD).
   * @return dataPagamento
  **/
  @ApiModelProperty(example = "20181122", value = "Data em que o Boleto/Título foi pago (AAAAMMDD).")

@Pattern(regexp="^\\d{8}$") 
  public String getDataPagamento() {
    return dataPagamento;
  }

  public void setDataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  public InfReimpressaoComprovanteResp valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Valor total pago (12 dpigitos, incluindo centavos).
   * @return valor
  **/
  @ApiModelProperty(example = "000000005000", value = "Valor total pago (12 dpigitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public InfReimpressaoComprovanteResp recibo(String recibo) {
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
    InfReimpressaoComprovanteResp infReimpressaoComprovanteResp = (InfReimpressaoComprovanteResp) o;
    return Objects.equals(this.id, infReimpressaoComprovanteResp.id) &&
        Objects.equals(this.cedente, infReimpressaoComprovanteResp.cedente) &&
        Objects.equals(this.dataVencimento, infReimpressaoComprovanteResp.dataVencimento) &&
        Objects.equals(this.dataPagamento, infReimpressaoComprovanteResp.dataPagamento) &&
        Objects.equals(this.valor, infReimpressaoComprovanteResp.valor) &&
        Objects.equals(this.recibo, infReimpressaoComprovanteResp.recibo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cedente, dataVencimento, dataPagamento, valor, recibo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfReimpressaoComprovanteResp {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cedente: ").append(toIndentedString(cedente)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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


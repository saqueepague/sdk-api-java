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
 * InfPagamentoReqCodBarras
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfPagamentoReqCodBarras   {
  @JsonProperty("codigo")
  private String codigo = null;

  @JsonProperty("dataPagamento")
  private String dataPagamento = null;

  @JsonProperty("dataVencimento")
  private String dataVencimento = null;

  /**
   * Forma de entrada do código de barras (0 = escaneado, 1 = digitado).
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

  @JsonProperty("numTitular")
  private String numTitular = null;

  @JsonProperty("valor")
  private String valor = null;

  public InfPagamentoReqCodBarras codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Código de barras do pagamento.
   * @return codigo
  **/
  @ApiModelProperty(required = true, value = "Código de barras do pagamento.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public InfPagamentoReqCodBarras dataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
    return this;
  }

  /**
   * Data em que o pagamento deve ser efetuado (AAAAMMDD).
   * @return dataPagamento
  **/
  @ApiModelProperty(example = "20181122", required = true, value = "Data em que o pagamento deve ser efetuado (AAAAMMDD).")
  @NotNull

@Pattern(regexp="^\\d{8}$") 
  public String getDataPagamento() {
    return dataPagamento;
  }

  public void setDataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  public InfPagamentoReqCodBarras dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }

  /**
   * Data de vencimento (AAAAMMDD).
   * @return dataVencimento
  **/
  @ApiModelProperty(example = "20181122", required = true, value = "Data de vencimento (AAAAMMDD).")
  @NotNull

@Pattern(regexp="^\\d{8}$") 
  public String getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public InfPagamentoReqCodBarras modoEntrada(ModoEntradaEnum modoEntrada) {
    this.modoEntrada = modoEntrada;
    return this;
  }

  /**
   * Forma de entrada do código de barras (0 = escaneado, 1 = digitado).
   * @return modoEntrada
  **/
  @ApiModelProperty(example = "0", required = true, value = "Forma de entrada do código de barras (0 = escaneado, 1 = digitado).")
  @NotNull


  public ModoEntradaEnum getModoEntrada() {
    return modoEntrada;
  }

  public void setModoEntrada(ModoEntradaEnum modoEntrada) {
    this.modoEntrada = modoEntrada;
  }

  public InfPagamentoReqCodBarras numTitular(String numTitular) {
    this.numTitular = numTitular;
    return this;
  }

  /**
   * Número do Titular.
   * @return numTitular
  **/
  @ApiModelProperty(required = true, value = "Número do Titular.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getNumTitular() {
    return numTitular;
  }

  public void setNumTitular(String numTitular) {
    this.numTitular = numTitular;
  }

  public InfPagamentoReqCodBarras valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Valor do pagamento (12 dígitos, incluindo centavos).
   * @return valor
  **/
  @ApiModelProperty(example = "000000001150", required = true, value = "Valor do pagamento (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfPagamentoReqCodBarras infPagamentoReqCodBarras = (InfPagamentoReqCodBarras) o;
    return Objects.equals(this.codigo, infPagamentoReqCodBarras.codigo) &&
        Objects.equals(this.dataPagamento, infPagamentoReqCodBarras.dataPagamento) &&
        Objects.equals(this.dataVencimento, infPagamentoReqCodBarras.dataVencimento) &&
        Objects.equals(this.modoEntrada, infPagamentoReqCodBarras.modoEntrada) &&
        Objects.equals(this.numTitular, infPagamentoReqCodBarras.numTitular) &&
        Objects.equals(this.valor, infPagamentoReqCodBarras.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, dataPagamento, dataVencimento, modoEntrada, numTitular, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfPagamentoReqCodBarras {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    modoEntrada: ").append(toIndentedString(modoEntrada)).append("\n");
    sb.append("    numTitular: ").append(toIndentedString(numTitular)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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


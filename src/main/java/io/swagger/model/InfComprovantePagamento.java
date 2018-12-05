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

public class InfComprovantePagamento   {
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

  public InfComprovantePagamento id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identificação do comprovante de pagamento.
   * @return id
  **/
  @ApiModelProperty(example = "036200001842241", value = "Identificação do comprovante de pagamento.")

@Pattern(regexp="^\\d+$") 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InfComprovantePagamento cedente(String cedente) {
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

  public InfComprovantePagamento dataVencimento(String dataVencimento) {
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

  public InfComprovantePagamento dataPagamento(String dataPagamento) {
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

  public InfComprovantePagamento valor(String valor) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfComprovantePagamento infComprovantePagamento = (InfComprovantePagamento) o;
    return Objects.equals(this.id, infComprovantePagamento.id) &&
        Objects.equals(this.cedente, infComprovantePagamento.cedente) &&
        Objects.equals(this.dataVencimento, infComprovantePagamento.dataVencimento) &&
        Objects.equals(this.dataPagamento, infComprovantePagamento.dataPagamento) &&
        Objects.equals(this.valor, infComprovantePagamento.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cedente, dataVencimento, dataPagamento, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfComprovantePagamento {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cedente: ").append(toIndentedString(cedente)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
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


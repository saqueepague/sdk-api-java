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
 * Informações da resquisição de agendamento de pagamento.
 */
@ApiModel(description = "Informações da resquisição de agendamento de pagamento.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfAgendamentoReq   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("cedente")
  private String cedente = null;

  @JsonProperty("dataVencimento")
  private String dataVencimento = null;

  @JsonProperty("dataPagamento")
  private String dataPagamento = null;

  @JsonProperty("valorTotal")
  private String valorTotal = null;

  public InfAgendamentoReq id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Código de identificação do agendamento de pagamento.
   * @return id
  **/
  @ApiModelProperty(example = "234", value = "Código de identificação do agendamento de pagamento.")

@Pattern(regexp="^\\d+$") 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InfAgendamentoReq cedente(String cedente) {
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

  public InfAgendamentoReq dataVencimento(String dataVencimento) {
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

  public InfAgendamentoReq dataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
    return this;
  }

  /**
   * Data de agendamento para o pagamento (AAAAMMDD).
   * @return dataPagamento
  **/
  @ApiModelProperty(example = "20181122", value = "Data de agendamento para o pagamento (AAAAMMDD).")

@Pattern(regexp="^\\d{8}$") 
  public String getDataPagamento() {
    return dataPagamento;
  }

  public void setDataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  public InfAgendamentoReq valorTotal(String valorTotal) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfAgendamentoReq infAgendamentoReq = (InfAgendamentoReq) o;
    return Objects.equals(this.id, infAgendamentoReq.id) &&
        Objects.equals(this.cedente, infAgendamentoReq.cedente) &&
        Objects.equals(this.dataVencimento, infAgendamentoReq.dataVencimento) &&
        Objects.equals(this.dataPagamento, infAgendamentoReq.dataPagamento) &&
        Objects.equals(this.valorTotal, infAgendamentoReq.valorTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cedente, dataVencimento, dataPagamento, valorTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfAgendamentoReq {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cedente: ").append(toIndentedString(cedente)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
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


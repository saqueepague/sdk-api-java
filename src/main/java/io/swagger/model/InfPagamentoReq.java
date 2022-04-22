package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfPagamentoReqCodBarras;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InfPagamentoReq
 */
@Validated
public class InfPagamentoReq   {
  @JsonProperty("cpf")
  private String cpf = null;

  @JsonProperty("codBanco")
  private String codBanco = null;

  @JsonProperty("numAgencia")
  private String numAgencia = null;

  @JsonProperty("numConta")
  private String numConta = null;

  /**
   * Tipo de conta do extrato (CC = conta corrente, CP = conta poupança, CS = conta Salário).
   */
  public enum TipoContaEnum {
    CC("CC"),
    
    CP("CP"),
    
    CS("CS");

    private String value;

    TipoContaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TipoContaEnum fromValue(String text) {
      for (TipoContaEnum b : TipoContaEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("tipoConta")
  private TipoContaEnum tipoConta = null;

  @JsonProperty("desconto")
  private String desconto = null;

  @JsonProperty("telefone")
  private String telefone = null;

  @JsonProperty("numConsultaPagamento")
  private String numConsultaPagamento = null;

  @JsonProperty("codBarras")
  private InfPagamentoReqCodBarras codBarras = null;

  public InfPagamentoReq cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * número do CPF ou CNPJ (11 dígitos ou 14 dígitos respectivamente).
   * @return cpf
  **/
  @ApiModelProperty(example = "01234567890", value = "número do CPF ou CNPJ (11 dígitos ou 14 dígitos respectivamente).")

@Pattern(regexp="^\\d{14}|\\d{11}$")   public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public InfPagamentoReq codBanco(String codBanco) {
    this.codBanco = codBanco;
    return this;
  }

  /**
   * Código do banco utilizado na operação (3 dígitos).
   * @return codBanco
  **/
  @ApiModelProperty(example = "237", value = "Código do banco utilizado na operação (3 dígitos).")

@Pattern(regexp="^\\d{3}$")   public String getCodBanco() {
    return codBanco;
  }

  public void setCodBanco(String codBanco) {
    this.codBanco = codBanco;
  }

  public InfPagamentoReq numAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
    return this;
  }

  /**
   * número da Agência utilizada na operação.
   * @return numAgencia
  **/
  @ApiModelProperty(example = "4029", value = "número da Agência utilizada na operação.")

@Pattern(regexp="^\\d+$")   public String getNumAgencia() {
    return numAgencia;
  }

  public void setNumAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
  }

  public InfPagamentoReq numConta(String numConta) {
    this.numConta = numConta;
    return this;
  }

  /**
   * número da conta utilizada na operação.
   * @return numConta
  **/
  @ApiModelProperty(example = "0082348296", value = "número da conta utilizada na operação.")

@Pattern(regexp="^\\d+$")   public String getNumConta() {
    return numConta;
  }

  public void setNumConta(String numConta) {
    this.numConta = numConta;
  }

  public InfPagamentoReq tipoConta(TipoContaEnum tipoConta) {
    this.tipoConta = tipoConta;
    return this;
  }

  /**
   * Tipo de conta do extrato (CC = conta corrente, CP = conta poupança, CS = conta Salário).
   * @return tipoConta
  **/
  @ApiModelProperty(example = "CC", value = "Tipo de conta do extrato (CC = conta corrente, CP = conta poupança, CS = conta Salário).")

  public TipoContaEnum getTipoConta() {
    return tipoConta;
  }

  public void setTipoConta(TipoContaEnum tipoConta) {
    this.tipoConta = tipoConta;
  }

  public InfPagamentoReq desconto(String desconto) {
    this.desconto = desconto;
    return this;
  }

  /**
   * Valor do desconto (12 dígitos, incluindo centavos).
   * @return desconto
  **/
  @ApiModelProperty(example = "000000000499", value = "Valor do desconto (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$")   public String getDesconto() {
    return desconto;
  }

  public void setDesconto(String desconto) {
    this.desconto = desconto;
  }

  public InfPagamentoReq telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }

  /**
   * Telefone declarado na transação (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).
   * @return telefone
  **/
  @ApiModelProperty(example = "05199999999", value = "Telefone declarado na transação (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).")

@Pattern(regexp="^\\d{11}$")   public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public InfPagamentoReq numConsultaPagamento(String numConsultaPagamento) {
    this.numConsultaPagamento = numConsultaPagamento;
    return this;
  }

  /**
   * NSU autorizador da transação de consulta de pagamento associada.
   * @return numConsultaPagamento
  **/
  @ApiModelProperty(example = "000080247206", value = "NSU autorizador da transação de consulta de pagamento associada.")

@Pattern(regexp="^\\d{12}$")   public String getNumConsultaPagamento() {
    return numConsultaPagamento;
  }

  public void setNumConsultaPagamento(String numConsultaPagamento) {
    this.numConsultaPagamento = numConsultaPagamento;
  }

  public InfPagamentoReq codBarras(InfPagamentoReqCodBarras codBarras) {
    this.codBarras = codBarras;
    return this;
  }

  /**
   * Get codBarras
   * @return codBarras
  **/
  @ApiModelProperty(value = "")

  @Valid
  public InfPagamentoReqCodBarras getCodBarras() {
    return codBarras;
  }

  public void setCodBarras(InfPagamentoReqCodBarras codBarras) {
    this.codBarras = codBarras;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfPagamentoReq infPagamentoReq = (InfPagamentoReq) o;
    return Objects.equals(this.cpf, infPagamentoReq.cpf) &&
        Objects.equals(this.codBanco, infPagamentoReq.codBanco) &&
        Objects.equals(this.numAgencia, infPagamentoReq.numAgencia) &&
        Objects.equals(this.numConta, infPagamentoReq.numConta) &&
        Objects.equals(this.tipoConta, infPagamentoReq.tipoConta) &&
        Objects.equals(this.desconto, infPagamentoReq.desconto) &&
        Objects.equals(this.telefone, infPagamentoReq.telefone) &&
        Objects.equals(this.numConsultaPagamento, infPagamentoReq.numConsultaPagamento) &&
        Objects.equals(this.codBarras, infPagamentoReq.codBarras);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, codBanco, numAgencia, numConta, tipoConta, desconto, telefone, numConsultaPagamento, codBarras);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfPagamentoReq {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    codBanco: ").append(toIndentedString(codBanco)).append("\n");
    sb.append("    numAgencia: ").append(toIndentedString(numAgencia)).append("\n");
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
    sb.append("    tipoConta: ").append(toIndentedString(tipoConta)).append("\n");
    sb.append("    desconto: ").append(toIndentedString(desconto)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("    numConsultaPagamento: ").append(toIndentedString(numConsultaPagamento)).append("\n");
    sb.append("    codBarras: ").append(toIndentedString(codBarras)).append("\n");
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

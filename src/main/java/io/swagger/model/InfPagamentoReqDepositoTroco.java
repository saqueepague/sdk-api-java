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
 * Informações da conta para o crédito do troco.
 */
@ApiModel(description = "Informações da conta para o crédito do troco.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfPagamentoReqDepositoTroco   {
  @JsonProperty("codBanco")
  private String codBanco = null;

  @JsonProperty("numAgencia")
  private String numAgencia = null;

  @JsonProperty("numConta")
  private String numConta = null;

  /**
   * Tipo de conta (CC = corrente, CP = poupança, CS = salário).
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

  @JsonProperty("telefone")
  private String telefone = null;

  @JsonProperty("cpfCNPJ")
  private String cpfCNPJ = null;

  public InfPagamentoReqDepositoTroco codBanco(String codBanco) {
    this.codBanco = codBanco;
    return this;
  }

  /**
   * Código do banco utilizado na operação (3 dígitos).
   * @return codBanco
  **/
  @ApiModelProperty(example = "237", value = "Código do banco utilizado na operação (3 dígitos).")

@Pattern(regexp="^\\d{3}$") 
  public String getCodBanco() {
    return codBanco;
  }

  public void setCodBanco(String codBanco) {
    this.codBanco = codBanco;
  }

  public InfPagamentoReqDepositoTroco numAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
    return this;
  }

  /**
   * Número da agência utilizada na operação (4 dígitos).
   * @return numAgencia
  **/
  @ApiModelProperty(example = "4029", value = "Número da agência utilizada na operação (4 dígitos).")

@Pattern(regexp="^\\d{4}$") 
  public String getNumAgencia() {
    return numAgencia;
  }

  public void setNumAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
  }

  public InfPagamentoReqDepositoTroco numConta(String numConta) {
    this.numConta = numConta;
    return this;
  }

  /**
   * Número da conta utilizada na operação (10 dígitos).
   * @return numConta
  **/
  @ApiModelProperty(example = "0082348296", value = "Número da conta utilizada na operação (10 dígitos).")

@Pattern(regexp="^\\d{10}$") 
  public String getNumConta() {
    return numConta;
  }

  public void setNumConta(String numConta) {
    this.numConta = numConta;
  }

  public InfPagamentoReqDepositoTroco tipoConta(TipoContaEnum tipoConta) {
    this.tipoConta = tipoConta;
    return this;
  }

  /**
   * Tipo de conta (CC = corrente, CP = poupança, CS = salário).
   * @return tipoConta
  **/
  @ApiModelProperty(example = "CS", value = "Tipo de conta (CC = corrente, CP = poupança, CS = salário).")


  public TipoContaEnum getTipoConta() {
    return tipoConta;
  }

  public void setTipoConta(TipoContaEnum tipoConta) {
    this.tipoConta = tipoConta;
  }

  public InfPagamentoReqDepositoTroco telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }

  /**
   * Telefone do cliente realizando a operação (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).
   * @return telefone
  **/
  @ApiModelProperty(example = "05199999999", value = "Telefone do cliente realizando a operação (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).")

@Pattern(regexp="^\\d{11}$") 
  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public InfPagamentoReqDepositoTroco cpfCNPJ(String cpfCNPJ) {
    this.cpfCNPJ = cpfCNPJ;
    return this;
  }

  /**
   * Número do CPF ou CNPJ (11 ou 14 dígitos).
   * @return cpfCNPJ
  **/
  @ApiModelProperty(example = "02358427000112", value = "Número do CPF ou CNPJ (11 ou 14 dígitos).")

@Pattern(regexp="^\\d{14}|\\d{11}$") 
  public String getCpfCNPJ() {
    return cpfCNPJ;
  }

  public void setCpfCNPJ(String cpfCNPJ) {
    this.cpfCNPJ = cpfCNPJ;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfPagamentoReqDepositoTroco infPagamentoReqDepositoTroco = (InfPagamentoReqDepositoTroco) o;
    return Objects.equals(this.codBanco, infPagamentoReqDepositoTroco.codBanco) &&
        Objects.equals(this.numAgencia, infPagamentoReqDepositoTroco.numAgencia) &&
        Objects.equals(this.numConta, infPagamentoReqDepositoTroco.numConta) &&
        Objects.equals(this.tipoConta, infPagamentoReqDepositoTroco.tipoConta) &&
        Objects.equals(this.telefone, infPagamentoReqDepositoTroco.telefone) &&
        Objects.equals(this.cpfCNPJ, infPagamentoReqDepositoTroco.cpfCNPJ);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codBanco, numAgencia, numConta, tipoConta, telefone, cpfCNPJ);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfPagamentoReqDepositoTroco {\n");
    
    sb.append("    codBanco: ").append(toIndentedString(codBanco)).append("\n");
    sb.append("    numAgencia: ").append(toIndentedString(numAgencia)).append("\n");
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
    sb.append("    tipoConta: ").append(toIndentedString(tipoConta)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("    cpfCNPJ: ").append(toIndentedString(cpfCNPJ)).append("\n");
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


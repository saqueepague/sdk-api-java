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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

public class InfPagamentoReqDepositoTroco   {
  @JsonProperty("codBanco")
  private String codBanco = null;

  @JsonProperty("cpfCNPJ")
  private String cpfCNPJ = null;

  @JsonProperty("numAgencia")
  private String numAgencia = null;

  @JsonProperty("numConta")
  private String numConta = null;

  @JsonProperty("telefone")
  private String telefone = null;

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

  public InfPagamentoReqDepositoTroco numAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
    return this;
  }

  /**
   * Número da agência utilizada na operação.
   * @return numAgencia
  **/
  @ApiModelProperty(example = "4029", value = "Número da agência utilizada na operação.")

@Pattern(regexp="^\\d+$") 
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
   * Número da conta utilizada na operação.
   * @return numConta
  **/
  @ApiModelProperty(example = "0082348296", value = "Número da conta utilizada na operação.")

@Pattern(regexp="^\\d+$") 
  public String getNumConta() {
    return numConta;
  }

  public void setNumConta(String numConta) {
    this.numConta = numConta;
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
        Objects.equals(this.cpfCNPJ, infPagamentoReqDepositoTroco.cpfCNPJ) &&
        Objects.equals(this.numAgencia, infPagamentoReqDepositoTroco.numAgencia) &&
        Objects.equals(this.numConta, infPagamentoReqDepositoTroco.numConta) &&
        Objects.equals(this.telefone, infPagamentoReqDepositoTroco.telefone) &&
        Objects.equals(this.tipoConta, infPagamentoReqDepositoTroco.tipoConta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codBanco, cpfCNPJ, numAgencia, numConta, telefone, tipoConta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfPagamentoReqDepositoTroco {\n");
    
    sb.append("    codBanco: ").append(toIndentedString(codBanco)).append("\n");
    sb.append("    cpfCNPJ: ").append(toIndentedString(cpfCNPJ)).append("\n");
    sb.append("    numAgencia: ").append(toIndentedString(numAgencia)).append("\n");
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("    tipoConta: ").append(toIndentedString(tipoConta)).append("\n");
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


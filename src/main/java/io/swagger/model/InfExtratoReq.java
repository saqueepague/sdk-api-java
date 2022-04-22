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
 * Informações da requisição de extrato.
 */
@ApiModel(description = "Informações da requisição de extrato.")
@Validated
public class InfExtratoReq   {
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

  @JsonProperty("codBanco")
  private String codBanco = null;

  @JsonProperty("numAgencia")
  private String numAgencia = null;

  @JsonProperty("numConta")
  private String numConta = null;

  @JsonProperty("cpf")
  private String cpf = null;

  @JsonProperty("telefone")
  private String telefone = null;

  public InfExtratoReq tipoConta(TipoContaEnum tipoConta) {
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

  public InfExtratoReq codBanco(String codBanco) {
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

  public InfExtratoReq numAgencia(String numAgencia) {
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

  public InfExtratoReq numConta(String numConta) {
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

  public InfExtratoReq cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * número do CPF do cliente realizando a operação (11 dígitos).
   * @return cpf
  **/
  @ApiModelProperty(example = "02358422785", value = "número do CPF do cliente realizando a operação (11 dígitos).")

@Pattern(regexp="^\\d{11}$")   public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public InfExtratoReq telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }

  /**
   * Telefone do cliente realizando a operação (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).
   * @return telefone
  **/
  @ApiModelProperty(example = "51999999999", value = "Telefone do cliente realizando a operação (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).")

@Pattern(regexp="^\\d{11}$")   public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfExtratoReq infExtratoReq = (InfExtratoReq) o;
    return Objects.equals(this.tipoConta, infExtratoReq.tipoConta) &&
        Objects.equals(this.codBanco, infExtratoReq.codBanco) &&
        Objects.equals(this.numAgencia, infExtratoReq.numAgencia) &&
        Objects.equals(this.numConta, infExtratoReq.numConta) &&
        Objects.equals(this.cpf, infExtratoReq.cpf) &&
        Objects.equals(this.telefone, infExtratoReq.telefone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoConta, codBanco, numAgencia, numConta, cpf, telefone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfExtratoReq {\n");
    
    sb.append("    tipoConta: ").append(toIndentedString(tipoConta)).append("\n");
    sb.append("    codBanco: ").append(toIndentedString(codBanco)).append("\n");
    sb.append("    numAgencia: ").append(toIndentedString(numAgencia)).append("\n");
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
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

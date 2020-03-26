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
 * Informações sobre a origem da transferência.
 */
@ApiModel(description = "Informações sobre a origem da transferência.")
@Validated
public class InfTransferenciaReqOrigem   {
  /**
   * Tipo de conta de origem (CC– Conta Corrente, CP-Conta Poupança, CS-Conta Salário)
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

  @JsonProperty("cpfcnpj")
  private String cpfcnpj = null;

  @JsonProperty("nomeCliente")
  private String nomeCliente = null;

  public InfTransferenciaReqOrigem tipoConta(TipoContaEnum tipoConta) {
    this.tipoConta = tipoConta;
    return this;
  }

  /**
   * Tipo de conta de origem (CC– Conta Corrente, CP-Conta Poupança, CS-Conta Salário)
   * @return tipoConta
  **/
  @ApiModelProperty(example = "CC", value = "Tipo de conta de origem (CC– Conta Corrente, CP-Conta Poupança, CS-Conta Salário)")

  public TipoContaEnum getTipoConta() {
    return tipoConta;
  }

  public void setTipoConta(TipoContaEnum tipoConta) {
    this.tipoConta = tipoConta;
  }

  public InfTransferenciaReqOrigem codBanco(String codBanco) {
    this.codBanco = codBanco;
    return this;
  }

  /**
   * Código do banco de origem (3 dígitos).
   * @return codBanco
  **/
  @ApiModelProperty(example = "237", value = "Código do banco de origem (3 dígitos).")

@Pattern(regexp="^\\d{3}$")   public String getCodBanco() {
    return codBanco;
  }

  public void setCodBanco(String codBanco) {
    this.codBanco = codBanco;
  }

  public InfTransferenciaReqOrigem numAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
    return this;
  }

  /**
   * Número da agência de origem.
   * @return numAgencia
  **/
  @ApiModelProperty(example = "4029", value = "Número da agência de origem.")

@Pattern(regexp="^\\d+$")   public String getNumAgencia() {
    return numAgencia;
  }

  public void setNumAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
  }

  public InfTransferenciaReqOrigem numConta(String numConta) {
    this.numConta = numConta;
    return this;
  }

  /**
   * Número da conta de origem.
   * @return numConta
  **/
  @ApiModelProperty(example = "0082348296", value = "Número da conta de origem.")

@Pattern(regexp="^\\d+$")   public String getNumConta() {
    return numConta;
  }

  public void setNumConta(String numConta) {
    this.numConta = numConta;
  }

  public InfTransferenciaReqOrigem cpfcnpj(String cpfcnpj) {
    this.cpfcnpj = cpfcnpj;
    return this;
  }

  /**
   * Número do CPF ou CNPJ de origem da transferência (11 dígitos ou 14 dígitos respectivamente).
   * @return cpfcnpj
  **/
  @ApiModelProperty(example = "02358422785", value = "Número do CPF ou CNPJ de origem da transferência (11 dígitos ou 14 dígitos respectivamente).")

@Pattern(regexp="^\\d{14}|\\d{11}$")   public String getCpfcnpj() {
    return cpfcnpj;
  }

  public void setCpfcnpj(String cpfcnpj) {
    this.cpfcnpj = cpfcnpj;
  }

  public InfTransferenciaReqOrigem nomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
    return this;
  }

  /**
   * Nome do cliente de origem.
   * @return nomeCliente
  **/
  @ApiModelProperty(example = "Jean-Luc Picard", value = "Nome do cliente de origem.")

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfTransferenciaReqOrigem infTransferenciaReqOrigem = (InfTransferenciaReqOrigem) o;
    return Objects.equals(this.tipoConta, infTransferenciaReqOrigem.tipoConta) &&
        Objects.equals(this.codBanco, infTransferenciaReqOrigem.codBanco) &&
        Objects.equals(this.numAgencia, infTransferenciaReqOrigem.numAgencia) &&
        Objects.equals(this.numConta, infTransferenciaReqOrigem.numConta) &&
        Objects.equals(this.cpfcnpj, infTransferenciaReqOrigem.cpfcnpj) &&
        Objects.equals(this.nomeCliente, infTransferenciaReqOrigem.nomeCliente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tipoConta, codBanco, numAgencia, numConta, cpfcnpj, nomeCliente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfTransferenciaReqOrigem {\n");
    
    sb.append("    tipoConta: ").append(toIndentedString(tipoConta)).append("\n");
    sb.append("    codBanco: ").append(toIndentedString(codBanco)).append("\n");
    sb.append("    numAgencia: ").append(toIndentedString(numAgencia)).append("\n");
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
    sb.append("    cpfcnpj: ").append(toIndentedString(cpfcnpj)).append("\n");
    sb.append("    nomeCliente: ").append(toIndentedString(nomeCliente)).append("\n");
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

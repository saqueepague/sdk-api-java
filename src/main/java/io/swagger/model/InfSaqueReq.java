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
 * Informações sobre a requisição de saque.
 */
@ApiModel(description = "Informações sobre a requisição de saque.")
@Validated
public class InfSaqueReq   {
  @JsonProperty("numAgencia")
  private String numAgencia = null;

  @JsonProperty("numConta")
  private String numConta = null;

  @JsonProperty("cpf")
  private String cpf = null;

  @JsonProperty("telefone")
  private String telefone = null;

  @JsonProperty("txId")
  private String txId = null;

  public InfSaqueReq numAgencia(String numAgencia) {
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

  public InfSaqueReq numConta(String numConta) {
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

  public InfSaqueReq cpf(String cpf) {
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

  public InfSaqueReq telefone(String telefone) {
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

  public InfSaqueReq txId(String txId) {
    this.txId = txId;
    return this;
  }

  /**
   * No caso de um saque usando QR Code, enviar nesse campo o id pix da transação, gerado na consulta saque. Caso não seja usada a infraestrutura do pix para a geração do QR Code, o campo é opcional.
   * @return txId
  **/
  @ApiModelProperty(example = "abcd1234", value = "No caso de um saque usando QR Code, enviar nesse campo o id pix da transação, gerado na consulta saque. Caso não seja usada a infraestrutura do pix para a geração do QR Code, o campo é opcional.")

  public String getTxId() {
    return txId;
  }

  public void setTxId(String txId) {
    this.txId = txId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfSaqueReq infSaqueReq = (InfSaqueReq) o;
    return Objects.equals(this.numAgencia, infSaqueReq.numAgencia) &&
        Objects.equals(this.numConta, infSaqueReq.numConta) &&
        Objects.equals(this.cpf, infSaqueReq.cpf) &&
        Objects.equals(this.telefone, infSaqueReq.telefone) &&
        Objects.equals(this.txId, infSaqueReq.txId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numAgencia, numConta, cpf, telefone, txId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfSaqueReq {\n");
    
    sb.append("    numAgencia: ").append(toIndentedString(numAgencia)).append("\n");
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
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

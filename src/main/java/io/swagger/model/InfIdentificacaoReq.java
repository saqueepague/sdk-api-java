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
 * Informações da requisição de identificação do cliente através do cartão.
 */
@ApiModel(description = "Informações da requisição de identificação do cliente através do cartão.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfIdentificacaoReq   {
  @JsonProperty("cpf")
  private String cpf = null;

  @JsonProperty("numAgencia")
  private String numAgencia = null;

  @JsonProperty("numConta")
  private String numConta = null;

  @JsonProperty("telefone")
  private String telefone = null;

  public InfIdentificacaoReq cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * Número do CPF do cliente realizando a operação (11 dígitos).
   * @return cpf
  **/
  @ApiModelProperty(example = "02358422785", value = "Número do CPF do cliente realizando a operação (11 dígitos).")

@Pattern(regexp="^\\d{11}$") 
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public InfIdentificacaoReq numAgencia(String numAgencia) {
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

  public InfIdentificacaoReq numConta(String numConta) {
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

  public InfIdentificacaoReq telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }

  /**
   * Telefone do cliente realizando a operação (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).
   * @return telefone
  **/
  @ApiModelProperty(example = "51999999999", value = "Telefone do cliente realizando a operação (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).")

@Pattern(regexp="^\\d{11}$") 
  public String getTelefone() {
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
    InfIdentificacaoReq infIdentificacaoReq = (InfIdentificacaoReq) o;
    return Objects.equals(this.cpf, infIdentificacaoReq.cpf) &&
        Objects.equals(this.numAgencia, infIdentificacaoReq.numAgencia) &&
        Objects.equals(this.numConta, infIdentificacaoReq.numConta) &&
        Objects.equals(this.telefone, infIdentificacaoReq.telefone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, numAgencia, numConta, telefone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfIdentificacaoReq {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    numAgencia: ").append(toIndentedString(numAgencia)).append("\n");
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
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


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
 * Informações da requisição de consulta de saque.
 */
@ApiModel(description = "Informações da requisição de consulta de saque.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

public class InfConsultaSaqueReq   {
  @JsonProperty("cpfFavorecido")
  private String cpfFavorecido = null;

  @JsonProperty("numAgencia")
  private String numAgencia = null;

  @JsonProperty("numConta")
  private String numConta = null;

  @JsonProperty("tokenFavorecido")
  private String tokenFavorecido = null;

  public InfConsultaSaqueReq cpfFavorecido(String cpfFavorecido) {
    this.cpfFavorecido = cpfFavorecido;
    return this;
  }

  /**
   * Número do CPF do cliente favorecido da transação (11 dígitos).
   * @return cpfFavorecido
  **/
  @ApiModelProperty(example = "02358422785", value = "Número do CPF do cliente favorecido da transação (11 dígitos).")

@Pattern(regexp="^\\d{11}$") 
  public String getCpfFavorecido() {
    return cpfFavorecido;
  }

  public void setCpfFavorecido(String cpfFavorecido) {
    this.cpfFavorecido = cpfFavorecido;
  }

  public InfConsultaSaqueReq numAgencia(String numAgencia) {
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

  public InfConsultaSaqueReq numConta(String numConta) {
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

  public InfConsultaSaqueReq tokenFavorecido(String tokenFavorecido) {
    this.tokenFavorecido = tokenFavorecido;
    return this;
  }

  /**
   * Token gerado pela instituicao que identifica a transação.
   * @return tokenFavorecido
  **/
  @ApiModelProperty(example = "02C47DF604EB43B1", value = "Token gerado pela instituicao que identifica a transação.")


  public String getTokenFavorecido() {
    return tokenFavorecido;
  }

  public void setTokenFavorecido(String tokenFavorecido) {
    this.tokenFavorecido = tokenFavorecido;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaSaqueReq infConsultaSaqueReq = (InfConsultaSaqueReq) o;
    return Objects.equals(this.cpfFavorecido, infConsultaSaqueReq.cpfFavorecido) &&
        Objects.equals(this.numAgencia, infConsultaSaqueReq.numAgencia) &&
        Objects.equals(this.numConta, infConsultaSaqueReq.numConta) &&
        Objects.equals(this.tokenFavorecido, infConsultaSaqueReq.tokenFavorecido);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpfFavorecido, numAgencia, numConta, tokenFavorecido);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaSaqueReq {\n");
    
    sb.append("    cpfFavorecido: ").append(toIndentedString(cpfFavorecido)).append("\n");
    sb.append("    numAgencia: ").append(toIndentedString(numAgencia)).append("\n");
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
    sb.append("    tokenFavorecido: ").append(toIndentedString(tokenFavorecido)).append("\n");
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


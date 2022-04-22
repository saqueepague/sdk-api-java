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
 * Informações da requisição de Empréstimo.
 */
@ApiModel(description = "Informações da requisição de Empréstimo.")
@Validated
public class InfEmprestimoReq   {
  @JsonProperty("qntParcelas")
  private String qntParcelas = null;

  @JsonProperty("numAgencia")
  private String numAgencia = null;

  @JsonProperty("numConta")
  private String numConta = null;

  public InfEmprestimoReq qntParcelas(String qntParcelas) {
    this.qntParcelas = qntParcelas;
    return this;
  }

  /**
   * Quantidade de parcelas.
   * @return qntParcelas
  **/
  @ApiModelProperty(example = "6", required = true, value = "Quantidade de parcelas.")
  @NotNull

@Pattern(regexp="^\\d+$")   public String getQntParcelas() {
    return qntParcelas;
  }

  public void setQntParcelas(String qntParcelas) {
    this.qntParcelas = qntParcelas;
  }

  public InfEmprestimoReq numAgencia(String numAgencia) {
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

  public InfEmprestimoReq numConta(String numConta) {
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfEmprestimoReq infEmprestimoReq = (InfEmprestimoReq) o;
    return Objects.equals(this.qntParcelas, infEmprestimoReq.qntParcelas) &&
        Objects.equals(this.numAgencia, infEmprestimoReq.numAgencia) &&
        Objects.equals(this.numConta, infEmprestimoReq.numConta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qntParcelas, numAgencia, numConta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfEmprestimoReq {\n");
    
    sb.append("    qntParcelas: ").append(toIndentedString(qntParcelas)).append("\n");
    sb.append("    numAgencia: ").append(toIndentedString(numAgencia)).append("\n");
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
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

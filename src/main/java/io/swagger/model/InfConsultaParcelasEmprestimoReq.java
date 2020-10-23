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
 * Informações da requisição de consulta de condições de parcelamento de empréstimo.
 */
@ApiModel(description = "Informações da requisição de consulta de condições de parcelamento de empréstimo.")
@Validated
public class InfConsultaParcelasEmprestimoReq   {
  @JsonProperty("qtdParcelas")
  private String qtdParcelas = null;

  @JsonProperty("numAgencia")
  private String numAgencia = null;

  @JsonProperty("numConta")
  private String numConta = null;

  @JsonProperty("cpfFavorecido")
  private String cpfFavorecido = null;

  public InfConsultaParcelasEmprestimoReq qtdParcelas(String qtdParcelas) {
    this.qtdParcelas = qtdParcelas;
    return this;
  }

  /**
   * Quantidade de parcelas informadas pelo cliente.
   * @return qtdParcelas
  **/
  @ApiModelProperty(example = "320", value = "Quantidade de parcelas informadas pelo cliente.")

@Pattern(regexp="^\\d{03}$")   public String getQtdParcelas() {
    return qtdParcelas;
  }

  public void setQtdParcelas(String qtdParcelas) {
    this.qtdParcelas = qtdParcelas;
  }

  public InfConsultaParcelasEmprestimoReq numAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
    return this;
  }

  /**
   * Número da agência utilizada na operação.
   * @return numAgencia
  **/
  @ApiModelProperty(example = "4029", value = "Número da agência utilizada na operação.")

@Pattern(regexp="^\\d+$")   public String getNumAgencia() {
    return numAgencia;
  }

  public void setNumAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
  }

  public InfConsultaParcelasEmprestimoReq numConta(String numConta) {
    this.numConta = numConta;
    return this;
  }

  /**
   * Número da conta utilizada na operação.
   * @return numConta
  **/
  @ApiModelProperty(example = "0082348296", value = "Número da conta utilizada na operação.")

@Pattern(regexp="^\\d+$")   public String getNumConta() {
    return numConta;
  }

  public void setNumConta(String numConta) {
    this.numConta = numConta;
  }

  public InfConsultaParcelasEmprestimoReq cpfFavorecido(String cpfFavorecido) {
    this.cpfFavorecido = cpfFavorecido;
    return this;
  }

  /**
   * Número do CPF do cliente (11 dígitos).
   * @return cpfFavorecido
  **/
  @ApiModelProperty(example = "02358422785", value = "Número do CPF do cliente (11 dígitos).")

@Pattern(regexp="^\\d{11}$")   public String getCpfFavorecido() {
    return cpfFavorecido;
  }

  public void setCpfFavorecido(String cpfFavorecido) {
    this.cpfFavorecido = cpfFavorecido;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaParcelasEmprestimoReq infConsultaParcelasEmprestimoReq = (InfConsultaParcelasEmprestimoReq) o;
    return Objects.equals(this.qtdParcelas, infConsultaParcelasEmprestimoReq.qtdParcelas) &&
        Objects.equals(this.numAgencia, infConsultaParcelasEmprestimoReq.numAgencia) &&
        Objects.equals(this.numConta, infConsultaParcelasEmprestimoReq.numConta) &&
        Objects.equals(this.cpfFavorecido, infConsultaParcelasEmprestimoReq.cpfFavorecido);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qtdParcelas, numAgencia, numConta, cpfFavorecido);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaParcelasEmprestimoReq {\n");
    
    sb.append("    qtdParcelas: ").append(toIndentedString(qtdParcelas)).append("\n");
    sb.append("    numAgencia: ").append(toIndentedString(numAgencia)).append("\n");
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
    sb.append("    cpfFavorecido: ").append(toIndentedString(cpfFavorecido)).append("\n");
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

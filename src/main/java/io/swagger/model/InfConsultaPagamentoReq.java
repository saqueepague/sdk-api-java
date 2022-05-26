package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaPagamentoReqCodBarras;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InfConsultaPagamentoReq
 */
@Validated
public class InfConsultaPagamentoReq   {
  @JsonProperty("cpf")
  private String cpf = null;

  @JsonProperty("cnpj")
  private String cnpj = null;

  @JsonProperty("numAgencia")
  private String numAgencia = null;

  @JsonProperty("numConta")
  private String numConta = null;

  @JsonProperty("codBarras")
  private InfConsultaPagamentoReqCodBarras codBarras = null;

  public InfConsultaPagamentoReq cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * Número do CPF (11 dígitos).
   * @return cpf
  **/
  @ApiModelProperty(example = "01234567890", value = "Número do CPF (11 dígitos).")

@Pattern(regexp="^\\d{11}$")   public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public InfConsultaPagamentoReq cnpj(String cnpj) {
    this.cnpj = cnpj;
    return this;
  }

  /**
   * Número do CNPJ (14 dígitos).
   * @return cnpj
  **/
  @ApiModelProperty(example = "01234567890123", value = "Número do CNPJ (14 dígitos).")

@Pattern(regexp="^\\d{14}$")   public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
  }

  public InfConsultaPagamentoReq numAgencia(String numAgencia) {
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

  public InfConsultaPagamentoReq numConta(String numConta) {
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

  public InfConsultaPagamentoReq codBarras(InfConsultaPagamentoReqCodBarras codBarras) {
    this.codBarras = codBarras;
    return this;
  }

  /**
   * Get codBarras
   * @return codBarras
  **/
  @ApiModelProperty(value = "")

  @Valid
  public InfConsultaPagamentoReqCodBarras getCodBarras() {
    return codBarras;
  }

  public void setCodBarras(InfConsultaPagamentoReqCodBarras codBarras) {
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
    InfConsultaPagamentoReq infConsultaPagamentoReq = (InfConsultaPagamentoReq) o;
    return Objects.equals(this.cpf, infConsultaPagamentoReq.cpf) &&
        Objects.equals(this.cnpj, infConsultaPagamentoReq.cnpj) &&
        Objects.equals(this.numAgencia, infConsultaPagamentoReq.numAgencia) &&
        Objects.equals(this.numConta, infConsultaPagamentoReq.numConta) &&
        Objects.equals(this.codBarras, infConsultaPagamentoReq.codBarras);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, cnpj, numAgencia, numConta, codBarras);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPagamentoReq {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
    sb.append("    numAgencia: ").append(toIndentedString(numAgencia)).append("\n");
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
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

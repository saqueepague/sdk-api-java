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

  @JsonProperty("codBarras")
  private InfConsultaPagamentoReqCodBarras codBarras = null;

  public InfConsultaPagamentoReq cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * número do CPF (11 dígitos).
   * @return cpf
  **/
  @ApiModelProperty(example = "01234567890", value = "número do CPF (11 dígitos).")

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
   * número do CNPJ (14 dígitos).
   * @return cnpj
  **/
  @ApiModelProperty(example = "01234567890123", value = "número do CNPJ (14 dígitos).")

@Pattern(regexp="^\\d{14}$")   public String getCnpj() {
    return cnpj;
  }

  public void setCnpj(String cnpj) {
    this.cnpj = cnpj;
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
        Objects.equals(this.codBarras, infConsultaPagamentoReq.codBarras);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, cnpj, codBarras);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPagamentoReq {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    cnpj: ").append(toIndentedString(cnpj)).append("\n");
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

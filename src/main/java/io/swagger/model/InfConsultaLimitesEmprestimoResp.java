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
 * Informações da resposta da requisição de consulta de limite de empréstimos.
 */
@ApiModel(description = "Informações da resposta da requisição de consulta de limite de empréstimos.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfConsultaLimitesEmprestimoResp   {
  @JsonProperty("limiteMaximoEmprestimo")
  private String limiteMaximoEmprestimo = null;

  @JsonProperty("limiteMinimoEmprestimo")
  private String limiteMinimoEmprestimo = null;

  @JsonProperty("nomeAgenciaBancaria")
  private String nomeAgenciaBancaria = null;

  @JsonProperty("nomeTitularConta")
  private String nomeTitularConta = null;

  public InfConsultaLimitesEmprestimoResp limiteMaximoEmprestimo(String limiteMaximoEmprestimo) {
    this.limiteMaximoEmprestimo = limiteMaximoEmprestimo;
    return this;
  }

  /**
   * Valor máximo permitido de empréstimo (12 caracteres, incluindo centavos).
   * @return limiteMaximoEmprestimo
  **/
  @ApiModelProperty(example = "000005000000", required = true, value = "Valor máximo permitido de empréstimo (12 caracteres, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getLimiteMaximoEmprestimo() {
    return limiteMaximoEmprestimo;
  }

  public void setLimiteMaximoEmprestimo(String limiteMaximoEmprestimo) {
    this.limiteMaximoEmprestimo = limiteMaximoEmprestimo;
  }

  public InfConsultaLimitesEmprestimoResp limiteMinimoEmprestimo(String limiteMinimoEmprestimo) {
    this.limiteMinimoEmprestimo = limiteMinimoEmprestimo;
    return this;
  }

  /**
   * Valor mínimo permitido de empréstimo (12 caracteres, incluindo centavos).
   * @return limiteMinimoEmprestimo
  **/
  @ApiModelProperty(example = "000000500000", required = true, value = "Valor mínimo permitido de empréstimo (12 caracteres, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getLimiteMinimoEmprestimo() {
    return limiteMinimoEmprestimo;
  }

  public void setLimiteMinimoEmprestimo(String limiteMinimoEmprestimo) {
    this.limiteMinimoEmprestimo = limiteMinimoEmprestimo;
  }

  public InfConsultaLimitesEmprestimoResp nomeAgenciaBancaria(String nomeAgenciaBancaria) {
    this.nomeAgenciaBancaria = nomeAgenciaBancaria;
    return this;
  }

  /**
   * Nome da agencia bancária.
   * @return nomeAgenciaBancaria
  **/
  @ApiModelProperty(example = "Agência bancária", required = true, value = "Nome da agencia bancária.")
  @NotNull


  public String getNomeAgenciaBancaria() {
    return nomeAgenciaBancaria;
  }

  public void setNomeAgenciaBancaria(String nomeAgenciaBancaria) {
    this.nomeAgenciaBancaria = nomeAgenciaBancaria;
  }

  public InfConsultaLimitesEmprestimoResp nomeTitularConta(String nomeTitularConta) {
    this.nomeTitularConta = nomeTitularConta;
    return this;
  }

  /**
   * Nome do titular da conta.
   * @return nomeTitularConta
  **/
  @ApiModelProperty(example = "Carl Edward Sagan", required = true, value = "Nome do titular da conta.")
  @NotNull


  public String getNomeTitularConta() {
    return nomeTitularConta;
  }

  public void setNomeTitularConta(String nomeTitularConta) {
    this.nomeTitularConta = nomeTitularConta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaLimitesEmprestimoResp infConsultaLimitesEmprestimoResp = (InfConsultaLimitesEmprestimoResp) o;
    return Objects.equals(this.limiteMaximoEmprestimo, infConsultaLimitesEmprestimoResp.limiteMaximoEmprestimo) &&
        Objects.equals(this.limiteMinimoEmprestimo, infConsultaLimitesEmprestimoResp.limiteMinimoEmprestimo) &&
        Objects.equals(this.nomeAgenciaBancaria, infConsultaLimitesEmprestimoResp.nomeAgenciaBancaria) &&
        Objects.equals(this.nomeTitularConta, infConsultaLimitesEmprestimoResp.nomeTitularConta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(limiteMaximoEmprestimo, limiteMinimoEmprestimo, nomeAgenciaBancaria, nomeTitularConta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaLimitesEmprestimoResp {\n");
    
    sb.append("    limiteMaximoEmprestimo: ").append(toIndentedString(limiteMaximoEmprestimo)).append("\n");
    sb.append("    limiteMinimoEmprestimo: ").append(toIndentedString(limiteMinimoEmprestimo)).append("\n");
    sb.append("    nomeAgenciaBancaria: ").append(toIndentedString(nomeAgenciaBancaria)).append("\n");
    sb.append("    nomeTitularConta: ").append(toIndentedString(nomeTitularConta)).append("\n");
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


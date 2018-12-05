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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfConsultaLimitesEmprestimoResp   {
  @JsonProperty("nomeAgenciaBancaria")
  private String nomeAgenciaBancaria = null;

  @JsonProperty("nomeTitularConta")
  private String nomeTitularConta = null;

  @JsonProperty("limiteMinimoEmprestimo")
  private String limiteMinimoEmprestimo = null;

  @JsonProperty("limiteMaximoEmprestimo")
  private String limiteMaximoEmprestimo = null;

  public InfConsultaLimitesEmprestimoResp nomeAgenciaBancaria(String nomeAgenciaBancaria) {
    this.nomeAgenciaBancaria = nomeAgenciaBancaria;
    return this;
  }

  /**
   * Nome da agencia bancária (até 60 caracteres).
   * @return nomeAgenciaBancaria
  **/
  @ApiModelProperty(example = "Agência bancária", value = "Nome da agencia bancária (até 60 caracteres).")

@Pattern(regexp="^.{0,60}$") 
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
   * Nome do titular da conta (até 60 caracteres).
   * @return nomeTitularConta
  **/
  @ApiModelProperty(example = "Carl Edward Sagan", value = "Nome do titular da conta (até 60 caracteres).")

@Pattern(regexp="^.{0,60}$") 
  public String getNomeTitularConta() {
    return nomeTitularConta;
  }

  public void setNomeTitularConta(String nomeTitularConta) {
    this.nomeTitularConta = nomeTitularConta;
  }

  public InfConsultaLimitesEmprestimoResp limiteMinimoEmprestimo(String limiteMinimoEmprestimo) {
    this.limiteMinimoEmprestimo = limiteMinimoEmprestimo;
    return this;
  }

  /**
   * Valor mínimo permitido de empréstimo (12 caracteres, incluindo centavos).
   * @return limiteMinimoEmprestimo
  **/
  @ApiModelProperty(example = "000000500000", value = "Valor mínimo permitido de empréstimo (12 caracteres, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getLimiteMinimoEmprestimo() {
    return limiteMinimoEmprestimo;
  }

  public void setLimiteMinimoEmprestimo(String limiteMinimoEmprestimo) {
    this.limiteMinimoEmprestimo = limiteMinimoEmprestimo;
  }

  public InfConsultaLimitesEmprestimoResp limiteMaximoEmprestimo(String limiteMaximoEmprestimo) {
    this.limiteMaximoEmprestimo = limiteMaximoEmprestimo;
    return this;
  }

  /**
   * Valor máximo permitido de empréstimo (12 caracteres, incluindo centavos).
   * @return limiteMaximoEmprestimo
  **/
  @ApiModelProperty(example = "000005000000", value = "Valor máximo permitido de empréstimo (12 caracteres, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getLimiteMaximoEmprestimo() {
    return limiteMaximoEmprestimo;
  }

  public void setLimiteMaximoEmprestimo(String limiteMaximoEmprestimo) {
    this.limiteMaximoEmprestimo = limiteMaximoEmprestimo;
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
    return Objects.equals(this.nomeAgenciaBancaria, infConsultaLimitesEmprestimoResp.nomeAgenciaBancaria) &&
        Objects.equals(this.nomeTitularConta, infConsultaLimitesEmprestimoResp.nomeTitularConta) &&
        Objects.equals(this.limiteMinimoEmprestimo, infConsultaLimitesEmprestimoResp.limiteMinimoEmprestimo) &&
        Objects.equals(this.limiteMaximoEmprestimo, infConsultaLimitesEmprestimoResp.limiteMaximoEmprestimo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeAgenciaBancaria, nomeTitularConta, limiteMinimoEmprestimo, limiteMaximoEmprestimo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaLimitesEmprestimoResp {\n");
    
    sb.append("    nomeAgenciaBancaria: ").append(toIndentedString(nomeAgenciaBancaria)).append("\n");
    sb.append("    nomeTitularConta: ").append(toIndentedString(nomeTitularConta)).append("\n");
    sb.append("    limiteMinimoEmprestimo: ").append(toIndentedString(limiteMinimoEmprestimo)).append("\n");
    sb.append("    limiteMaximoEmprestimo: ").append(toIndentedString(limiteMaximoEmprestimo)).append("\n");
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


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
 * InfConsultaPagamentoReqDarf
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfConsultaPagamentoReqDarf   {
  @JsonProperty("periodoApuracao")
  private String periodoApuracao = null;

  @JsonProperty("codReceita")
  private String codReceita = null;

  @JsonProperty("numReferencia")
  private String numReferencia = null;

  public InfConsultaPagamentoReqDarf periodoApuracao(String periodoApuracao) {
    this.periodoApuracao = periodoApuracao;
    return this;
  }

  /**
   * Data de apuração do DARF (AAAAMMDD).
   * @return periodoApuracao
  **/
  @ApiModelProperty(example = "20181122", value = "Data de apuração do DARF (AAAAMMDD).")

@Pattern(regexp="^\\d{8}$") 
  public String getPeriodoApuracao() {
    return periodoApuracao;
  }

  public void setPeriodoApuracao(String periodoApuracao) {
    this.periodoApuracao = periodoApuracao;
  }

  public InfConsultaPagamentoReqDarf codReceita(String codReceita) {
    this.codReceita = codReceita;
    return this;
  }

  /**
   * Código da receita do DARF.
   * @return codReceita
  **/
  @ApiModelProperty(value = "Código da receita do DARF.")


  public String getCodReceita() {
    return codReceita;
  }

  public void setCodReceita(String codReceita) {
    this.codReceita = codReceita;
  }

  public InfConsultaPagamentoReqDarf numReferencia(String numReferencia) {
    this.numReferencia = numReferencia;
    return this;
  }

  /**
   * Número de referência.
   * @return numReferencia
  **/
  @ApiModelProperty(example = "7", value = "Número de referência.")

@Pattern(regexp="^\\d+$") 
  public String getNumReferencia() {
    return numReferencia;
  }

  public void setNumReferencia(String numReferencia) {
    this.numReferencia = numReferencia;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaPagamentoReqDarf infConsultaPagamentoReqDarf = (InfConsultaPagamentoReqDarf) o;
    return Objects.equals(this.periodoApuracao, infConsultaPagamentoReqDarf.periodoApuracao) &&
        Objects.equals(this.codReceita, infConsultaPagamentoReqDarf.codReceita) &&
        Objects.equals(this.numReferencia, infConsultaPagamentoReqDarf.numReferencia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodoApuracao, codReceita, numReferencia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPagamentoReqDarf {\n");
    
    sb.append("    periodoApuracao: ").append(toIndentedString(periodoApuracao)).append("\n");
    sb.append("    codReceita: ").append(toIndentedString(codReceita)).append("\n");
    sb.append("    numReferencia: ").append(toIndentedString(numReferencia)).append("\n");
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


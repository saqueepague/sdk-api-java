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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

public class InfConsultaPagamentoReqDarf   {
  @JsonProperty("codReceita")
  private String codReceita = null;

  @JsonProperty("numReferencia")
  private String numReferencia = null;

  @JsonProperty("periodoApuracao")
  private String periodoApuracao = null;

  public InfConsultaPagamentoReqDarf codReceita(String codReceita) {
    this.codReceita = codReceita;
    return this;
  }

  /**
   * Código da receita do DARF.
   * @return codReceita
  **/
  @ApiModelProperty(example = "8301", required = true, value = "Código da receita do DARF.")
  @NotNull

@Pattern(regexp="^\\d+$") 
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
  @ApiModelProperty(example = "7", required = true, value = "Número de referência.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getNumReferencia() {
    return numReferencia;
  }

  public void setNumReferencia(String numReferencia) {
    this.numReferencia = numReferencia;
  }

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaPagamentoReqDarf infConsultaPagamentoReqDarf = (InfConsultaPagamentoReqDarf) o;
    return Objects.equals(this.codReceita, infConsultaPagamentoReqDarf.codReceita) &&
        Objects.equals(this.numReferencia, infConsultaPagamentoReqDarf.numReferencia) &&
        Objects.equals(this.periodoApuracao, infConsultaPagamentoReqDarf.periodoApuracao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codReceita, numReferencia, periodoApuracao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPagamentoReqDarf {\n");
    
    sb.append("    codReceita: ").append(toIndentedString(codReceita)).append("\n");
    sb.append("    numReferencia: ").append(toIndentedString(numReferencia)).append("\n");
    sb.append("    periodoApuracao: ").append(toIndentedString(periodoApuracao)).append("\n");
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


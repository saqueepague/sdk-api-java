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
 * InfConsultaPagamentoReqDda
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfConsultaPagamentoReqDda   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("tipoConsulta")
  private String tipoConsulta = null;

  @JsonProperty("cpfCNPJ")
  private String cpfCNPJ = null;

  @JsonProperty("dataInicial")
  private String dataInicial = null;

  @JsonProperty("dataFinal")
  private String dataFinal = null;

  public InfConsultaPagamentoReqDda id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Número ID DDA.
   * @return id
  **/
  @ApiModelProperty(example = "852", value = "Número ID DDA.")

@Pattern(regexp="^\\d+$") 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InfConsultaPagamentoReqDda tipoConsulta(String tipoConsulta) {
    this.tipoConsulta = tipoConsulta;
    return this;
  }

  /**
   * Tipo de consulta de DDA a ser feita.
   * @return tipoConsulta
  **/
  @ApiModelProperty(value = "Tipo de consulta de DDA a ser feita.")


  public String getTipoConsulta() {
    return tipoConsulta;
  }

  public void setTipoConsulta(String tipoConsulta) {
    this.tipoConsulta = tipoConsulta;
  }

  public InfConsultaPagamentoReqDda cpfCNPJ(String cpfCNPJ) {
    this.cpfCNPJ = cpfCNPJ;
    return this;
  }

  /**
   * Número do CPF ou CNPJ (11 ou 14 dígitos).
   * @return cpfCNPJ
  **/
  @ApiModelProperty(example = "02358427000112", value = "Número do CPF ou CNPJ (11 ou 14 dígitos).")

@Pattern(regexp="^\\d{14}|\\d{11}$") 
  public String getCpfCNPJ() {
    return cpfCNPJ;
  }

  public void setCpfCNPJ(String cpfCNPJ) {
    this.cpfCNPJ = cpfCNPJ;
  }

  public InfConsultaPagamentoReqDda dataInicial(String dataInicial) {
    this.dataInicial = dataInicial;
    return this;
  }

  /**
   * Data de início do período da lista de DDA (caso a consulta seja por período, AAAAMMDD).
   * @return dataInicial
  **/
  @ApiModelProperty(example = "20181122", value = "Data de início do período da lista de DDA (caso a consulta seja por período, AAAAMMDD).")

@Pattern(regexp="^\\d{8}$") 
  public String getDataInicial() {
    return dataInicial;
  }

  public void setDataInicial(String dataInicial) {
    this.dataInicial = dataInicial;
  }

  public InfConsultaPagamentoReqDda dataFinal(String dataFinal) {
    this.dataFinal = dataFinal;
    return this;
  }

  /**
   * Data final do período da lista de DDA (caso a consulta seja por período, AAAAMMDD).
   * @return dataFinal
  **/
  @ApiModelProperty(example = "20181122", value = "Data final do período da lista de DDA (caso a consulta seja por período, AAAAMMDD).")

@Pattern(regexp="^\\d{8}$") 
  public String getDataFinal() {
    return dataFinal;
  }

  public void setDataFinal(String dataFinal) {
    this.dataFinal = dataFinal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaPagamentoReqDda infConsultaPagamentoReqDda = (InfConsultaPagamentoReqDda) o;
    return Objects.equals(this.id, infConsultaPagamentoReqDda.id) &&
        Objects.equals(this.tipoConsulta, infConsultaPagamentoReqDda.tipoConsulta) &&
        Objects.equals(this.cpfCNPJ, infConsultaPagamentoReqDda.cpfCNPJ) &&
        Objects.equals(this.dataInicial, infConsultaPagamentoReqDda.dataInicial) &&
        Objects.equals(this.dataFinal, infConsultaPagamentoReqDda.dataFinal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tipoConsulta, cpfCNPJ, dataInicial, dataFinal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPagamentoReqDda {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tipoConsulta: ").append(toIndentedString(tipoConsulta)).append("\n");
    sb.append("    cpfCNPJ: ").append(toIndentedString(cpfCNPJ)).append("\n");
    sb.append("    dataInicial: ").append(toIndentedString(dataInicial)).append("\n");
    sb.append("    dataFinal: ").append(toIndentedString(dataFinal)).append("\n");
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


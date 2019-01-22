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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

public class InfConsultaPagamentoReqDda   {
  @JsonProperty("cpfCNPJ")
  private String cpfCNPJ = null;

  @JsonProperty("dataFinal")
  private String dataFinal = null;

  @JsonProperty("dataInicial")
  private String dataInicial = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("tipoConsulta")
  private String tipoConsulta = null;

  public InfConsultaPagamentoReqDda cpfCNPJ(String cpfCNPJ) {
    this.cpfCNPJ = cpfCNPJ;
    return this;
  }

  /**
   * Número do CPF ou CNPJ (11 ou 14 dígitos).
   * @return cpfCNPJ
  **/
  @ApiModelProperty(example = "02358427000112", required = true, value = "Número do CPF ou CNPJ (11 ou 14 dígitos).")
  @NotNull

@Pattern(regexp="^\\d{14}|\\d{11}$") 
  public String getCpfCNPJ() {
    return cpfCNPJ;
  }

  public void setCpfCNPJ(String cpfCNPJ) {
    this.cpfCNPJ = cpfCNPJ;
  }

  public InfConsultaPagamentoReqDda dataFinal(String dataFinal) {
    this.dataFinal = dataFinal;
    return this;
  }

  /**
   * Data final do período da lista de DDA (caso a consulta seja por período, AAAAMMDD).
   * @return dataFinal
  **/
  @ApiModelProperty(example = "20181122", required = true, value = "Data final do período da lista de DDA (caso a consulta seja por período, AAAAMMDD).")
  @NotNull

@Pattern(regexp="^\\d{8}$") 
  public String getDataFinal() {
    return dataFinal;
  }

  public void setDataFinal(String dataFinal) {
    this.dataFinal = dataFinal;
  }

  public InfConsultaPagamentoReqDda dataInicial(String dataInicial) {
    this.dataInicial = dataInicial;
    return this;
  }

  /**
   * Data de início do período da lista de DDA (caso a consulta seja por período, AAAAMMDD).
   * @return dataInicial
  **/
  @ApiModelProperty(example = "20181122", required = true, value = "Data de início do período da lista de DDA (caso a consulta seja por período, AAAAMMDD).")
  @NotNull

@Pattern(regexp="^\\d{8}$") 
  public String getDataInicial() {
    return dataInicial;
  }

  public void setDataInicial(String dataInicial) {
    this.dataInicial = dataInicial;
  }

  public InfConsultaPagamentoReqDda id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador do dda.
   * @return id
  **/
  @ApiModelProperty(example = "852", required = true, value = "Identificador do dda.")
  @NotNull

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
  @ApiModelProperty(required = true, value = "Tipo de consulta de DDA a ser feita.")
  @NotNull


  public String getTipoConsulta() {
    return tipoConsulta;
  }

  public void setTipoConsulta(String tipoConsulta) {
    this.tipoConsulta = tipoConsulta;
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
    return Objects.equals(this.cpfCNPJ, infConsultaPagamentoReqDda.cpfCNPJ) &&
        Objects.equals(this.dataFinal, infConsultaPagamentoReqDda.dataFinal) &&
        Objects.equals(this.dataInicial, infConsultaPagamentoReqDda.dataInicial) &&
        Objects.equals(this.id, infConsultaPagamentoReqDda.id) &&
        Objects.equals(this.tipoConsulta, infConsultaPagamentoReqDda.tipoConsulta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpfCNPJ, dataFinal, dataInicial, id, tipoConsulta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPagamentoReqDda {\n");
    
    sb.append("    cpfCNPJ: ").append(toIndentedString(cpfCNPJ)).append("\n");
    sb.append("    dataFinal: ").append(toIndentedString(dataFinal)).append("\n");
    sb.append("    dataInicial: ").append(toIndentedString(dataInicial)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tipoConsulta: ").append(toIndentedString(tipoConsulta)).append("\n");
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


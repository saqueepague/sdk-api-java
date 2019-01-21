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
 * InfPagamentoReqGps
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfPagamentoReqGps   {
  @JsonProperty("codPagamento")
  private String codPagamento = null;

  @JsonProperty("dataCompetencia")
  private String dataCompetencia = null;

  @JsonProperty("identificador")
  private String identificador = null;

  @JsonProperty("valorInss")
  private String valorInss = null;

  @JsonProperty("valorMulta")
  private String valorMulta = null;

  @JsonProperty("valorOutros")
  private String valorOutros = null;

  @JsonProperty("valorTotal")
  private String valorTotal = null;

  public InfPagamentoReqGps codPagamento(String codPagamento) {
    this.codPagamento = codPagamento;
    return this;
  }

  /**
   * Código da Guia da Previdência Social (GPS).
   * @return codPagamento
  **/
  @ApiModelProperty(example = "3456", required = true, value = "Código da Guia da Previdência Social (GPS).")
  @NotNull

@Pattern(regexp="^\\d{4}$") 
  public String getCodPagamento() {
    return codPagamento;
  }

  public void setCodPagamento(String codPagamento) {
    this.codPagamento = codPagamento;
  }

  public InfPagamentoReqGps dataCompetencia(String dataCompetencia) {
    this.dataCompetencia = dataCompetencia;
    return this;
  }

  /**
   * Data de competência (AAAAMMDD).
   * @return dataCompetencia
  **/
  @ApiModelProperty(example = "20181122", required = true, value = "Data de competência (AAAAMMDD).")
  @NotNull

@Pattern(regexp="^\\d{8}$") 
  public String getDataCompetencia() {
    return dataCompetencia;
  }

  public void setDataCompetencia(String dataCompetencia) {
    this.dataCompetencia = dataCompetencia;
  }

  public InfPagamentoReqGps identificador(String identificador) {
    this.identificador = identificador;
    return this;
  }

  /**
   * Identificador da guia.
   * @return identificador
  **/
  @ApiModelProperty(example = "1234567890", required = true, value = "Identificador da guia.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getIdentificador() {
    return identificador;
  }

  public void setIdentificador(String identificador) {
    this.identificador = identificador;
  }

  public InfPagamentoReqGps valorInss(String valorInss) {
    this.valorInss = valorInss;
    return this;
  }

  /**
   * Valor do INSS (12 dígitos, incluindo centavos).
   * @return valorInss
  **/
  @ApiModelProperty(example = "000000001150", required = true, value = "Valor do INSS (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValorInss() {
    return valorInss;
  }

  public void setValorInss(String valorInss) {
    this.valorInss = valorInss;
  }

  public InfPagamentoReqGps valorMulta(String valorMulta) {
    this.valorMulta = valorMulta;
    return this;
  }

  /**
   * Valor associado a ATM/Multa e Juros (12 dígitos, incluindo centavos).
   * @return valorMulta
  **/
  @ApiModelProperty(example = "000000001150", required = true, value = "Valor associado a ATM/Multa e Juros (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValorMulta() {
    return valorMulta;
  }

  public void setValorMulta(String valorMulta) {
    this.valorMulta = valorMulta;
  }

  public InfPagamentoReqGps valorOutros(String valorOutros) {
    this.valorOutros = valorOutros;
    return this;
  }

  /**
   * Valor de outras entidades (12 dígitos, incluindo centavos).
   * @return valorOutros
  **/
  @ApiModelProperty(example = "000000001150", required = true, value = "Valor de outras entidades (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValorOutros() {
    return valorOutros;
  }

  public void setValorOutros(String valorOutros) {
    this.valorOutros = valorOutros;
  }

  public InfPagamentoReqGps valorTotal(String valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }

  /**
   * Valor total da Guia da Previdência Social (GPS, 12 dígitos, incluindo centavos).
   * @return valorTotal
  **/
  @ApiModelProperty(example = "000000001150", required = true, value = "Valor total da Guia da Previdência Social (GPS, 12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValorTotal() {
    return valorTotal;
  }

  public void setValorTotal(String valorTotal) {
    this.valorTotal = valorTotal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfPagamentoReqGps infPagamentoReqGps = (InfPagamentoReqGps) o;
    return Objects.equals(this.codPagamento, infPagamentoReqGps.codPagamento) &&
        Objects.equals(this.dataCompetencia, infPagamentoReqGps.dataCompetencia) &&
        Objects.equals(this.identificador, infPagamentoReqGps.identificador) &&
        Objects.equals(this.valorInss, infPagamentoReqGps.valorInss) &&
        Objects.equals(this.valorMulta, infPagamentoReqGps.valorMulta) &&
        Objects.equals(this.valorOutros, infPagamentoReqGps.valorOutros) &&
        Objects.equals(this.valorTotal, infPagamentoReqGps.valorTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codPagamento, dataCompetencia, identificador, valorInss, valorMulta, valorOutros, valorTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfPagamentoReqGps {\n");
    
    sb.append("    codPagamento: ").append(toIndentedString(codPagamento)).append("\n");
    sb.append("    dataCompetencia: ").append(toIndentedString(dataCompetencia)).append("\n");
    sb.append("    identificador: ").append(toIndentedString(identificador)).append("\n");
    sb.append("    valorInss: ").append(toIndentedString(valorInss)).append("\n");
    sb.append("    valorMulta: ").append(toIndentedString(valorMulta)).append("\n");
    sb.append("    valorOutros: ").append(toIndentedString(valorOutros)).append("\n");
    sb.append("    valorTotal: ").append(toIndentedString(valorTotal)).append("\n");
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


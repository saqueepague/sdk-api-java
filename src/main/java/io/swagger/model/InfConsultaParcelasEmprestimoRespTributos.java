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
 * Informações sobre cada parcela.
 */
@ApiModel(description = "Informações sobre cada parcela.")
@Validated
public class InfConsultaParcelasEmprestimoRespTributos   {
  @JsonProperty("valorSolicitado")
  private String valorSolicitado = null;

  @JsonProperty("iof")
  private String iof = null;

  @JsonProperty("iofAdicional")
  private String iofAdicional = null;

  @JsonProperty("valorJuros")
  private String valorJuros = null;

  @JsonProperty("taxaJurosAnual")
  private String taxaJurosAnual = null;

  @JsonProperty("taxaJurosMensal")
  private String taxaJurosMensal = null;

  @JsonProperty("dataContratacao")
  private String dataContratacao = null;

  @JsonProperty("primeiroVencimento")
  private String primeiroVencimento = null;

  @JsonProperty("ultimoVencimento")
  private String ultimoVencimento = null;

  @JsonProperty("cetAnual")
  private String cetAnual = null;

  @JsonProperty("cetMensal")
  private String cetMensal = null;

  public InfConsultaParcelasEmprestimoRespTributos valorSolicitado(String valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
    return this;
  }

  /**
   * Valor dos juros calculados (12 dígitos, incluindo centavos).
   * @return valorSolicitado
  **/
  @ApiModelProperty(example = "000000000499", value = "Valor dos juros calculados (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$")   public String getValorSolicitado() {
    return valorSolicitado;
  }

  public void setValorSolicitado(String valorSolicitado) {
    this.valorSolicitado = valorSolicitado;
  }

  public InfConsultaParcelasEmprestimoRespTributos iof(String iof) {
    this.iof = iof;
    return this;
  }

  /**
   * Informações do imposto sobre operações financeiras (07 dígitos, valor total = 80,9445%).
   * @return iof
  **/
  @ApiModelProperty(example = "0809445", value = "Informações do imposto sobre operações financeiras (07 dígitos, valor total = 80,9445%).")

@Pattern(regexp="^\\d{07}$")   public String getIof() {
    return iof;
  }

  public void setIof(String iof) {
    this.iof = iof;
  }

  public InfConsultaParcelasEmprestimoRespTributos iofAdicional(String iofAdicional) {
    this.iofAdicional = iofAdicional;
    return this;
  }

  /**
   * Informações do imposto sobre operações financeiras adicional (07 dígitos, valor total = 80,9445%).
   * @return iofAdicional
  **/
  @ApiModelProperty(example = "0809445", value = "Informações do imposto sobre operações financeiras adicional (07 dígitos, valor total = 80,9445%).")

@Pattern(regexp="^\\d{07}$")   public String getIofAdicional() {
    return iofAdicional;
  }

  public void setIofAdicional(String iofAdicional) {
    this.iofAdicional = iofAdicional;
  }

  public InfConsultaParcelasEmprestimoRespTributos valorJuros(String valorJuros) {
    this.valorJuros = valorJuros;
    return this;
  }

  /**
   * Valor dos juros calculado (07 dígitos, valor total = 80,9445%).
   * @return valorJuros
  **/
  @ApiModelProperty(example = "0002422", value = "Valor dos juros calculado (07 dígitos, valor total = 80,9445%).")

@Pattern(regexp="^\\d{07}$")   public String getValorJuros() {
    return valorJuros;
  }

  public void setValorJuros(String valorJuros) {
    this.valorJuros = valorJuros;
  }

  public InfConsultaParcelasEmprestimoRespTributos taxaJurosAnual(String taxaJurosAnual) {
    this.taxaJurosAnual = taxaJurosAnual;
    return this;
  }

  /**
   * Informações sobre taxas de juros anual (07 dígitos, valor total = 80,9445%).
   * @return taxaJurosAnual
  **/
  @ApiModelProperty(example = "0809445", value = "Informações sobre taxas de juros anual (07 dígitos, valor total = 80,9445%).")

@Pattern(regexp="^\\d{07}$")   public String getTaxaJurosAnual() {
    return taxaJurosAnual;
  }

  public void setTaxaJurosAnual(String taxaJurosAnual) {
    this.taxaJurosAnual = taxaJurosAnual;
  }

  public InfConsultaParcelasEmprestimoRespTributos taxaJurosMensal(String taxaJurosMensal) {
    this.taxaJurosMensal = taxaJurosMensal;
    return this;
  }

  /**
   * Informações sobre taxas de juros mensal (07 dígitos, valor total = 80,9445%).
   * @return taxaJurosMensal
  **/
  @ApiModelProperty(example = "0809445", value = "Informações sobre taxas de juros mensal (07 dígitos, valor total = 80,9445%).")

@Pattern(regexp="^\\d{07}$")   public String getTaxaJurosMensal() {
    return taxaJurosMensal;
  }

  public void setTaxaJurosMensal(String taxaJurosMensal) {
    this.taxaJurosMensal = taxaJurosMensal;
  }

  public InfConsultaParcelasEmprestimoRespTributos dataContratacao(String dataContratacao) {
    this.dataContratacao = dataContratacao;
    return this;
  }

  /**
   * Data de contratação do empréstimo (08 dígitos e AAAAMMDD).
   * @return dataContratacao
  **/
  @ApiModelProperty(example = "20200928", value = "Data de contratação do empréstimo (08 dígitos e AAAAMMDD).")

@Pattern(regexp="^\\d{08}$")   public String getDataContratacao() {
    return dataContratacao;
  }

  public void setDataContratacao(String dataContratacao) {
    this.dataContratacao = dataContratacao;
  }

  public InfConsultaParcelasEmprestimoRespTributos primeiroVencimento(String primeiroVencimento) {
    this.primeiroVencimento = primeiroVencimento;
    return this;
  }

  /**
   * Data da primeira parcela de vencimeto (08 dígitos e AAAAMMDD).
   * @return primeiroVencimento
  **/
  @ApiModelProperty(example = "20200928", value = "Data da primeira parcela de vencimeto (08 dígitos e AAAAMMDD).")

@Pattern(regexp="^\\d{08}$")   public String getPrimeiroVencimento() {
    return primeiroVencimento;
  }

  public void setPrimeiroVencimento(String primeiroVencimento) {
    this.primeiroVencimento = primeiroVencimento;
  }

  public InfConsultaParcelasEmprestimoRespTributos ultimoVencimento(String ultimoVencimento) {
    this.ultimoVencimento = ultimoVencimento;
    return this;
  }

  /**
   * Data da última parcela de vencimeto (08 dígitos e AAAAMMDD).
   * @return ultimoVencimento
  **/
  @ApiModelProperty(example = "20200928", value = "Data da última parcela de vencimeto (08 dígitos e AAAAMMDD).")

@Pattern(regexp="^\\d{08}$")   public String getUltimoVencimento() {
    return ultimoVencimento;
  }

  public void setUltimoVencimento(String ultimoVencimento) {
    this.ultimoVencimento = ultimoVencimento;
  }

  public InfConsultaParcelasEmprestimoRespTributos cetAnual(String cetAnual) {
    this.cetAnual = cetAnual;
    return this;
  }

  /**
   * Informações sobre a soma de taxas de juros anual (07 dígitos, valor total = 80,9445%).
   * @return cetAnual
  **/
  @ApiModelProperty(example = "0809445", value = "Informações sobre a soma de taxas de juros anual (07 dígitos, valor total = 80,9445%).")

@Pattern(regexp="^\\d{07}$")   public String getCetAnual() {
    return cetAnual;
  }

  public void setCetAnual(String cetAnual) {
    this.cetAnual = cetAnual;
  }

  public InfConsultaParcelasEmprestimoRespTributos cetMensal(String cetMensal) {
    this.cetMensal = cetMensal;
    return this;
  }

  /**
   * Informações sobre a soma de taxas de juros mensal(07 dígitos, valor total = 80,9445%).
   * @return cetMensal
  **/
  @ApiModelProperty(example = "0809445", value = "Informações sobre a soma de taxas de juros mensal(07 dígitos, valor total = 80,9445%).")

@Pattern(regexp="^\\d{07}$")   public String getCetMensal() {
    return cetMensal;
  }

  public void setCetMensal(String cetMensal) {
    this.cetMensal = cetMensal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaParcelasEmprestimoRespTributos infConsultaParcelasEmprestimoRespTributos = (InfConsultaParcelasEmprestimoRespTributos) o;
    return Objects.equals(this.valorSolicitado, infConsultaParcelasEmprestimoRespTributos.valorSolicitado) &&
        Objects.equals(this.iof, infConsultaParcelasEmprestimoRespTributos.iof) &&
        Objects.equals(this.iofAdicional, infConsultaParcelasEmprestimoRespTributos.iofAdicional) &&
        Objects.equals(this.valorJuros, infConsultaParcelasEmprestimoRespTributos.valorJuros) &&
        Objects.equals(this.taxaJurosAnual, infConsultaParcelasEmprestimoRespTributos.taxaJurosAnual) &&
        Objects.equals(this.taxaJurosMensal, infConsultaParcelasEmprestimoRespTributos.taxaJurosMensal) &&
        Objects.equals(this.dataContratacao, infConsultaParcelasEmprestimoRespTributos.dataContratacao) &&
        Objects.equals(this.primeiroVencimento, infConsultaParcelasEmprestimoRespTributos.primeiroVencimento) &&
        Objects.equals(this.ultimoVencimento, infConsultaParcelasEmprestimoRespTributos.ultimoVencimento) &&
        Objects.equals(this.cetAnual, infConsultaParcelasEmprestimoRespTributos.cetAnual) &&
        Objects.equals(this.cetMensal, infConsultaParcelasEmprestimoRespTributos.cetMensal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valorSolicitado, iof, iofAdicional, valorJuros, taxaJurosAnual, taxaJurosMensal, dataContratacao, primeiroVencimento, ultimoVencimento, cetAnual, cetMensal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaParcelasEmprestimoRespTributos {\n");
    
    sb.append("    valorSolicitado: ").append(toIndentedString(valorSolicitado)).append("\n");
    sb.append("    iof: ").append(toIndentedString(iof)).append("\n");
    sb.append("    iofAdicional: ").append(toIndentedString(iofAdicional)).append("\n");
    sb.append("    valorJuros: ").append(toIndentedString(valorJuros)).append("\n");
    sb.append("    taxaJurosAnual: ").append(toIndentedString(taxaJurosAnual)).append("\n");
    sb.append("    taxaJurosMensal: ").append(toIndentedString(taxaJurosMensal)).append("\n");
    sb.append("    dataContratacao: ").append(toIndentedString(dataContratacao)).append("\n");
    sb.append("    primeiroVencimento: ").append(toIndentedString(primeiroVencimento)).append("\n");
    sb.append("    ultimoVencimento: ").append(toIndentedString(ultimoVencimento)).append("\n");
    sb.append("    cetAnual: ").append(toIndentedString(cetAnual)).append("\n");
    sb.append("    cetMensal: ").append(toIndentedString(cetMensal)).append("\n");
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

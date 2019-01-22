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
 * InfPagamentoReqDarf
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

public class InfPagamentoReqDarf   {
  @JsonProperty("codReceita")
  private String codReceita = null;

  @JsonProperty("dataVencimento")
  private String dataVencimento = null;

  @JsonProperty("numReferencia")
  private String numReferencia = null;

  @JsonProperty("periodoApuracao")
  private String periodoApuracao = null;

  @JsonProperty("valorJuros")
  private String valorJuros = null;

  @JsonProperty("valorMulta")
  private String valorMulta = null;

  @JsonProperty("valorPrincipal")
  private String valorPrincipal = null;

  @JsonProperty("valorTotal")
  private String valorTotal = null;

  public InfPagamentoReqDarf codReceita(String codReceita) {
    this.codReceita = codReceita;
    return this;
  }

  /**
   * Código da receita do DARF.
   * @return codReceita
  **/
  @ApiModelProperty(example = "3456", required = true, value = "Código da receita do DARF.")
  @NotNull

@Pattern(regexp="^\\d{4}$") 
  public String getCodReceita() {
    return codReceita;
  }

  public void setCodReceita(String codReceita) {
    this.codReceita = codReceita;
  }

  public InfPagamentoReqDarf dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }

  /**
   * Data de vencimento do DARF (AAAAMMDD).
   * @return dataVencimento
  **/
  @ApiModelProperty(example = "20181122", required = true, value = "Data de vencimento do DARF (AAAAMMDD).")
  @NotNull

@Pattern(regexp="^\\d{8}$") 
  public String getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public InfPagamentoReqDarf numReferencia(String numReferencia) {
    this.numReferencia = numReferencia;
    return this;
  }

  /**
   * Número de referência.
   * @return numReferencia
  **/
  @ApiModelProperty(required = true, value = "Número de referência.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getNumReferencia() {
    return numReferencia;
  }

  public void setNumReferencia(String numReferencia) {
    this.numReferencia = numReferencia;
  }

  public InfPagamentoReqDarf periodoApuracao(String periodoApuracao) {
    this.periodoApuracao = periodoApuracao;
    return this;
  }

  /**
   * Data de apuração do DARF (AAAAMMDD).
   * @return periodoApuracao
  **/
  @ApiModelProperty(example = "20181122", required = true, value = "Data de apuração do DARF (AAAAMMDD).")
  @NotNull

@Pattern(regexp="^\\d{8}$") 
  public String getPeriodoApuracao() {
    return periodoApuracao;
  }

  public void setPeriodoApuracao(String periodoApuracao) {
    this.periodoApuracao = periodoApuracao;
  }

  public InfPagamentoReqDarf valorJuros(String valorJuros) {
    this.valorJuros = valorJuros;
    return this;
  }

  /**
   * Valor relativo aos juros (12 dígitos, incluindo centavos).
   * @return valorJuros
  **/
  @ApiModelProperty(example = "000000001150", required = true, value = "Valor relativo aos juros (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValorJuros() {
    return valorJuros;
  }

  public void setValorJuros(String valorJuros) {
    this.valorJuros = valorJuros;
  }

  public InfPagamentoReqDarf valorMulta(String valorMulta) {
    this.valorMulta = valorMulta;
    return this;
  }

  /**
   * Valor da multa (12 dígitos, incluindo centavos).
   * @return valorMulta
  **/
  @ApiModelProperty(example = "000000001150", required = true, value = "Valor da multa (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValorMulta() {
    return valorMulta;
  }

  public void setValorMulta(String valorMulta) {
    this.valorMulta = valorMulta;
  }

  public InfPagamentoReqDarf valorPrincipal(String valorPrincipal) {
    this.valorPrincipal = valorPrincipal;
    return this;
  }

  /**
   * Valor principal do DARF (12 dígitos, incluindo centavos).
   * @return valorPrincipal
  **/
  @ApiModelProperty(example = "000000001150", required = true, value = "Valor principal do DARF (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValorPrincipal() {
    return valorPrincipal;
  }

  public void setValorPrincipal(String valorPrincipal) {
    this.valorPrincipal = valorPrincipal;
  }

  public InfPagamentoReqDarf valorTotal(String valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }

  /**
   * Valor total de pagamento do DARF (12 dígitos, incluindo centavos).
   * @return valorTotal
  **/
  @ApiModelProperty(example = "000000001150", required = true, value = "Valor total de pagamento do DARF (12 dígitos, incluindo centavos).")
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
    InfPagamentoReqDarf infPagamentoReqDarf = (InfPagamentoReqDarf) o;
    return Objects.equals(this.codReceita, infPagamentoReqDarf.codReceita) &&
        Objects.equals(this.dataVencimento, infPagamentoReqDarf.dataVencimento) &&
        Objects.equals(this.numReferencia, infPagamentoReqDarf.numReferencia) &&
        Objects.equals(this.periodoApuracao, infPagamentoReqDarf.periodoApuracao) &&
        Objects.equals(this.valorJuros, infPagamentoReqDarf.valorJuros) &&
        Objects.equals(this.valorMulta, infPagamentoReqDarf.valorMulta) &&
        Objects.equals(this.valorPrincipal, infPagamentoReqDarf.valorPrincipal) &&
        Objects.equals(this.valorTotal, infPagamentoReqDarf.valorTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codReceita, dataVencimento, numReferencia, periodoApuracao, valorJuros, valorMulta, valorPrincipal, valorTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfPagamentoReqDarf {\n");
    
    sb.append("    codReceita: ").append(toIndentedString(codReceita)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    numReferencia: ").append(toIndentedString(numReferencia)).append("\n");
    sb.append("    periodoApuracao: ").append(toIndentedString(periodoApuracao)).append("\n");
    sb.append("    valorJuros: ").append(toIndentedString(valorJuros)).append("\n");
    sb.append("    valorMulta: ").append(toIndentedString(valorMulta)).append("\n");
    sb.append("    valorPrincipal: ").append(toIndentedString(valorPrincipal)).append("\n");
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


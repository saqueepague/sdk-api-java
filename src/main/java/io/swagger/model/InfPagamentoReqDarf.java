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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfPagamentoReqDarf   {
  @JsonProperty("periodoApuracao")
  private String periodoApuracao = null;

  @JsonProperty("codReceita")
  private String codReceita = null;

  @JsonProperty("numReferencia")
  private String numReferencia = null;

  @JsonProperty("dataVencimento")
  private String dataVencimento = null;

  @JsonProperty("valorPrincipal")
  private String valorPrincipal = null;

  @JsonProperty("valorMulta")
  private String valorMulta = null;

  @JsonProperty("valorJuros")
  private String valorJuros = null;

  @JsonProperty("valorTotal")
  private String valorTotal = null;

  public InfPagamentoReqDarf periodoApuracao(String periodoApuracao) {
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

  public InfPagamentoReqDarf codReceita(String codReceita) {
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

  public InfPagamentoReqDarf numReferencia(String numReferencia) {
    this.numReferencia = numReferencia;
    return this;
  }

  /**
   * Número de referência.
   * @return numReferencia
  **/
  @ApiModelProperty(value = "Número de referência.")

@Pattern(regexp="^\\d+$") 
  public String getNumReferencia() {
    return numReferencia;
  }

  public void setNumReferencia(String numReferencia) {
    this.numReferencia = numReferencia;
  }

  public InfPagamentoReqDarf dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }

  /**
   * Data de vencimento do DARF (AAAAMMDD).
   * @return dataVencimento
  **/
  @ApiModelProperty(example = "20181122", value = "Data de vencimento do DARF (AAAAMMDD).")

@Pattern(regexp="^\\d{8}$") 
  public String getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public InfPagamentoReqDarf valorPrincipal(String valorPrincipal) {
    this.valorPrincipal = valorPrincipal;
    return this;
  }

  /**
   * Valor principal do DARF (12 dígitos, incluindo centavos).
   * @return valorPrincipal
  **/
  @ApiModelProperty(example = "000000001150", value = "Valor principal do DARF (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getValorPrincipal() {
    return valorPrincipal;
  }

  public void setValorPrincipal(String valorPrincipal) {
    this.valorPrincipal = valorPrincipal;
  }

  public InfPagamentoReqDarf valorMulta(String valorMulta) {
    this.valorMulta = valorMulta;
    return this;
  }

  /**
   * Valor da multa (12 dígitos, incluindo centavos).
   * @return valorMulta
  **/
  @ApiModelProperty(example = "000000001150", value = "Valor da multa (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getValorMulta() {
    return valorMulta;
  }

  public void setValorMulta(String valorMulta) {
    this.valorMulta = valorMulta;
  }

  public InfPagamentoReqDarf valorJuros(String valorJuros) {
    this.valorJuros = valorJuros;
    return this;
  }

  /**
   * Valor relativo aos juros (12 dígitos, incluindo centavos).
   * @return valorJuros
  **/
  @ApiModelProperty(example = "000000001150", value = "Valor relativo aos juros (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getValorJuros() {
    return valorJuros;
  }

  public void setValorJuros(String valorJuros) {
    this.valorJuros = valorJuros;
  }

  public InfPagamentoReqDarf valorTotal(String valorTotal) {
    this.valorTotal = valorTotal;
    return this;
  }

  /**
   * Valor total de pagamento do DARF (12 dígitos, incluindo centavos).
   * @return valorTotal
  **/
  @ApiModelProperty(example = "000000001150", value = "Valor total de pagamento do DARF (12 dígitos, incluindo centavos).")

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
    return Objects.equals(this.periodoApuracao, infPagamentoReqDarf.periodoApuracao) &&
        Objects.equals(this.codReceita, infPagamentoReqDarf.codReceita) &&
        Objects.equals(this.numReferencia, infPagamentoReqDarf.numReferencia) &&
        Objects.equals(this.dataVencimento, infPagamentoReqDarf.dataVencimento) &&
        Objects.equals(this.valorPrincipal, infPagamentoReqDarf.valorPrincipal) &&
        Objects.equals(this.valorMulta, infPagamentoReqDarf.valorMulta) &&
        Objects.equals(this.valorJuros, infPagamentoReqDarf.valorJuros) &&
        Objects.equals(this.valorTotal, infPagamentoReqDarf.valorTotal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(periodoApuracao, codReceita, numReferencia, dataVencimento, valorPrincipal, valorMulta, valorJuros, valorTotal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfPagamentoReqDarf {\n");
    
    sb.append("    periodoApuracao: ").append(toIndentedString(periodoApuracao)).append("\n");
    sb.append("    codReceita: ").append(toIndentedString(codReceita)).append("\n");
    sb.append("    numReferencia: ").append(toIndentedString(numReferencia)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    valorPrincipal: ").append(toIndentedString(valorPrincipal)).append("\n");
    sb.append("    valorMulta: ").append(toIndentedString(valorMulta)).append("\n");
    sb.append("    valorJuros: ").append(toIndentedString(valorJuros)).append("\n");
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


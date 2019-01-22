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
 * Informações sobre a requisição de confirmação de transação.
 */
@ApiModel(description = "Informações sobre a requisição de confirmação de transação.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

public class InfTransacaoConf   {
  @JsonProperty("cdProc")
  private String cdProc = null;

  @JsonProperty("codMoeda")
  private String codMoeda = null;

  @JsonProperty("codOperadora")
  private String codOperadora = null;

  @JsonProperty("dataHora")
  private String dataHora = null;

  @JsonProperty("dataLocal")
  private String dataLocal = null;

  @JsonProperty("horaLocal")
  private String horaLocal = null;

  @JsonProperty("nsu")
  private String nsu = null;

  @JsonProperty("nsuResposta")
  private String nsuResposta = null;

  @JsonProperty("valor")
  private String valor = null;

  public InfTransacaoConf cdProc(String cdProc) {
    this.cdProc = cdProc;
    return this;
  }

  /**
   * Igual à requisição e à resposta.
   * @return cdProc
  **/
  @ApiModelProperty(example = "029100", required = true, value = "Igual à requisição e à resposta.")
  @NotNull

@Pattern(regexp="^\\d{6}$") 
  public String getCdProc() {
    return cdProc;
  }

  public void setCdProc(String cdProc) {
    this.cdProc = cdProc;
  }

  public InfTransacaoConf codMoeda(String codMoeda) {
    this.codMoeda = codMoeda;
    return this;
  }

  /**
   * Igual à requisição e à resposta.
   * @return codMoeda
  **/
  @ApiModelProperty(example = "986", required = true, value = "Igual à requisição e à resposta.")
  @NotNull

@Pattern(regexp="^\\d{3}$") 
  public String getCodMoeda() {
    return codMoeda;
  }

  public void setCodMoeda(String codMoeda) {
    this.codMoeda = codMoeda;
  }

  public InfTransacaoConf codOperadora(String codOperadora) {
    this.codOperadora = codOperadora;
    return this;
  }

  /**
   * Igual à requisição e à resposta.
   * @return codOperadora
  **/
  @ApiModelProperty(example = "00000000914", required = true, value = "Igual à requisição e à resposta.")
  @NotNull

@Pattern(regexp="^\\d{11}$") 
  public String getCodOperadora() {
    return codOperadora;
  }

  public void setCodOperadora(String codOperadora) {
    this.codOperadora = codOperadora;
  }

  public InfTransacaoConf dataHora(String dataHora) {
    this.dataHora = dataHora;
    return this;
  }

  /**
   * Data e hora da transação (MMDDhhmmss).
   * @return dataHora
  **/
  @ApiModelProperty(example = "1122151032", required = true, value = "Data e hora da transação (MMDDhhmmss).")
  @NotNull

@Pattern(regexp="^\\d{10}$") 
  public String getDataHora() {
    return dataHora;
  }

  public void setDataHora(String dataHora) {
    this.dataHora = dataHora;
  }

  public InfTransacaoConf dataLocal(String dataLocal) {
    this.dataLocal = dataLocal;
    return this;
  }

  /**
   * Igual à requisição e à resposta.
   * @return dataLocal
  **/
  @ApiModelProperty(example = "1122", required = true, value = "Igual à requisição e à resposta.")
  @NotNull

@Pattern(regexp="^\\d{4}$") 
  public String getDataLocal() {
    return dataLocal;
  }

  public void setDataLocal(String dataLocal) {
    this.dataLocal = dataLocal;
  }

  public InfTransacaoConf horaLocal(String horaLocal) {
    this.horaLocal = horaLocal;
    return this;
  }

  /**
   * Igual à requisição e à resposta.
   * @return horaLocal
  **/
  @ApiModelProperty(example = "151032", required = true, value = "Igual à requisição e à resposta.")
  @NotNull

@Pattern(regexp="^\\d{6}$") 
  public String getHoraLocal() {
    return horaLocal;
  }

  public void setHoraLocal(String horaLocal) {
    this.horaLocal = horaLocal;
  }

  public InfTransacaoConf nsu(String nsu) {
    this.nsu = nsu;
    return this;
  }

  /**
   * Igual à requisição e à resposta.
   * @return nsu
  **/
  @ApiModelProperty(example = "000080247206", required = true, value = "Igual à requisição e à resposta.")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getNsu() {
    return nsu;
  }

  public void setNsu(String nsu) {
    this.nsu = nsu;
  }

  public InfTransacaoConf nsuResposta(String nsuResposta) {
    this.nsuResposta = nsuResposta;
    return this;
  }

  /**
   * Igual à resposta.
   * @return nsuResposta
  **/
  @ApiModelProperty(example = "820", required = true, value = "Igual à resposta.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getNsuResposta() {
    return nsuResposta;
  }

  public void setNsuResposta(String nsuResposta) {
    this.nsuResposta = nsuResposta;
  }

  public InfTransacaoConf valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Valor efetivado na transação. Em alguns casos, pode ser diferente da requisição e da resposta (12 dígitos, incluindo centavos).
   * @return valor
  **/
  @ApiModelProperty(example = "000000005000", required = true, value = "Valor efetivado na transação. Em alguns casos, pode ser diferente da requisição e da resposta (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfTransacaoConf infTransacaoConf = (InfTransacaoConf) o;
    return Objects.equals(this.cdProc, infTransacaoConf.cdProc) &&
        Objects.equals(this.codMoeda, infTransacaoConf.codMoeda) &&
        Objects.equals(this.codOperadora, infTransacaoConf.codOperadora) &&
        Objects.equals(this.dataHora, infTransacaoConf.dataHora) &&
        Objects.equals(this.dataLocal, infTransacaoConf.dataLocal) &&
        Objects.equals(this.horaLocal, infTransacaoConf.horaLocal) &&
        Objects.equals(this.nsu, infTransacaoConf.nsu) &&
        Objects.equals(this.nsuResposta, infTransacaoConf.nsuResposta) &&
        Objects.equals(this.valor, infTransacaoConf.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdProc, codMoeda, codOperadora, dataHora, dataLocal, horaLocal, nsu, nsuResposta, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfTransacaoConf {\n");
    
    sb.append("    cdProc: ").append(toIndentedString(cdProc)).append("\n");
    sb.append("    codMoeda: ").append(toIndentedString(codMoeda)).append("\n");
    sb.append("    codOperadora: ").append(toIndentedString(codOperadora)).append("\n");
    sb.append("    dataHora: ").append(toIndentedString(dataHora)).append("\n");
    sb.append("    dataLocal: ").append(toIndentedString(dataLocal)).append("\n");
    sb.append("    horaLocal: ").append(toIndentedString(horaLocal)).append("\n");
    sb.append("    nsu: ").append(toIndentedString(nsu)).append("\n");
    sb.append("    nsuResposta: ").append(toIndentedString(nsuResposta)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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


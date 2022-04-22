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
 * Informações genéricas sobre a requisição de transação.
 */
@ApiModel(description = "Informações genéricas sobre a requisição de transação.")
@Validated
public class InfTransacaoReq   {
  @JsonProperty("nsu")
  private String nsu = null;

  @JsonProperty("cdProc")
  private String cdProc = null;

  @JsonProperty("dataHora")
  private String dataHora = null;

  @JsonProperty("horaLocal")
  private String horaLocal = null;

  @JsonProperty("dataLocal")
  private String dataLocal = null;

  @JsonProperty("codOperadora")
  private String codOperadora = null;

  @JsonProperty("dataContabil")
  private String dataContabil = null;

  @JsonProperty("valor")
  private String valor = null;

  @JsonProperty("codMoeda")
  private String codMoeda = null;

  @JsonProperty("fintechCode")
  private String fintechCode = null;

  public InfTransacaoReq nsu(String nsu) {
    this.nsu = nsu;
    return this;
  }

  /**
   * Identificador da transação gerado pela Saque e Pague (de 9 dígitos a 12 dígitos).
   * @return nsu
  **/
  @ApiModelProperty(example = "000080247206", required = true, value = "Identificador da transação gerado pela Saque e Pague (de 9 dígitos a 12 dígitos).")
  @NotNull

@Pattern(regexp="^\\d{12}$")   public String getNsu() {
    return nsu;
  }

  public void setNsu(String nsu) {
    this.nsu = nsu;
  }

  public InfTransacaoReq cdProc(String cdProc) {
    this.cdProc = cdProc;
    return this;
  }

  /**
   * Código de processamento da transação, gerado pela Saque e Pague. Verificar Código específico de cada transação com a Saque e Pague (6 dígitos).
   * @return cdProc
  **/
  @ApiModelProperty(example = "029100", required = true, value = "Código de processamento da transação, gerado pela Saque e Pague. Verificar Código específico de cada transação com a Saque e Pague (6 dígitos).")
  @NotNull

@Pattern(regexp="^\\d{6}$")   public String getCdProc() {
    return cdProc;
  }

  public void setCdProc(String cdProc) {
    this.cdProc = cdProc;
  }

  public InfTransacaoReq dataHora(String dataHora) {
    this.dataHora = dataHora;
    return this;
  }

  /**
   * Data e hora da transação (MMDDhhmmss).
   * @return dataHora
  **/
  @ApiModelProperty(example = "1122151032", required = true, value = "Data e hora da transação (MMDDhhmmss).")
  @NotNull

@Pattern(regexp="^\\d{10}$")   public String getDataHora() {
    return dataHora;
  }

  public void setDataHora(String dataHora) {
    this.dataHora = dataHora;
  }

  public InfTransacaoReq horaLocal(String horaLocal) {
    this.horaLocal = horaLocal;
    return this;
  }

  /**
   * Hora local (hhmmss).
   * @return horaLocal
  **/
  @ApiModelProperty(example = "151032", required = true, value = "Hora local (hhmmss).")
  @NotNull

@Pattern(regexp="^\\d{6}$")   public String getHoraLocal() {
    return horaLocal;
  }

  public void setHoraLocal(String horaLocal) {
    this.horaLocal = horaLocal;
  }

  public InfTransacaoReq dataLocal(String dataLocal) {
    this.dataLocal = dataLocal;
    return this;
  }

  /**
   * Data local (MMDD).
   * @return dataLocal
  **/
  @ApiModelProperty(example = "1122", required = true, value = "Data local (MMDD).")
  @NotNull

@Pattern(regexp="^\\d{4}$")   public String getDataLocal() {
    return dataLocal;
  }

  public void setDataLocal(String dataLocal) {
    this.dataLocal = dataLocal;
  }

  public InfTransacaoReq codOperadora(String codOperadora) {
    this.codOperadora = codOperadora;
    return this;
  }

  /**
   * Código definido pela Saque e Pague que identifica o autorizador (11 dígitos).
   * @return codOperadora
  **/
  @ApiModelProperty(example = "00000000914", required = true, value = "Código definido pela Saque e Pague que identifica o autorizador (11 dígitos).")
  @NotNull

@Pattern(regexp="^\\d{11}$")   public String getCodOperadora() {
    return codOperadora;
  }

  public void setCodOperadora(String codOperadora) {
    this.codOperadora = codOperadora;
  }

  public InfTransacaoReq dataContabil(String dataContabil) {
    this.dataContabil = dataContabil;
    return this;
  }

  /**
   * Data contábil da transação (MMDD).
   * @return dataContabil
  **/
  @ApiModelProperty(example = "1122", value = "Data contábil da transação (MMDD).")

@Pattern(regexp="^\\d{4}$")   public String getDataContabil() {
    return dataContabil;
  }

  public void setDataContabil(String dataContabil) {
    this.dataContabil = dataContabil;
  }

  public InfTransacaoReq valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Valor da transação (12 dígitos, incluindo centavos).
   * @return valor
  **/
  @ApiModelProperty(example = "000000005000", value = "Valor da transação (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$")   public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public InfTransacaoReq codMoeda(String codMoeda) {
    this.codMoeda = codMoeda;
    return this;
  }

  /**
   * Código na tabela de moedas da ISO-4217 (986 = real, 3 dígitos).
   * @return codMoeda
  **/
  @ApiModelProperty(example = "986", value = "Código na tabela de moedas da ISO-4217 (986 = real, 3 dígitos).")

@Pattern(regexp="^\\d{3}$")   public String getCodMoeda() {
    return codMoeda;
  }

  public void setCodMoeda(String codMoeda) {
    this.codMoeda = codMoeda;
  }

  public InfTransacaoReq fintechCode(String fintechCode) {
    this.fintechCode = fintechCode;
    return this;
  }

  /**
   * Código fornecido pelo parceiro que identifica a Fintech (máximo 20 dígitos). Campo utilizado somente para parceiros que operam no modelo HUB.
   * @return fintechCode
  **/
  @ApiModelProperty(example = "123", value = "Código fornecido pelo parceiro que identifica a Fintech (máximo 20 dígitos). Campo utilizado somente para parceiros que operam no modelo HUB.")

@Size(max=20)   public String getFintechCode() {
    return fintechCode;
  }

  public void setFintechCode(String fintechCode) {
    this.fintechCode = fintechCode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfTransacaoReq infTransacaoReq = (InfTransacaoReq) o;
    return Objects.equals(this.nsu, infTransacaoReq.nsu) &&
        Objects.equals(this.cdProc, infTransacaoReq.cdProc) &&
        Objects.equals(this.dataHora, infTransacaoReq.dataHora) &&
        Objects.equals(this.horaLocal, infTransacaoReq.horaLocal) &&
        Objects.equals(this.dataLocal, infTransacaoReq.dataLocal) &&
        Objects.equals(this.codOperadora, infTransacaoReq.codOperadora) &&
        Objects.equals(this.dataContabil, infTransacaoReq.dataContabil) &&
        Objects.equals(this.valor, infTransacaoReq.valor) &&
        Objects.equals(this.codMoeda, infTransacaoReq.codMoeda) &&
        Objects.equals(this.fintechCode, infTransacaoReq.fintechCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nsu, cdProc, dataHora, horaLocal, dataLocal, codOperadora, dataContabil, valor, codMoeda, fintechCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfTransacaoReq {\n");
    
    sb.append("    nsu: ").append(toIndentedString(nsu)).append("\n");
    sb.append("    cdProc: ").append(toIndentedString(cdProc)).append("\n");
    sb.append("    dataHora: ").append(toIndentedString(dataHora)).append("\n");
    sb.append("    horaLocal: ").append(toIndentedString(horaLocal)).append("\n");
    sb.append("    dataLocal: ").append(toIndentedString(dataLocal)).append("\n");
    sb.append("    codOperadora: ").append(toIndentedString(codOperadora)).append("\n");
    sb.append("    dataContabil: ").append(toIndentedString(dataContabil)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    codMoeda: ").append(toIndentedString(codMoeda)).append("\n");
    sb.append("    fintechCode: ").append(toIndentedString(fintechCode)).append("\n");
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

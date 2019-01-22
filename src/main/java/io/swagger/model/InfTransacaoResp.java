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
 * Informações sobre a resposta da resquisição de transação.
 */
@ApiModel(description = "Informações sobre a resposta da resquisição de transação.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

public class InfTransacaoResp   {
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

  @JsonProperty("errorMessage")
  private String errorMessage = null;

  @JsonProperty("horaLocal")
  private String horaLocal = null;

  @JsonProperty("mensagemCliente")
  private String mensagemCliente = null;

  @JsonProperty("nsu")
  private String nsu = null;

  @JsonProperty("nsuResposta")
  private String nsuResposta = null;

  @JsonProperty("valor")
  private String valor = null;

  public InfTransacaoResp cdProc(String cdProc) {
    this.cdProc = cdProc;
    return this;
  }

  /**
   * Igual à requisição.
   * @return cdProc
  **/
  @ApiModelProperty(example = "029100", required = true, value = "Igual à requisição.")
  @NotNull

@Pattern(regexp="^\\d{6}$") 
  public String getCdProc() {
    return cdProc;
  }

  public void setCdProc(String cdProc) {
    this.cdProc = cdProc;
  }

  public InfTransacaoResp codMoeda(String codMoeda) {
    this.codMoeda = codMoeda;
    return this;
  }

  /**
   * Igual à requisição.
   * @return codMoeda
  **/
  @ApiModelProperty(example = "986", value = "Igual à requisição.")

@Pattern(regexp="^\\d{3}") 
  public String getCodMoeda() {
    return codMoeda;
  }

  public void setCodMoeda(String codMoeda) {
    this.codMoeda = codMoeda;
  }

  public InfTransacaoResp codOperadora(String codOperadora) {
    this.codOperadora = codOperadora;
    return this;
  }

  /**
   * Igual à requisição.
   * @return codOperadora
  **/
  @ApiModelProperty(example = "00000000914", required = true, value = "Igual à requisição.")
  @NotNull

@Pattern(regexp="^\\d{11}") 
  public String getCodOperadora() {
    return codOperadora;
  }

  public void setCodOperadora(String codOperadora) {
    this.codOperadora = codOperadora;
  }

  public InfTransacaoResp dataHora(String dataHora) {
    this.dataHora = dataHora;
    return this;
  }

  /**
   * Data hora da transação (MMDDhhmmss).
   * @return dataHora
  **/
  @ApiModelProperty(example = "1122151032", required = true, value = "Data hora da transação (MMDDhhmmss).")
  @NotNull

@Pattern(regexp="^\\d{10}$") 
  public String getDataHora() {
    return dataHora;
  }

  public void setDataHora(String dataHora) {
    this.dataHora = dataHora;
  }

  public InfTransacaoResp dataLocal(String dataLocal) {
    this.dataLocal = dataLocal;
    return this;
  }

  /**
   * Igual à requisição.
   * @return dataLocal
  **/
  @ApiModelProperty(example = "1122", required = true, value = "Igual à requisição.")
  @NotNull

@Pattern(regexp="^\\d{4}$") 
  public String getDataLocal() {
    return dataLocal;
  }

  public void setDataLocal(String dataLocal) {
    this.dataLocal = dataLocal;
  }

  public InfTransacaoResp errorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * Mensagem de erro, caso ocorra.
   * @return errorMessage
  **/
  @ApiModelProperty(example = "Cartão inválido.", value = "Mensagem de erro, caso ocorra.")


  public String getErrorMessage() {
    return errorMessage;
  }

  public void setErrorMessage(String errorMessage) {
    this.errorMessage = errorMessage;
  }

  public InfTransacaoResp horaLocal(String horaLocal) {
    this.horaLocal = horaLocal;
    return this;
  }

  /**
   * Igual à requisição.
   * @return horaLocal
  **/
  @ApiModelProperty(example = "151032", required = true, value = "Igual à requisição.")
  @NotNull

@Pattern(regexp="^\\d{6}$") 
  public String getHoraLocal() {
    return horaLocal;
  }

  public void setHoraLocal(String horaLocal) {
    this.horaLocal = horaLocal;
  }

  public InfTransacaoResp mensagemCliente(String mensagemCliente) {
    this.mensagemCliente = mensagemCliente;
    return this;
  }

  /**
   * Mensagem para ser mostrada na tela para o cliente.
   * @return mensagemCliente
  **/
  @ApiModelProperty(example = "Não foi possível validar o cartão.", value = "Mensagem para ser mostrada na tela para o cliente.")


  public String getMensagemCliente() {
    return mensagemCliente;
  }

  public void setMensagemCliente(String mensagemCliente) {
    this.mensagemCliente = mensagemCliente;
  }

  public InfTransacaoResp nsu(String nsu) {
    this.nsu = nsu;
    return this;
  }

  /**
   * Igual à requisição.
   * @return nsu
  **/
  @ApiModelProperty(example = "000080247206", required = true, value = "Igual à requisição.")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getNsu() {
    return nsu;
  }

  public void setNsu(String nsu) {
    this.nsu = nsu;
  }

  public InfTransacaoResp nsuResposta(String nsuResposta) {
    this.nsuResposta = nsuResposta;
    return this;
  }

  /**
   * Identificador da resposta da transação, gerado pelo autorizador.
   * @return nsuResposta
  **/
  @ApiModelProperty(example = "820", required = true, value = "Identificador da resposta da transação, gerado pelo autorizador.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getNsuResposta() {
    return nsuResposta;
  }

  public void setNsuResposta(String nsuResposta) {
    this.nsuResposta = nsuResposta;
  }

  public InfTransacaoResp valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Igual à requisição.
   * @return valor
  **/
  @ApiModelProperty(example = "5000", value = "Igual à requisição.")

@Pattern(regexp="^\\d+") 
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
    InfTransacaoResp infTransacaoResp = (InfTransacaoResp) o;
    return Objects.equals(this.cdProc, infTransacaoResp.cdProc) &&
        Objects.equals(this.codMoeda, infTransacaoResp.codMoeda) &&
        Objects.equals(this.codOperadora, infTransacaoResp.codOperadora) &&
        Objects.equals(this.dataHora, infTransacaoResp.dataHora) &&
        Objects.equals(this.dataLocal, infTransacaoResp.dataLocal) &&
        Objects.equals(this.errorMessage, infTransacaoResp.errorMessage) &&
        Objects.equals(this.horaLocal, infTransacaoResp.horaLocal) &&
        Objects.equals(this.mensagemCliente, infTransacaoResp.mensagemCliente) &&
        Objects.equals(this.nsu, infTransacaoResp.nsu) &&
        Objects.equals(this.nsuResposta, infTransacaoResp.nsuResposta) &&
        Objects.equals(this.valor, infTransacaoResp.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cdProc, codMoeda, codOperadora, dataHora, dataLocal, errorMessage, horaLocal, mensagemCliente, nsu, nsuResposta, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfTransacaoResp {\n");
    
    sb.append("    cdProc: ").append(toIndentedString(cdProc)).append("\n");
    sb.append("    codMoeda: ").append(toIndentedString(codMoeda)).append("\n");
    sb.append("    codOperadora: ").append(toIndentedString(codOperadora)).append("\n");
    sb.append("    dataHora: ").append(toIndentedString(dataHora)).append("\n");
    sb.append("    dataLocal: ").append(toIndentedString(dataLocal)).append("\n");
    sb.append("    errorMessage: ").append(toIndentedString(errorMessage)).append("\n");
    sb.append("    horaLocal: ").append(toIndentedString(horaLocal)).append("\n");
    sb.append("    mensagemCliente: ").append(toIndentedString(mensagemCliente)).append("\n");
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


package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfPagamentoReqCodBarras;
import io.swagger.model.InfPagamentoReqDarf;
import io.swagger.model.InfPagamentoReqDepositoTroco;
import io.swagger.model.InfPagamentoReqGps;
import io.swagger.model.InfPagamentoReqTroco;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InfPagamentoReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfPagamentoReq   {
  @JsonProperty("codBarras")
  private InfPagamentoReqCodBarras codBarras = null;

  @JsonProperty("darf")
  private InfPagamentoReqDarf darf = null;

  @JsonProperty("gps")
  private InfPagamentoReqGps gps = null;

  @JsonProperty("troco")
  private InfPagamentoReqTroco troco = null;

  @JsonProperty("depositoTroco")
  private InfPagamentoReqDepositoTroco depositoTroco = null;

  @JsonProperty("numDDA")
  private String numDDA = null;

  @JsonProperty("numConsultaPagamento")
  private String numConsultaPagamento = null;

  public InfPagamentoReq codBarras(InfPagamentoReqCodBarras codBarras) {
    this.codBarras = codBarras;
    return this;
  }

  /**
   * Get codBarras
   * @return codBarras
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfPagamentoReqCodBarras getCodBarras() {
    return codBarras;
  }

  public void setCodBarras(InfPagamentoReqCodBarras codBarras) {
    this.codBarras = codBarras;
  }

  public InfPagamentoReq darf(InfPagamentoReqDarf darf) {
    this.darf = darf;
    return this;
  }

  /**
   * Get darf
   * @return darf
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfPagamentoReqDarf getDarf() {
    return darf;
  }

  public void setDarf(InfPagamentoReqDarf darf) {
    this.darf = darf;
  }

  public InfPagamentoReq gps(InfPagamentoReqGps gps) {
    this.gps = gps;
    return this;
  }

  /**
   * Get gps
   * @return gps
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfPagamentoReqGps getGps() {
    return gps;
  }

  public void setGps(InfPagamentoReqGps gps) {
    this.gps = gps;
  }

  public InfPagamentoReq troco(InfPagamentoReqTroco troco) {
    this.troco = troco;
    return this;
  }

  /**
   * Get troco
   * @return troco
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfPagamentoReqTroco getTroco() {
    return troco;
  }

  public void setTroco(InfPagamentoReqTroco troco) {
    this.troco = troco;
  }

  public InfPagamentoReq depositoTroco(InfPagamentoReqDepositoTroco depositoTroco) {
    this.depositoTroco = depositoTroco;
    return this;
  }

  /**
   * Get depositoTroco
   * @return depositoTroco
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfPagamentoReqDepositoTroco getDepositoTroco() {
    return depositoTroco;
  }

  public void setDepositoTroco(InfPagamentoReqDepositoTroco depositoTroco) {
    this.depositoTroco = depositoTroco;
  }

  public InfPagamentoReq numDDA(String numDDA) {
    this.numDDA = numDDA;
    return this;
  }

  /**
   * Número ID DDA.
   * @return numDDA
  **/
  @ApiModelProperty(value = "Número ID DDA.")

@Pattern(regexp="^\\d+$") 
  public String getNumDDA() {
    return numDDA;
  }

  public void setNumDDA(String numDDA) {
    this.numDDA = numDDA;
  }

  public InfPagamentoReq numConsultaPagamento(String numConsultaPagamento) {
    this.numConsultaPagamento = numConsultaPagamento;
    return this;
  }

  /**
   * Identificação da Consulta Pagamento.
   * @return numConsultaPagamento
  **/
  @ApiModelProperty(value = "Identificação da Consulta Pagamento.")

@Pattern(regexp="^\\d+$") 
  public String getNumConsultaPagamento() {
    return numConsultaPagamento;
  }

  public void setNumConsultaPagamento(String numConsultaPagamento) {
    this.numConsultaPagamento = numConsultaPagamento;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfPagamentoReq infPagamentoReq = (InfPagamentoReq) o;
    return Objects.equals(this.codBarras, infPagamentoReq.codBarras) &&
        Objects.equals(this.darf, infPagamentoReq.darf) &&
        Objects.equals(this.gps, infPagamentoReq.gps) &&
        Objects.equals(this.troco, infPagamentoReq.troco) &&
        Objects.equals(this.depositoTroco, infPagamentoReq.depositoTroco) &&
        Objects.equals(this.numDDA, infPagamentoReq.numDDA) &&
        Objects.equals(this.numConsultaPagamento, infPagamentoReq.numConsultaPagamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codBarras, darf, gps, troco, depositoTroco, numDDA, numConsultaPagamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfPagamentoReq {\n");
    
    sb.append("    codBarras: ").append(toIndentedString(codBarras)).append("\n");
    sb.append("    darf: ").append(toIndentedString(darf)).append("\n");
    sb.append("    gps: ").append(toIndentedString(gps)).append("\n");
    sb.append("    troco: ").append(toIndentedString(troco)).append("\n");
    sb.append("    depositoTroco: ").append(toIndentedString(depositoTroco)).append("\n");
    sb.append("    numDDA: ").append(toIndentedString(numDDA)).append("\n");
    sb.append("    numConsultaPagamento: ").append(toIndentedString(numConsultaPagamento)).append("\n");
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


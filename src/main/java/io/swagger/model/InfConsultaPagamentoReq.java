package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaPagamentoReqCodBarras;
import io.swagger.model.InfConsultaPagamentoReqDarf;
import io.swagger.model.InfConsultaPagamentoReqDda;
import io.swagger.model.InfConsultaPagamentoReqGps;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InfConsultaPagamentoReq
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfConsultaPagamentoReq   {
  @JsonProperty("codBarras")
  private InfConsultaPagamentoReqCodBarras codBarras = null;

  @JsonProperty("darf")
  private InfConsultaPagamentoReqDarf darf = null;

  @JsonProperty("dda")
  private InfConsultaPagamentoReqDda dda = null;

  @JsonProperty("gps")
  private InfConsultaPagamentoReqGps gps = null;

  public InfConsultaPagamentoReq codBarras(InfConsultaPagamentoReqCodBarras codBarras) {
    this.codBarras = codBarras;
    return this;
  }

  /**
   * Get codBarras
   * @return codBarras
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfConsultaPagamentoReqCodBarras getCodBarras() {
    return codBarras;
  }

  public void setCodBarras(InfConsultaPagamentoReqCodBarras codBarras) {
    this.codBarras = codBarras;
  }

  public InfConsultaPagamentoReq darf(InfConsultaPagamentoReqDarf darf) {
    this.darf = darf;
    return this;
  }

  /**
   * Get darf
   * @return darf
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfConsultaPagamentoReqDarf getDarf() {
    return darf;
  }

  public void setDarf(InfConsultaPagamentoReqDarf darf) {
    this.darf = darf;
  }

  public InfConsultaPagamentoReq dda(InfConsultaPagamentoReqDda dda) {
    this.dda = dda;
    return this;
  }

  /**
   * Get dda
   * @return dda
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfConsultaPagamentoReqDda getDda() {
    return dda;
  }

  public void setDda(InfConsultaPagamentoReqDda dda) {
    this.dda = dda;
  }

  public InfConsultaPagamentoReq gps(InfConsultaPagamentoReqGps gps) {
    this.gps = gps;
    return this;
  }

  /**
   * Get gps
   * @return gps
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfConsultaPagamentoReqGps getGps() {
    return gps;
  }

  public void setGps(InfConsultaPagamentoReqGps gps) {
    this.gps = gps;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaPagamentoReq infConsultaPagamentoReq = (InfConsultaPagamentoReq) o;
    return Objects.equals(this.codBarras, infConsultaPagamentoReq.codBarras) &&
        Objects.equals(this.darf, infConsultaPagamentoReq.darf) &&
        Objects.equals(this.dda, infConsultaPagamentoReq.dda) &&
        Objects.equals(this.gps, infConsultaPagamentoReq.gps);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codBarras, darf, dda, gps);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPagamentoReq {\n");
    
    sb.append("    codBarras: ").append(toIndentedString(codBarras)).append("\n");
    sb.append("    darf: ").append(toIndentedString(darf)).append("\n");
    sb.append("    dda: ").append(toIndentedString(dda)).append("\n");
    sb.append("    gps: ").append(toIndentedString(gps)).append("\n");
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


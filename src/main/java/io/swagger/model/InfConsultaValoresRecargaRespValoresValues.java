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
 * InfConsultaValoresRecargaRespValoresValues
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfConsultaValoresRecargaRespValoresValues   {
  @JsonProperty("fee")
  private String fee = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("value")
  private String value = null;

  public InfConsultaValoresRecargaRespValoresValues fee(String fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Taxa do valor.
   * @return fee
  **/
  @ApiModelProperty(example = "200", required = true, value = "Taxa do valor.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public InfConsultaValoresRecargaRespValoresValues id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador do valor.
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "Identificador do valor.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InfConsultaValoresRecargaRespValoresValues value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Identificador do valor.
   * @return value
  **/
  @ApiModelProperty(example = "2000", required = true, value = "Identificador do valor.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaValoresRecargaRespValoresValues infConsultaValoresRecargaRespValoresValues = (InfConsultaValoresRecargaRespValoresValues) o;
    return Objects.equals(this.fee, infConsultaValoresRecargaRespValoresValues.fee) &&
        Objects.equals(this.id, infConsultaValoresRecargaRespValoresValues.id) &&
        Objects.equals(this.value, infConsultaValoresRecargaRespValoresValues.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fee, id, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaValoresRecargaRespValoresValues {\n");
    
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
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


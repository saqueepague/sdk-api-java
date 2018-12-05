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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfConsultaValoresRecargaRespValoresValues   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("value")
  private String value = null;

  @JsonProperty("fee")
  private String fee = null;

  public InfConsultaValoresRecargaRespValoresValues id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador do valor.
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "Identificador do valor.")

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
  @ApiModelProperty(example = "2000", value = "Identificador do valor.")

@Pattern(regexp="^\\d+$") 
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public InfConsultaValoresRecargaRespValoresValues fee(String fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Taxa do valor.
   * @return fee
  **/
  @ApiModelProperty(example = "200", value = "Taxa do valor.")

@Pattern(regexp="^\\d+$") 
  public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
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
    return Objects.equals(this.id, infConsultaValoresRecargaRespValoresValues.id) &&
        Objects.equals(this.value, infConsultaValoresRecargaRespValoresValues.value) &&
        Objects.equals(this.fee, infConsultaValoresRecargaRespValoresValues.fee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, value, fee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaValoresRecargaRespValoresValues {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
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


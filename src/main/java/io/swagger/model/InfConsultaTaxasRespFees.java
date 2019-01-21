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
 * InfConsultaTaxasRespFees
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfConsultaTaxasRespFees   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("max_amount")
  private String maxAmount = null;

  @JsonProperty("min_amount")
  private String minAmount = null;

  @JsonProperty("value")
  private String value = null;

  public InfConsultaTaxasRespFees id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador da operação da taxa.
   * @return id
  **/
  @ApiModelProperty(example = "0201", required = true, value = "Identificador da operação da taxa.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InfConsultaTaxasRespFees maxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
    return this;
  }

  /**
   * Valor máximo da taxa.
   * @return maxAmount
  **/
  @ApiModelProperty(example = "10000", required = true, value = "Valor máximo da taxa.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
  }

  public InfConsultaTaxasRespFees minAmount(String minAmount) {
    this.minAmount = minAmount;
    return this;
  }

  /**
   * Valor mínimo da taxa.
   * @return minAmount
  **/
  @ApiModelProperty(example = "000", required = true, value = "Valor mínimo da taxa.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getMinAmount() {
    return minAmount;
  }

  public void setMinAmount(String minAmount) {
    this.minAmount = minAmount;
  }

  public InfConsultaTaxasRespFees value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Valor da taxa.
   * @return value
  **/
  @ApiModelProperty(example = "000", required = true, value = "Valor da taxa.")
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
    InfConsultaTaxasRespFees infConsultaTaxasRespFees = (InfConsultaTaxasRespFees) o;
    return Objects.equals(this.id, infConsultaTaxasRespFees.id) &&
        Objects.equals(this.maxAmount, infConsultaTaxasRespFees.maxAmount) &&
        Objects.equals(this.minAmount, infConsultaTaxasRespFees.minAmount) &&
        Objects.equals(this.value, infConsultaTaxasRespFees.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, maxAmount, minAmount, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaTaxasRespFees {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
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


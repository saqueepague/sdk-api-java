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
public class InfConsultaTaxasRespFees   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("min_amount")
  private String minAmount = null;

  @JsonProperty("max_amount")
  private String maxAmount = null;

  @JsonProperty("value")
  private String value = null;

  public InfConsultaTaxasRespFees id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Número identificador da taxa.
   * @return id
  **/
  @ApiModelProperty(example = "0201", value = "Número identificador da taxa.")

@Pattern(regexp="^\\d+$")   public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InfConsultaTaxasRespFees minAmount(String minAmount) {
    this.minAmount = minAmount;
    return this;
  }

  /**
   * Limite inferior de valor para aplicação desta taxa.
   * @return minAmount
  **/
  @ApiModelProperty(example = "000", value = "Limite inferior de valor para aplicação desta taxa.")

@Pattern(regexp="^\\d+$")   public String getMinAmount() {
    return minAmount;
  }

  public void setMinAmount(String minAmount) {
    this.minAmount = minAmount;
  }

  public InfConsultaTaxasRespFees maxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
    return this;
  }

  /**
   * Limite superior de valor para aplicação desta taxa.
   * @return maxAmount
  **/
  @ApiModelProperty(example = "10000", value = "Limite superior de valor para aplicação desta taxa.")

@Pattern(regexp="^\\d+$")   public String getMaxAmount() {
    return maxAmount;
  }

  public void setMaxAmount(String maxAmount) {
    this.maxAmount = maxAmount;
  }

  public InfConsultaTaxasRespFees value(String value) {
    this.value = value;
    return this;
  }

  /**
   * Valor da taxa a ser aplicada.
   * @return value
  **/
  @ApiModelProperty(example = "000", value = "Valor da taxa a ser aplicada.")

@Pattern(regexp="^\\d+$")   public String getValue() {
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
        Objects.equals(this.minAmount, infConsultaTaxasRespFees.minAmount) &&
        Objects.equals(this.maxAmount, infConsultaTaxasRespFees.maxAmount) &&
        Objects.equals(this.value, infConsultaTaxasRespFees.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, minAmount, maxAmount, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaTaxasRespFees {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    minAmount: ").append(toIndentedString(minAmount)).append("\n");
    sb.append("    maxAmount: ").append(toIndentedString(maxAmount)).append("\n");
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

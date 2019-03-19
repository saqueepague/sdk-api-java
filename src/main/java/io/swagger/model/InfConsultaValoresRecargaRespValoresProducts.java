package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaValoresRecargaRespValoresValues;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InfConsultaValoresRecargaRespValoresProducts
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-19T14:13:24.289Z[GMT]")
public class InfConsultaValoresRecargaRespValoresProducts   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("min_value")
  private String minValue = null;

  @JsonProperty("max_value")
  private String maxValue = null;

  @JsonProperty("fee")
  private String fee = null;

  @JsonProperty("values")
  @Valid
  private List<InfConsultaValoresRecargaRespValoresValues> values = null;

  public InfConsultaValoresRecargaRespValoresProducts id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Número identificador do produto.
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "Número identificador do produto.")

@Pattern(regexp="^\\d+$")   public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InfConsultaValoresRecargaRespValoresProducts name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome do produto.
   * @return name
  **/
  @ApiModelProperty(example = "Bilhete Antecipado", value = "Nome do produto.")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InfConsultaValoresRecargaRespValoresProducts minValue(String minValue) {
    this.minValue = minValue;
    return this;
  }

  /**
   * Limite inferior de valor de recarga para aplicação desta taxa (fee).
   * @return minValue
  **/
  @ApiModelProperty(example = "1000", value = "Limite inferior de valor de recarga para aplicação desta taxa (fee).")

@Pattern(regexp="^\\d+$")   public String getMinValue() {
    return minValue;
  }

  public void setMinValue(String minValue) {
    this.minValue = minValue;
  }

  public InfConsultaValoresRecargaRespValoresProducts maxValue(String maxValue) {
    this.maxValue = maxValue;
    return this;
  }

  /**
   * Limite superior de valor de recarga para aplicação desta taxa (fee).
   * @return maxValue
  **/
  @ApiModelProperty(example = "9000", value = "Limite superior de valor de recarga para aplicação desta taxa (fee).")

@Pattern(regexp="^\\d+$")   public String getMaxValue() {
    return maxValue;
  }

  public void setMaxValue(String maxValue) {
    this.maxValue = maxValue;
  }

  public InfConsultaValoresRecargaRespValoresProducts fee(String fee) {
    this.fee = fee;
    return this;
  }

  /**
   * Taxa da recarga para a faixa de valor determinada.
   * @return fee
  **/
  @ApiModelProperty(example = "200", value = "Taxa da recarga para a faixa de valor determinada.")

@Pattern(regexp="^\\d+$")   public String getFee() {
    return fee;
  }

  public void setFee(String fee) {
    this.fee = fee;
  }

  public InfConsultaValoresRecargaRespValoresProducts values(List<InfConsultaValoresRecargaRespValoresValues> values) {
    this.values = values;
    return this;
  }

  public InfConsultaValoresRecargaRespValoresProducts addValuesItem(InfConsultaValoresRecargaRespValoresValues valuesItem) {
    if (this.values == null) {
      this.values = new ArrayList<InfConsultaValoresRecargaRespValoresValues>();
    }
    this.values.add(valuesItem);
    return this;
  }

  /**
   * Get values
   * @return values
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<InfConsultaValoresRecargaRespValoresValues> getValues() {
    return values;
  }

  public void setValues(List<InfConsultaValoresRecargaRespValoresValues> values) {
    this.values = values;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaValoresRecargaRespValoresProducts infConsultaValoresRecargaRespValoresProducts = (InfConsultaValoresRecargaRespValoresProducts) o;
    return Objects.equals(this.id, infConsultaValoresRecargaRespValoresProducts.id) &&
        Objects.equals(this.name, infConsultaValoresRecargaRespValoresProducts.name) &&
        Objects.equals(this.minValue, infConsultaValoresRecargaRespValoresProducts.minValue) &&
        Objects.equals(this.maxValue, infConsultaValoresRecargaRespValoresProducts.maxValue) &&
        Objects.equals(this.fee, infConsultaValoresRecargaRespValoresProducts.fee) &&
        Objects.equals(this.values, infConsultaValoresRecargaRespValoresProducts.values);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, minValue, maxValue, fee, values);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaValoresRecargaRespValoresProducts {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    minValue: ").append(toIndentedString(minValue)).append("\n");
    sb.append("    maxValue: ").append(toIndentedString(maxValue)).append("\n");
    sb.append("    fee: ").append(toIndentedString(fee)).append("\n");
    sb.append("    values: ").append(toIndentedString(values)).append("\n");
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

package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaTaxasRespFees;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InfConsultaTaxasRespTransactionsFees
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-19T14:13:24.289Z[GMT]")
public class InfConsultaTaxasRespTransactionsFees   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("fees")
  @Valid
  private List<InfConsultaTaxasRespFees> fees = null;

  public InfConsultaTaxasRespTransactionsFees id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Número identificador produto.
   * @return id
  **/
  @ApiModelProperty(example = "01", value = "Número identificador produto.")

@Pattern(regexp="^\\d+$")   public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InfConsultaTaxasRespTransactionsFees name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome do produto.
   * @return name
  **/
  @ApiModelProperty(example = "deposit", value = "Nome do produto.")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InfConsultaTaxasRespTransactionsFees fees(List<InfConsultaTaxasRespFees> fees) {
    this.fees = fees;
    return this;
  }

  public InfConsultaTaxasRespTransactionsFees addFeesItem(InfConsultaTaxasRespFees feesItem) {
    if (this.fees == null) {
      this.fees = new ArrayList<InfConsultaTaxasRespFees>();
    }
    this.fees.add(feesItem);
    return this;
  }

  /**
   * Get fees
   * @return fees
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<InfConsultaTaxasRespFees> getFees() {
    return fees;
  }

  public void setFees(List<InfConsultaTaxasRespFees> fees) {
    this.fees = fees;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaTaxasRespTransactionsFees infConsultaTaxasRespTransactionsFees = (InfConsultaTaxasRespTransactionsFees) o;
    return Objects.equals(this.id, infConsultaTaxasRespTransactionsFees.id) &&
        Objects.equals(this.name, infConsultaTaxasRespTransactionsFees.name) &&
        Objects.equals(this.fees, infConsultaTaxasRespTransactionsFees.fees);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, fees);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaTaxasRespTransactionsFees {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
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

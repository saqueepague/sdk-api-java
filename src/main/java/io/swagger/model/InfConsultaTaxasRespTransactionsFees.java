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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

public class InfConsultaTaxasRespTransactionsFees   {
  @JsonProperty("fees")
  @Valid
  private List<InfConsultaTaxasRespFees> fees = new ArrayList<InfConsultaTaxasRespFees>();

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public InfConsultaTaxasRespTransactionsFees fees(List<InfConsultaTaxasRespFees> fees) {
    this.fees = fees;
    return this;
  }

  public InfConsultaTaxasRespTransactionsFees addFeesItem(InfConsultaTaxasRespFees feesItem) {
    this.fees.add(feesItem);
    return this;
  }

  /**
   * Get fees
   * @return fees
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<InfConsultaTaxasRespFees> getFees() {
    return fees;
  }

  public void setFees(List<InfConsultaTaxasRespFees> fees) {
    this.fees = fees;
  }

  public InfConsultaTaxasRespTransactionsFees id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador da taxa.
   * @return id
  **/
  @ApiModelProperty(example = "01", required = true, value = "Identificador da taxa.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getId() {
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
   * Nome da taxa.
   * @return name
  **/
  @ApiModelProperty(example = "deposit", required = true, value = "Nome da taxa.")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
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
    return Objects.equals(this.fees, infConsultaTaxasRespTransactionsFees.fees) &&
        Objects.equals(this.id, infConsultaTaxasRespTransactionsFees.id) &&
        Objects.equals(this.name, infConsultaTaxasRespTransactionsFees.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(fees, id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaTaxasRespTransactionsFees {\n");
    
    sb.append("    fees: ").append(toIndentedString(fees)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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


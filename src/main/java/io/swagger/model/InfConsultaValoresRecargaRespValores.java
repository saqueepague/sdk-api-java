package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaValoresRecargaRespValoresIssuers;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Lista de valores possíveis de produtos de recarga com seus valores.
 */
@ApiModel(description = "Lista de valores possíveis de produtos de recarga com seus valores.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfConsultaValoresRecargaRespValores   {
  @JsonProperty("issuers")
  @Valid
  private List<InfConsultaValoresRecargaRespValoresIssuers> issuers = new ArrayList<InfConsultaValoresRecargaRespValoresIssuers>();

  public InfConsultaValoresRecargaRespValores issuers(List<InfConsultaValoresRecargaRespValoresIssuers> issuers) {
    this.issuers = issuers;
    return this;
  }

  public InfConsultaValoresRecargaRespValores addIssuersItem(InfConsultaValoresRecargaRespValoresIssuers issuersItem) {
    this.issuers.add(issuersItem);
    return this;
  }

  /**
   * Get issuers
   * @return issuers
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<InfConsultaValoresRecargaRespValoresIssuers> getIssuers() {
    return issuers;
  }

  public void setIssuers(List<InfConsultaValoresRecargaRespValoresIssuers> issuers) {
    this.issuers = issuers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaValoresRecargaRespValores infConsultaValoresRecargaRespValores = (InfConsultaValoresRecargaRespValores) o;
    return Objects.equals(this.issuers, infConsultaValoresRecargaRespValores.issuers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(issuers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaValoresRecargaRespValores {\n");
    
    sb.append("    issuers: ").append(toIndentedString(issuers)).append("\n");
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


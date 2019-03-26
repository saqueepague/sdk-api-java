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
 * InfConsultaProdutosRecargaRespProducts
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-26T17:53:50.941Z[GMT]")
public class InfConsultaProdutosRecargaRespProducts   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  public InfConsultaProdutosRecargaRespProducts id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador do produto disponível com base na lista gerada na operação /consultaValoresRecarga.
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "Identificador do produto disponível com base na lista gerada na operação /consultaValoresRecarga.")

@Pattern(regexp="^\\d+$")   public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InfConsultaProdutosRecargaRespProducts name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome do produto disponível.
   * @return name
  **/
  @ApiModelProperty(example = "Produto de Recarga", value = "Nome do produto disponível.")

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
    InfConsultaProdutosRecargaRespProducts infConsultaProdutosRecargaRespProducts = (InfConsultaProdutosRecargaRespProducts) o;
    return Objects.equals(this.id, infConsultaProdutosRecargaRespProducts.id) &&
        Objects.equals(this.name, infConsultaProdutosRecargaRespProducts.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaProdutosRecargaRespProducts {\n");
    
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

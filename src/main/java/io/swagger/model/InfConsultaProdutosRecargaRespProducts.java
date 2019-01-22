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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

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
   * Identificador do produto.
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "Identificador do produto.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getId() {
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
   * Nome do produto.
   * @return name
  **/
  @ApiModelProperty(example = "Produto de Recarga", required = true, value = "Nome do produto.")
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


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
 * Informações da requisição de empréstimo.
 */
@ApiModel(description = "Informações da requisição de empréstimo.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfEmprestimoReq   {
  @JsonProperty("qntParcelas")
  private String qntParcelas = null;

  public InfEmprestimoReq qntParcelas(String qntParcelas) {
    this.qntParcelas = qntParcelas;
    return this;
  }

  /**
   * Quantidade de parcelas.
   * @return qntParcelas
  **/
  @ApiModelProperty(example = "6", value = "Quantidade de parcelas.")

@Pattern(regexp="^\\d+$") 
  public String getQntParcelas() {
    return qntParcelas;
  }

  public void setQntParcelas(String qntParcelas) {
    this.qntParcelas = qntParcelas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfEmprestimoReq infEmprestimoReq = (InfEmprestimoReq) o;
    return Objects.equals(this.qntParcelas, infEmprestimoReq.qntParcelas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qntParcelas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfEmprestimoReq {\n");
    
    sb.append("    qntParcelas: ").append(toIndentedString(qntParcelas)).append("\n");
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


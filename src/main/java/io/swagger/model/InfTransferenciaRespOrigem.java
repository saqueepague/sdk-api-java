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
 * Informações de origem da transferencia.
 */
@ApiModel(description = "Informações de origem da transferencia.")
@Validated
public class InfTransferenciaRespOrigem   {
  @JsonProperty("nomeCliente")
  private String nomeCliente = null;

  public InfTransferenciaRespOrigem nomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
    return this;
  }

  /**
   * Nome do cliente de origem.
   * @return nomeCliente
  **/
  @ApiModelProperty(example = "Jean-Luc Picard", value = "Nome do cliente de origem.")

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfTransferenciaRespOrigem infTransferenciaRespOrigem = (InfTransferenciaRespOrigem) o;
    return Objects.equals(this.nomeCliente, infTransferenciaRespOrigem.nomeCliente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeCliente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfTransferenciaRespOrigem {\n");
    
    sb.append("    nomeCliente: ").append(toIndentedString(nomeCliente)).append("\n");
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

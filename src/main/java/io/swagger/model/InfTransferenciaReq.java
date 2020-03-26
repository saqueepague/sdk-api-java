package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfTransferenciaReqDestino;
import io.swagger.model.InfTransferenciaReqOrigem;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações sobre a requisição de transferência.
 */
@ApiModel(description = "Informações sobre a requisição de transferência.")
@Validated
public class InfTransferenciaReq   {
  @JsonProperty("origem")
  private InfTransferenciaReqOrigem origem = null;

  @JsonProperty("destino")
  private InfTransferenciaReqDestino destino = null;

  public InfTransferenciaReq origem(InfTransferenciaReqOrigem origem) {
    this.origem = origem;
    return this;
  }

  /**
   * Get origem
   * @return origem
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public InfTransferenciaReqOrigem getOrigem() {
    return origem;
  }

  public void setOrigem(InfTransferenciaReqOrigem origem) {
    this.origem = origem;
  }

  public InfTransferenciaReq destino(InfTransferenciaReqDestino destino) {
    this.destino = destino;
    return this;
  }

  /**
   * Get destino
   * @return destino
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid
  public InfTransferenciaReqDestino getDestino() {
    return destino;
  }

  public void setDestino(InfTransferenciaReqDestino destino) {
    this.destino = destino;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfTransferenciaReq infTransferenciaReq = (InfTransferenciaReq) o;
    return Objects.equals(this.origem, infTransferenciaReq.origem) &&
        Objects.equals(this.destino, infTransferenciaReq.destino);
  }

  @Override
  public int hashCode() {
    return Objects.hash(origem, destino);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfTransferenciaReq {\n");
    
    sb.append("    origem: ").append(toIndentedString(origem)).append("\n");
    sb.append("    destino: ").append(toIndentedString(destino)).append("\n");
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

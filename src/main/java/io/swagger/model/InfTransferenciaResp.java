package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfTransferenciaRespDestino;
import io.swagger.model.InfTransferenciaRespOrigem;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações da resposta de transferencia.
 */
@ApiModel(description = "Informações da resposta de transferencia.")
@Validated
public class InfTransferenciaResp   {
  @JsonProperty("origem")
  private InfTransferenciaRespOrigem origem = null;

  @JsonProperty("destino")
  private InfTransferenciaRespDestino destino = null;

  @JsonProperty("recibo")
  private String recibo = null;

  public InfTransferenciaResp origem(InfTransferenciaRespOrigem origem) {
    this.origem = origem;
    return this;
  }

  /**
   * Get origem
   * @return origem
  **/
  @ApiModelProperty(value = "")

  @Valid
  public InfTransferenciaRespOrigem getOrigem() {
    return origem;
  }

  public void setOrigem(InfTransferenciaRespOrigem origem) {
    this.origem = origem;
  }

  public InfTransferenciaResp destino(InfTransferenciaRespDestino destino) {
    this.destino = destino;
    return this;
  }

  /**
   * Get destino
   * @return destino
  **/
  @ApiModelProperty(value = "")

  @Valid
  public InfTransferenciaRespDestino getDestino() {
    return destino;
  }

  public void setDestino(InfTransferenciaRespDestino destino) {
    this.destino = destino;
  }

  public InfTransferenciaResp recibo(String recibo) {
    this.recibo = recibo;
    return this;
  }

  /**
   * Recibo da operação de transferencia efetuada. Linhas com 48 posições separadas por \"@\".
   * @return recibo
  **/
  @ApiModelProperty(example = "          COMPROVANTE DE TRANSFERENCIA          @           TRANSFERENCIA ENTRE CONTAS           @ORIGEM: CONTA CORRENTE - 123/1234567890         @DESTINO: CONTA CORRENTE - 456/9876543210        @VALOR TRANSFERENCIA: 123,456                    ", required = true, value = "Recibo da operação de transferencia efetuada. Linhas com 48 posições separadas por \"@\".")
  @NotNull

@Pattern(regexp="^[^@]{0,48}(\\@[^@]{0,48})*$")   public String getRecibo() {
    return recibo;
  }

  public void setRecibo(String recibo) {
    this.recibo = recibo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfTransferenciaResp infTransferenciaResp = (InfTransferenciaResp) o;
    return Objects.equals(this.origem, infTransferenciaResp.origem) &&
        Objects.equals(this.destino, infTransferenciaResp.destino) &&
        Objects.equals(this.recibo, infTransferenciaResp.recibo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(origem, destino, recibo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfTransferenciaResp {\n");
    
    sb.append("    origem: ").append(toIndentedString(origem)).append("\n");
    sb.append("    destino: ").append(toIndentedString(destino)).append("\n");
    sb.append("    recibo: ").append(toIndentedString(recibo)).append("\n");
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

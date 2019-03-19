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
 * Informações sobre a resposta de requisição de recarga de cartão pré-pago de transporte.
 */
@ApiModel(description = "Informações sobre a resposta de requisição de recarga de cartão pré-pago de transporte.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-19T14:13:24.289Z[GMT]")
public class InfRecargaResp   {
  @JsonProperty("recibo")
  private String recibo = null;

  public InfRecargaResp recibo(String recibo) {
    this.recibo = recibo;
    return this;
  }

  /**
   * Comprovante da operação de recarga. Linhas com 48 posições separadas por \"@\".
   * @return recibo
  **/
  @ApiModelProperty(example = "@             TEU BILHETE ANTECIPADO             @                                                @ CARTAO: 036200005433591                        @ VALOR DA RECARGA: R$ 48,00                     @ TAXAS: R$ 2,00                                 @ TOTAL PAGO: R$ 50,00                           ", required = true, value = "Comprovante da operação de recarga. Linhas com 48 posições separadas por \"@\".")
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
    InfRecargaResp infRecargaResp = (InfRecargaResp) o;
    return Objects.equals(this.recibo, infRecargaResp.recibo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recibo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfRecargaResp {\n");
    
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

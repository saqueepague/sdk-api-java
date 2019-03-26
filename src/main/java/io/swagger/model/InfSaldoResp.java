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
 * Informações da resposta de saldo.
 */
@ApiModel(description = "Informações da resposta de saldo.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-26T13:22:47.638Z[GMT]")
public class InfSaldoResp   {
  @JsonProperty("recibo")
  private String recibo = null;

  public InfSaldoResp recibo(String recibo) {
    this.recibo = recibo;
    return this;
  }

  /**
   * Recibo com informações do saldo em conta. Linhas com 48 posições separadas por \"@\".
   * @return recibo
  **/
  @ApiModelProperty(example = "                 SALDO EM CONTA                @                036200005433591                @               13/10/2018  20:24                @          BANCO: BANCO SAQUE E PAGUE           @          AGENCIA: 4029                        @          CONTA: 0082348296                    @          VALOR NA DATA: R$ 50,00              ", required = true, value = "Recibo com informações do saldo em conta. Linhas com 48 posições separadas por \"@\".")
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
    InfSaldoResp infSaldoResp = (InfSaldoResp) o;
    return Objects.equals(this.recibo, infSaldoResp.recibo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recibo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfSaldoResp {\n");
    
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

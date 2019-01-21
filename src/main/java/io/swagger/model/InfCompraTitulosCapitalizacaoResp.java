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
 * Informações da resposta da requisição de compra de títulos de capitalização.
 */
@ApiModel(description = "Informações da resposta da requisição de compra de títulos de capitalização.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfCompraTitulosCapitalizacaoResp   {
  @JsonProperty("recibo")
  private String recibo = null;

  public InfCompraTitulosCapitalizacaoResp recibo(String recibo) {
    this.recibo = recibo;
    return this;
  }

  /**
   * Recibo com informações da compra. Linhas com 48 posições separadas por \"@\".
   * @return recibo
  **/
  @ApiModelProperty(example = "               TÍTULOS COMPRADOS               @                036200005433591                @               13/10/2018  20:24               @                NOME DO TITULO                 @                 QUANTIDADE: 2                 @                VALOR: R$ 25,00                @              VALOR TOTAL: R$ 50,00            @              TELEFONE: 05199999999            @                CPF: 02358422785               ", required = true, value = "Recibo com informações da compra. Linhas com 48 posições separadas por \"@\".")
  @NotNull

@Pattern(regexp="^[^@]{0,48}(\\@[^@]{0,48})*$") 
  public String getRecibo() {
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
    InfCompraTitulosCapitalizacaoResp infCompraTitulosCapitalizacaoResp = (InfCompraTitulosCapitalizacaoResp) o;
    return Objects.equals(this.recibo, infCompraTitulosCapitalizacaoResp.recibo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recibo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfCompraTitulosCapitalizacaoResp {\n");
    
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


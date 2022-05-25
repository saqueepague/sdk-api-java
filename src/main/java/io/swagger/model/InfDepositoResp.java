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
 * Informações da resposta da requisição de depósito.
 */
@ApiModel(description = "Informações da resposta da requisição de depósito.")
@Validated
public class InfDepositoResp   {
  @JsonProperty("recibo")
  private String recibo = null;

  public InfDepositoResp recibo(String recibo) {
    this.recibo = recibo;
    return this;
  }

  /**
   * Recibo com informações do depósito efetuado. Linhas com 48 posições separadas por \"@\".
   * @return recibo
  **/
  @ApiModelProperty(example = "@            COMPROVANTE DE DEPOSITO             @------------------------------------------------@ Agencia....: 0101                              @ Conta......: 74414-0                           @ Nome.......: EUGENIO SCHMITT COELHO            @@------------------------------------------------@ Favorecido: EUGENIO SCHMITT COELHO             @ Agencia Destino:                           0101@ Conta Destino:         Conta Corrente - 74414-0@@Tipo            NSU                        Valor@Dinheiro        697841472523             R$20,00@------------------------------------------------@               SAC - 0800 123 4569@      SAC - DEF. AUDITIVO - 0800 123 4568@            OUVIDORIA - 0800 123 4567@@             www.siteparceiro.com.br@", required = true, value = "Recibo com informações do depósito efetuado. Linhas com 48 posições separadas por \"@\".")
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
    InfDepositoResp infDepositoResp = (InfDepositoResp) o;
    return Objects.equals(this.recibo, infDepositoResp.recibo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recibo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfDepositoResp {\n");
    
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

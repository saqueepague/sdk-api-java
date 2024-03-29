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
 * Informações da resposta de saque.
 */
@ApiModel(description = "Informações da resposta de saque.")
@Validated
public class InfSaqueResp   {
  @JsonProperty("recibo")
  private String recibo = null;

  @JsonProperty("ispb")
  private String ispb = null;

  public InfSaqueResp recibo(String recibo) {
    this.recibo = recibo;
    return this;
  }

  /**
   * Recibo da operação de saque efetuada. Linhas com 48 posições separadas por \"@\". Substituir os valores do recibo pela tag %VALOR%. A Saque e Pague substituirá essa tag no comprovante pelo valor realmente sacado pelo cliente.
   * @return recibo
  **/
  @ApiModelProperty(example = "                 SAQUE DE CONTA                 @                036200005433591                @               13/10/2018  20:24               @                 BANCO: BANCO                  @                AGENCIA: 4029                  @              CONTA: 0082348296                @               %VALOR%: R$ 50,00                 ", required = true, value = "Recibo da operação de saque efetuada. Linhas com 48 posições separadas por \"@\". Substituir os valores do recibo pela tag %VALOR%. A Saque e Pague substituirá essa tag no comprovante pelo valor realmente sacado pelo cliente.")
  @NotNull

@Pattern(regexp="^[^@]{0,48}(\\@[^@]{0,48})*$")   public String getRecibo() {
    return recibo;
  }

  public void setRecibo(String recibo) {
    this.recibo = recibo;
  }

  public InfSaqueResp ispb(String ispb) {
    this.ispb = ispb;
    return this;
  }

  /**
   * Código da Intituição registrada no Sistema Brasileiro de Pagamentos. Campo obrigatório, para transações de Saque QR Code, afim de identificar a instituição parceira da transação.
   * @return ispb
  **/
  @ApiModelProperty(example = "01234567", value = "Código da Intituição registrada no Sistema Brasileiro de Pagamentos. Campo obrigatório, para transações de Saque QR Code, afim de identificar a instituição parceira da transação.")

@Pattern(regexp="^\\d{8}$")   public String getIspb() {
    return ispb;
  }

  public void setIspb(String ispb) {
    this.ispb = ispb;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfSaqueResp infSaqueResp = (InfSaqueResp) o;
    return Objects.equals(this.recibo, infSaqueResp.recibo) &&
        Objects.equals(this.ispb, infSaqueResp.ispb);
  }

  @Override
  public int hashCode() {
    return Objects.hash(recibo, ispb);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfSaqueResp {\n");
    
    sb.append("    recibo: ").append(toIndentedString(recibo)).append("\n");
    sb.append("    ispb: ").append(toIndentedString(ispb)).append("\n");
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

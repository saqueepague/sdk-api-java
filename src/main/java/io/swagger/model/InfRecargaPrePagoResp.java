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
 * Informações de retorno da recarga de celular pré-pago.
 */
@ApiModel(description = "Informações de retorno da recarga de celular pré-pago.")
@Validated
public class InfRecargaPrePagoResp   {
  @JsonProperty("idRecarga")
  private String idRecarga = null;

  @JsonProperty("bonus")
  private String bonus = null;

  @JsonProperty("recibo")
  private String recibo = null;

  public InfRecargaPrePagoResp idRecarga(String idRecarga) {
    this.idRecarga = idRecarga;
    return this;
  }

  /**
   * Código de identificação da recarga efetuada pela operadora, em caso de sucesso.
   * @return idRecarga
  **/
  @ApiModelProperty(example = "b1a5c4bd-a914-4506-8d1d-744a6b3a285c", value = "Código de identificação da recarga efetuada pela operadora, em caso de sucesso.")

@Pattern(regexp="^\\.*$")   public String getIdRecarga() {
    return idRecarga;
  }

  public void setIdRecarga(String idRecarga) {
    this.idRecarga = idRecarga;
  }

  public InfRecargaPrePagoResp bonus(String bonus) {
    this.bonus = bonus;
    return this;
  }

  /**
   * Bônus adicional recebido na recarga pré-pago.
   * @return bonus
  **/
  @ApiModelProperty(example = "000000000400", value = "Bônus adicional recebido na recarga pré-pago.")

@Pattern(regexp="^\\d{12}$")   public String getBonus() {
    return bonus;
  }

  public void setBonus(String bonus) {
    this.bonus = bonus;
  }

  public InfRecargaPrePagoResp recibo(String recibo) {
    this.recibo = recibo;
    return this;
  }

  /**
   * Recibo com informações da compra. Linhas com 48 posições separadas por \"@\".
   * @return recibo
  **/
  @ApiModelProperty(value = "Recibo com informações da compra. Linhas com 48 posições separadas por \"@\".")

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
    InfRecargaPrePagoResp infRecargaPrePagoResp = (InfRecargaPrePagoResp) o;
    return Objects.equals(this.idRecarga, infRecargaPrePagoResp.idRecarga) &&
        Objects.equals(this.bonus, infRecargaPrePagoResp.bonus) &&
        Objects.equals(this.recibo, infRecargaPrePagoResp.recibo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idRecarga, bonus, recibo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfRecargaPrePagoResp {\n");
    
    sb.append("    idRecarga: ").append(toIndentedString(idRecarga)).append("\n");
    sb.append("    bonus: ").append(toIndentedString(bonus)).append("\n");
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

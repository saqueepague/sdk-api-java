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
 * Informações de retorno da compra de Cartão presente.
 */
@ApiModel(description = "Informações de retorno da compra de Cartão presente.")
@Validated
public class InfEfetuarCompraCartaoPresenteResp   {
  @JsonProperty("idCompraCartaoPresente")
  private String idCompraCartaoPresente = null;

  @JsonProperty("chaveResgate")
  private String chaveResgate = null;

  @JsonProperty("validadeChave")
  private String validadeChave = null;

  @JsonProperty("chaveSerial")
  private String chaveSerial = null;

  @JsonProperty("recibo")
  private String recibo = null;

  public InfEfetuarCompraCartaoPresenteResp idCompraCartaoPresente(String idCompraCartaoPresente) {
    this.idCompraCartaoPresente = idCompraCartaoPresente;
    return this;
  }

  /**
   * Código de identificação da compra de Cartão presente, em caso de sucesso.
   * @return idCompraCartaoPresente
  **/
  @ApiModelProperty(example = "b1a5c4bd-a914-4506-8d1d-744a6b3a285c", value = "Código de identificação da compra de Cartão presente, em caso de sucesso.")

@Pattern(regexp="^\\.*$")   public String getIdCompraCartaoPresente() {
    return idCompraCartaoPresente;
  }

  public void setIdCompraCartaoPresente(String idCompraCartaoPresente) {
    this.idCompraCartaoPresente = idCompraCartaoPresente;
  }

  public InfEfetuarCompraCartaoPresenteResp chaveResgate(String chaveResgate) {
    this.chaveResgate = chaveResgate;
    return this;
  }

  /**
   * número PIN para resgate do Cartão presente, em caso de sucesso.
   * @return chaveResgate
  **/
  @ApiModelProperty(example = "93215783", value = "número PIN para resgate do Cartão presente, em caso de sucesso.")

  public String getChaveResgate() {
    return chaveResgate;
  }

  public void setChaveResgate(String chaveResgate) {
    this.chaveResgate = chaveResgate;
  }

  public InfEfetuarCompraCartaoPresenteResp validadeChave(String validadeChave) {
    this.validadeChave = validadeChave;
    return this;
  }

  /**
   * Validade do número PIN, em caso de sucesso.
   * @return validadeChave
  **/
  @ApiModelProperty(example = "AAAAMMDDhhmmss", value = "Validade do número PIN, em caso de sucesso.")

@Pattern(regexp="^\\d{14}$")   public String getValidadeChave() {
    return validadeChave;
  }

  public void setValidadeChave(String validadeChave) {
    this.validadeChave = validadeChave;
  }

  public InfEfetuarCompraCartaoPresenteResp chaveSerial(String chaveSerial) {
    this.chaveSerial = chaveSerial;
    return this;
  }

  /**
   * número serial para suporte, em caso de sucesso.
   * @return chaveSerial
  **/
  @ApiModelProperty(example = "9999999999999999999", value = "número serial para suporte, em caso de sucesso.")

  public String getChaveSerial() {
    return chaveSerial;
  }

  public void setChaveSerial(String chaveSerial) {
    this.chaveSerial = chaveSerial;
  }

  public InfEfetuarCompraCartaoPresenteResp recibo(String recibo) {
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
    InfEfetuarCompraCartaoPresenteResp infEfetuarCompraCartaoPresenteResp = (InfEfetuarCompraCartaoPresenteResp) o;
    return Objects.equals(this.idCompraCartaoPresente, infEfetuarCompraCartaoPresenteResp.idCompraCartaoPresente) &&
        Objects.equals(this.chaveResgate, infEfetuarCompraCartaoPresenteResp.chaveResgate) &&
        Objects.equals(this.validadeChave, infEfetuarCompraCartaoPresenteResp.validadeChave) &&
        Objects.equals(this.chaveSerial, infEfetuarCompraCartaoPresenteResp.chaveSerial) &&
        Objects.equals(this.recibo, infEfetuarCompraCartaoPresenteResp.recibo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idCompraCartaoPresente, chaveResgate, validadeChave, chaveSerial, recibo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfEfetuarCompraCartaoPresenteResp {\n");
    
    sb.append("    idCompraCartaoPresente: ").append(toIndentedString(idCompraCartaoPresente)).append("\n");
    sb.append("    chaveResgate: ").append(toIndentedString(chaveResgate)).append("\n");
    sb.append("    validadeChave: ").append(toIndentedString(validadeChave)).append("\n");
    sb.append("    chaveSerial: ").append(toIndentedString(chaveSerial)).append("\n");
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

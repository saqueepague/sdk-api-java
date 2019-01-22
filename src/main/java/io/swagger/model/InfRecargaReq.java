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
 * Informações sobre a requisição de recarga de transporte ou pré-pago.
 */
@ApiModel(description = "Informações sobre a requisição de recarga de transporte ou pré-pago.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

public class InfRecargaReq   {
  @JsonProperty("idOperadora")
  private String idOperadora = null;

  @JsonProperty("idProduto")
  private String idProduto = null;

  @JsonProperty("numCartao")
  private String numCartao = null;

  @JsonProperty("telefone")
  private String telefone = null;

  public InfRecargaReq idOperadora(String idOperadora) {
    this.idOperadora = idOperadora;
    return this;
  }

  /**
   * Operadora utilizada na operação.
   * @return idOperadora
  **/
  @ApiModelProperty(example = "847", required = true, value = "Operadora utilizada na operação.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getIdOperadora() {
    return idOperadora;
  }

  public void setIdOperadora(String idOperadora) {
    this.idOperadora = idOperadora;
  }

  public InfRecargaReq idProduto(String idProduto) {
    this.idProduto = idProduto;
    return this;
  }

  /**
   * Produto utilizado na operação.
   * @return idProduto
  **/
  @ApiModelProperty(example = "87", required = true, value = "Produto utilizado na operação.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getIdProduto() {
    return idProduto;
  }

  public void setIdProduto(String idProduto) {
    this.idProduto = idProduto;
  }

  public InfRecargaReq numCartao(String numCartao) {
    this.numCartao = numCartao;
    return this;
  }

  /**
   * Número do cartão utilizado na operação.
   * @return numCartao
  **/
  @ApiModelProperty(example = "036200001842241", required = true, value = "Número do cartão utilizado na operação.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getNumCartao() {
    return numCartao;
  }

  public void setNumCartao(String numCartao) {
    this.numCartao = numCartao;
  }

  public InfRecargaReq telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }

  /**
   * Número do telefone utilizado na operação (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).
   * @return telefone
  **/
  @ApiModelProperty(example = "51999999999", value = "Número do telefone utilizado na operação (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).")

@Pattern(regexp="^\\d{11}$") 
  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfRecargaReq infRecargaReq = (InfRecargaReq) o;
    return Objects.equals(this.idOperadora, infRecargaReq.idOperadora) &&
        Objects.equals(this.idProduto, infRecargaReq.idProduto) &&
        Objects.equals(this.numCartao, infRecargaReq.numCartao) &&
        Objects.equals(this.telefone, infRecargaReq.telefone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOperadora, idProduto, numCartao, telefone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfRecargaReq {\n");
    
    sb.append("    idOperadora: ").append(toIndentedString(idOperadora)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    numCartao: ").append(toIndentedString(numCartao)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
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


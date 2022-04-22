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
 * Informações da requisição de compra de Cartão presente.
 */
@ApiModel(description = "Informações da requisição de compra de Cartão presente.")
@Validated
public class InfEfetuarCompraCartaoPresenteReq   {
  @JsonProperty("cpf")
  private String cpf = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("valor")
  private String valor = null;

  @JsonProperty("ddd")
  private String ddd = null;

  @JsonProperty("telefone")
  private String telefone = null;

  public InfEfetuarCompraCartaoPresenteReq cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * CPF do cliente para a compra de Cartão presente.
   * @return cpf
  **/
  @ApiModelProperty(example = "12345678901", required = true, value = "CPF do cliente para a compra de Cartão presente.")
  @NotNull

@Pattern(regexp="^\\d{11}$")   public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public InfEfetuarCompraCartaoPresenteReq id(String id) {
    this.id = id;
    return this;
  }

  /**
   * ID do produto para a compra de Cartão presente.
   * @return id
  **/
  @ApiModelProperty(example = "113183", required = true, value = "ID do produto para a compra de Cartão presente.")
  @NotNull

@Pattern(regexp="^.*$")   public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InfEfetuarCompraCartaoPresenteReq valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Valor do Cartão presente.
   * @return valor
  **/
  @ApiModelProperty(example = "000000005000", required = true, value = "Valor do Cartão presente.")
  @NotNull

@Pattern(regexp="^\\d{12}$")   public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public InfEfetuarCompraCartaoPresenteReq ddd(String ddd) {
    this.ddd = ddd;
    return this;
  }

  /**
   * Código da área do telefone do cliente.
   * @return ddd
  **/
  @ApiModelProperty(example = "51", required = true, value = "Código da área do telefone do cliente.")
  @NotNull

@Pattern(regexp="^\\d{2}$")   public String getDdd() {
    return ddd;
  }

  public void setDdd(String ddd) {
    this.ddd = ddd;
  }

  public InfEfetuarCompraCartaoPresenteReq telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }

  /**
   * número do telefone, sem DDD, do cliente efetuando a compra.
   * @return telefone
  **/
  @ApiModelProperty(example = "982041311", required = true, value = "número do telefone, sem DDD, do cliente efetuando a compra.")
  @NotNull

@Pattern(regexp="^\\d+$")   public String getTelefone() {
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
    InfEfetuarCompraCartaoPresenteReq infEfetuarCompraCartaoPresenteReq = (InfEfetuarCompraCartaoPresenteReq) o;
    return Objects.equals(this.cpf, infEfetuarCompraCartaoPresenteReq.cpf) &&
        Objects.equals(this.id, infEfetuarCompraCartaoPresenteReq.id) &&
        Objects.equals(this.valor, infEfetuarCompraCartaoPresenteReq.valor) &&
        Objects.equals(this.ddd, infEfetuarCompraCartaoPresenteReq.ddd) &&
        Objects.equals(this.telefone, infEfetuarCompraCartaoPresenteReq.telefone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, id, valor, ddd, telefone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfEfetuarCompraCartaoPresenteReq {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    ddd: ").append(toIndentedString(ddd)).append("\n");
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

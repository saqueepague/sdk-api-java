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
  @JsonProperty("cpfCliente")
  private String cpfCliente = null;

  @JsonProperty("idCartaoPresente")
  private String idCartaoPresente = null;

  @JsonProperty("valorCartaoPresente")
  private String valorCartaoPresente = null;

  @JsonProperty("ddd")
  private String ddd = null;

  @JsonProperty("telefone")
  private String telefone = null;

  public InfEfetuarCompraCartaoPresenteReq cpfCliente(String cpfCliente) {
    this.cpfCliente = cpfCliente;
    return this;
  }

  /**
   * CPF do cliente para a compra de Cartão presente.
   * @return cpfCliente
  **/
  @ApiModelProperty(example = "12345678901", value = "CPF do cliente para a compra de Cartão presente.")

@Pattern(regexp="^\\d{11}$")   public String getCpfCliente() {
    return cpfCliente;
  }

  public void setCpfCliente(String cpfCliente) {
    this.cpfCliente = cpfCliente;
  }

  public InfEfetuarCompraCartaoPresenteReq idCartaoPresente(String idCartaoPresente) {
    this.idCartaoPresente = idCartaoPresente;
    return this;
  }

  /**
   * ID do produto para a compra de Cartão presente.
   * @return idCartaoPresente
  **/
  @ApiModelProperty(example = "113183", value = "ID do produto para a compra de Cartão presente.")

@Pattern(regexp="^.*$")   public String getIdCartaoPresente() {
    return idCartaoPresente;
  }

  public void setIdCartaoPresente(String idCartaoPresente) {
    this.idCartaoPresente = idCartaoPresente;
  }

  public InfEfetuarCompraCartaoPresenteReq valorCartaoPresente(String valorCartaoPresente) {
    this.valorCartaoPresente = valorCartaoPresente;
    return this;
  }

  /**
   * Valor do Cartão presente.
   * @return valorCartaoPresente
  **/
  @ApiModelProperty(example = "000000005000", value = "Valor do Cartão presente.")

@Pattern(regexp="^\\d{12}$")   public String getValorCartaoPresente() {
    return valorCartaoPresente;
  }

  public void setValorCartaoPresente(String valorCartaoPresente) {
    this.valorCartaoPresente = valorCartaoPresente;
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
    return Objects.equals(this.cpfCliente, infEfetuarCompraCartaoPresenteReq.cpfCliente) &&
        Objects.equals(this.idCartaoPresente, infEfetuarCompraCartaoPresenteReq.idCartaoPresente) &&
        Objects.equals(this.valorCartaoPresente, infEfetuarCompraCartaoPresenteReq.valorCartaoPresente) &&
        Objects.equals(this.ddd, infEfetuarCompraCartaoPresenteReq.ddd) &&
        Objects.equals(this.telefone, infEfetuarCompraCartaoPresenteReq.telefone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpfCliente, idCartaoPresente, valorCartaoPresente, ddd, telefone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfEfetuarCompraCartaoPresenteReq {\n");
    
    sb.append("    cpfCliente: ").append(toIndentedString(cpfCliente)).append("\n");
    sb.append("    idCartaoPresente: ").append(toIndentedString(idCartaoPresente)).append("\n");
    sb.append("    valorCartaoPresente: ").append(toIndentedString(valorCartaoPresente)).append("\n");
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

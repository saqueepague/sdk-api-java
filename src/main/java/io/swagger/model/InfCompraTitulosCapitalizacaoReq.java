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
 * Informações da requisição de compra de títulos de capitalização.
 */
@ApiModel(description = "Informações da requisição de compra de títulos de capitalização.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfCompraTitulosCapitalizacaoReq   {
  @JsonProperty("idProduto")
  private String idProduto = null;

  @JsonProperty("cpf")
  private String cpf = null;

  @JsonProperty("telefone")
  private String telefone = null;

  @JsonProperty("quantidade")
  private String quantidade = null;

  public InfCompraTitulosCapitalizacaoReq idProduto(String idProduto) {
    this.idProduto = idProduto;
    return this;
  }

  /**
   * Produto utilizado na operação.
   * @return idProduto
  **/
  @ApiModelProperty(example = "7", value = "Produto utilizado na operação.")

@Pattern(regexp="^\\d+$") 
  public String getIdProduto() {
    return idProduto;
  }

  public void setIdProduto(String idProduto) {
    this.idProduto = idProduto;
  }

  public InfCompraTitulosCapitalizacaoReq cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * Número do CPF do cliente favorecido da transação (11 dígitos).
   * @return cpf
  **/
  @ApiModelProperty(example = "02358422785", value = "Número do CPF do cliente favorecido da transação (11 dígitos).")

@Pattern(regexp="^\\d{11}$") 
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public InfCompraTitulosCapitalizacaoReq telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }

  /**
   * Telefone do cliente favorecido da transação (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).
   * @return telefone
  **/
  @ApiModelProperty(example = "05199999999", value = "Telefone do cliente favorecido da transação (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).")

@Pattern(regexp="^\\d{11}$") 
  public String getTelefone() {
    return telefone;
  }

  public void setTelefone(String telefone) {
    this.telefone = telefone;
  }

  public InfCompraTitulosCapitalizacaoReq quantidade(String quantidade) {
    this.quantidade = quantidade;
    return this;
  }

  /**
   * Quantidade de itens do produtos.
   * @return quantidade
  **/
  @ApiModelProperty(example = "2", value = "Quantidade de itens do produtos.")

@Pattern(regexp="^\\d+$") 
  public String getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(String quantidade) {
    this.quantidade = quantidade;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfCompraTitulosCapitalizacaoReq infCompraTitulosCapitalizacaoReq = (InfCompraTitulosCapitalizacaoReq) o;
    return Objects.equals(this.idProduto, infCompraTitulosCapitalizacaoReq.idProduto) &&
        Objects.equals(this.cpf, infCompraTitulosCapitalizacaoReq.cpf) &&
        Objects.equals(this.telefone, infCompraTitulosCapitalizacaoReq.telefone) &&
        Objects.equals(this.quantidade, infCompraTitulosCapitalizacaoReq.quantidade);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduto, cpf, telefone, quantidade);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfCompraTitulosCapitalizacaoReq {\n");
    
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    telefone: ").append(toIndentedString(telefone)).append("\n");
    sb.append("    quantidade: ").append(toIndentedString(quantidade)).append("\n");
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


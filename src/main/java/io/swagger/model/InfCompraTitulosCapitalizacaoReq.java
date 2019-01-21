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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfCompraTitulosCapitalizacaoReq   {
  @JsonProperty("cpf")
  private String cpf = null;

  @JsonProperty("idProduto")
  private String idProduto = null;

  @JsonProperty("quantidade")
  private String quantidade = null;

  @JsonProperty("telefone")
  private String telefone = null;

  public InfCompraTitulosCapitalizacaoReq cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * Número do CPF do cliente favorecido da transação (11 dígitos).
   * @return cpf
  **/
  @ApiModelProperty(example = "02358422785", required = true, value = "Número do CPF do cliente favorecido da transação (11 dígitos).")
  @NotNull

@Pattern(regexp="^\\d{11}$") 
  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public InfCompraTitulosCapitalizacaoReq idProduto(String idProduto) {
    this.idProduto = idProduto;
    return this;
  }

  /**
   * Produto utilizado na operação.
   * @return idProduto
  **/
  @ApiModelProperty(example = "7", required = true, value = "Produto utilizado na operação.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getIdProduto() {
    return idProduto;
  }

  public void setIdProduto(String idProduto) {
    this.idProduto = idProduto;
  }

  public InfCompraTitulosCapitalizacaoReq quantidade(String quantidade) {
    this.quantidade = quantidade;
    return this;
  }

  /**
   * Quantidade de itens do produtos.
   * @return quantidade
  **/
  @ApiModelProperty(example = "2", required = true, value = "Quantidade de itens do produtos.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(String quantidade) {
    this.quantidade = quantidade;
  }

  public InfCompraTitulosCapitalizacaoReq telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }

  /**
   * Telefone do cliente favorecido da transação (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).
   * @return telefone
  **/
  @ApiModelProperty(example = "05199999999", required = true, value = "Telefone do cliente favorecido da transação (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).")
  @NotNull

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
    InfCompraTitulosCapitalizacaoReq infCompraTitulosCapitalizacaoReq = (InfCompraTitulosCapitalizacaoReq) o;
    return Objects.equals(this.cpf, infCompraTitulosCapitalizacaoReq.cpf) &&
        Objects.equals(this.idProduto, infCompraTitulosCapitalizacaoReq.idProduto) &&
        Objects.equals(this.quantidade, infCompraTitulosCapitalizacaoReq.quantidade) &&
        Objects.equals(this.telefone, infCompraTitulosCapitalizacaoReq.telefone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, idProduto, quantidade, telefone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfCompraTitulosCapitalizacaoReq {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    quantidade: ").append(toIndentedString(quantidade)).append("\n");
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


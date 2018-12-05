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
 * InfPagamentoReqTroco
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfPagamentoReqTroco   {
  @JsonProperty("valorCreditoConta")
  private String valorCreditoConta = null;

  @JsonProperty("valorEspecie")
  private String valorEspecie = null;

  @JsonProperty("valorDoacao")
  private String valorDoacao = null;

  @JsonProperty("cnpjInstituicao")
  private String cnpjInstituicao = null;

  @JsonProperty("valorCupom")
  private String valorCupom = null;

  public InfPagamentoReqTroco valorCreditoConta(String valorCreditoConta) {
    this.valorCreditoConta = valorCreditoConta;
    return this;
  }

  /**
   * Valor do troco creditado em conta (pagamento em dinheiro, 12 dígitos, incluindo centavos).
   * @return valorCreditoConta
  **/
  @ApiModelProperty(example = "000000001150", value = "Valor do troco creditado em conta (pagamento em dinheiro, 12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getValorCreditoConta() {
    return valorCreditoConta;
  }

  public void setValorCreditoConta(String valorCreditoConta) {
    this.valorCreditoConta = valorCreditoConta;
  }

  public InfPagamentoReqTroco valorEspecie(String valorEspecie) {
    this.valorEspecie = valorEspecie;
    return this;
  }

  /**
   * Valor do troco entregue em espécie (pagamento em dinheiro, 12 dígitos, incluindo centavos).
   * @return valorEspecie
  **/
  @ApiModelProperty(example = "000000001150", value = "Valor do troco entregue em espécie (pagamento em dinheiro, 12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getValorEspecie() {
    return valorEspecie;
  }

  public void setValorEspecie(String valorEspecie) {
    this.valorEspecie = valorEspecie;
  }

  public InfPagamentoReqTroco valorDoacao(String valorDoacao) {
    this.valorDoacao = valorDoacao;
    return this;
  }

  /**
   * Valor do troco doado à instituição de caridade (pagamento em dinheiro, 12 dígitos, incluindo centavos).
   * @return valorDoacao
  **/
  @ApiModelProperty(example = "000000000350", value = "Valor do troco doado à instituição de caridade (pagamento em dinheiro, 12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getValorDoacao() {
    return valorDoacao;
  }

  public void setValorDoacao(String valorDoacao) {
    this.valorDoacao = valorDoacao;
  }

  public InfPagamentoReqTroco cnpjInstituicao(String cnpjInstituicao) {
    this.cnpjInstituicao = cnpjInstituicao;
    return this;
  }

  /**
   * CNPJ da instituição favorecida para doação (pagamento em dinheiro, 14 dígitos).
   * @return cnpjInstituicao
  **/
  @ApiModelProperty(example = "02358427000112", value = "CNPJ da instituição favorecida para doação (pagamento em dinheiro, 14 dígitos).")

@Pattern(regexp="^\\d{14}$") 
  public String getCnpjInstituicao() {
    return cnpjInstituicao;
  }

  public void setCnpjInstituicao(String cnpjInstituicao) {
    this.cnpjInstituicao = cnpjInstituicao;
  }

  public InfPagamentoReqTroco valorCupom(String valorCupom) {
    this.valorCupom = valorCupom;
    return this;
  }

  /**
   * Valor do troco a ser entregue em cupom (pagamento em dinheiro, 12 dígitos, incluindo centavos).
   * @return valorCupom
  **/
  @ApiModelProperty(example = "000000005000", value = "Valor do troco a ser entregue em cupom (pagamento em dinheiro, 12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getValorCupom() {
    return valorCupom;
  }

  public void setValorCupom(String valorCupom) {
    this.valorCupom = valorCupom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfPagamentoReqTroco infPagamentoReqTroco = (InfPagamentoReqTroco) o;
    return Objects.equals(this.valorCreditoConta, infPagamentoReqTroco.valorCreditoConta) &&
        Objects.equals(this.valorEspecie, infPagamentoReqTroco.valorEspecie) &&
        Objects.equals(this.valorDoacao, infPagamentoReqTroco.valorDoacao) &&
        Objects.equals(this.cnpjInstituicao, infPagamentoReqTroco.cnpjInstituicao) &&
        Objects.equals(this.valorCupom, infPagamentoReqTroco.valorCupom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valorCreditoConta, valorEspecie, valorDoacao, cnpjInstituicao, valorCupom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfPagamentoReqTroco {\n");
    
    sb.append("    valorCreditoConta: ").append(toIndentedString(valorCreditoConta)).append("\n");
    sb.append("    valorEspecie: ").append(toIndentedString(valorEspecie)).append("\n");
    sb.append("    valorDoacao: ").append(toIndentedString(valorDoacao)).append("\n");
    sb.append("    cnpjInstituicao: ").append(toIndentedString(cnpjInstituicao)).append("\n");
    sb.append("    valorCupom: ").append(toIndentedString(valorCupom)).append("\n");
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


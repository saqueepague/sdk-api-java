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
 * Informações da requisição de depósito.
 */
@ApiModel(description = "Informações da requisição de depósito.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-26T17:53:50.941Z[GMT]")
public class InfDepositoReq   {
  @JsonProperty("nomeDepositante")
  private String nomeDepositante = null;

  @JsonProperty("telefoneDepositante")
  private String telefoneDepositante = null;

  @JsonProperty("cpfDepositante")
  private String cpfDepositante = null;

  @JsonProperty("nomeFavorecido")
  private String nomeFavorecido = null;

  @JsonProperty("telefoneFavorecido")
  private String telefoneFavorecido = null;

  @JsonProperty("cpfFavorecido")
  private String cpfFavorecido = null;

  @JsonProperty("codBanco")
  private String codBanco = null;

  @JsonProperty("numAgencia")
  private String numAgencia = null;

  @JsonProperty("numConta")
  private String numConta = null;

  @JsonProperty("identificacao")
  private String identificacao = null;

  public InfDepositoReq nomeDepositante(String nomeDepositante) {
    this.nomeDepositante = nomeDepositante;
    return this;
  }

  /**
   * Nome do cliente realizando o depósito.
   * @return nomeDepositante
  **/
  @ApiModelProperty(example = "Carl Edward Sagan", value = "Nome do cliente realizando o depósito.")

  public String getNomeDepositante() {
    return nomeDepositante;
  }

  public void setNomeDepositante(String nomeDepositante) {
    this.nomeDepositante = nomeDepositante;
  }

  public InfDepositoReq telefoneDepositante(String telefoneDepositante) {
    this.telefoneDepositante = telefoneDepositante;
    return this;
  }

  /**
   * Telefone do cliente realizando o depósito (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).
   * @return telefoneDepositante
  **/
  @ApiModelProperty(example = "51999999999", value = "Telefone do cliente realizando o depósito (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).")

@Pattern(regexp="^\\d{11}$")   public String getTelefoneDepositante() {
    return telefoneDepositante;
  }

  public void setTelefoneDepositante(String telefoneDepositante) {
    this.telefoneDepositante = telefoneDepositante;
  }

  public InfDepositoReq cpfDepositante(String cpfDepositante) {
    this.cpfDepositante = cpfDepositante;
    return this;
  }

  /**
   * Número do CPF ou CNPJ do cliente realizando o depósito (11 dígitos ou 14 dígitos respectivamente).
   * @return cpfDepositante
  **/
  @ApiModelProperty(example = "02358422785", value = "Número do CPF ou CNPJ do cliente realizando o depósito (11 dígitos ou 14 dígitos respectivamente).")

@Pattern(regexp="^\\d{14}|\\d{11}$")   public String getCpfDepositante() {
    return cpfDepositante;
  }

  public void setCpfDepositante(String cpfDepositante) {
    this.cpfDepositante = cpfDepositante;
  }

  public InfDepositoReq nomeFavorecido(String nomeFavorecido) {
    this.nomeFavorecido = nomeFavorecido;
    return this;
  }

  /**
   * Nome do cliente que receberá o depósito.
   * @return nomeFavorecido
  **/
  @ApiModelProperty(example = "Carl Edward Sagan", value = "Nome do cliente que receberá o depósito.")

  public String getNomeFavorecido() {
    return nomeFavorecido;
  }

  public void setNomeFavorecido(String nomeFavorecido) {
    this.nomeFavorecido = nomeFavorecido;
  }

  public InfDepositoReq telefoneFavorecido(String telefoneFavorecido) {
    this.telefoneFavorecido = telefoneFavorecido;
    return this;
  }

  /**
   * Telefone do cliente que receberá o depósito (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).
   * @return telefoneFavorecido
  **/
  @ApiModelProperty(example = "05199999999", value = "Telefone do cliente que receberá o depósito (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).")

@Pattern(regexp="^\\d{11}$")   public String getTelefoneFavorecido() {
    return telefoneFavorecido;
  }

  public void setTelefoneFavorecido(String telefoneFavorecido) {
    this.telefoneFavorecido = telefoneFavorecido;
  }

  public InfDepositoReq cpfFavorecido(String cpfFavorecido) {
    this.cpfFavorecido = cpfFavorecido;
    return this;
  }

  /**
   * Número do CPF ou CNPJ do cliente que receberá o depósito (11 dígitos ou 14 dígitos respectivamente).
   * @return cpfFavorecido
  **/
  @ApiModelProperty(example = "02358422785", value = "Número do CPF ou CNPJ do cliente que receberá o depósito (11 dígitos ou 14 dígitos respectivamente).")

@Pattern(regexp="^\\d{14}|\\d{11}$")   public String getCpfFavorecido() {
    return cpfFavorecido;
  }

  public void setCpfFavorecido(String cpfFavorecido) {
    this.cpfFavorecido = cpfFavorecido;
  }

  public InfDepositoReq codBanco(String codBanco) {
    this.codBanco = codBanco;
    return this;
  }

  /**
   * Código do banco utilizado na operação (3 dígitos).
   * @return codBanco
  **/
  @ApiModelProperty(example = "237", value = "Código do banco utilizado na operação (3 dígitos).")

@Pattern(regexp="^\\d{3}$")   public String getCodBanco() {
    return codBanco;
  }

  public void setCodBanco(String codBanco) {
    this.codBanco = codBanco;
  }

  public InfDepositoReq numAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
    return this;
  }

  /**
   * Número da agência utilizada na operação.
   * @return numAgencia
  **/
  @ApiModelProperty(example = "4029", value = "Número da agência utilizada na operação.")

@Pattern(regexp="^\\d+$")   public String getNumAgencia() {
    return numAgencia;
  }

  public void setNumAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
  }

  public InfDepositoReq numConta(String numConta) {
    this.numConta = numConta;
    return this;
  }

  /**
   * Número da conta utilizada na operação.
   * @return numConta
  **/
  @ApiModelProperty(example = "0082348296", value = "Número da conta utilizada na operação.")

@Pattern(regexp="^\\d+$")   public String getNumConta() {
    return numConta;
  }

  public void setNumConta(String numConta) {
    this.numConta = numConta;
  }

  public InfDepositoReq identificacao(String identificacao) {
    this.identificacao = identificacao;
    return this;
  }

  /**
   * Número identificador do depósito (depósito identificado), caso seja informada necessidade na consulta de conta.
   * @return identificacao
  **/
  @ApiModelProperty(example = "0223489", value = "Número identificador do depósito (depósito identificado), caso seja informada necessidade na consulta de conta.")

@Pattern(regexp="^\\d{7}")   public String getIdentificacao() {
    return identificacao;
  }

  public void setIdentificacao(String identificacao) {
    this.identificacao = identificacao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfDepositoReq infDepositoReq = (InfDepositoReq) o;
    return Objects.equals(this.nomeDepositante, infDepositoReq.nomeDepositante) &&
        Objects.equals(this.telefoneDepositante, infDepositoReq.telefoneDepositante) &&
        Objects.equals(this.cpfDepositante, infDepositoReq.cpfDepositante) &&
        Objects.equals(this.nomeFavorecido, infDepositoReq.nomeFavorecido) &&
        Objects.equals(this.telefoneFavorecido, infDepositoReq.telefoneFavorecido) &&
        Objects.equals(this.cpfFavorecido, infDepositoReq.cpfFavorecido) &&
        Objects.equals(this.codBanco, infDepositoReq.codBanco) &&
        Objects.equals(this.numAgencia, infDepositoReq.numAgencia) &&
        Objects.equals(this.numConta, infDepositoReq.numConta) &&
        Objects.equals(this.identificacao, infDepositoReq.identificacao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeDepositante, telefoneDepositante, cpfDepositante, nomeFavorecido, telefoneFavorecido, cpfFavorecido, codBanco, numAgencia, numConta, identificacao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfDepositoReq {\n");
    
    sb.append("    nomeDepositante: ").append(toIndentedString(nomeDepositante)).append("\n");
    sb.append("    telefoneDepositante: ").append(toIndentedString(telefoneDepositante)).append("\n");
    sb.append("    cpfDepositante: ").append(toIndentedString(cpfDepositante)).append("\n");
    sb.append("    nomeFavorecido: ").append(toIndentedString(nomeFavorecido)).append("\n");
    sb.append("    telefoneFavorecido: ").append(toIndentedString(telefoneFavorecido)).append("\n");
    sb.append("    cpfFavorecido: ").append(toIndentedString(cpfFavorecido)).append("\n");
    sb.append("    codBanco: ").append(toIndentedString(codBanco)).append("\n");
    sb.append("    numAgencia: ").append(toIndentedString(numAgencia)).append("\n");
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
    sb.append("    identificacao: ").append(toIndentedString(identificacao)).append("\n");
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

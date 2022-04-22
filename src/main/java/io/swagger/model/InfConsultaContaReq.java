package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações da requisição de consulta de conta do favorecido do Depósito.
 */
@ApiModel(description = "Informações da requisição de consulta de conta do favorecido do Depósito.")
@Validated
public class InfConsultaContaReq   {
  @JsonProperty("codBanco")
  private String codBanco = null;

  @JsonProperty("numAgencia")
  private String numAgencia = null;

  @JsonProperty("numConta")
  private String numConta = null;

  /**
   * Indica a modalidade de Depósito desejada (2 dígitos, 00 = dinheiro, 01 = cheque).
   */
  public enum ModalidadeDepositoEnum {
    _00("00"),
    
    _01("01");

    private String value;

    ModalidadeDepositoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModalidadeDepositoEnum fromValue(String text) {
      for (ModalidadeDepositoEnum b : ModalidadeDepositoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("modalidadeDeposito")
  private ModalidadeDepositoEnum modalidadeDeposito = null;

  @JsonProperty("telefoneFavorecido")
  private String telefoneFavorecido = null;

  @JsonProperty("cpfFavorecido")
  private String cpfFavorecido = null;

  public InfConsultaContaReq codBanco(String codBanco) {
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

  public InfConsultaContaReq numAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
    return this;
  }

  /**
   * número da Agência utilizada na operação.
   * @return numAgencia
  **/
  @ApiModelProperty(example = "4029", value = "número da Agência utilizada na operação.")

@Pattern(regexp="^\\d+$")   public String getNumAgencia() {
    return numAgencia;
  }

  public void setNumAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
  }

  public InfConsultaContaReq numConta(String numConta) {
    this.numConta = numConta;
    return this;
  }

  /**
   * número da conta utilizada na operação.
   * @return numConta
  **/
  @ApiModelProperty(example = "0082348296", value = "número da conta utilizada na operação.")

@Pattern(regexp="^\\d+$")   public String getNumConta() {
    return numConta;
  }

  public void setNumConta(String numConta) {
    this.numConta = numConta;
  }

  public InfConsultaContaReq modalidadeDeposito(ModalidadeDepositoEnum modalidadeDeposito) {
    this.modalidadeDeposito = modalidadeDeposito;
    return this;
  }

  /**
   * Indica a modalidade de Depósito desejada (2 dígitos, 00 = dinheiro, 01 = cheque).
   * @return modalidadeDeposito
  **/
  @ApiModelProperty(example = "00", required = true, value = "Indica a modalidade de Depósito desejada (2 dígitos, 00 = dinheiro, 01 = cheque).")
  @NotNull

  public ModalidadeDepositoEnum getModalidadeDeposito() {
    return modalidadeDeposito;
  }

  public void setModalidadeDeposito(ModalidadeDepositoEnum modalidadeDeposito) {
    this.modalidadeDeposito = modalidadeDeposito;
  }

  public InfConsultaContaReq telefoneFavorecido(String telefoneFavorecido) {
    this.telefoneFavorecido = telefoneFavorecido;
    return this;
  }

  /**
   * Telefone do cliente favorecido da transação (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).
   * @return telefoneFavorecido
  **/
  @ApiModelProperty(example = "05199999999", value = "Telefone do cliente favorecido da transação (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).")

@Pattern(regexp="^\\d{11}$")   public String getTelefoneFavorecido() {
    return telefoneFavorecido;
  }

  public void setTelefoneFavorecido(String telefoneFavorecido) {
    this.telefoneFavorecido = telefoneFavorecido;
  }

  public InfConsultaContaReq cpfFavorecido(String cpfFavorecido) {
    this.cpfFavorecido = cpfFavorecido;
    return this;
  }

  /**
   * número do CPF ou CNPJ do cliente favorecido da transação (11 dígitos ou 14 dígitos respectivamente).
   * @return cpfFavorecido
  **/
  @ApiModelProperty(example = "02358422785", value = "número do CPF ou CNPJ do cliente favorecido da transação (11 dígitos ou 14 dígitos respectivamente).")

@Pattern(regexp="^\\d{14}|\\d{11}$")   public String getCpfFavorecido() {
    return cpfFavorecido;
  }

  public void setCpfFavorecido(String cpfFavorecido) {
    this.cpfFavorecido = cpfFavorecido;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaContaReq infConsultaContaReq = (InfConsultaContaReq) o;
    return Objects.equals(this.codBanco, infConsultaContaReq.codBanco) &&
        Objects.equals(this.numAgencia, infConsultaContaReq.numAgencia) &&
        Objects.equals(this.numConta, infConsultaContaReq.numConta) &&
        Objects.equals(this.modalidadeDeposito, infConsultaContaReq.modalidadeDeposito) &&
        Objects.equals(this.telefoneFavorecido, infConsultaContaReq.telefoneFavorecido) &&
        Objects.equals(this.cpfFavorecido, infConsultaContaReq.cpfFavorecido);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codBanco, numAgencia, numConta, modalidadeDeposito, telefoneFavorecido, cpfFavorecido);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaContaReq {\n");
    
    sb.append("    codBanco: ").append(toIndentedString(codBanco)).append("\n");
    sb.append("    numAgencia: ").append(toIndentedString(numAgencia)).append("\n");
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
    sb.append("    modalidadeDeposito: ").append(toIndentedString(modalidadeDeposito)).append("\n");
    sb.append("    telefoneFavorecido: ").append(toIndentedString(telefoneFavorecido)).append("\n");
    sb.append("    cpfFavorecido: ").append(toIndentedString(cpfFavorecido)).append("\n");
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

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
 * InfConsultaFavorecidoRespFavorecidos
 */
@Validated
public class InfConsultaFavorecidoRespFavorecidos   {
  @JsonProperty("codBanco")
  private String codBanco = null;

  @JsonProperty("nomeBanco")
  private String nomeBanco = null;

  @JsonProperty("numAgencia")
  private String numAgencia = null;

  @JsonProperty("numConta")
  private String numConta = null;

  /**
   * Tipo de conta do extrato do Favorecido Cadastrado (CC = conta corrente, CP = conta poupança).
   */
  public enum TipoContaEnum {
    CC("CC"),
    
    CP("CP");

    private String value;

    TipoContaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TipoContaEnum fromValue(String text) {
      for (TipoContaEnum b : TipoContaEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("tipoConta")
  private TipoContaEnum tipoConta = null;

  @JsonProperty("nomeTitularConta")
  private String nomeTitularConta = null;

  @JsonProperty("cpf")
  private String cpf = null;

  public InfConsultaFavorecidoRespFavorecidos codBanco(String codBanco) {
    this.codBanco = codBanco;
    return this;
  }

  /**
   * Código do banco do Favorecido Cadastrado (3 dígitos).
   * @return codBanco
  **/
  @ApiModelProperty(example = "237", value = "Código do banco do Favorecido Cadastrado (3 dígitos).")

@Pattern(regexp="^\\d{3}$")   public String getCodBanco() {
    return codBanco;
  }

  public void setCodBanco(String codBanco) {
    this.codBanco = codBanco;
  }

  public InfConsultaFavorecidoRespFavorecidos nomeBanco(String nomeBanco) {
    this.nomeBanco = nomeBanco;
    return this;
  }

  /**
   * Nome do Banco Favorecido Cadastrado (sem acento).
   * @return nomeBanco
  **/
  @ApiModelProperty(example = "BRADESCO", value = "Nome do Banco Favorecido Cadastrado (sem acento).")

  public String getNomeBanco() {
    return nomeBanco;
  }

  public void setNomeBanco(String nomeBanco) {
    this.nomeBanco = nomeBanco;
  }

  public InfConsultaFavorecidoRespFavorecidos numAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
    return this;
  }

  /**
   * número da Agência do Favorecido Cadastrado.
   * @return numAgencia
  **/
  @ApiModelProperty(example = "4029", value = "número da Agência do Favorecido Cadastrado.")

@Pattern(regexp="^\\d+$")   public String getNumAgencia() {
    return numAgencia;
  }

  public void setNumAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
  }

  public InfConsultaFavorecidoRespFavorecidos numConta(String numConta) {
    this.numConta = numConta;
    return this;
  }

  /**
   * número da conta do Favorecido Cadastrado.
   * @return numConta
  **/
  @ApiModelProperty(example = "0082348296", value = "número da conta do Favorecido Cadastrado.")

@Pattern(regexp="^\\d+$")   public String getNumConta() {
    return numConta;
  }

  public void setNumConta(String numConta) {
    this.numConta = numConta;
  }

  public InfConsultaFavorecidoRespFavorecidos tipoConta(TipoContaEnum tipoConta) {
    this.tipoConta = tipoConta;
    return this;
  }

  /**
   * Tipo de conta do extrato do Favorecido Cadastrado (CC = conta corrente, CP = conta poupança).
   * @return tipoConta
  **/
  @ApiModelProperty(example = "CC", value = "Tipo de conta do extrato do Favorecido Cadastrado (CC = conta corrente, CP = conta poupança).")

  public TipoContaEnum getTipoConta() {
    return tipoConta;
  }

  public void setTipoConta(TipoContaEnum tipoConta) {
    this.tipoConta = tipoConta;
  }

  public InfConsultaFavorecidoRespFavorecidos nomeTitularConta(String nomeTitularConta) {
    this.nomeTitularConta = nomeTitularConta;
    return this;
  }

  /**
   * Nome do titular da conta.
   * @return nomeTitularConta
  **/
  @ApiModelProperty(example = "Carl Edward Sagan", value = "Nome do titular da conta.")

  public String getNomeTitularConta() {
    return nomeTitularConta;
  }

  public void setNomeTitularConta(String nomeTitularConta) {
    this.nomeTitularConta = nomeTitularConta;
  }

  public InfConsultaFavorecidoRespFavorecidos cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * número do CPF ou CNPJ do Favorecido Cadastrado (11 dígitos ou 14 dígitos, respectivamente).
   * @return cpf
  **/
  @ApiModelProperty(example = "02358422785", value = "número do CPF ou CNPJ do Favorecido Cadastrado (11 dígitos ou 14 dígitos, respectivamente).")

@Pattern(regexp="^\\d{14}|\\d{11}$")   public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaFavorecidoRespFavorecidos infConsultaFavorecidoRespFavorecidos = (InfConsultaFavorecidoRespFavorecidos) o;
    return Objects.equals(this.codBanco, infConsultaFavorecidoRespFavorecidos.codBanco) &&
        Objects.equals(this.nomeBanco, infConsultaFavorecidoRespFavorecidos.nomeBanco) &&
        Objects.equals(this.numAgencia, infConsultaFavorecidoRespFavorecidos.numAgencia) &&
        Objects.equals(this.numConta, infConsultaFavorecidoRespFavorecidos.numConta) &&
        Objects.equals(this.tipoConta, infConsultaFavorecidoRespFavorecidos.tipoConta) &&
        Objects.equals(this.nomeTitularConta, infConsultaFavorecidoRespFavorecidos.nomeTitularConta) &&
        Objects.equals(this.cpf, infConsultaFavorecidoRespFavorecidos.cpf);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codBanco, nomeBanco, numAgencia, numConta, tipoConta, nomeTitularConta, cpf);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaFavorecidoRespFavorecidos {\n");
    
    sb.append("    codBanco: ").append(toIndentedString(codBanco)).append("\n");
    sb.append("    nomeBanco: ").append(toIndentedString(nomeBanco)).append("\n");
    sb.append("    numAgencia: ").append(toIndentedString(numAgencia)).append("\n");
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
    sb.append("    tipoConta: ").append(toIndentedString(tipoConta)).append("\n");
    sb.append("    nomeTitularConta: ").append(toIndentedString(nomeTitularConta)).append("\n");
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
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

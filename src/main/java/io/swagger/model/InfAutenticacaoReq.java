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
 * Informações da requisição de autenticação.
 */
@ApiModel(description = "Informações da requisição de autenticação.")
@Validated
public class InfAutenticacaoReq   {
  @JsonProperty("cpf")
  private String cpf = null;

  @JsonProperty("telefone")
  private String telefone = null;

  public InfAutenticacaoReq cpf(String cpf) {
    this.cpf = cpf;
    return this;
  }

  /**
   * número do CPF do cliente a autenticar (11 dígitos).
   * @return cpf
  **/
  @ApiModelProperty(example = "02358422785", required = true, value = "número do CPF do cliente a autenticar (11 dígitos).")
  @NotNull

@Pattern(regexp="^\\d{11}$")   public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

  public InfAutenticacaoReq telefone(String telefone) {
    this.telefone = telefone;
    return this;
  }

  /**
   * Telefone do cliente favorecido a autenticar (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).
   * @return telefone
  **/
  @ApiModelProperty(example = "51999999999", required = true, value = "Telefone do cliente favorecido a autenticar (11 dígitos = DDD com 0 quando número tem 8 dígitos, sem 0 quando número tem 9 dígitos).")
  @NotNull

@Pattern(regexp="^\\d{11}$")   public String getTelefone() {
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
    InfAutenticacaoReq infAutenticacaoReq = (InfAutenticacaoReq) o;
    return Objects.equals(this.cpf, infAutenticacaoReq.cpf) &&
        Objects.equals(this.telefone, infAutenticacaoReq.telefone);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cpf, telefone);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfAutenticacaoReq {\n");
    
    sb.append("    cpf: ").append(toIndentedString(cpf)).append("\n");
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

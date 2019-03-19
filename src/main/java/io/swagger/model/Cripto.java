package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.CriptoRespostaCliente;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações relacionadas a criptografia e senhas da requisição. Varia dependendo da necessidade de cada transação.
 */
@ApiModel(description = "Informações relacionadas a criptografia e senhas da requisição. Varia dependendo da necessidade de cada transação.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-19T14:13:24.289Z[GMT]")
public class Cripto   {
  @JsonProperty("senha")
  private String senha = null;

  @JsonProperty("tamanhoSenha")
  private String tamanhoSenha = null;

  @JsonProperty("idPositiva")
  private String idPositiva = null;

  @JsonProperty("token")
  private String token = null;

  @JsonProperty("templateBiometria")
  private String templateBiometria = null;

  @JsonProperty("criptogramaChip")
  private String criptogramaChip = null;

  @JsonProperty("hash")
  private String hash = null;

  @JsonProperty("respostaCliente")
  private CriptoRespostaCliente respostaCliente = null;

  public Cripto senha(String senha) {
    this.senha = senha;
    return this;
  }

  /**
   * Senha numérica criptografada.
   * @return senha
  **/
  @ApiModelProperty(value = "Senha numérica criptografada.")

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  public Cripto tamanhoSenha(String tamanhoSenha) {
    this.tamanhoSenha = tamanhoSenha;
    return this;
  }

  /**
   * Tamanho da senha numérica.
   * @return tamanhoSenha
  **/
  @ApiModelProperty(example = "15", value = "Tamanho da senha numérica.")

@Pattern(regexp="^\\d+$")   public String getTamanhoSenha() {
    return tamanhoSenha;
  }

  public void setTamanhoSenha(String tamanhoSenha) {
    this.tamanhoSenha = tamanhoSenha;
  }

  public Cripto idPositiva(String idPositiva) {
    this.idPositiva = idPositiva;
    return this;
  }

  /**
   * Identificação positiva informada pelo usuário, caso utilizada. Corresponde às posições (botões) selecionadas pelo usuário em cada tela apresentada. Pode ser criptografada ou não.
   * @return idPositiva
  **/
  @ApiModelProperty(value = "Identificação positiva informada pelo usuário, caso utilizada. Corresponde às posições (botões) selecionadas pelo usuário em cada tela apresentada. Pode ser criptografada ou não.")

  public String getIdPositiva() {
    return idPositiva;
  }

  public void setIdPositiva(String idPositiva) {
    this.idPositiva = idPositiva;
  }

  public Cripto token(String token) {
    this.token = token;
    return this;
  }

  /**
   * Em caso de utilização de token para autenticação, contém o token informado pelo usuário.
   * @return token
  **/
  @ApiModelProperty(example = "02C47DF604EB43B1", value = "Em caso de utilização de token para autenticação, contém o token informado pelo usuário.")

  public String getToken() {
    return token;
  }

  public void setToken(String token) {
    this.token = token;
  }

  public Cripto templateBiometria(String templateBiometria) {
    this.templateBiometria = templateBiometria;
    return this;
  }

  /**
   * Em caso de biometria, contém o template gerado.
   * @return templateBiometria
  **/
  @ApiModelProperty(value = "Em caso de biometria, contém o template gerado.")

  public String getTemplateBiometria() {
    return templateBiometria;
  }

  public void setTemplateBiometria(String templateBiometria) {
    this.templateBiometria = templateBiometria;
  }

  public Cripto criptogramaChip(String criptogramaChip) {
    this.criptogramaChip = criptogramaChip;
    return this;
  }

  /**
   * Em caso de cartão com chip, contém o criptograma dele.
   * @return criptogramaChip
  **/
  @ApiModelProperty(value = "Em caso de cartão com chip, contém o criptograma dele.")

  public String getCriptogramaChip() {
    return criptogramaChip;
  }

  public void setCriptogramaChip(String criptogramaChip) {
    this.criptogramaChip = criptogramaChip;
  }

  public Cripto hash(String hash) {
    this.hash = hash;
    return this;
  }

  /**
   * Hash de todos os campos que compõem a transação.
   * @return hash
  **/
  @ApiModelProperty(value = "Hash de todos os campos que compõem a transação.")

  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public Cripto respostaCliente(CriptoRespostaCliente respostaCliente) {
    this.respostaCliente = respostaCliente;
    return this;
  }

  /**
   * Get respostaCliente
   * @return respostaCliente
  **/
  @ApiModelProperty(value = "")

  @Valid
  public CriptoRespostaCliente getRespostaCliente() {
    return respostaCliente;
  }

  public void setRespostaCliente(CriptoRespostaCliente respostaCliente) {
    this.respostaCliente = respostaCliente;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cripto cripto = (Cripto) o;
    return Objects.equals(this.senha, cripto.senha) &&
        Objects.equals(this.tamanhoSenha, cripto.tamanhoSenha) &&
        Objects.equals(this.idPositiva, cripto.idPositiva) &&
        Objects.equals(this.token, cripto.token) &&
        Objects.equals(this.templateBiometria, cripto.templateBiometria) &&
        Objects.equals(this.criptogramaChip, cripto.criptogramaChip) &&
        Objects.equals(this.hash, cripto.hash) &&
        Objects.equals(this.respostaCliente, cripto.respostaCliente);
  }

  @Override
  public int hashCode() {
    return Objects.hash(senha, tamanhoSenha, idPositiva, token, templateBiometria, criptogramaChip, hash, respostaCliente);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cripto {\n");
    
    sb.append("    senha: ").append(toIndentedString(senha)).append("\n");
    sb.append("    tamanhoSenha: ").append(toIndentedString(tamanhoSenha)).append("\n");
    sb.append("    idPositiva: ").append(toIndentedString(idPositiva)).append("\n");
    sb.append("    token: ").append(toIndentedString(token)).append("\n");
    sb.append("    templateBiometria: ").append(toIndentedString(templateBiometria)).append("\n");
    sb.append("    criptogramaChip: ").append(toIndentedString(criptogramaChip)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    respostaCliente: ").append(toIndentedString(respostaCliente)).append("\n");
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

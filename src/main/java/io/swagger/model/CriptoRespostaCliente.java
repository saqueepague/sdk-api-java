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
 * Resposta do cliente à pergunta feita na identificação (somente respostas numéricas).
 */
@ApiModel(description = "Resposta do cliente à pergunta feita na identificação (somente respostas numéricas).")
@Validated
public class CriptoRespostaCliente   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("pergunta")
  private String pergunta = null;

  @JsonProperty("resposta")
  private String resposta = null;

  public CriptoRespostaCliente id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador da pergunta.
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "Identificador da pergunta.")

@Pattern(regexp="^\\d+$")   public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public CriptoRespostaCliente pergunta(String pergunta) {
    this.pergunta = pergunta;
    return this;
  }

  /**
   * Pergunta feita ao cliente (somente o id é preenchido).
   * @return pergunta
  **/
  @ApiModelProperty(example = "Qual o dia do seu aniversário?", value = "Pergunta feita ao cliente (somente o id é preenchido).")

  public String getPergunta() {
    return pergunta;
  }

  public void setPergunta(String pergunta) {
    this.pergunta = pergunta;
  }

  public CriptoRespostaCliente resposta(String resposta) {
    this.resposta = resposta;
    return this;
  }

  /**
   * Resposta da pergunta (dado criptografado).
   * @return resposta
  **/
  @ApiModelProperty(example = "q0WKgCM+wbXjzlY=", value = "Resposta da pergunta (dado criptografado).")

  public String getResposta() {
    return resposta;
  }

  public void setResposta(String resposta) {
    this.resposta = resposta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CriptoRespostaCliente criptoRespostaCliente = (CriptoRespostaCliente) o;
    return Objects.equals(this.id, criptoRespostaCliente.id) &&
        Objects.equals(this.pergunta, criptoRespostaCliente.pergunta) &&
        Objects.equals(this.resposta, criptoRespostaCliente.resposta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pergunta, resposta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CriptoRespostaCliente {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pergunta: ").append(toIndentedString(pergunta)).append("\n");
    sb.append("    resposta: ").append(toIndentedString(resposta)).append("\n");
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

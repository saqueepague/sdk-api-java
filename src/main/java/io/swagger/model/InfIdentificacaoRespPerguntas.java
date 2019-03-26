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
 * InfIdentificacaoRespPerguntas
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-26T13:22:47.638Z[GMT]")
public class InfIdentificacaoRespPerguntas   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("pergunta")
  private String pergunta = null;

  @JsonProperty("tamResposta")
  private String tamResposta = null;

  @JsonProperty("resposta")
  private String resposta = null;

  public InfIdentificacaoRespPerguntas id(String id) {
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

  public InfIdentificacaoRespPerguntas pergunta(String pergunta) {
    this.pergunta = pergunta;
    return this;
  }

  /**
   * Pergunta a ser exibida ao usuário.
   * @return pergunta
  **/
  @ApiModelProperty(example = "Qual é o dia de seu aniversário?", value = "Pergunta a ser exibida ao usuário.")

  public String getPergunta() {
    return pergunta;
  }

  public void setPergunta(String pergunta) {
    this.pergunta = pergunta;
  }

  public InfIdentificacaoRespPerguntas tamResposta(String tamResposta) {
    this.tamResposta = tamResposta;
    return this;
  }

  /**
   * Número de dígitos esperado para a resposta.
   * @return tamResposta
  **/
  @ApiModelProperty(example = "2", value = "Número de dígitos esperado para a resposta.")

@Pattern(regexp="^\\d+$")   public String getTamResposta() {
    return tamResposta;
  }

  public void setTamResposta(String tamResposta) {
    this.tamResposta = tamResposta;
  }

  public InfIdentificacaoRespPerguntas resposta(String resposta) {
    this.resposta = resposta;
    return this;
  }

  /**
   * Resposta da pergunta (campo preenchido na requisição da transação financeira associada)
   * @return resposta
  **/
  @ApiModelProperty(value = "Resposta da pergunta (campo preenchido na requisição da transação financeira associada)")

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
    InfIdentificacaoRespPerguntas infIdentificacaoRespPerguntas = (InfIdentificacaoRespPerguntas) o;
    return Objects.equals(this.id, infIdentificacaoRespPerguntas.id) &&
        Objects.equals(this.pergunta, infIdentificacaoRespPerguntas.pergunta) &&
        Objects.equals(this.tamResposta, infIdentificacaoRespPerguntas.tamResposta) &&
        Objects.equals(this.resposta, infIdentificacaoRespPerguntas.resposta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pergunta, tamResposta, resposta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfIdentificacaoRespPerguntas {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pergunta: ").append(toIndentedString(pergunta)).append("\n");
    sb.append("    tamResposta: ").append(toIndentedString(tamResposta)).append("\n");
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

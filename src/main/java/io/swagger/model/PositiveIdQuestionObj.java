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
 * Pergunta mostrada ao usuário para se identificar antes de uma transação. Esta pergunta é selecionada aleatoriamente através da lista mandada na requisição de identificação.
 */
@ApiModel(description = "Pergunta mostrada ao usuário para se identificar antes de uma transação. Esta pergunta é selecionada aleatoriamente através da lista mandada na requisição de identificação.")
@Validated
public class PositiveIdQuestionObj   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("pergunta")
  private String pergunta = null;

  @JsonProperty("tamResposta")
  private String tamResposta = null;

  public PositiveIdQuestionObj id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador da pergunta.
   * @return id
  **/
  @ApiModelProperty(example = "1", required = true, value = "Identificador da pergunta.")
  @NotNull

@Pattern(regexp="^\\d+$")   public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PositiveIdQuestionObj pergunta(String pergunta) {
    this.pergunta = pergunta;
    return this;
  }

  /**
   * Pergunta a ser exibida ao usuário.
   * @return pergunta
  **/
  @ApiModelProperty(example = "Qual é o dia de seu aniversário?", required = true, value = "Pergunta a ser exibida ao usuário.")
  @NotNull

  public String getPergunta() {
    return pergunta;
  }

  public void setPergunta(String pergunta) {
    this.pergunta = pergunta;
  }

  public PositiveIdQuestionObj tamResposta(String tamResposta) {
    this.tamResposta = tamResposta;
    return this;
  }

  /**
   * número de dígitos esperado para a resposta.
   * @return tamResposta
  **/
  @ApiModelProperty(example = "2", required = true, value = "número de dígitos esperado para a resposta.")
  @NotNull

@Pattern(regexp="^\\d+$")   public String getTamResposta() {
    return tamResposta;
  }

  public void setTamResposta(String tamResposta) {
    this.tamResposta = tamResposta;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositiveIdQuestionObj positiveIdQuestionObj = (PositiveIdQuestionObj) o;
    return Objects.equals(this.id, positiveIdQuestionObj.id) &&
        Objects.equals(this.pergunta, positiveIdQuestionObj.pergunta) &&
        Objects.equals(this.tamResposta, positiveIdQuestionObj.tamResposta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pergunta, tamResposta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositiveIdQuestionObj {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    pergunta: ").append(toIndentedString(pergunta)).append("\n");
    sb.append("    tamResposta: ").append(toIndentedString(tamResposta)).append("\n");
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

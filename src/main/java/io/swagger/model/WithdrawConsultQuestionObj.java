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
 * Pergunta mostrada ao usuário para se identificar antes do saque. Esta pergunta é selecionada aleatoriamente através da lista mandada na requisição de identificação.
 */
@ApiModel(description = "Pergunta mostrada ao usuário para se identificar antes do saque. Esta pergunta é selecionada aleatoriamente através da lista mandada na requisição de identificação.")
@Validated
public class WithdrawConsultQuestionObj   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("pergunta")
  private String pergunta = null;

  @JsonProperty("tamResposta")
  private String tamResposta = null;

  public WithdrawConsultQuestionObj id(String id) {
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

  public WithdrawConsultQuestionObj pergunta(String pergunta) {
    this.pergunta = pergunta;
    return this;
  }

  /**
   * Pergunta de identificação.
   * @return pergunta
  **/
  @ApiModelProperty(example = "Informe os 3 primeiros dígitos do seu CPF", required = true, value = "Pergunta de identificação.")
  @NotNull

  public String getPergunta() {
    return pergunta;
  }

  public void setPergunta(String pergunta) {
    this.pergunta = pergunta;
  }

  public WithdrawConsultQuestionObj tamResposta(String tamResposta) {
    this.tamResposta = tamResposta;
    return this;
  }

  /**
   * Tamanho da resposta da pergunta.
   * @return tamResposta
  **/
  @ApiModelProperty(example = "3", required = true, value = "Tamanho da resposta da pergunta.")
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
    WithdrawConsultQuestionObj withdrawConsultQuestionObj = (WithdrawConsultQuestionObj) o;
    return Objects.equals(this.id, withdrawConsultQuestionObj.id) &&
        Objects.equals(this.pergunta, withdrawConsultQuestionObj.pergunta) &&
        Objects.equals(this.tamResposta, withdrawConsultQuestionObj.tamResposta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pergunta, tamResposta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class WithdrawConsultQuestionObj {\n");
    
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

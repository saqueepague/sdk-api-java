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
 * InfConsultaSaqueRespPerguntas
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-26T13:22:47.638Z[GMT]")
public class InfConsultaSaqueRespPerguntas   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("pergunta")
  private String pergunta = null;

  @JsonProperty("tamResposta")
  private String tamResposta = null;

  public InfConsultaSaqueRespPerguntas id(String id) {
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

  public InfConsultaSaqueRespPerguntas pergunta(String pergunta) {
    this.pergunta = pergunta;
    return this;
  }

  /**
   * Pergunta de identificação.
   * @return pergunta
  **/
  @ApiModelProperty(example = "Informe os 3 primeiros dígitos do seu CPF", value = "Pergunta de identificação.")

  public String getPergunta() {
    return pergunta;
  }

  public void setPergunta(String pergunta) {
    this.pergunta = pergunta;
  }

  public InfConsultaSaqueRespPerguntas tamResposta(String tamResposta) {
    this.tamResposta = tamResposta;
    return this;
  }

  /**
   * Tamanho da resposta da pergunta.
   * @return tamResposta
  **/
  @ApiModelProperty(example = "3", value = "Tamanho da resposta da pergunta.")

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
    InfConsultaSaqueRespPerguntas infConsultaSaqueRespPerguntas = (InfConsultaSaqueRespPerguntas) o;
    return Objects.equals(this.id, infConsultaSaqueRespPerguntas.id) &&
        Objects.equals(this.pergunta, infConsultaSaqueRespPerguntas.pergunta) &&
        Objects.equals(this.tamResposta, infConsultaSaqueRespPerguntas.tamResposta);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, pergunta, tamResposta);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaSaqueRespPerguntas {\n");
    
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

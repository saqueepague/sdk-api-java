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
 * Resposta do cliente à pergunta feita na identificação.
 */
@ApiModel(description = "Resposta do cliente à pergunta feita na identificação.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

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

@Pattern(regexp="^\\d+$") 
  public String getId() {
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
   * Pergunta feita ao cliente.
   * @return pergunta
  **/
  @ApiModelProperty(example = "Qual a data de aniversário do seu primeiro animal de estimação?", value = "Pergunta feita ao cliente.")


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
   * Resposta da pergunta.
   * @return resposta
  **/
  @ApiModelProperty(example = "14", value = "Resposta da pergunta.")


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


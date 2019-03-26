package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaSaqueRespPerguntas;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações da resposta de requisição de consulta de saque.
 */
@ApiModel(description = "Informações da resposta de requisição de consulta de saque.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-26T13:22:47.638Z[GMT]")
public class InfConsultaSaqueResp   {
  @JsonProperty("nomeCliente")
  private String nomeCliente = null;

  @JsonProperty("perguntas")
  @Valid
  private List<InfConsultaSaqueRespPerguntas> perguntas = null;

  public InfConsultaSaqueResp nomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
    return this;
  }

  /**
   * Nome do cliente titular da conta.
   * @return nomeCliente
  **/
  @ApiModelProperty(example = "Carl Edward Sagan", value = "Nome do cliente titular da conta.")

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public InfConsultaSaqueResp perguntas(List<InfConsultaSaqueRespPerguntas> perguntas) {
    this.perguntas = perguntas;
    return this;
  }

  public InfConsultaSaqueResp addPerguntasItem(InfConsultaSaqueRespPerguntas perguntasItem) {
    if (this.perguntas == null) {
      this.perguntas = new ArrayList<InfConsultaSaqueRespPerguntas>();
    }
    this.perguntas.add(perguntasItem);
    return this;
  }

  /**
   * Lista de possíveis perguntas a serem mostradas para o usuário para autorizar o saque.
   * @return perguntas
  **/
  @ApiModelProperty(value = "Lista de possíveis perguntas a serem mostradas para o usuário para autorizar o saque.")
  @Valid
  public List<InfConsultaSaqueRespPerguntas> getPerguntas() {
    return perguntas;
  }

  public void setPerguntas(List<InfConsultaSaqueRespPerguntas> perguntas) {
    this.perguntas = perguntas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaSaqueResp infConsultaSaqueResp = (InfConsultaSaqueResp) o;
    return Objects.equals(this.nomeCliente, infConsultaSaqueResp.nomeCliente) &&
        Objects.equals(this.perguntas, infConsultaSaqueResp.perguntas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeCliente, perguntas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaSaqueResp {\n");
    
    sb.append("    nomeCliente: ").append(toIndentedString(nomeCliente)).append("\n");
    sb.append("    perguntas: ").append(toIndentedString(perguntas)).append("\n");
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

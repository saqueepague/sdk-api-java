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
 * InfConsultaTitulosCapitalizacaoRespTemaEstilos
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-26T17:53:50.941Z[GMT]")
public class InfConsultaTitulosCapitalizacaoRespTemaEstilos   {
  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("valor")
  private String valor = null;

  public InfConsultaTitulosCapitalizacaoRespTemaEstilos nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Nome do Estilo.
   * @return nome
  **/
  @ApiModelProperty(example = "cor-fundo ou cor-botao", value = "Nome do Estilo.")

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public InfConsultaTitulosCapitalizacaoRespTemaEstilos valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Valor do estilo (no formato hexadecimal).
   * @return valor
  **/
  @ApiModelProperty(example = "#00288C", value = "Valor do estilo (no formato hexadecimal).")

@Pattern(regexp="^\\#(\\d{3}|\\d{6})$")   public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaTitulosCapitalizacaoRespTemaEstilos infConsultaTitulosCapitalizacaoRespTemaEstilos = (InfConsultaTitulosCapitalizacaoRespTemaEstilos) o;
    return Objects.equals(this.nome, infConsultaTitulosCapitalizacaoRespTemaEstilos.nome) &&
        Objects.equals(this.valor, infConsultaTitulosCapitalizacaoRespTemaEstilos.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nome, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaTitulosCapitalizacaoRespTemaEstilos {\n");
    
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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

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
 * Informações da requisição de consulta de produtos de recarga.
 */
@ApiModel(description = "Informações da requisição de consulta de produtos de recarga.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfConsultaProdutosRecargaReq   {
  @JsonProperty("idOperadora")
  private String idOperadora = null;

  @JsonProperty("numCartao")
  private String numCartao = null;

  public InfConsultaProdutosRecargaReq idOperadora(String idOperadora) {
    this.idOperadora = idOperadora;
    return this;
  }

  /**
   * Operadora utilizada na operação.
   * @return idOperadora
  **/
  @ApiModelProperty(example = "586", value = "Operadora utilizada na operação.")

@Pattern(regexp="^\\d+$") 
  public String getIdOperadora() {
    return idOperadora;
  }

  public void setIdOperadora(String idOperadora) {
    this.idOperadora = idOperadora;
  }

  public InfConsultaProdutosRecargaReq numCartao(String numCartao) {
    this.numCartao = numCartao;
    return this;
  }

  /**
   * Número do cartão utilizado na operação.
   * @return numCartao
  **/
  @ApiModelProperty(example = "574839201659236", value = "Número do cartão utilizado na operação.")

@Pattern(regexp="^\\d+$") 
  public String getNumCartao() {
    return numCartao;
  }

  public void setNumCartao(String numCartao) {
    this.numCartao = numCartao;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaProdutosRecargaReq infConsultaProdutosRecargaReq = (InfConsultaProdutosRecargaReq) o;
    return Objects.equals(this.idOperadora, infConsultaProdutosRecargaReq.idOperadora) &&
        Objects.equals(this.numCartao, infConsultaProdutosRecargaReq.numCartao);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOperadora, numCartao);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaProdutosRecargaReq {\n");
    
    sb.append("    idOperadora: ").append(toIndentedString(idOperadora)).append("\n");
    sb.append("    numCartao: ").append(toIndentedString(numCartao)).append("\n");
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


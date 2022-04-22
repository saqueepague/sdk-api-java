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
 * Informações adicionais como termo de uso e como utilizar.
 */
@ApiModel(description = "Informações adicionais como termo de uso e como utilizar.")
@Validated
public class InfConsultaCatalogoCartaoPresenteRespInformacoes   {
  @JsonProperty("termoDeUso")
  private String termoDeUso = null;

  @JsonProperty("descricaoResgate")
  private String descricaoResgate = null;

  public InfConsultaCatalogoCartaoPresenteRespInformacoes termoDeUso(String termoDeUso) {
    this.termoDeUso = termoDeUso;
    return this;
  }

  /**
   * Termo de uso do produto.
   * @return termoDeUso
  **/
  @ApiModelProperty(example = "O produto só poderá ser resgatado uma vez.", value = "Termo de uso do produto.")

  public String getTermoDeUso() {
    return termoDeUso;
  }

  public void setTermoDeUso(String termoDeUso) {
    this.termoDeUso = termoDeUso;
  }

  public InfConsultaCatalogoCartaoPresenteRespInformacoes descricaoResgate(String descricaoResgate) {
    this.descricaoResgate = descricaoResgate;
    return this;
  }

  /**
   * Descrição de como resgatar o produto.
   * @return descricaoResgate
  **/
  @ApiModelProperty(example = "O Cartão presente deve ser resgatado de tal forma.", value = "Descrição de como resgatar o produto.")

  public String getDescricaoResgate() {
    return descricaoResgate;
  }

  public void setDescricaoResgate(String descricaoResgate) {
    this.descricaoResgate = descricaoResgate;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaCatalogoCartaoPresenteRespInformacoes infConsultaCatalogoCartaoPresenteRespInformacoes = (InfConsultaCatalogoCartaoPresenteRespInformacoes) o;
    return Objects.equals(this.termoDeUso, infConsultaCatalogoCartaoPresenteRespInformacoes.termoDeUso) &&
        Objects.equals(this.descricaoResgate, infConsultaCatalogoCartaoPresenteRespInformacoes.descricaoResgate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(termoDeUso, descricaoResgate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaCatalogoCartaoPresenteRespInformacoes {\n");
    
    sb.append("    termoDeUso: ").append(toIndentedString(termoDeUso)).append("\n");
    sb.append("    descricaoResgate: ").append(toIndentedString(descricaoResgate)).append("\n");
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

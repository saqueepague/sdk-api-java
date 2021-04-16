package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaFavorecidoRespFavorecidos;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações da resposta da requisição de consulta de favorecidos para TED.
 */
@ApiModel(description = "Informações da resposta da requisição de consulta de favorecidos para TED.")
@Validated
public class InfConsultaFavorecidoResp   {
  @JsonProperty("favorecidos")
  @Valid
  private List<InfConsultaFavorecidoRespFavorecidos> favorecidos = new ArrayList<InfConsultaFavorecidoRespFavorecidos>();

  public InfConsultaFavorecidoResp favorecidos(List<InfConsultaFavorecidoRespFavorecidos> favorecidos) {
    this.favorecidos = favorecidos;
    return this;
  }

  public InfConsultaFavorecidoResp addFavorecidosItem(InfConsultaFavorecidoRespFavorecidos favorecidosItem) {
    this.favorecidos.add(favorecidosItem);
    return this;
  }

  /**
   * Lista de favorecidos cadastrados no parceiro.
   * @return favorecidos
  **/
  @ApiModelProperty(required = true, value = "Lista de favorecidos cadastrados no parceiro.")
  @NotNull
  @Valid
  public List<InfConsultaFavorecidoRespFavorecidos> getFavorecidos() {
    return favorecidos;
  }

  public void setFavorecidos(List<InfConsultaFavorecidoRespFavorecidos> favorecidos) {
    this.favorecidos = favorecidos;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaFavorecidoResp infConsultaFavorecidoResp = (InfConsultaFavorecidoResp) o;
    return Objects.equals(this.favorecidos, infConsultaFavorecidoResp.favorecidos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(favorecidos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaFavorecidoResp {\n");
    
    sb.append("    favorecidos: ").append(toIndentedString(favorecidos)).append("\n");
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

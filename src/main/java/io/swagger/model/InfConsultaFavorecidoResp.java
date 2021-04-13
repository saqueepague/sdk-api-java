package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaFavorecidoRespListaFavorecidos;
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
  @JsonProperty("listaFavorecidos")
  @Valid
  private List<InfConsultaFavorecidoRespListaFavorecidos> listaFavorecidos = null;

  public InfConsultaFavorecidoResp listaFavorecidos(List<InfConsultaFavorecidoRespListaFavorecidos> listaFavorecidos) {
    this.listaFavorecidos = listaFavorecidos;
    return this;
  }

  public InfConsultaFavorecidoResp addListaFavorecidosItem(InfConsultaFavorecidoRespListaFavorecidos listaFavorecidosItem) {
    if (this.listaFavorecidos == null) {
      this.listaFavorecidos = new ArrayList<InfConsultaFavorecidoRespListaFavorecidos>();
    }
    this.listaFavorecidos.add(listaFavorecidosItem);
    return this;
  }

  /**
   * Get listaFavorecidos
   * @return listaFavorecidos
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<InfConsultaFavorecidoRespListaFavorecidos> getListaFavorecidos() {
    return listaFavorecidos;
  }

  public void setListaFavorecidos(List<InfConsultaFavorecidoRespListaFavorecidos> listaFavorecidos) {
    this.listaFavorecidos = listaFavorecidos;
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
    return Objects.equals(this.listaFavorecidos, infConsultaFavorecidoResp.listaFavorecidos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(listaFavorecidos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaFavorecidoResp {\n");
    
    sb.append("    listaFavorecidos: ").append(toIndentedString(listaFavorecidos)).append("\n");
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

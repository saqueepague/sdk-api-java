package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaFavorecidoRespFavorecido;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InfConsultaFavorecidoRespListaFavorecidos
 */
@Validated
public class InfConsultaFavorecidoRespListaFavorecidos   {
  @JsonProperty("favorecido")
  private InfConsultaFavorecidoRespFavorecido favorecido = null;

  public InfConsultaFavorecidoRespListaFavorecidos favorecido(InfConsultaFavorecidoRespFavorecido favorecido) {
    this.favorecido = favorecido;
    return this;
  }

  /**
   * Get favorecido
   * @return favorecido
  **/
  @ApiModelProperty(value = "")

  @Valid
  public InfConsultaFavorecidoRespFavorecido getFavorecido() {
    return favorecido;
  }

  public void setFavorecido(InfConsultaFavorecidoRespFavorecido favorecido) {
    this.favorecido = favorecido;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaFavorecidoRespListaFavorecidos infConsultaFavorecidoRespListaFavorecidos = (InfConsultaFavorecidoRespListaFavorecidos) o;
    return Objects.equals(this.favorecido, infConsultaFavorecidoRespListaFavorecidos.favorecido);
  }

  @Override
  public int hashCode() {
    return Objects.hash(favorecido);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaFavorecidoRespListaFavorecidos {\n");
    
    sb.append("    favorecido: ").append(toIndentedString(favorecido)).append("\n");
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

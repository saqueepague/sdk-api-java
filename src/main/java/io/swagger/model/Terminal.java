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
 * Informações sobre o terminal vigente.
 */
@ApiModel(description = "Informações sobre o terminal vigente.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-22T18:11:57.142Z")

public class Terminal   {
  @JsonProperty("codEstab")
  private String codEstab = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("tipo")
  private String tipo = null;

  public Terminal codEstab(String codEstab) {
    this.codEstab = codEstab;
    return this;
  }

  /**
   * Código do estabelecimento onde está localizado o terminal gerado pela Saque e Pague (15 dígitos).
   * @return codEstab
  **/
  @ApiModelProperty(example = "000000000742673", required = true, value = "Código do estabelecimento onde está localizado o terminal gerado pela Saque e Pague (15 dígitos).")
  @NotNull

@Pattern(regexp="^\\d{15}$") 
  public String getCodEstab() {
    return codEstab;
  }

  public void setCodEstab(String codEstab) {
    this.codEstab = codEstab;
  }

  public Terminal id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador do terminal gerado pela Saque e Pague (8 dígitos).
   * @return id
  **/
  @ApiModelProperty(example = "05100004", required = true, value = "Identificador do terminal gerado pela Saque e Pague (8 dígitos).")
  @NotNull

@Pattern(regexp="^\\d{8}$") 
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Terminal tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Tipo de terminal o qual a operação é gerada (3 dígitos, 008 = ATM).
   * @return tipo
  **/
  @ApiModelProperty(example = "008", required = true, value = "Tipo de terminal o qual a operação é gerada (3 dígitos, 008 = ATM).")
  @NotNull

@Pattern(regexp="^\\d{3}$") 
  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Terminal terminal = (Terminal) o;
    return Objects.equals(this.codEstab, terminal.codEstab) &&
        Objects.equals(this.id, terminal.id) &&
        Objects.equals(this.tipo, terminal.tipo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codEstab, id, tipo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Terminal {\n");
    
    sb.append("    codEstab: ").append(toIndentedString(codEstab)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
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


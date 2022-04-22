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
 * Lista de conjuntos de letras/sílabas para o usuário selecionar, antes de uma transação. Cada posição é análoga a um botão mostrado, em posição aleatéria, nesta tela. Contudo a resposta mandada na transação manterá a posição original retornada por este objeto.
 */
@ApiModel(description = "Lista de conjuntos de letras/sílabas para o usuário selecionar, antes de uma transação. Cada posição é análoga a um botão mostrado, em posição aleatéria, nesta tela. Contudo a resposta mandada na transação manterá a posição original retornada por este objeto.")
@Validated
public class PositiveIdScreenObj   {
  @JsonProperty("idTela")
  private String idTela = null;

  @JsonProperty("pos1")
  private String pos1 = null;

  @JsonProperty("pos2")
  private String pos2 = null;

  @JsonProperty("pos3")
  private String pos3 = null;

  @JsonProperty("pos4")
  private String pos4 = null;

  @JsonProperty("pos5")
  private String pos5 = null;

  @JsonProperty("pos6")
  private String pos6 = null;

  @JsonProperty("pos7")
  private String pos7 = null;

  @JsonProperty("pos8")
  private String pos8 = null;

  public PositiveIdScreenObj idTela(String idTela) {
    this.idTela = idTela;
    return this;
  }

  /**
   * Identificador da tela.
   * @return idTela
  **/
  @ApiModelProperty(example = "1", required = true, value = "Identificador da tela.")
  @NotNull

@Pattern(regexp="^\\d+$")   public String getIdTela() {
    return idTela;
  }

  public void setIdTela(String idTela) {
    this.idTela = idTela;
  }

  public PositiveIdScreenObj pos1(String pos1) {
    this.pos1 = pos1;
    return this;
  }

  /**
   * Get pos1
   * @return pos1
  **/
  @ApiModelProperty(example = "SOS GER", required = true, value = "")
  @NotNull

@Pattern(regexp="^.{3,19}$")   public String getPos1() {
    return pos1;
  }

  public void setPos1(String pos1) {
    this.pos1 = pos1;
  }

  public PositiveIdScreenObj pos2(String pos2) {
    this.pos2 = pos2;
    return this;
  }

  /**
   * Get pos2
   * @return pos2
  **/
  @ApiModelProperty(example = "MA/QU/NE", required = true, value = "")
  @NotNull

@Pattern(regexp="^.{3,19}$")   public String getPos2() {
    return pos2;
  }

  public void setPos2(String pos2) {
    this.pos2 = pos2;
  }

  public PositiveIdScreenObj pos3(String pos3) {
    this.pos3 = pos3;
    return this;
  }

  /**
   * Get pos3
   * @return pos3
  **/
  @ApiModelProperty(example = "14 50 96", required = true, value = "")
  @NotNull

@Pattern(regexp="^.{3,19}$")   public String getPos3() {
    return pos3;
  }

  public void setPos3(String pos3) {
    this.pos3 = pos3;
  }

  public PositiveIdScreenObj pos4(String pos4) {
    this.pos4 = pos4;
    return this;
  }

  /**
   * Get pos4
   * @return pos4
  **/
  @ApiModelProperty(example = "P1-G8-E4", required = true, value = "")
  @NotNull

@Pattern(regexp="^.{3,19}$")   public String getPos4() {
    return pos4;
  }

  public void setPos4(String pos4) {
    this.pos4 = pos4;
  }

  public PositiveIdScreenObj pos5(String pos5) {
    this.pos5 = pos5;
    return this;
  }

  /**
   * Get pos5
   * @return pos5
  **/
  @ApiModelProperty(example = "REG SOS", value = "")

@Pattern(regexp="^.{3,19}$")   public String getPos5() {
    return pos5;
  }

  public void setPos5(String pos5) {
    this.pos5 = pos5;
  }

  public PositiveIdScreenObj pos6(String pos6) {
    this.pos6 = pos6;
    return this;
  }

  /**
   * Get pos6
   * @return pos6
  **/
  @ApiModelProperty(example = "EN/UQ/AM", value = "")

@Pattern(regexp="^.{3,19}$")   public String getPos6() {
    return pos6;
  }

  public void setPos6(String pos6) {
    this.pos6 = pos6;
  }

  public PositiveIdScreenObj pos7(String pos7) {
    this.pos7 = pos7;
    return this;
  }

  /**
   * Get pos7
   * @return pos7
  **/
  @ApiModelProperty(example = "69 05 41", value = "")

@Pattern(regexp="^.{3,19}$")   public String getPos7() {
    return pos7;
  }

  public void setPos7(String pos7) {
    this.pos7 = pos7;
  }

  public PositiveIdScreenObj pos8(String pos8) {
    this.pos8 = pos8;
    return this;
  }

  /**
   * Get pos8
   * @return pos8
  **/
  @ApiModelProperty(example = "4E-8G-1P", value = "")

@Pattern(regexp="^.{3,19}$")   public String getPos8() {
    return pos8;
  }

  public void setPos8(String pos8) {
    this.pos8 = pos8;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PositiveIdScreenObj positiveIdScreenObj = (PositiveIdScreenObj) o;
    return Objects.equals(this.idTela, positiveIdScreenObj.idTela) &&
        Objects.equals(this.pos1, positiveIdScreenObj.pos1) &&
        Objects.equals(this.pos2, positiveIdScreenObj.pos2) &&
        Objects.equals(this.pos3, positiveIdScreenObj.pos3) &&
        Objects.equals(this.pos4, positiveIdScreenObj.pos4) &&
        Objects.equals(this.pos5, positiveIdScreenObj.pos5) &&
        Objects.equals(this.pos6, positiveIdScreenObj.pos6) &&
        Objects.equals(this.pos7, positiveIdScreenObj.pos7) &&
        Objects.equals(this.pos8, positiveIdScreenObj.pos8);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTela, pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PositiveIdScreenObj {\n");
    
    sb.append("    idTela: ").append(toIndentedString(idTela)).append("\n");
    sb.append("    pos1: ").append(toIndentedString(pos1)).append("\n");
    sb.append("    pos2: ").append(toIndentedString(pos2)).append("\n");
    sb.append("    pos3: ").append(toIndentedString(pos3)).append("\n");
    sb.append("    pos4: ").append(toIndentedString(pos4)).append("\n");
    sb.append("    pos5: ").append(toIndentedString(pos5)).append("\n");
    sb.append("    pos6: ").append(toIndentedString(pos6)).append("\n");
    sb.append("    pos7: ").append(toIndentedString(pos7)).append("\n");
    sb.append("    pos8: ").append(toIndentedString(pos8)).append("\n");
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

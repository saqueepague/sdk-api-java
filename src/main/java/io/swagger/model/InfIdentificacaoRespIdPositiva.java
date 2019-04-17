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
 * Lista de conjunto de letras/sílabas a serem mostradas nas teclas em cada tela (até 8 caracteres por tecla).
 */
@ApiModel(description = "Lista de conjunto de letras/sílabas a serem mostradas nas teclas em cada tela (até 8 caracteres por tecla).")
@Validated
public class InfIdentificacaoRespIdPositiva   {
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

  public InfIdentificacaoRespIdPositiva idTela(String idTela) {
    this.idTela = idTela;
    return this;
  }

  /**
   * Identificador da tela.
   * @return idTela
  **/
  @ApiModelProperty(example = "1", value = "Identificador da tela.")

@Pattern(regexp="^\\d+$")   public String getIdTela() {
    return idTela;
  }

  public void setIdTela(String idTela) {
    this.idTela = idTela;
  }

  public InfIdentificacaoRespIdPositiva pos1(String pos1) {
    this.pos1 = pos1;
    return this;
  }

  /**
   * Get pos1
   * @return pos1
  **/
  @ApiModelProperty(example = "A-C-D-3", value = "")

@Pattern(regexp="^.{0,8}$")   public String getPos1() {
    return pos1;
  }

  public void setPos1(String pos1) {
    this.pos1 = pos1;
  }

  public InfIdentificacaoRespIdPositiva pos2(String pos2) {
    this.pos2 = pos2;
    return this;
  }

  /**
   * Get pos2
   * @return pos2
  **/
  @ApiModelProperty(example = "A-C-D-3", value = "")

@Pattern(regexp="^.{0,8}$")   public String getPos2() {
    return pos2;
  }

  public void setPos2(String pos2) {
    this.pos2 = pos2;
  }

  public InfIdentificacaoRespIdPositiva pos3(String pos3) {
    this.pos3 = pos3;
    return this;
  }

  /**
   * Get pos3
   * @return pos3
  **/
  @ApiModelProperty(example = "A-C-D-3", value = "")

@Pattern(regexp="^.{0,8}$")   public String getPos3() {
    return pos3;
  }

  public void setPos3(String pos3) {
    this.pos3 = pos3;
  }

  public InfIdentificacaoRespIdPositiva pos4(String pos4) {
    this.pos4 = pos4;
    return this;
  }

  /**
   * Get pos4
   * @return pos4
  **/
  @ApiModelProperty(example = "A-C-D-3", value = "")

@Pattern(regexp="^.{0,8}$")   public String getPos4() {
    return pos4;
  }

  public void setPos4(String pos4) {
    this.pos4 = pos4;
  }

  public InfIdentificacaoRespIdPositiva pos5(String pos5) {
    this.pos5 = pos5;
    return this;
  }

  /**
   * Get pos5
   * @return pos5
  **/
  @ApiModelProperty(example = "A-C-D-3", value = "")

@Pattern(regexp="^.{0,8}$")   public String getPos5() {
    return pos5;
  }

  public void setPos5(String pos5) {
    this.pos5 = pos5;
  }

  public InfIdentificacaoRespIdPositiva pos6(String pos6) {
    this.pos6 = pos6;
    return this;
  }

  /**
   * Get pos6
   * @return pos6
  **/
  @ApiModelProperty(example = "A-C-D-3", value = "")

@Pattern(regexp="^.{0,8}$")   public String getPos6() {
    return pos6;
  }

  public void setPos6(String pos6) {
    this.pos6 = pos6;
  }

  public InfIdentificacaoRespIdPositiva pos7(String pos7) {
    this.pos7 = pos7;
    return this;
  }

  /**
   * Get pos7
   * @return pos7
  **/
  @ApiModelProperty(example = "A-C-D-3", value = "")

@Pattern(regexp="^.{0,8}$")   public String getPos7() {
    return pos7;
  }

  public void setPos7(String pos7) {
    this.pos7 = pos7;
  }

  public InfIdentificacaoRespIdPositiva pos8(String pos8) {
    this.pos8 = pos8;
    return this;
  }

  /**
   * Get pos8
   * @return pos8
  **/
  @ApiModelProperty(example = "A-C-D-3", value = "")

@Pattern(regexp="^.{0,8}$")   public String getPos8() {
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
    InfIdentificacaoRespIdPositiva infIdentificacaoRespIdPositiva = (InfIdentificacaoRespIdPositiva) o;
    return Objects.equals(this.idTela, infIdentificacaoRespIdPositiva.idTela) &&
        Objects.equals(this.pos1, infIdentificacaoRespIdPositiva.pos1) &&
        Objects.equals(this.pos2, infIdentificacaoRespIdPositiva.pos2) &&
        Objects.equals(this.pos3, infIdentificacaoRespIdPositiva.pos3) &&
        Objects.equals(this.pos4, infIdentificacaoRespIdPositiva.pos4) &&
        Objects.equals(this.pos5, infIdentificacaoRespIdPositiva.pos5) &&
        Objects.equals(this.pos6, infIdentificacaoRespIdPositiva.pos6) &&
        Objects.equals(this.pos7, infIdentificacaoRespIdPositiva.pos7) &&
        Objects.equals(this.pos8, infIdentificacaoRespIdPositiva.pos8);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idTela, pos1, pos2, pos3, pos4, pos5, pos6, pos7, pos8);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfIdentificacaoRespIdPositiva {\n");
    
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

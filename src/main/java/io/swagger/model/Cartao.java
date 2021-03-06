package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Cartao
 */
@Validated
public class Cartao   {
  /**
   * Modo de entrada de leitura do cartão. (000 = sem cartão, 050 = chip, 800 = chip, se falhar realiza leitura da trilha, 900 = trilha completa).
   */
  public enum ModoEntradaEnum {
    _000("000"),
    
    _050("050"),
    
    _800("800"),
    
    _900("900");

    private String value;

    ModoEntradaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModoEntradaEnum fromValue(String text) {
      for (ModoEntradaEnum b : ModoEntradaEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("modoEntrada")
  private ModoEntradaEnum modoEntrada = null;

  @JsonProperty("pan")
  private String pan = null;

  @JsonProperty("trilha2")
  private String trilha2 = null;

  public Cartao modoEntrada(ModoEntradaEnum modoEntrada) {
    this.modoEntrada = modoEntrada;
    return this;
  }

  /**
   * Modo de entrada de leitura do cartão. (000 = sem cartão, 050 = chip, 800 = chip, se falhar realiza leitura da trilha, 900 = trilha completa).
   * @return modoEntrada
  **/
  @ApiModelProperty(value = "Modo de entrada de leitura do cartão. (000 = sem cartão, 050 = chip, 800 = chip, se falhar realiza leitura da trilha, 900 = trilha completa).")

  public ModoEntradaEnum getModoEntrada() {
    return modoEntrada;
  }

  public void setModoEntrada(ModoEntradaEnum modoEntrada) {
    this.modoEntrada = modoEntrada;
  }

  public Cartao pan(String pan) {
    this.pan = pan;
    return this;
  }

  /**
   * PAN/Número do cartão utilizado (dado criptografado).
   * @return pan
  **/
  @ApiModelProperty(example = "zhXTyHl5nf2ckysYXXjAgZS5fzS7ybC5xePnWeLEP//bw==", value = "PAN/Número do cartão utilizado (dado criptografado).")

@Pattern(regexp="^.{10,}$")   public String getPan() {
    return pan;
  }

  public void setPan(String pan) {
    this.pan = pan;
  }

  public Cartao trilha2(String trilha2) {
    this.trilha2 = trilha2;
    return this;
  }

  /**
   * Trilha 2 do cartão utilizado (dado criptografado).
   * @return trilha2
  **/
  @ApiModelProperty(example = "mMIrkIrf2pSHccWuaROxoIS+NGcTOWcTWXUtjniTa1BRzPziiE8pWnknAxW9HIgoKdc/Fli2KZwNA==", value = "Trilha 2 do cartão utilizado (dado criptografado).")

@Pattern(regexp="^.{10,}$")   public String getTrilha2() {
    return trilha2;
  }

  public void setTrilha2(String trilha2) {
    this.trilha2 = trilha2;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Cartao cartao = (Cartao) o;
    return Objects.equals(this.modoEntrada, cartao.modoEntrada) &&
        Objects.equals(this.pan, cartao.pan) &&
        Objects.equals(this.trilha2, cartao.trilha2);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modoEntrada, pan, trilha2);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Cartao {\n");
    
    sb.append("    modoEntrada: ").append(toIndentedString(modoEntrada)).append("\n");
    sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
    sb.append("    trilha2: ").append(toIndentedString(trilha2)).append("\n");
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

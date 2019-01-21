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
 * InfConsultaPagamentoReqCodBarras
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfConsultaPagamentoReqCodBarras   {
  @JsonProperty("codigo")
  private String codigo = null;

  /**
   * Forma de entrada do código de barras (0 = escaneado, 1 = digitado).
   */
  public enum ModoEntradaEnum {
    _0("0"),
    
    _1("1");

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

  public InfConsultaPagamentoReqCodBarras codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Código de barras do documento.
   * @return codigo
  **/
  @ApiModelProperty(required = true, value = "Código de barras do documento.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public InfConsultaPagamentoReqCodBarras modoEntrada(ModoEntradaEnum modoEntrada) {
    this.modoEntrada = modoEntrada;
    return this;
  }

  /**
   * Forma de entrada do código de barras (0 = escaneado, 1 = digitado).
   * @return modoEntrada
  **/
  @ApiModelProperty(example = "0", required = true, value = "Forma de entrada do código de barras (0 = escaneado, 1 = digitado).")
  @NotNull


  public ModoEntradaEnum getModoEntrada() {
    return modoEntrada;
  }

  public void setModoEntrada(ModoEntradaEnum modoEntrada) {
    this.modoEntrada = modoEntrada;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaPagamentoReqCodBarras infConsultaPagamentoReqCodBarras = (InfConsultaPagamentoReqCodBarras) o;
    return Objects.equals(this.codigo, infConsultaPagamentoReqCodBarras.codigo) &&
        Objects.equals(this.modoEntrada, infConsultaPagamentoReqCodBarras.modoEntrada);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, modoEntrada);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPagamentoReqCodBarras {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    modoEntrada: ").append(toIndentedString(modoEntrada)).append("\n");
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


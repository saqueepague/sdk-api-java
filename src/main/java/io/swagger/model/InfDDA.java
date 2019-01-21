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
 * Informações para consultas de DDA.
 */
@ApiModel(description = "Informações para consultas de DDA.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfDDA   {
  /**
   * Possível pagar parcialmente (00 = não, 01 = sim).
   */
  public enum AceitaPagamentoParcialEnum {
    _00("00"),
    
    _01("01");

    private String value;

    AceitaPagamentoParcialEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AceitaPagamentoParcialEnum fromValue(String text) {
      for (AceitaPagamentoParcialEnum b : AceitaPagamentoParcialEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("aceitaPagamentoParcial")
  private AceitaPagamentoParcialEnum aceitaPagamentoParcial = null;

  @JsonProperty("alegacao")
  private String alegacao = null;

  @JsonProperty("cedente")
  private String cedente = null;

  @JsonProperty("dataVencimento")
  private String dataVencimento = null;

  /**
   * Flag que indica se houve alteração (00 = não, 01 = sim).
   */
  public enum ModificadoEnum {
    _00("00"),
    
    _01("01");

    private String value;

    ModificadoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModificadoEnum fromValue(String text) {
      for (ModificadoEnum b : ModificadoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("modificado")
  private ModificadoEnum modificado = null;

  @JsonProperty("numDDA")
  private String numDDA = null;

  @JsonProperty("sacado")
  private String sacado = null;

  @JsonProperty("tipo")
  private String tipo = null;

  @JsonProperty("valor")
  private String valor = null;

  public InfDDA aceitaPagamentoParcial(AceitaPagamentoParcialEnum aceitaPagamentoParcial) {
    this.aceitaPagamentoParcial = aceitaPagamentoParcial;
    return this;
  }

  /**
   * Possível pagar parcialmente (00 = não, 01 = sim).
   * @return aceitaPagamentoParcial
  **/
  @ApiModelProperty(example = "00", value = "Possível pagar parcialmente (00 = não, 01 = sim).")


  public AceitaPagamentoParcialEnum getAceitaPagamentoParcial() {
    return aceitaPagamentoParcial;
  }

  public void setAceitaPagamentoParcial(AceitaPagamentoParcialEnum aceitaPagamentoParcial) {
    this.aceitaPagamentoParcial = aceitaPagamentoParcial;
  }

  public InfDDA alegacao(String alegacao) {
    this.alegacao = alegacao;
    return this;
  }

  /**
   * Alegação.
   * @return alegacao
  **/
  @ApiModelProperty(required = true, value = "Alegação.")
  @NotNull


  public String getAlegacao() {
    return alegacao;
  }

  public void setAlegacao(String alegacao) {
    this.alegacao = alegacao;
  }

  public InfDDA cedente(String cedente) {
    this.cedente = cedente;
    return this;
  }

  /**
   * Cedente.
   * @return cedente
  **/
  @ApiModelProperty(example = "Cedente", value = "Cedente.")

@Pattern(regexp="^.{0,40}$") 
  public String getCedente() {
    return cedente;
  }

  public void setCedente(String cedente) {
    this.cedente = cedente;
  }

  public InfDDA dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }

  /**
   * Data de vencimento (AAAAMMDD).
   * @return dataVencimento
  **/
  @ApiModelProperty(example = "20181122", required = true, value = "Data de vencimento (AAAAMMDD).")
  @NotNull

@Pattern(regexp="^\\d{8}$") 
  public String getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }

  public InfDDA modificado(ModificadoEnum modificado) {
    this.modificado = modificado;
    return this;
  }

  /**
   * Flag que indica se houve alteração (00 = não, 01 = sim).
   * @return modificado
  **/
  @ApiModelProperty(example = "00", required = true, value = "Flag que indica se houve alteração (00 = não, 01 = sim).")
  @NotNull


  public ModificadoEnum getModificado() {
    return modificado;
  }

  public void setModificado(ModificadoEnum modificado) {
    this.modificado = modificado;
  }

  public InfDDA numDDA(String numDDA) {
    this.numDDA = numDDA;
    return this;
  }

  /**
   * Identificador do DDA.
   * @return numDDA
  **/
  @ApiModelProperty(example = "7123", required = true, value = "Identificador do DDA.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getNumDDA() {
    return numDDA;
  }

  public void setNumDDA(String numDDA) {
    this.numDDA = numDDA;
  }

  public InfDDA sacado(String sacado) {
    this.sacado = sacado;
    return this;
  }

  /**
   * Sacado.
   * @return sacado
  **/
  @ApiModelProperty(required = true, value = "Sacado.")
  @NotNull


  public String getSacado() {
    return sacado;
  }

  public void setSacado(String sacado) {
    this.sacado = sacado;
  }

  public InfDDA tipo(String tipo) {
    this.tipo = tipo;
    return this;
  }

  /**
   * Tipo do DDA.
   * @return tipo
  **/
  @ApiModelProperty(required = true, value = "Tipo do DDA.")
  @NotNull


  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public InfDDA valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Valor do DDA (12 dígitos, incluindo centavos).
   * @return valor
  **/
  @ApiModelProperty(example = "000000005000", required = true, value = "Valor do DDA (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfDDA infDDA = (InfDDA) o;
    return Objects.equals(this.aceitaPagamentoParcial, infDDA.aceitaPagamentoParcial) &&
        Objects.equals(this.alegacao, infDDA.alegacao) &&
        Objects.equals(this.cedente, infDDA.cedente) &&
        Objects.equals(this.dataVencimento, infDDA.dataVencimento) &&
        Objects.equals(this.modificado, infDDA.modificado) &&
        Objects.equals(this.numDDA, infDDA.numDDA) &&
        Objects.equals(this.sacado, infDDA.sacado) &&
        Objects.equals(this.tipo, infDDA.tipo) &&
        Objects.equals(this.valor, infDDA.valor);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aceitaPagamentoParcial, alegacao, cedente, dataVencimento, modificado, numDDA, sacado, tipo, valor);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfDDA {\n");
    
    sb.append("    aceitaPagamentoParcial: ").append(toIndentedString(aceitaPagamentoParcial)).append("\n");
    sb.append("    alegacao: ").append(toIndentedString(alegacao)).append("\n");
    sb.append("    cedente: ").append(toIndentedString(cedente)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
    sb.append("    modificado: ").append(toIndentedString(modificado)).append("\n");
    sb.append("    numDDA: ").append(toIndentedString(numDDA)).append("\n");
    sb.append("    sacado: ").append(toIndentedString(sacado)).append("\n");
    sb.append("    tipo: ").append(toIndentedString(tipo)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
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


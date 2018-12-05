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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

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

  @JsonProperty("dataAgendamento")
  private String dataAgendamento = null;

  public InfConsultaPagamentoReqCodBarras codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Código de barras.
   * @return codigo
  **/
  @ApiModelProperty(value = "Código de barras.")

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
  @ApiModelProperty(example = "0", value = "Forma de entrada do código de barras (0 = escaneado, 1 = digitado).")


  public ModoEntradaEnum getModoEntrada() {
    return modoEntrada;
  }

  public void setModoEntrada(ModoEntradaEnum modoEntrada) {
    this.modoEntrada = modoEntrada;
  }

  public InfConsultaPagamentoReqCodBarras dataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
    return this;
  }

  /**
   * Data em que o pagamento do Boleto/Título será realizado. Utilizado para pagamento agendado (AAAAMMDD).
   * @return dataAgendamento
  **/
  @ApiModelProperty(example = "20181122", value = "Data em que o pagamento do Boleto/Título será realizado. Utilizado para pagamento agendado (AAAAMMDD).")

@Pattern(regexp="^\\d{8}$") 
  public String getDataAgendamento() {
    return dataAgendamento;
  }

  public void setDataAgendamento(String dataAgendamento) {
    this.dataAgendamento = dataAgendamento;
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
        Objects.equals(this.modoEntrada, infConsultaPagamentoReqCodBarras.modoEntrada) &&
        Objects.equals(this.dataAgendamento, infConsultaPagamentoReqCodBarras.dataAgendamento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, modoEntrada, dataAgendamento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPagamentoReqCodBarras {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    modoEntrada: ").append(toIndentedString(modoEntrada)).append("\n");
    sb.append("    dataAgendamento: ").append(toIndentedString(dataAgendamento)).append("\n");
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


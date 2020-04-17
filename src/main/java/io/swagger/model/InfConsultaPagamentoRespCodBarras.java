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
 * InfConsultaPagamentoRespCodBarras
 */
@Validated
public class InfConsultaPagamentoRespCodBarras   {
  @JsonProperty("codigo")
  private String codigo = null;

  @JsonProperty("dataVencimento")
  private String dataVencimento = null;

  public InfConsultaPagamentoRespCodBarras codigo(String codigo) {
    this.codigo = codigo;
    return this;
  }

  /**
   * Código de barras do documento.Necessário caso no ConsultaPagamento o objeto infConsultaPagamento tenha sido apenas com CPF.
   * @return codigo
  **/
  @ApiModelProperty(example = "12345678912346579812345678912345678913456789123456789", value = "Código de barras do documento.Necessário caso no ConsultaPagamento o objeto infConsultaPagamento tenha sido apenas com CPF.")

@Pattern(regexp="^\\d+$")   public String getCodigo() {
    return codigo;
  }

  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }

  public InfConsultaPagamentoRespCodBarras dataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
    return this;
  }

  /**
   * Data de vencimento (AAAAMMDD).
   * @return dataVencimento
  **/
  @ApiModelProperty(example = "20181122", value = "Data de vencimento (AAAAMMDD).")

@Pattern(regexp="^\\d{8}$")   public String getDataVencimento() {
    return dataVencimento;
  }

  public void setDataVencimento(String dataVencimento) {
    this.dataVencimento = dataVencimento;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaPagamentoRespCodBarras infConsultaPagamentoRespCodBarras = (InfConsultaPagamentoRespCodBarras) o;
    return Objects.equals(this.codigo, infConsultaPagamentoRespCodBarras.codigo) &&
        Objects.equals(this.dataVencimento, infConsultaPagamentoRespCodBarras.dataVencimento);
  }

  @Override
  public int hashCode() {
    return Objects.hash(codigo, dataVencimento);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPagamentoRespCodBarras {\n");
    
    sb.append("    codigo: ").append(toIndentedString(codigo)).append("\n");
    sb.append("    dataVencimento: ").append(toIndentedString(dataVencimento)).append("\n");
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

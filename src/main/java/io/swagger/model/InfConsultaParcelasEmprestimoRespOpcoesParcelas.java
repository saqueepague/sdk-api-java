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
 * InfConsultaParcelasEmprestimoRespOpcoesParcelas
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfConsultaParcelasEmprestimoRespOpcoesParcelas   {
  @JsonProperty("qntParcelas")
  private String qntParcelas = null;

  @JsonProperty("valorParcela")
  private String valorParcela = null;

  public InfConsultaParcelasEmprestimoRespOpcoesParcelas qntParcelas(String qntParcelas) {
    this.qntParcelas = qntParcelas;
    return this;
  }

  /**
   * Quantidade de parcelas do empréstimo.
   * @return qntParcelas
  **/
  @ApiModelProperty(example = "5", required = true, value = "Quantidade de parcelas do empréstimo.")
  @NotNull

@Pattern(regexp="^\\d+$") 
  public String getQntParcelas() {
    return qntParcelas;
  }

  public void setQntParcelas(String qntParcelas) {
    this.qntParcelas = qntParcelas;
  }

  public InfConsultaParcelasEmprestimoRespOpcoesParcelas valorParcela(String valorParcela) {
    this.valorParcela = valorParcela;
    return this;
  }

  /**
   * Valor de cada parcela do empréstimo (12 dígitos).
   * @return valorParcela
  **/
  @ApiModelProperty(example = "000000005000", required = true, value = "Valor de cada parcela do empréstimo (12 dígitos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValorParcela() {
    return valorParcela;
  }

  public void setValorParcela(String valorParcela) {
    this.valorParcela = valorParcela;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaParcelasEmprestimoRespOpcoesParcelas infConsultaParcelasEmprestimoRespOpcoesParcelas = (InfConsultaParcelasEmprestimoRespOpcoesParcelas) o;
    return Objects.equals(this.qntParcelas, infConsultaParcelasEmprestimoRespOpcoesParcelas.qntParcelas) &&
        Objects.equals(this.valorParcela, infConsultaParcelasEmprestimoRespOpcoesParcelas.valorParcela);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qntParcelas, valorParcela);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaParcelasEmprestimoRespOpcoesParcelas {\n");
    
    sb.append("    qntParcelas: ").append(toIndentedString(qntParcelas)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
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


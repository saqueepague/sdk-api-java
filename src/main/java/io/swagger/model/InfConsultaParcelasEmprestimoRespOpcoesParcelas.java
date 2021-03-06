package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaParcelasEmprestimoRespTributos;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InfConsultaParcelasEmprestimoRespOpcoesParcelas
 */
@Validated
public class InfConsultaParcelasEmprestimoRespOpcoesParcelas   {
  @JsonProperty("qntParcelas")
  private String qntParcelas = null;

  @JsonProperty("valorParcela")
  private String valorParcela = null;

  @JsonProperty("tributos")
  private InfConsultaParcelasEmprestimoRespTributos tributos = null;

  public InfConsultaParcelasEmprestimoRespOpcoesParcelas qntParcelas(String qntParcelas) {
    this.qntParcelas = qntParcelas;
    return this;
  }

  /**
   * Quantidade de parcelas do empréstimo.
   * @return qntParcelas
  **/
  @ApiModelProperty(example = "5", value = "Quantidade de parcelas do empréstimo.")

@Pattern(regexp="^\\d+$")   public String getQntParcelas() {
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
  @ApiModelProperty(example = "000000005000", value = "Valor de cada parcela do empréstimo (12 dígitos).")

@Pattern(regexp="^\\d{12}$")   public String getValorParcela() {
    return valorParcela;
  }

  public void setValorParcela(String valorParcela) {
    this.valorParcela = valorParcela;
  }

  public InfConsultaParcelasEmprestimoRespOpcoesParcelas tributos(InfConsultaParcelasEmprestimoRespTributos tributos) {
    this.tributos = tributos;
    return this;
  }

  /**
   * Get tributos
   * @return tributos
  **/
  @ApiModelProperty(value = "")

  @Valid
  public InfConsultaParcelasEmprestimoRespTributos getTributos() {
    return tributos;
  }

  public void setTributos(InfConsultaParcelasEmprestimoRespTributos tributos) {
    this.tributos = tributos;
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
        Objects.equals(this.valorParcela, infConsultaParcelasEmprestimoRespOpcoesParcelas.valorParcela) &&
        Objects.equals(this.tributos, infConsultaParcelasEmprestimoRespOpcoesParcelas.tributos);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qntParcelas, valorParcela, tributos);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaParcelasEmprestimoRespOpcoesParcelas {\n");
    
    sb.append("    qntParcelas: ").append(toIndentedString(qntParcelas)).append("\n");
    sb.append("    valorParcela: ").append(toIndentedString(valorParcela)).append("\n");
    sb.append("    tributos: ").append(toIndentedString(tributos)).append("\n");
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

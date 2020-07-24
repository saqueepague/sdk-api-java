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
 * Informações da requisição de consulta de condições de parcelamento de empréstimo.
 */
@ApiModel(description = "Informações da requisição de consulta de condições de parcelamento de empréstimo.")
@Validated
public class InfConsultaParcelasEmprestimoReq   {
  @JsonProperty("qtdParcelas")
  private String qtdParcelas = null;

  public InfConsultaParcelasEmprestimoReq qtdParcelas(String qtdParcelas) {
    this.qtdParcelas = qtdParcelas;
    return this;
  }

  /**
   * Quantidade de parcelas informadas pelo cliente.
   * @return qtdParcelas
  **/
  @ApiModelProperty(example = "320", value = "Quantidade de parcelas informadas pelo cliente.")

@Pattern(regexp="^\\d{03}$")   public String getQtdParcelas() {
    return qtdParcelas;
  }

  public void setQtdParcelas(String qtdParcelas) {
    this.qtdParcelas = qtdParcelas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaParcelasEmprestimoReq infConsultaParcelasEmprestimoReq = (InfConsultaParcelasEmprestimoReq) o;
    return Objects.equals(this.qtdParcelas, infConsultaParcelasEmprestimoReq.qtdParcelas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(qtdParcelas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaParcelasEmprestimoReq {\n");
    
    sb.append("    qtdParcelas: ").append(toIndentedString(qtdParcelas)).append("\n");
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

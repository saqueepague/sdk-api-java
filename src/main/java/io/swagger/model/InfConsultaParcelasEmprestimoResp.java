package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaParcelasEmprestimoRespOpcoesParcelas;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações da resposta da requisição de consulta de parcelas de empréstimo.
 */
@ApiModel(description = "Informações da resposta da requisição de consulta de parcelas de empréstimo.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfConsultaParcelasEmprestimoResp   {
  @JsonProperty("dataPrimeiraParcela")
  private String dataPrimeiraParcela = null;

  @JsonProperty("opcoesParcelas")
  @Valid
  private List<InfConsultaParcelasEmprestimoRespOpcoesParcelas> opcoesParcelas = new ArrayList<InfConsultaParcelasEmprestimoRespOpcoesParcelas>();

  public InfConsultaParcelasEmprestimoResp dataPrimeiraParcela(String dataPrimeiraParcela) {
    this.dataPrimeiraParcela = dataPrimeiraParcela;
    return this;
  }

  /**
   * Data da primeira parcela do empréstimo (AAAAMMDD).
   * @return dataPrimeiraParcela
  **/
  @ApiModelProperty(example = "20181122", required = true, value = "Data da primeira parcela do empréstimo (AAAAMMDD).")
  @NotNull

@Pattern(regexp="^\\d{8}$") 
  public String getDataPrimeiraParcela() {
    return dataPrimeiraParcela;
  }

  public void setDataPrimeiraParcela(String dataPrimeiraParcela) {
    this.dataPrimeiraParcela = dataPrimeiraParcela;
  }

  public InfConsultaParcelasEmprestimoResp opcoesParcelas(List<InfConsultaParcelasEmprestimoRespOpcoesParcelas> opcoesParcelas) {
    this.opcoesParcelas = opcoesParcelas;
    return this;
  }

  public InfConsultaParcelasEmprestimoResp addOpcoesParcelasItem(InfConsultaParcelasEmprestimoRespOpcoesParcelas opcoesParcelasItem) {
    this.opcoesParcelas.add(opcoesParcelasItem);
    return this;
  }

  /**
   * Get opcoesParcelas
   * @return opcoesParcelas
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<InfConsultaParcelasEmprestimoRespOpcoesParcelas> getOpcoesParcelas() {
    return opcoesParcelas;
  }

  public void setOpcoesParcelas(List<InfConsultaParcelasEmprestimoRespOpcoesParcelas> opcoesParcelas) {
    this.opcoesParcelas = opcoesParcelas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaParcelasEmprestimoResp infConsultaParcelasEmprestimoResp = (InfConsultaParcelasEmprestimoResp) o;
    return Objects.equals(this.dataPrimeiraParcela, infConsultaParcelasEmprestimoResp.dataPrimeiraParcela) &&
        Objects.equals(this.opcoesParcelas, infConsultaParcelasEmprestimoResp.opcoesParcelas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dataPrimeiraParcela, opcoesParcelas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaParcelasEmprestimoResp {\n");
    
    sb.append("    dataPrimeiraParcela: ").append(toIndentedString(dataPrimeiraParcela)).append("\n");
    sb.append("    opcoesParcelas: ").append(toIndentedString(opcoesParcelas)).append("\n");
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


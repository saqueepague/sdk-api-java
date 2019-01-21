package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaProdutosRecargaResp;
import io.swagger.model.InfTransacaoResp;
import io.swagger.model.Terminal;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ConsultaProdutosRecargaResp
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class ConsultaProdutosRecargaResp   {
  @JsonProperty("InfConsultaProdutosRecarga")
  private InfConsultaProdutosRecargaResp infConsultaProdutosRecarga = null;

  @JsonProperty("InfTransacao")
  private InfTransacaoResp infTransacao = null;

  @JsonProperty("Terminal")
  private Terminal terminal = null;

  public ConsultaProdutosRecargaResp infConsultaProdutosRecarga(InfConsultaProdutosRecargaResp infConsultaProdutosRecarga) {
    this.infConsultaProdutosRecarga = infConsultaProdutosRecarga;
    return this;
  }

  /**
   * Get infConsultaProdutosRecarga
   * @return infConsultaProdutosRecarga
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public InfConsultaProdutosRecargaResp getInfConsultaProdutosRecarga() {
    return infConsultaProdutosRecarga;
  }

  public void setInfConsultaProdutosRecarga(InfConsultaProdutosRecargaResp infConsultaProdutosRecarga) {
    this.infConsultaProdutosRecarga = infConsultaProdutosRecarga;
  }

  public ConsultaProdutosRecargaResp infTransacao(InfTransacaoResp infTransacao) {
    this.infTransacao = infTransacao;
    return this;
  }

  /**
   * Get infTransacao
   * @return infTransacao
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public InfTransacaoResp getInfTransacao() {
    return infTransacao;
  }

  public void setInfTransacao(InfTransacaoResp infTransacao) {
    this.infTransacao = infTransacao;
  }

  public ConsultaProdutosRecargaResp terminal(Terminal terminal) {
    this.terminal = terminal;
    return this;
  }

  /**
   * Get terminal
   * @return terminal
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public Terminal getTerminal() {
    return terminal;
  }

  public void setTerminal(Terminal terminal) {
    this.terminal = terminal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ConsultaProdutosRecargaResp consultaProdutosRecargaResp = (ConsultaProdutosRecargaResp) o;
    return Objects.equals(this.infConsultaProdutosRecarga, consultaProdutosRecargaResp.infConsultaProdutosRecarga) &&
        Objects.equals(this.infTransacao, consultaProdutosRecargaResp.infTransacao) &&
        Objects.equals(this.terminal, consultaProdutosRecargaResp.terminal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(infConsultaProdutosRecarga, infTransacao, terminal);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ConsultaProdutosRecargaResp {\n");
    
    sb.append("    infConsultaProdutosRecarga: ").append(toIndentedString(infConsultaProdutosRecarga)).append("\n");
    sb.append("    infTransacao: ").append(toIndentedString(infTransacao)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
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


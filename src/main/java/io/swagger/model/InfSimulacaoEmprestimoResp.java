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
 * Informações da resposta da requisição de simulação de empréstimo.
 */
@ApiModel(description = "Informações da resposta da requisição de simulação de empréstimo.")
@Validated
public class InfSimulacaoEmprestimoResp   {
  @JsonProperty("mensagem")
  private String mensagem = null;

  public InfSimulacaoEmprestimoResp mensagem(String mensagem) {
    this.mensagem = mensagem;
    return this;
  }

  /**
   * Mensagem informativa para ser mostrada ao cliente após a simulação. Os caracteres \"</\" indicam uma quebra de linha.
   * @return mensagem
  **/
  @ApiModelProperty(example = "O pagamento sera em 4 prestacoes de  306,90     </Juros  6,29% CET (ao mes)   110,11% CET (ao ano)</", value = "Mensagem informativa para ser mostrada ao cliente após a simulação. Os caracteres \"</\" indicam uma quebra de linha.")

  public String getMensagem() {
    return mensagem;
  }

  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfSimulacaoEmprestimoResp infSimulacaoEmprestimoResp = (InfSimulacaoEmprestimoResp) o;
    return Objects.equals(this.mensagem, infSimulacaoEmprestimoResp.mensagem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mensagem);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfSimulacaoEmprestimoResp {\n");
    
    sb.append("    mensagem: ").append(toIndentedString(mensagem)).append("\n");
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

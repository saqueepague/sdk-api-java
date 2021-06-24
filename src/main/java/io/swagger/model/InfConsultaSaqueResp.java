package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.WithdrawConsultQuestionObj;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações da resposta de requisição de consulta de saque.
 */
@ApiModel(description = "Informações da resposta de requisição de consulta de saque.")
@Validated
public class InfConsultaSaqueResp   {
  @JsonProperty("nomeCliente")
  private String nomeCliente = null;

  @JsonProperty("perguntas")
  @Valid
  private List<WithdrawConsultQuestionObj> perguntas = null;

  @JsonProperty("qrCode")
  private String qrCode = null;

  @JsonProperty("txId")
  private String txId = null;

  public InfConsultaSaqueResp nomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
    return this;
  }

  /**
   * Nome do cliente titular da conta.
   * @return nomeCliente
  **/
  @ApiModelProperty(example = "Carl Edward Sagan", value = "Nome do cliente titular da conta.")

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public InfConsultaSaqueResp perguntas(List<WithdrawConsultQuestionObj> perguntas) {
    this.perguntas = perguntas;
    return this;
  }

  public InfConsultaSaqueResp addPerguntasItem(WithdrawConsultQuestionObj perguntasItem) {
    if (this.perguntas == null) {
      this.perguntas = new ArrayList<WithdrawConsultQuestionObj>();
    }
    this.perguntas.add(perguntasItem);
    return this;
  }

  /**
   * Lista de possíveis perguntas a serem mostradas para o usuário para autorizar o saque.
   * @return perguntas
  **/
  @ApiModelProperty(value = "Lista de possíveis perguntas a serem mostradas para o usuário para autorizar o saque.")
  @Valid
  public List<WithdrawConsultQuestionObj> getPerguntas() {
    return perguntas;
  }

  public void setPerguntas(List<WithdrawConsultQuestionObj> perguntas) {
    this.perguntas = perguntas;
  }

  public InfConsultaSaqueResp qrCode(String qrCode) {
    this.qrCode = qrCode;
    return this;
  }

  /**
   * Em caso de uma solicitação de saque usando QR Code, retornar nesse campo o seu base64.
   * @return qrCode
  **/
  @ApiModelProperty(example = "eyAidmFsb3IiOiIxMDAwIn0=", value = "Em caso de uma solicitação de saque usando QR Code, retornar nesse campo o seu base64.")

  public String getQrCode() {
    return qrCode;
  }

  public void setQrCode(String qrCode) {
    this.qrCode = qrCode;
  }

  public InfConsultaSaqueResp txId(String txId) {
    this.txId = txId;
    return this;
  }

  /**
   * Em caso de uma solicitação de saque usando QR Code, retornar nesse campo o id pix da transação. Caso não seja usada a infraestrutura do pix para a geração do QR Code, o campo é opcional.
   * @return txId
  **/
  @ApiModelProperty(example = "abcd1234", value = "Em caso de uma solicitação de saque usando QR Code, retornar nesse campo o id pix da transação. Caso não seja usada a infraestrutura do pix para a geração do QR Code, o campo é opcional.")

  public String getTxId() {
    return txId;
  }

  public void setTxId(String txId) {
    this.txId = txId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaSaqueResp infConsultaSaqueResp = (InfConsultaSaqueResp) o;
    return Objects.equals(this.nomeCliente, infConsultaSaqueResp.nomeCliente) &&
        Objects.equals(this.perguntas, infConsultaSaqueResp.perguntas) &&
        Objects.equals(this.qrCode, infConsultaSaqueResp.qrCode) &&
        Objects.equals(this.txId, infConsultaSaqueResp.txId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nomeCliente, perguntas, qrCode, txId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaSaqueResp {\n");
    
    sb.append("    nomeCliente: ").append(toIndentedString(nomeCliente)).append("\n");
    sb.append("    perguntas: ").append(toIndentedString(perguntas)).append("\n");
    sb.append("    qrCode: ").append(toIndentedString(qrCode)).append("\n");
    sb.append("    txId: ").append(toIndentedString(txId)).append("\n");
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

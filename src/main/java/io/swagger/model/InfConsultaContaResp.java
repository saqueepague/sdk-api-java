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
 * Informações da resposta da requisição de consulta de conta do favorecido.
 */
@ApiModel(description = "Informações da resposta da requisição de consulta de conta do favorecido.")
@Validated
public class InfConsultaContaResp   {
  /**
   * Igual à requisição.
   */
  public enum ModalidadeDepositoEnum {
    _00("00"),
    
    _01("01");

    private String value;

    ModalidadeDepositoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModalidadeDepositoEnum fromValue(String text) {
      for (ModalidadeDepositoEnum b : ModalidadeDepositoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("modalidadeDeposito")
  private ModalidadeDepositoEnum modalidadeDeposito = null;

  @JsonProperty("nomeCliente")
  private String nomeCliente = null;

  /**
   * Indica se deve ser solicitado o CPF/CNPJ do depositante (00 = Não / 01 = Sim).
   */
  public enum SolicDocEnum {
    _00("00"),
    
    _01("01");

    private String value;

    SolicDocEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SolicDocEnum fromValue(String text) {
      for (SolicDocEnum b : SolicDocEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("solicDoc")
  private SolicDocEnum solicDoc = null;

  /**
   * Indica é permitido fazer depósito nessa conta (00 = Não / 01 = Sim).
   */
  public enum HabilitaDepositoEnum {
    _00("00"),
    
    _01("01");

    private String value;

    HabilitaDepositoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static HabilitaDepositoEnum fromValue(String text) {
      for (HabilitaDepositoEnum b : HabilitaDepositoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("habilitaDeposito")
  private HabilitaDepositoEnum habilitaDeposito = null;

  /**
   * Indica a operação de depósito deve ser identificada (00 = Não / 01 = Sim).
   */
  public enum DepositoIdentificadoEnum {
    _00("00"),
    
    _01("01");

    private String value;

    DepositoIdentificadoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static DepositoIdentificadoEnum fromValue(String text) {
      for (DepositoIdentificadoEnum b : DepositoIdentificadoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }
  @JsonProperty("depositoIdentificado")
  private DepositoIdentificadoEnum depositoIdentificado = null;

  public InfConsultaContaResp modalidadeDeposito(ModalidadeDepositoEnum modalidadeDeposito) {
    this.modalidadeDeposito = modalidadeDeposito;
    return this;
  }

  /**
   * Igual à requisição.
   * @return modalidadeDeposito
  **/
  @ApiModelProperty(example = "00", required = true, value = "Igual à requisição.")
  @NotNull

  public ModalidadeDepositoEnum getModalidadeDeposito() {
    return modalidadeDeposito;
  }

  public void setModalidadeDeposito(ModalidadeDepositoEnum modalidadeDeposito) {
    this.modalidadeDeposito = modalidadeDeposito;
  }

  public InfConsultaContaResp nomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
    return this;
  }

  /**
   * Nome do cliente titular da conta.
   * @return nomeCliente
  **/
  @ApiModelProperty(example = "Carl Edward Sagan", required = true, value = "Nome do cliente titular da conta.")
  @NotNull

  public String getNomeCliente() {
    return nomeCliente;
  }

  public void setNomeCliente(String nomeCliente) {
    this.nomeCliente = nomeCliente;
  }

  public InfConsultaContaResp solicDoc(SolicDocEnum solicDoc) {
    this.solicDoc = solicDoc;
    return this;
  }

  /**
   * Indica se deve ser solicitado o CPF/CNPJ do depositante (00 = Não / 01 = Sim).
   * @return solicDoc
  **/
  @ApiModelProperty(example = "00", required = true, value = "Indica se deve ser solicitado o CPF/CNPJ do depositante (00 = Não / 01 = Sim).")
  @NotNull

  public SolicDocEnum getSolicDoc() {
    return solicDoc;
  }

  public void setSolicDoc(SolicDocEnum solicDoc) {
    this.solicDoc = solicDoc;
  }

  public InfConsultaContaResp habilitaDeposito(HabilitaDepositoEnum habilitaDeposito) {
    this.habilitaDeposito = habilitaDeposito;
    return this;
  }

  /**
   * Indica é permitido fazer depósito nessa conta (00 = Não / 01 = Sim).
   * @return habilitaDeposito
  **/
  @ApiModelProperty(example = "01", required = true, value = "Indica é permitido fazer depósito nessa conta (00 = Não / 01 = Sim).")
  @NotNull

  public HabilitaDepositoEnum getHabilitaDeposito() {
    return habilitaDeposito;
  }

  public void setHabilitaDeposito(HabilitaDepositoEnum habilitaDeposito) {
    this.habilitaDeposito = habilitaDeposito;
  }

  public InfConsultaContaResp depositoIdentificado(DepositoIdentificadoEnum depositoIdentificado) {
    this.depositoIdentificado = depositoIdentificado;
    return this;
  }

  /**
   * Indica a operação de depósito deve ser identificada (00 = Não / 01 = Sim).
   * @return depositoIdentificado
  **/
  @ApiModelProperty(example = "00", required = true, value = "Indica a operação de depósito deve ser identificada (00 = Não / 01 = Sim).")
  @NotNull

  public DepositoIdentificadoEnum getDepositoIdentificado() {
    return depositoIdentificado;
  }

  public void setDepositoIdentificado(DepositoIdentificadoEnum depositoIdentificado) {
    this.depositoIdentificado = depositoIdentificado;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaContaResp infConsultaContaResp = (InfConsultaContaResp) o;
    return Objects.equals(this.modalidadeDeposito, infConsultaContaResp.modalidadeDeposito) &&
        Objects.equals(this.nomeCliente, infConsultaContaResp.nomeCliente) &&
        Objects.equals(this.solicDoc, infConsultaContaResp.solicDoc) &&
        Objects.equals(this.habilitaDeposito, infConsultaContaResp.habilitaDeposito) &&
        Objects.equals(this.depositoIdentificado, infConsultaContaResp.depositoIdentificado);
  }

  @Override
  public int hashCode() {
    return Objects.hash(modalidadeDeposito, nomeCliente, solicDoc, habilitaDeposito, depositoIdentificado);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaContaResp {\n");
    
    sb.append("    modalidadeDeposito: ").append(toIndentedString(modalidadeDeposito)).append("\n");
    sb.append("    nomeCliente: ").append(toIndentedString(nomeCliente)).append("\n");
    sb.append("    solicDoc: ").append(toIndentedString(solicDoc)).append("\n");
    sb.append("    habilitaDeposito: ").append(toIndentedString(habilitaDeposito)).append("\n");
    sb.append("    depositoIdentificado: ").append(toIndentedString(depositoIdentificado)).append("\n");
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

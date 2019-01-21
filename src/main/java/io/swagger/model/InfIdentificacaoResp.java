package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfIdentificacaoRespIdPositiva;
import io.swagger.model.InfIdentificacaoRespPerguntas;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações da resposta da requisição de identificação.
 */
@ApiModel(description = "Informações da resposta da requisição de identificação.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfIdentificacaoResp   {
  @JsonProperty("frase")
  private String frase = null;

  @JsonProperty("idPositiva")
  @Valid
  private List<InfIdentificacaoRespIdPositiva> idPositiva = null;

  /**
   * Informa se o cliente deve se autenticar utilizando token (00 = não, 01 = sim).
   */
  public enum PedirTokenEnum {
    _00("00"),
    
    _01("01");

    private String value;

    PedirTokenEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static PedirTokenEnum fromValue(String text) {
      for (PedirTokenEnum b : PedirTokenEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("pedirToken")
  private PedirTokenEnum pedirToken = null;

  @JsonProperty("perguntas")
  @Valid
  private List<InfIdentificacaoRespPerguntas> perguntas = null;

  @JsonProperty("saldo")
  private String saldo = null;

  @JsonProperty("transacValidas")
  private String transacValidas = null;

  public InfIdentificacaoResp frase(String frase) {
    this.frase = frase;
    return this;
  }

  /**
   * Frase a ser mostrada para o cliente quando pedir o token ou identificacao positiva.
   * @return frase
  **/
  @ApiModelProperty(example = "Gere um token pelo Unicred Mobile e digite-o:", value = "Frase a ser mostrada para o cliente quando pedir o token ou identificacao positiva.")


  public String getFrase() {
    return frase;
  }

  public void setFrase(String frase) {
    this.frase = frase;
  }

  public InfIdentificacaoResp idPositiva(List<InfIdentificacaoRespIdPositiva> idPositiva) {
    this.idPositiva = idPositiva;
    return this;
  }

  public InfIdentificacaoResp addIdPositivaItem(InfIdentificacaoRespIdPositiva idPositivaItem) {
    if (this.idPositiva == null) {
      this.idPositiva = new ArrayList<InfIdentificacaoRespIdPositiva>();
    }
    this.idPositiva.add(idPositivaItem);
    return this;
  }

  /**
   * Opções de letra/sílabas a serem mostradas para o cliente, caso ele use identificação positiva.
   * @return idPositiva
  **/
  @ApiModelProperty(value = "Opções de letra/sílabas a serem mostradas para o cliente, caso ele use identificação positiva.")

  @Valid

  public List<InfIdentificacaoRespIdPositiva> getIdPositiva() {
    return idPositiva;
  }

  public void setIdPositiva(List<InfIdentificacaoRespIdPositiva> idPositiva) {
    this.idPositiva = idPositiva;
  }

  public InfIdentificacaoResp pedirToken(PedirTokenEnum pedirToken) {
    this.pedirToken = pedirToken;
    return this;
  }

  /**
   * Informa se o cliente deve se autenticar utilizando token (00 = não, 01 = sim).
   * @return pedirToken
  **/
  @ApiModelProperty(example = "01", required = true, value = "Informa se o cliente deve se autenticar utilizando token (00 = não, 01 = sim).")
  @NotNull


  public PedirTokenEnum getPedirToken() {
    return pedirToken;
  }

  public void setPedirToken(PedirTokenEnum pedirToken) {
    this.pedirToken = pedirToken;
  }

  public InfIdentificacaoResp perguntas(List<InfIdentificacaoRespPerguntas> perguntas) {
    this.perguntas = perguntas;
    return this;
  }

  public InfIdentificacaoResp addPerguntasItem(InfIdentificacaoRespPerguntas perguntasItem) {
    if (this.perguntas == null) {
      this.perguntas = new ArrayList<InfIdentificacaoRespPerguntas>();
    }
    this.perguntas.add(perguntasItem);
    return this;
  }

  /**
   * Lista de possíveis perguntas a serem mostradas para o usuário para autenticá-lo.
   * @return perguntas
  **/
  @ApiModelProperty(value = "Lista de possíveis perguntas a serem mostradas para o usuário para autenticá-lo.")

  @Valid

  public List<InfIdentificacaoRespPerguntas> getPerguntas() {
    return perguntas;
  }

  public void setPerguntas(List<InfIdentificacaoRespPerguntas> perguntas) {
    this.perguntas = perguntas;
  }

  public InfIdentificacaoResp saldo(String saldo) {
    this.saldo = saldo;
    return this;
  }

  /**
   * Saldo do cliente a ser mostrado na tela (12 dígitos).
   * @return saldo
  **/
  @ApiModelProperty(example = "000000005000", value = "Saldo do cliente a ser mostrado na tela (12 dígitos).")

@Pattern(regexp="^d{12}$") 
  public String getSaldo() {
    return saldo;
  }

  public void setSaldo(String saldo) {
    this.saldo = saldo;
  }

  public InfIdentificacaoResp transacValidas(String transacValidas) {
    this.transacValidas = transacValidas;
    return this;
  }

  /**
   * Transações habilitadas para o cartão utilizado. Enviar os cdProcs concatenados (6 dígitos cada).
   * @return transacValidas
  **/
  @ApiModelProperty(example = "068101068010", required = true, value = "Transações habilitadas para o cartão utilizado. Enviar os cdProcs concatenados (6 dígitos cada).")
  @NotNull

@Pattern(regexp="^(?:\\d{6})*$") 
  public String getTransacValidas() {
    return transacValidas;
  }

  public void setTransacValidas(String transacValidas) {
    this.transacValidas = transacValidas;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfIdentificacaoResp infIdentificacaoResp = (InfIdentificacaoResp) o;
    return Objects.equals(this.frase, infIdentificacaoResp.frase) &&
        Objects.equals(this.idPositiva, infIdentificacaoResp.idPositiva) &&
        Objects.equals(this.pedirToken, infIdentificacaoResp.pedirToken) &&
        Objects.equals(this.perguntas, infIdentificacaoResp.perguntas) &&
        Objects.equals(this.saldo, infIdentificacaoResp.saldo) &&
        Objects.equals(this.transacValidas, infIdentificacaoResp.transacValidas);
  }

  @Override
  public int hashCode() {
    return Objects.hash(frase, idPositiva, pedirToken, perguntas, saldo, transacValidas);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfIdentificacaoResp {\n");
    
    sb.append("    frase: ").append(toIndentedString(frase)).append("\n");
    sb.append("    idPositiva: ").append(toIndentedString(idPositiva)).append("\n");
    sb.append("    pedirToken: ").append(toIndentedString(pedirToken)).append("\n");
    sb.append("    perguntas: ").append(toIndentedString(perguntas)).append("\n");
    sb.append("    saldo: ").append(toIndentedString(saldo)).append("\n");
    sb.append("    transacValidas: ").append(toIndentedString(transacValidas)).append("\n");
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


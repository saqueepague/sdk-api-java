package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.PositiveIdQuestionObj;
import io.swagger.model.PositiveIdScreenObj;
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
public class InfIdentificacaoResp   {
  @JsonProperty("numAgencia")
  private String numAgencia = null;

  @JsonProperty("numConta")
  private String numConta = null;

  @JsonProperty("transacValidas")
  private String transacValidas = null;

  @JsonProperty("idPositiva")
  @Valid
  private List<PositiveIdScreenObj> idPositiva = null;

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

  @JsonProperty("frase")
  private String frase = null;

  @JsonProperty("saldo")
  private String saldo = null;

  @JsonProperty("perguntas")
  @Valid
  private List<PositiveIdQuestionObj> perguntas = null;

  @JsonProperty("valorLimiteFavorecido")
  private String valorLimiteFavorecido = null;

  public InfIdentificacaoResp numAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
    return this;
  }

  /**
   * número da Agência identificada (usado em operações em própria conta para o usuário não precisar preencher os dados). *Este campo é obrigatério apenas para bancos.
   * @return numAgencia
  **/
  @ApiModelProperty(example = "4029", value = "número da Agência identificada (usado em operações em própria conta para o usuário não precisar preencher os dados). *Este campo é obrigatério apenas para bancos.")

@Pattern(regexp="^\\d+$")   public String getNumAgencia() {
    return numAgencia;
  }

  public void setNumAgencia(String numAgencia) {
    this.numAgencia = numAgencia;
  }

  public InfIdentificacaoResp numConta(String numConta) {
    this.numConta = numConta;
    return this;
  }

  /**
   * número da conta identificada (usado em operações em própria conta para o usuário não precisar preencher os dados). *Este campo é obrigatério apenas para bancos.
   * @return numConta
  **/
  @ApiModelProperty(example = "0082348296", value = "número da conta identificada (usado em operações em própria conta para o usuário não precisar preencher os dados). *Este campo é obrigatério apenas para bancos.")

@Pattern(regexp="^\\d+$")   public String getNumConta() {
    return numConta;
  }

  public void setNumConta(String numConta) {
    this.numConta = numConta;
  }

  public InfIdentificacaoResp transacValidas(String transacValidas) {
    this.transacValidas = transacValidas;
    return this;
  }

  /**
   * Códigos de processamento das transações habilitadas para o cliente concatenados (6 dígitos cada Código).
   * @return transacValidas
  **/
  @ApiModelProperty(example = "068101068010", required = true, value = "Códigos de processamento das transações habilitadas para o cliente concatenados (6 dígitos cada Código).")
  @NotNull

@Pattern(regexp="^(?:\\d{6})*$")   public String getTransacValidas() {
    return transacValidas;
  }

  public void setTransacValidas(String transacValidas) {
    this.transacValidas = transacValidas;
  }

  public InfIdentificacaoResp idPositiva(List<PositiveIdScreenObj> idPositiva) {
    this.idPositiva = idPositiva;
    return this;
  }

  public InfIdentificacaoResp addIdPositivaItem(PositiveIdScreenObj idPositivaItem) {
    if (this.idPositiva == null) {
      this.idPositiva = new ArrayList<PositiveIdScreenObj>();
    }
    this.idPositiva.add(idPositivaItem);
    return this;
  }

  /**
   * Opções de letras/sílabas a serem mostradas para o cliente, caso ele use identificação positiva.
   * @return idPositiva
  **/
  @ApiModelProperty(value = "Opções de letras/sílabas a serem mostradas para o cliente, caso ele use identificação positiva.")
  @Valid
  public List<PositiveIdScreenObj> getIdPositiva() {
    return idPositiva;
  }

  public void setIdPositiva(List<PositiveIdScreenObj> idPositiva) {
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

  public InfIdentificacaoResp frase(String frase) {
    this.frase = frase;
    return this;
  }

  /**
   * Frase a ser mostrada para o cliente na tela de coleta do token ou identificacao positiva.(máximo 28 caracteres)
   * @return frase
  **/
  @ApiModelProperty(example = "Informe o token gerado em seu app:", value = "Frase a ser mostrada para o cliente na tela de coleta do token ou identificacao positiva.(máximo 28 caracteres)")

  public String getFrase() {
    return frase;
  }

  public void setFrase(String frase) {
    this.frase = frase;
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

@Pattern(regexp="^\\d{12}$")   public String getSaldo() {
    return saldo;
  }

  public void setSaldo(String saldo) {
    this.saldo = saldo;
  }

  public InfIdentificacaoResp perguntas(List<PositiveIdQuestionObj> perguntas) {
    this.perguntas = perguntas;
    return this;
  }

  public InfIdentificacaoResp addPerguntasItem(PositiveIdQuestionObj perguntasItem) {
    if (this.perguntas == null) {
      this.perguntas = new ArrayList<PositiveIdQuestionObj>();
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
  public List<PositiveIdQuestionObj> getPerguntas() {
    return perguntas;
  }

  public void setPerguntas(List<PositiveIdQuestionObj> perguntas) {
    this.perguntas = perguntas;
  }

  public InfIdentificacaoResp valorLimiteFavorecido(String valorLimiteFavorecido) {
    this.valorLimiteFavorecido = valorLimiteFavorecido;
    return this;
  }

  /**
   * Valor de limite para a TED (12 dígitos, incluindo centavos). Quando ultrapassar esse valor retornado pelo parceiro, devemos enviar a transação /consultaFavorecido.
   * @return valorLimiteFavorecido
  **/
  @ApiModelProperty(example = "000000030000", value = "Valor de limite para a TED (12 dígitos, incluindo centavos). Quando ultrapassar esse valor retornado pelo parceiro, devemos enviar a transação /consultaFavorecido.")

@Pattern(regexp="^\\d{12}$")   public String getValorLimiteFavorecido() {
    return valorLimiteFavorecido;
  }

  public void setValorLimiteFavorecido(String valorLimiteFavorecido) {
    this.valorLimiteFavorecido = valorLimiteFavorecido;
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
    return Objects.equals(this.numAgencia, infIdentificacaoResp.numAgencia) &&
        Objects.equals(this.numConta, infIdentificacaoResp.numConta) &&
        Objects.equals(this.transacValidas, infIdentificacaoResp.transacValidas) &&
        Objects.equals(this.idPositiva, infIdentificacaoResp.idPositiva) &&
        Objects.equals(this.pedirToken, infIdentificacaoResp.pedirToken) &&
        Objects.equals(this.frase, infIdentificacaoResp.frase) &&
        Objects.equals(this.saldo, infIdentificacaoResp.saldo) &&
        Objects.equals(this.perguntas, infIdentificacaoResp.perguntas) &&
        Objects.equals(this.valorLimiteFavorecido, infIdentificacaoResp.valorLimiteFavorecido);
  }

  @Override
  public int hashCode() {
    return Objects.hash(numAgencia, numConta, transacValidas, idPositiva, pedirToken, frase, saldo, perguntas, valorLimiteFavorecido);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfIdentificacaoResp {\n");
    
    sb.append("    numAgencia: ").append(toIndentedString(numAgencia)).append("\n");
    sb.append("    numConta: ").append(toIndentedString(numConta)).append("\n");
    sb.append("    transacValidas: ").append(toIndentedString(transacValidas)).append("\n");
    sb.append("    idPositiva: ").append(toIndentedString(idPositiva)).append("\n");
    sb.append("    pedirToken: ").append(toIndentedString(pedirToken)).append("\n");
    sb.append("    frase: ").append(toIndentedString(frase)).append("\n");
    sb.append("    saldo: ").append(toIndentedString(saldo)).append("\n");
    sb.append("    perguntas: ").append(toIndentedString(perguntas)).append("\n");
    sb.append("    valorLimiteFavorecido: ").append(toIndentedString(valorLimiteFavorecido)).append("\n");
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

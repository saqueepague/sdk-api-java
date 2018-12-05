package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaPagamentoRespCip;
import io.swagger.model.InfDDA;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Informações da resposta da requisição de consulta de pagamento.
 */
@ApiModel(description = "Informações da resposta da requisição de consulta de pagamento.")
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2018-12-05T18:08:56.087Z[GMT]")

public class InfConsultaPagamentoResp   {
  @JsonProperty("valor")
  private String valor = null;

  @JsonProperty("cedente")
  private String cedente = null;

  @JsonProperty("dataPagamento")
  private String dataPagamento = null;

  /**
   * Flag que indica se houve alteração (00 = não, 01 = sim).
   */
  public enum ModificadoEnum {
    _00("00"),
    
    _01("01");

    private String value;

    ModificadoEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static ModificadoEnum fromValue(String text) {
      for (ModificadoEnum b : ModificadoEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("modificado")
  private ModificadoEnum modificado = null;

  @JsonProperty("cnpjFavorecidoDoacao")
  private String cnpjFavorecidoDoacao = null;

  @JsonProperty("nomeFavorecidoDoacao")
  private String nomeFavorecidoDoacao = null;

  @JsonProperty("desconto")
  private String desconto = null;

  /**
   * Novo sistema de cobrança do pagamento de contas (00 = não, 01 = sim).
   */
  public enum SistemaCobrancaEnum {
    _00("00"),
    
    _01("01");

    private String value;

    SistemaCobrancaEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static SistemaCobrancaEnum fromValue(String text) {
      for (SistemaCobrancaEnum b : SistemaCobrancaEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("sistemaCobranca")
  private SistemaCobrancaEnum sistemaCobranca = null;

  @JsonProperty("cip")
  private InfConsultaPagamentoRespCip cip = null;

  /**
   * Aceita pagamento parcial (00 = não, 00 = sim).
   */
  public enum AceitaPagamentoParcialEnum {
    _00("00"),
    
    _01("01");

    private String value;

    AceitaPagamentoParcialEnum(String value) {
      this.value = value;
    }

    @Override
    @JsonValue
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static AceitaPagamentoParcialEnum fromValue(String text) {
      for (AceitaPagamentoParcialEnum b : AceitaPagamentoParcialEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
  }

  @JsonProperty("aceitaPagamentoParcial")
  private AceitaPagamentoParcialEnum aceitaPagamentoParcial = null;

  @JsonProperty("valorMinimo")
  private String valorMinimo = null;

  @JsonProperty("dda")
  @Valid
  private List<InfDDA> dda = null;

  public InfConsultaPagamentoResp valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Valor do pagamento (12 dígitos, incluindo centavos).
   * @return valor
  **/
  @ApiModelProperty(example = "000000005000", value = "Valor do pagamento (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{23}$") 
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public InfConsultaPagamentoResp cedente(String cedente) {
    this.cedente = cedente;
    return this;
  }

  /**
   * Cedente (até 40 caracteres).
   * @return cedente
  **/
  @ApiModelProperty(example = "Cedente", value = "Cedente (até 40 caracteres).")

@Pattern(regexp="^.{0,40}$") 
  public String getCedente() {
    return cedente;
  }

  public void setCedente(String cedente) {
    this.cedente = cedente;
  }

  public InfConsultaPagamentoResp dataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
    return this;
  }

  /**
   * Data de pagamento atualizada pelo host (AAAAMMDD).
   * @return dataPagamento
  **/
  @ApiModelProperty(example = "20181122", value = "Data de pagamento atualizada pelo host (AAAAMMDD).")

@Pattern(regexp="^\\d{8}$") 
  public String getDataPagamento() {
    return dataPagamento;
  }

  public void setDataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
  }

  public InfConsultaPagamentoResp modificado(ModificadoEnum modificado) {
    this.modificado = modificado;
    return this;
  }

  /**
   * Flag que indica se houve alteração (00 = não, 01 = sim).
   * @return modificado
  **/
  @ApiModelProperty(example = "01", value = "Flag que indica se houve alteração (00 = não, 01 = sim).")


  public ModificadoEnum getModificado() {
    return modificado;
  }

  public void setModificado(ModificadoEnum modificado) {
    this.modificado = modificado;
  }

  public InfConsultaPagamentoResp cnpjFavorecidoDoacao(String cnpjFavorecidoDoacao) {
    this.cnpjFavorecidoDoacao = cnpjFavorecidoDoacao;
    return this;
  }

  /**
   * CNPJ da instituição favorecida para doação (pagamento em dinheiro, obrigatório quando sem cartão).
   * @return cnpjFavorecidoDoacao
  **/
  @ApiModelProperty(value = "CNPJ da instituição favorecida para doação (pagamento em dinheiro, obrigatório quando sem cartão).")


  public String getCnpjFavorecidoDoacao() {
    return cnpjFavorecidoDoacao;
  }

  public void setCnpjFavorecidoDoacao(String cnpjFavorecidoDoacao) {
    this.cnpjFavorecidoDoacao = cnpjFavorecidoDoacao;
  }

  public InfConsultaPagamentoResp nomeFavorecidoDoacao(String nomeFavorecidoDoacao) {
    this.nomeFavorecidoDoacao = nomeFavorecidoDoacao;
    return this;
  }

  /**
   * Nome da instituição favorecida para doação (pagamento em dinheiro, obrigatório quando sem cartão, até 60 caracteres).
   * @return nomeFavorecidoDoacao
  **/
  @ApiModelProperty(example = "Carl Edward Sagan", value = "Nome da instituição favorecida para doação (pagamento em dinheiro, obrigatório quando sem cartão, até 60 caracteres).")

@Pattern(regexp="^.{0,60}$") 
  public String getNomeFavorecidoDoacao() {
    return nomeFavorecidoDoacao;
  }

  public void setNomeFavorecidoDoacao(String nomeFavorecidoDoacao) {
    this.nomeFavorecidoDoacao = nomeFavorecidoDoacao;
  }

  public InfConsultaPagamentoResp desconto(String desconto) {
    this.desconto = desconto;
    return this;
  }

  /**
   * Valor de desconto (12 dígitos, incluindo centavos).
   * @return desconto
  **/
  @ApiModelProperty(example = "000000000499", value = "Valor de desconto (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getDesconto() {
    return desconto;
  }

  public void setDesconto(String desconto) {
    this.desconto = desconto;
  }

  public InfConsultaPagamentoResp sistemaCobranca(SistemaCobrancaEnum sistemaCobranca) {
    this.sistemaCobranca = sistemaCobranca;
    return this;
  }

  /**
   * Novo sistema de cobrança do pagamento de contas (00 = não, 01 = sim).
   * @return sistemaCobranca
  **/
  @ApiModelProperty(example = "00", value = "Novo sistema de cobrança do pagamento de contas (00 = não, 01 = sim).")


  public SistemaCobrancaEnum getSistemaCobranca() {
    return sistemaCobranca;
  }

  public void setSistemaCobranca(SistemaCobrancaEnum sistemaCobranca) {
    this.sistemaCobranca = sistemaCobranca;
  }

  public InfConsultaPagamentoResp cip(InfConsultaPagamentoRespCip cip) {
    this.cip = cip;
    return this;
  }

  /**
   * Get cip
   * @return cip
  **/
  @ApiModelProperty(value = "")

  @Valid

  public InfConsultaPagamentoRespCip getCip() {
    return cip;
  }

  public void setCip(InfConsultaPagamentoRespCip cip) {
    this.cip = cip;
  }

  public InfConsultaPagamentoResp aceitaPagamentoParcial(AceitaPagamentoParcialEnum aceitaPagamentoParcial) {
    this.aceitaPagamentoParcial = aceitaPagamentoParcial;
    return this;
  }

  /**
   * Aceita pagamento parcial (00 = não, 00 = sim).
   * @return aceitaPagamentoParcial
  **/
  @ApiModelProperty(example = "01", value = "Aceita pagamento parcial (00 = não, 00 = sim).")


  public AceitaPagamentoParcialEnum getAceitaPagamentoParcial() {
    return aceitaPagamentoParcial;
  }

  public void setAceitaPagamentoParcial(AceitaPagamentoParcialEnum aceitaPagamentoParcial) {
    this.aceitaPagamentoParcial = aceitaPagamentoParcial;
  }

  public InfConsultaPagamentoResp valorMinimo(String valorMinimo) {
    this.valorMinimo = valorMinimo;
    return this;
  }

  /**
   * Valor mínimo do pagamento (12 dígitos, incluindo centavos).
   * @return valorMinimo
  **/
  @ApiModelProperty(example = "000000000500", value = "Valor mínimo do pagamento (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$") 
  public String getValorMinimo() {
    return valorMinimo;
  }

  public void setValorMinimo(String valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  public InfConsultaPagamentoResp dda(List<InfDDA> dda) {
    this.dda = dda;
    return this;
  }

  public InfConsultaPagamentoResp addDdaItem(InfDDA ddaItem) {
    if (this.dda == null) {
      this.dda = new ArrayList<InfDDA>();
    }
    this.dda.add(ddaItem);
    return this;
  }

  /**
   * Informações de retorno para consultas de DDA.
   * @return dda
  **/
  @ApiModelProperty(value = "Informações de retorno para consultas de DDA.")

  @Valid

  public List<InfDDA> getDda() {
    return dda;
  }

  public void setDda(List<InfDDA> dda) {
    this.dda = dda;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaPagamentoResp infConsultaPagamentoResp = (InfConsultaPagamentoResp) o;
    return Objects.equals(this.valor, infConsultaPagamentoResp.valor) &&
        Objects.equals(this.cedente, infConsultaPagamentoResp.cedente) &&
        Objects.equals(this.dataPagamento, infConsultaPagamentoResp.dataPagamento) &&
        Objects.equals(this.modificado, infConsultaPagamentoResp.modificado) &&
        Objects.equals(this.cnpjFavorecidoDoacao, infConsultaPagamentoResp.cnpjFavorecidoDoacao) &&
        Objects.equals(this.nomeFavorecidoDoacao, infConsultaPagamentoResp.nomeFavorecidoDoacao) &&
        Objects.equals(this.desconto, infConsultaPagamentoResp.desconto) &&
        Objects.equals(this.sistemaCobranca, infConsultaPagamentoResp.sistemaCobranca) &&
        Objects.equals(this.cip, infConsultaPagamentoResp.cip) &&
        Objects.equals(this.aceitaPagamentoParcial, infConsultaPagamentoResp.aceitaPagamentoParcial) &&
        Objects.equals(this.valorMinimo, infConsultaPagamentoResp.valorMinimo) &&
        Objects.equals(this.dda, infConsultaPagamentoResp.dda);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valor, cedente, dataPagamento, modificado, cnpjFavorecidoDoacao, nomeFavorecidoDoacao, desconto, sistemaCobranca, cip, aceitaPagamentoParcial, valorMinimo, dda);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPagamentoResp {\n");
    
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    cedente: ").append(toIndentedString(cedente)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
    sb.append("    modificado: ").append(toIndentedString(modificado)).append("\n");
    sb.append("    cnpjFavorecidoDoacao: ").append(toIndentedString(cnpjFavorecidoDoacao)).append("\n");
    sb.append("    nomeFavorecidoDoacao: ").append(toIndentedString(nomeFavorecidoDoacao)).append("\n");
    sb.append("    desconto: ").append(toIndentedString(desconto)).append("\n");
    sb.append("    sistemaCobranca: ").append(toIndentedString(sistemaCobranca)).append("\n");
    sb.append("    cip: ").append(toIndentedString(cip)).append("\n");
    sb.append("    aceitaPagamentoParcial: ").append(toIndentedString(aceitaPagamentoParcial)).append("\n");
    sb.append("    valorMinimo: ").append(toIndentedString(valorMinimo)).append("\n");
    sb.append("    dda: ").append(toIndentedString(dda)).append("\n");
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


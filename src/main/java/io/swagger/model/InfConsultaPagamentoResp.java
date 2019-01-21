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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

public class InfConsultaPagamentoResp   {
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

  @JsonProperty("cedente")
  private String cedente = null;

  @JsonProperty("cip")
  private InfConsultaPagamentoRespCip cip = null;

  @JsonProperty("cnpjFavorecidoDoacao")
  private String cnpjFavorecidoDoacao = null;

  @JsonProperty("dataPagamento")
  private String dataPagamento = null;

  @JsonProperty("dda")
  @Valid
  private List<InfDDA> dda = null;

  @JsonProperty("desconto")
  private String desconto = null;

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

  @JsonProperty("nomeFavorecidoDoacao")
  private String nomeFavorecidoDoacao = null;

  @JsonProperty("valor")
  private String valor = null;

  @JsonProperty("valorMinimo")
  private String valorMinimo = null;

  public InfConsultaPagamentoResp aceitaPagamentoParcial(AceitaPagamentoParcialEnum aceitaPagamentoParcial) {
    this.aceitaPagamentoParcial = aceitaPagamentoParcial;
    return this;
  }

  /**
   * Aceita pagamento parcial (00 = não, 00 = sim).
   * @return aceitaPagamentoParcial
  **/
  @ApiModelProperty(example = "01", required = true, value = "Aceita pagamento parcial (00 = não, 00 = sim).")
  @NotNull


  public AceitaPagamentoParcialEnum getAceitaPagamentoParcial() {
    return aceitaPagamentoParcial;
  }

  public void setAceitaPagamentoParcial(AceitaPagamentoParcialEnum aceitaPagamentoParcial) {
    this.aceitaPagamentoParcial = aceitaPagamentoParcial;
  }

  public InfConsultaPagamentoResp cedente(String cedente) {
    this.cedente = cedente;
    return this;
  }

  /**
   * Cedente.
   * @return cedente
  **/
  @ApiModelProperty(example = "Cedente", value = "Cedente.")


  public String getCedente() {
    return cedente;
  }

  public void setCedente(String cedente) {
    this.cedente = cedente;
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

  public InfConsultaPagamentoResp cnpjFavorecidoDoacao(String cnpjFavorecidoDoacao) {
    this.cnpjFavorecidoDoacao = cnpjFavorecidoDoacao;
    return this;
  }

  /**
   * CNPJ da instituição favorecida para doação (pagamento em dinheiro, obrigatório quando sem cartão).
   * @return cnpjFavorecidoDoacao
  **/
  @ApiModelProperty(value = "CNPJ da instituição favorecida para doação (pagamento em dinheiro, obrigatório quando sem cartão).")

@Pattern(regexp="^\\d{14}$") 
  public String getCnpjFavorecidoDoacao() {
    return cnpjFavorecidoDoacao;
  }

  public void setCnpjFavorecidoDoacao(String cnpjFavorecidoDoacao) {
    this.cnpjFavorecidoDoacao = cnpjFavorecidoDoacao;
  }

  public InfConsultaPagamentoResp dataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
    return this;
  }

  /**
   * Data de pagamento atualizada pelo parceiro (AAAAMMDD).
   * @return dataPagamento
  **/
  @ApiModelProperty(example = "20181122", required = true, value = "Data de pagamento atualizada pelo parceiro (AAAAMMDD).")
  @NotNull

@Pattern(regexp="^\\d{8}$") 
  public String getDataPagamento() {
    return dataPagamento;
  }

  public void setDataPagamento(String dataPagamento) {
    this.dataPagamento = dataPagamento;
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

  public InfConsultaPagamentoResp nomeFavorecidoDoacao(String nomeFavorecidoDoacao) {
    this.nomeFavorecidoDoacao = nomeFavorecidoDoacao;
    return this;
  }

  /**
   * Nome da instituição favorecida para doação (pagamento em dinheiro, obrigatório quando sem cartão).
   * @return nomeFavorecidoDoacao
  **/
  @ApiModelProperty(example = "Carl Edward Sagan", value = "Nome da instituição favorecida para doação (pagamento em dinheiro, obrigatório quando sem cartão).")


  public String getNomeFavorecidoDoacao() {
    return nomeFavorecidoDoacao;
  }

  public void setNomeFavorecidoDoacao(String nomeFavorecidoDoacao) {
    this.nomeFavorecidoDoacao = nomeFavorecidoDoacao;
  }

  public InfConsultaPagamentoResp valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Valor do pagamento (12 dígitos, incluindo centavos).
   * @return valor
  **/
  @ApiModelProperty(example = "000000005000", required = true, value = "Valor do pagamento (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{23}$") 
  public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public InfConsultaPagamentoResp valorMinimo(String valorMinimo) {
    this.valorMinimo = valorMinimo;
    return this;
  }

  /**
   * Valor mínimo do pagamento (12 dígitos, incluindo centavos).
   * @return valorMinimo
  **/
  @ApiModelProperty(example = "000000000500", required = true, value = "Valor mínimo do pagamento (12 dígitos, incluindo centavos).")
  @NotNull

@Pattern(regexp="^\\d{12}$") 
  public String getValorMinimo() {
    return valorMinimo;
  }

  public void setValorMinimo(String valorMinimo) {
    this.valorMinimo = valorMinimo;
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
    return Objects.equals(this.aceitaPagamentoParcial, infConsultaPagamentoResp.aceitaPagamentoParcial) &&
        Objects.equals(this.cedente, infConsultaPagamentoResp.cedente) &&
        Objects.equals(this.cip, infConsultaPagamentoResp.cip) &&
        Objects.equals(this.cnpjFavorecidoDoacao, infConsultaPagamentoResp.cnpjFavorecidoDoacao) &&
        Objects.equals(this.dataPagamento, infConsultaPagamentoResp.dataPagamento) &&
        Objects.equals(this.dda, infConsultaPagamentoResp.dda) &&
        Objects.equals(this.desconto, infConsultaPagamentoResp.desconto) &&
        Objects.equals(this.modificado, infConsultaPagamentoResp.modificado) &&
        Objects.equals(this.nomeFavorecidoDoacao, infConsultaPagamentoResp.nomeFavorecidoDoacao) &&
        Objects.equals(this.valor, infConsultaPagamentoResp.valor) &&
        Objects.equals(this.valorMinimo, infConsultaPagamentoResp.valorMinimo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(aceitaPagamentoParcial, cedente, cip, cnpjFavorecidoDoacao, dataPagamento, dda, desconto, modificado, nomeFavorecidoDoacao, valor, valorMinimo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaPagamentoResp {\n");
    
    sb.append("    aceitaPagamentoParcial: ").append(toIndentedString(aceitaPagamentoParcial)).append("\n");
    sb.append("    cedente: ").append(toIndentedString(cedente)).append("\n");
    sb.append("    cip: ").append(toIndentedString(cip)).append("\n");
    sb.append("    cnpjFavorecidoDoacao: ").append(toIndentedString(cnpjFavorecidoDoacao)).append("\n");
    sb.append("    dataPagamento: ").append(toIndentedString(dataPagamento)).append("\n");
    sb.append("    dda: ").append(toIndentedString(dda)).append("\n");
    sb.append("    desconto: ").append(toIndentedString(desconto)).append("\n");
    sb.append("    modificado: ").append(toIndentedString(modificado)).append("\n");
    sb.append("    nomeFavorecidoDoacao: ").append(toIndentedString(nomeFavorecidoDoacao)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    valorMinimo: ").append(toIndentedString(valorMinimo)).append("\n");
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


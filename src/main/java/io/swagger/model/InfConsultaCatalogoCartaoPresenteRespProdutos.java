package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaCatalogoCartaoPresenteRespInformacoes;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InfConsultaCatalogoCartaoPresenteRespProdutos
 */
@Validated
public class InfConsultaCatalogoCartaoPresenteRespProdutos   {
  @JsonProperty("idProduto")
  private String idProduto = null;

  @JsonProperty("nomeProduto")
  private String nomeProduto = null;

  @JsonProperty("descricaoProduto")
  private String descricaoProduto = null;

  @JsonProperty("valor")
  private String valor = null;

  @JsonProperty("valorMinimo")
  private String valorMinimo = null;

  @JsonProperty("valorMaximo")
  private String valorMaximo = null;

  @JsonProperty("statusProduto")
  private String statusProduto = null;

  @JsonProperty("tipoProduto")
  private String tipoProduto = null;

  @JsonProperty("nomeProvedor")
  private String nomeProvedor = null;

  @JsonProperty("idProvedor")
  private String idProvedor = null;

  @JsonProperty("tipoMoeda")
  private String tipoMoeda = null;

  @JsonProperty("eanProduto")
  private String eanProduto = null;

  @JsonProperty("informacoes")
  private InfConsultaCatalogoCartaoPresenteRespInformacoes informacoes = null;

  @JsonProperty("logoURL")
  private String logoURL = null;

  @JsonProperty("priority")
  private String priority = null;

  public InfConsultaCatalogoCartaoPresenteRespProdutos idProduto(String idProduto) {
    this.idProduto = idProduto;
    return this;
  }

  /**
   * Identificador do produto disponível com base na lista gerada na operação /consultaCatalogoCartaoPresente.
   * @return idProduto
  **/
  @ApiModelProperty(example = "1", value = "Identificador do produto disponível com base na lista gerada na operação /consultaCatalogoCartaoPresente.")

@Pattern(regexp="^\\d+$")   public String getIdProduto() {
    return idProduto;
  }

  public void setIdProduto(String idProduto) {
    this.idProduto = idProduto;
  }

  public InfConsultaCatalogoCartaoPresenteRespProdutos nomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
    return this;
  }

  /**
   * Nome do produto disponível.
   * @return nomeProduto
  **/
  @ApiModelProperty(example = "Produto de Recarga", value = "Nome do produto disponível.")

  public String getNomeProduto() {
    return nomeProduto;
  }

  public void setNomeProduto(String nomeProduto) {
    this.nomeProduto = nomeProduto;
  }

  public InfConsultaCatalogoCartaoPresenteRespProdutos descricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
    return this;
  }

  /**
   * Descricao do produto.
   * @return descricaoProduto
  **/
  @ApiModelProperty(example = "Cartao Presente", value = "Descricao do produto.")

  public String getDescricaoProduto() {
    return descricaoProduto;
  }

  public void setDescricaoProduto(String descricaoProduto) {
    this.descricaoProduto = descricaoProduto;
  }

  public InfConsultaCatalogoCartaoPresenteRespProdutos valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Valor do produto disponível em reais incluindo centavos exemplo (R$ 30,00).
   * @return valor
  **/
  @ApiModelProperty(example = "0003000", value = "Valor do produto disponível em reais incluindo centavos exemplo (R$ 30,00).")

@Pattern(regexp="^\\d{7}\\d*$")   public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public InfConsultaCatalogoCartaoPresenteRespProdutos valorMinimo(String valorMinimo) {
    this.valorMinimo = valorMinimo;
    return this;
  }

  /**
   * Valor mínimo para este produto, expresso em reais incluindo centavos exemplo (R$ 30,00).
   * @return valorMinimo
  **/
  @ApiModelProperty(example = "0003000", value = "Valor mínimo para este produto, expresso em reais incluindo centavos exemplo (R$ 30,00).")

@Pattern(regexp="^\\d{7}\\d*$")   public String getValorMinimo() {
    return valorMinimo;
  }

  public void setValorMinimo(String valorMinimo) {
    this.valorMinimo = valorMinimo;
  }

  public InfConsultaCatalogoCartaoPresenteRespProdutos valorMaximo(String valorMaximo) {
    this.valorMaximo = valorMaximo;
    return this;
  }

  /**
   * Valor mínimo para este produto, expresso em reais incluindo centavos exemplo (R$ 30,00).
   * @return valorMaximo
  **/
  @ApiModelProperty(example = "0003000", value = "Valor mínimo para este produto, expresso em reais incluindo centavos exemplo (R$ 30,00).")

@Pattern(regexp="^\\d{7}\\d*$")   public String getValorMaximo() {
    return valorMaximo;
  }

  public void setValorMaximo(String valorMaximo) {
    this.valorMaximo = valorMaximo;
  }

  public InfConsultaCatalogoCartaoPresenteRespProdutos statusProduto(String statusProduto) {
    this.statusProduto = statusProduto;
    return this;
  }

  /**
   * Status do produto, se o mesmo está ativo ou não, ativo = 1.
   * @return statusProduto
  **/
  @ApiModelProperty(example = "1", value = "Status do produto, se o mesmo está ativo ou não, ativo = 1.")

@Pattern(regexp="^\\d{1}$")   public String getStatusProduto() {
    return statusProduto;
  }

  public void setStatusProduto(String statusProduto) {
    this.statusProduto = statusProduto;
  }

  public InfConsultaCatalogoCartaoPresenteRespProdutos tipoProduto(String tipoProduto) {
    this.tipoProduto = tipoProduto;
    return this;
  }

  /**
   * Tipo do produto.
   * @return tipoProduto
  **/
  @ApiModelProperty(example = "PIN", value = "Tipo do produto.")

@Pattern(regexp="^.*$")   public String getTipoProduto() {
    return tipoProduto;
  }

  public void setTipoProduto(String tipoProduto) {
    this.tipoProduto = tipoProduto;
  }

  public InfConsultaCatalogoCartaoPresenteRespProdutos nomeProvedor(String nomeProvedor) {
    this.nomeProvedor = nomeProvedor;
    return this;
  }

  /**
   * Nome do provedor do produto.
   * @return nomeProvedor
  **/
  @ApiModelProperty(example = "STEAM", value = "Nome do provedor do produto.")

  public String getNomeProvedor() {
    return nomeProvedor;
  }

  public void setNomeProvedor(String nomeProvedor) {
    this.nomeProvedor = nomeProvedor;
  }

  public InfConsultaCatalogoCartaoPresenteRespProdutos idProvedor(String idProvedor) {
    this.idProvedor = idProvedor;
    return this;
  }

  /**
   * ID do provedor do produto.
   * @return idProvedor
  **/
  @ApiModelProperty(example = "132", value = "ID do provedor do produto.")

@Pattern(regexp="^\\d+$")   public String getIdProvedor() {
    return idProvedor;
  }

  public void setIdProvedor(String idProvedor) {
    this.idProvedor = idProvedor;
  }

  public InfConsultaCatalogoCartaoPresenteRespProdutos tipoMoeda(String tipoMoeda) {
    this.tipoMoeda = tipoMoeda;
    return this;
  }

  /**
   * Moeda que está sendo vendido o produto.
   * @return tipoMoeda
  **/
  @ApiModelProperty(example = "BRL", value = "Moeda que está sendo vendido o produto.")

@Pattern(regexp="^\\d+$")   public String getTipoMoeda() {
    return tipoMoeda;
  }

  public void setTipoMoeda(String tipoMoeda) {
    this.tipoMoeda = tipoMoeda;
  }

  public InfConsultaCatalogoCartaoPresenteRespProdutos eanProduto(String eanProduto) {
    this.eanProduto = eanProduto;
    return this;
  }

  /**
   * Código de barras do produto disponível com base na lista gerada na operação /consultaCatalogoCartaoPresente.
   * @return eanProduto
  **/
  @ApiModelProperty(example = "4260433452913", value = "Código de barras do produto disponível com base na lista gerada na operação /consultaCatalogoCartaoPresente.")

@Pattern(regexp="^\\d+$")   public String getEanProduto() {
    return eanProduto;
  }

  public void setEanProduto(String eanProduto) {
    this.eanProduto = eanProduto;
  }

  public InfConsultaCatalogoCartaoPresenteRespProdutos informacoes(InfConsultaCatalogoCartaoPresenteRespInformacoes informacoes) {
    this.informacoes = informacoes;
    return this;
  }

  /**
   * Get informacoes
   * @return informacoes
  **/
  @ApiModelProperty(value = "")

  @Valid
  public InfConsultaCatalogoCartaoPresenteRespInformacoes getInformacoes() {
    return informacoes;
  }

  public void setInformacoes(InfConsultaCatalogoCartaoPresenteRespInformacoes informacoes) {
    this.informacoes = informacoes;
  }

  public InfConsultaCatalogoCartaoPresenteRespProdutos logoURL(String logoURL) {
    this.logoURL = logoURL;
    return this;
  }

  /**
   * Logo do produto no formato base64.
   * @return logoURL
  **/
  @ApiModelProperty(example = "dHUgw6kgbyBjYXJhIDsp", value = "Logo do produto no formato base64.")

@Pattern(regexp="^\\d+$")   public String getLogoURL() {
    return logoURL;
  }

  public void setLogoURL(String logoURL) {
    this.logoURL = logoURL;
  }

  public InfConsultaCatalogoCartaoPresenteRespProdutos priority(String priority) {
    this.priority = priority;
    return this;
  }

  /**
   * Prioridade para aparecer para o cliente. Quanto maior, maior a prioridade.
   * @return priority
  **/
  @ApiModelProperty(example = "1", value = "Prioridade para aparecer para o cliente. Quanto maior, maior a prioridade.")

@Pattern(regexp="^\\d+$")   public String getPriority() {
    return priority;
  }

  public void setPriority(String priority) {
    this.priority = priority;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaCatalogoCartaoPresenteRespProdutos infConsultaCatalogoCartaoPresenteRespProdutos = (InfConsultaCatalogoCartaoPresenteRespProdutos) o;
    return Objects.equals(this.idProduto, infConsultaCatalogoCartaoPresenteRespProdutos.idProduto) &&
        Objects.equals(this.nomeProduto, infConsultaCatalogoCartaoPresenteRespProdutos.nomeProduto) &&
        Objects.equals(this.descricaoProduto, infConsultaCatalogoCartaoPresenteRespProdutos.descricaoProduto) &&
        Objects.equals(this.valor, infConsultaCatalogoCartaoPresenteRespProdutos.valor) &&
        Objects.equals(this.valorMinimo, infConsultaCatalogoCartaoPresenteRespProdutos.valorMinimo) &&
        Objects.equals(this.valorMaximo, infConsultaCatalogoCartaoPresenteRespProdutos.valorMaximo) &&
        Objects.equals(this.statusProduto, infConsultaCatalogoCartaoPresenteRespProdutos.statusProduto) &&
        Objects.equals(this.tipoProduto, infConsultaCatalogoCartaoPresenteRespProdutos.tipoProduto) &&
        Objects.equals(this.nomeProvedor, infConsultaCatalogoCartaoPresenteRespProdutos.nomeProvedor) &&
        Objects.equals(this.idProvedor, infConsultaCatalogoCartaoPresenteRespProdutos.idProvedor) &&
        Objects.equals(this.tipoMoeda, infConsultaCatalogoCartaoPresenteRespProdutos.tipoMoeda) &&
        Objects.equals(this.eanProduto, infConsultaCatalogoCartaoPresenteRespProdutos.eanProduto) &&
        Objects.equals(this.informacoes, infConsultaCatalogoCartaoPresenteRespProdutos.informacoes) &&
        Objects.equals(this.logoURL, infConsultaCatalogoCartaoPresenteRespProdutos.logoURL) &&
        Objects.equals(this.priority, infConsultaCatalogoCartaoPresenteRespProdutos.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idProduto, nomeProduto, descricaoProduto, valor, valorMinimo, valorMaximo, statusProduto, tipoProduto, nomeProvedor, idProvedor, tipoMoeda, eanProduto, informacoes, logoURL, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaCatalogoCartaoPresenteRespProdutos {\n");
    
    sb.append("    idProduto: ").append(toIndentedString(idProduto)).append("\n");
    sb.append("    nomeProduto: ").append(toIndentedString(nomeProduto)).append("\n");
    sb.append("    descricaoProduto: ").append(toIndentedString(descricaoProduto)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    valorMinimo: ").append(toIndentedString(valorMinimo)).append("\n");
    sb.append("    valorMaximo: ").append(toIndentedString(valorMaximo)).append("\n");
    sb.append("    statusProduto: ").append(toIndentedString(statusProduto)).append("\n");
    sb.append("    tipoProduto: ").append(toIndentedString(tipoProduto)).append("\n");
    sb.append("    nomeProvedor: ").append(toIndentedString(nomeProvedor)).append("\n");
    sb.append("    idProvedor: ").append(toIndentedString(idProvedor)).append("\n");
    sb.append("    tipoMoeda: ").append(toIndentedString(tipoMoeda)).append("\n");
    sb.append("    eanProduto: ").append(toIndentedString(eanProduto)).append("\n");
    sb.append("    informacoes: ").append(toIndentedString(informacoes)).append("\n");
    sb.append("    logoURL: ").append(toIndentedString(logoURL)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

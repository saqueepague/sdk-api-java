package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaTitulosCapitalizacaoRespTema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InfConsultaTitulosCapitalizacaoRespProdutos
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-26T13:22:47.638Z[GMT]")
public class InfConsultaTitulosCapitalizacaoRespProdutos   {
  @JsonProperty("id")
  private String id = null;

  @JsonProperty("nome")
  private String nome = null;

  @JsonProperty("descricao")
  private String descricao = null;

  @JsonProperty("detalhes")
  private String detalhes = null;

  @JsonProperty("dataInicioVigencia")
  private String dataInicioVigencia = null;

  @JsonProperty("dataFimVigencia")
  private String dataFimVigencia = null;

  @JsonProperty("valor")
  private String valor = null;

  @JsonProperty("limiteMaximoCompra")
  private String limiteMaximoCompra = null;

  @JsonProperty("tema")
  private InfConsultaTitulosCapitalizacaoRespTema tema = null;

  public InfConsultaTitulosCapitalizacaoRespProdutos id(String id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador do produto.
   * @return id
  **/
  @ApiModelProperty(example = "7", value = "Identificador do produto.")

@Pattern(regexp="^\\d+$")   public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public InfConsultaTitulosCapitalizacaoRespProdutos nome(String nome) {
    this.nome = nome;
    return this;
  }

  /**
   * Nome do produto.
   * @return nome
  **/
  @ApiModelProperty(example = "Grêmio Mais", value = "Nome do produto.")

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public InfConsultaTitulosCapitalizacaoRespProdutos descricao(String descricao) {
    this.descricao = descricao;
    return this;
  }

  /**
   * Descrição do produto.
   * @return descricao
  **/
  @ApiModelProperty(example = "Edição 115 Anos", value = "Descrição do produto.")

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public InfConsultaTitulosCapitalizacaoRespProdutos detalhes(String detalhes) {
    this.detalhes = detalhes;
    return this;
  }

  /**
   * Informações complementares sobre o produto (até 60 caracteres).
   * @return detalhes
  **/
  @ApiModelProperty(example = "Edição ouro de mais um produto do Grêmio Mais", value = "Informações complementares sobre o produto (até 60 caracteres).")

  public String getDetalhes() {
    return detalhes;
  }

  public void setDetalhes(String detalhes) {
    this.detalhes = detalhes;
  }

  public InfConsultaTitulosCapitalizacaoRespProdutos dataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
    return this;
  }

  /**
   * Data inicial da vigência do produto (AAAAMMDD).
   * @return dataInicioVigencia
  **/
  @ApiModelProperty(example = "20181122", value = "Data inicial da vigência do produto (AAAAMMDD).")

@Pattern(regexp="^\\d{8}$")   public String getDataInicioVigencia() {
    return dataInicioVigencia;
  }

  public void setDataInicioVigencia(String dataInicioVigencia) {
    this.dataInicioVigencia = dataInicioVigencia;
  }

  public InfConsultaTitulosCapitalizacaoRespProdutos dataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
    return this;
  }

  /**
   * Data final da vigência do produto (AAAAMMDD).
   * @return dataFimVigencia
  **/
  @ApiModelProperty(example = "20181130", value = "Data final da vigência do produto (AAAAMMDD).")

@Pattern(regexp="^\\d{8}$")   public String getDataFimVigencia() {
    return dataFimVigencia;
  }

  public void setDataFimVigencia(String dataFimVigencia) {
    this.dataFimVigencia = dataFimVigencia;
  }

  public InfConsultaTitulosCapitalizacaoRespProdutos valor(String valor) {
    this.valor = valor;
    return this;
  }

  /**
   * Valor por produto (12 dígitos, incluindo centavos).
   * @return valor
  **/
  @ApiModelProperty(example = "000000000500", value = "Valor por produto (12 dígitos, incluindo centavos).")

@Pattern(regexp="^\\d{12}$")   public String getValor() {
    return valor;
  }

  public void setValor(String valor) {
    this.valor = valor;
  }

  public InfConsultaTitulosCapitalizacaoRespProdutos limiteMaximoCompra(String limiteMaximoCompra) {
    this.limiteMaximoCompra = limiteMaximoCompra;
    return this;
  }

  /**
   * Limite máximo de compras por usuário.
   * @return limiteMaximoCompra
  **/
  @ApiModelProperty(example = "4", value = "Limite máximo de compras por usuário.")

@Pattern(regexp="^\\d+$")   public String getLimiteMaximoCompra() {
    return limiteMaximoCompra;
  }

  public void setLimiteMaximoCompra(String limiteMaximoCompra) {
    this.limiteMaximoCompra = limiteMaximoCompra;
  }

  public InfConsultaTitulosCapitalizacaoRespProdutos tema(InfConsultaTitulosCapitalizacaoRespTema tema) {
    this.tema = tema;
    return this;
  }

  /**
   * Get tema
   * @return tema
  **/
  @ApiModelProperty(value = "")

  @Valid
  public InfConsultaTitulosCapitalizacaoRespTema getTema() {
    return tema;
  }

  public void setTema(InfConsultaTitulosCapitalizacaoRespTema tema) {
    this.tema = tema;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaTitulosCapitalizacaoRespProdutos infConsultaTitulosCapitalizacaoRespProdutos = (InfConsultaTitulosCapitalizacaoRespProdutos) o;
    return Objects.equals(this.id, infConsultaTitulosCapitalizacaoRespProdutos.id) &&
        Objects.equals(this.nome, infConsultaTitulosCapitalizacaoRespProdutos.nome) &&
        Objects.equals(this.descricao, infConsultaTitulosCapitalizacaoRespProdutos.descricao) &&
        Objects.equals(this.detalhes, infConsultaTitulosCapitalizacaoRespProdutos.detalhes) &&
        Objects.equals(this.dataInicioVigencia, infConsultaTitulosCapitalizacaoRespProdutos.dataInicioVigencia) &&
        Objects.equals(this.dataFimVigencia, infConsultaTitulosCapitalizacaoRespProdutos.dataFimVigencia) &&
        Objects.equals(this.valor, infConsultaTitulosCapitalizacaoRespProdutos.valor) &&
        Objects.equals(this.limiteMaximoCompra, infConsultaTitulosCapitalizacaoRespProdutos.limiteMaximoCompra) &&
        Objects.equals(this.tema, infConsultaTitulosCapitalizacaoRespProdutos.tema);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nome, descricao, detalhes, dataInicioVigencia, dataFimVigencia, valor, limiteMaximoCompra, tema);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaTitulosCapitalizacaoRespProdutos {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nome: ").append(toIndentedString(nome)).append("\n");
    sb.append("    descricao: ").append(toIndentedString(descricao)).append("\n");
    sb.append("    detalhes: ").append(toIndentedString(detalhes)).append("\n");
    sb.append("    dataInicioVigencia: ").append(toIndentedString(dataInicioVigencia)).append("\n");
    sb.append("    dataFimVigencia: ").append(toIndentedString(dataFimVigencia)).append("\n");
    sb.append("    valor: ").append(toIndentedString(valor)).append("\n");
    sb.append("    limiteMaximoCompra: ").append(toIndentedString(limiteMaximoCompra)).append("\n");
    sb.append("    tema: ").append(toIndentedString(tema)).append("\n");
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

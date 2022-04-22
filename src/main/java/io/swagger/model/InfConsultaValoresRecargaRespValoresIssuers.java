package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.model.InfConsultaValoresRecargaRespValoresProducts;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * InfConsultaValoresRecargaRespValoresIssuers
 */
@Validated
public class InfConsultaValoresRecargaRespValoresIssuers   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("card_number_length")
  private Integer cardNumberLength = null;

  @JsonProperty("card_number_mask")
  private String cardNumberMask = null;

  @JsonProperty("products")
  @Valid
  private List<InfConsultaValoresRecargaRespValoresProducts> products = null;

  public InfConsultaValoresRecargaRespValoresIssuers id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Identificador da operadora de bilhetagem.
   * @return id
  **/
  @ApiModelProperty(example = "1", value = "Identificador da operadora de bilhetagem.")

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public InfConsultaValoresRecargaRespValoresIssuers name(String name) {
    this.name = name;
    return this;
  }

  /**
   * Nome da operadora.
   * @return name
  **/
  @ApiModelProperty(example = "TEU", value = "Nome da operadora.")

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public InfConsultaValoresRecargaRespValoresIssuers cardNumberLength(Integer cardNumberLength) {
    this.cardNumberLength = cardNumberLength;
    return this;
  }

  /**
   * Quantidade de caracteres do Cartão esperado para Cartões da operadora.
   * @return cardNumberLength
  **/
  @ApiModelProperty(example = "15", value = "Quantidade de caracteres do Cartão esperado para Cartões da operadora.")

  public Integer getCardNumberLength() {
    return cardNumberLength;
  }

  public void setCardNumberLength(Integer cardNumberLength) {
    this.cardNumberLength = cardNumberLength;
  }

  public InfConsultaValoresRecargaRespValoresIssuers cardNumberMask(String cardNumberMask) {
    this.cardNumberMask = cardNumberMask;
    return this;
  }

  /**
   * Máscara de números do Cartão.
   * @return cardNumberMask
  **/
  @ApiModelProperty(example = "XXXXXXXXXXXXXX-X", value = "Máscara de números do Cartão.")

  public String getCardNumberMask() {
    return cardNumberMask;
  }

  public void setCardNumberMask(String cardNumberMask) {
    this.cardNumberMask = cardNumberMask;
  }

  public InfConsultaValoresRecargaRespValoresIssuers products(List<InfConsultaValoresRecargaRespValoresProducts> products) {
    this.products = products;
    return this;
  }

  public InfConsultaValoresRecargaRespValoresIssuers addProductsItem(InfConsultaValoresRecargaRespValoresProducts productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<InfConsultaValoresRecargaRespValoresProducts>();
    }
    this.products.add(productsItem);
    return this;
  }

  /**
   * Get products
   * @return products
  **/
  @ApiModelProperty(value = "")
  @Valid
  public List<InfConsultaValoresRecargaRespValoresProducts> getProducts() {
    return products;
  }

  public void setProducts(List<InfConsultaValoresRecargaRespValoresProducts> products) {
    this.products = products;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfConsultaValoresRecargaRespValoresIssuers infConsultaValoresRecargaRespValoresIssuers = (InfConsultaValoresRecargaRespValoresIssuers) o;
    return Objects.equals(this.id, infConsultaValoresRecargaRespValoresIssuers.id) &&
        Objects.equals(this.name, infConsultaValoresRecargaRespValoresIssuers.name) &&
        Objects.equals(this.cardNumberLength, infConsultaValoresRecargaRespValoresIssuers.cardNumberLength) &&
        Objects.equals(this.cardNumberMask, infConsultaValoresRecargaRespValoresIssuers.cardNumberMask) &&
        Objects.equals(this.products, infConsultaValoresRecargaRespValoresIssuers.products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, cardNumberLength, cardNumberMask, products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfConsultaValoresRecargaRespValoresIssuers {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    cardNumberLength: ").append(toIndentedString(cardNumberLength)).append("\n");
    sb.append("    cardNumberMask: ").append(toIndentedString(cardNumberMask)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

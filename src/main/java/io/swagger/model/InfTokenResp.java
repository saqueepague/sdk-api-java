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
 * Informações da requisição de consulta de Token.
 */
@ApiModel(description = "Informações da requisição de consulta de Token.")
@Validated
public class InfTokenResp   {
  @JsonProperty("access_token")
  private String accessToken = null;

  @JsonProperty("token_type")
  private String tokenType = null;

  public InfTokenResp accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * Token retornado.
   * @return accessToken
  **/
  @ApiModelProperty(example = "847c2530-9819-434b-82fb-a9058a1ec957", required = true, value = "Token retornado.")
  @NotNull

  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public InfTokenResp tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * Tipo do token.
   * @return tokenType
  **/
  @ApiModelProperty(example = "bearer", required = true, value = "Tipo do token.")
  @NotNull

  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InfTokenResp infTokenResp = (InfTokenResp) o;
    return Objects.equals(this.accessToken, infTokenResp.accessToken) &&
        Objects.equals(this.tokenType, infTokenResp.tokenType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InfTokenResp {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
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

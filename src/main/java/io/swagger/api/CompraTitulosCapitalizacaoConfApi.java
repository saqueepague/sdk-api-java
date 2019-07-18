/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.TransacConf;
import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
@Api(value = "compraTitulosCapitalizacaoConf", description = "the compraTitulosCapitalizacaoConf API")
public interface CompraTitulosCapitalizacaoConfApi {

    @ApiOperation(value = "", nickname = "compraTitulosCapitalizacaoConfPost", notes = "Confirmação de operação de compra de títulos de capitalização.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retorno com sucesso."),
        @ApiResponse(code = 401, message = "Acesso não autorizado.") })
    @RequestMapping(value = "/compraTitulosCapitalizacaoConf",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<Void> compraTitulosCapitalizacaoConfPost(@ApiParam(value = "Requisição de confirmação de operação de compra de titulos de capitalizacao" ,required=true )  @Valid @RequestBody TransacConf body,@ApiParam(value = "Tipo de autenticação requerida." ,required=true) @RequestHeader(value="authenticationType", required=true) String authenticationType,@ApiParam(value = "Identificação do cliente." ,required=true) @RequestHeader(value="clientId", required=true) String clientId,@ApiParam(value = "Chave para validação do acesso ao serviço." ,required=true) @RequestHeader(value="token", required=true) String token);

}

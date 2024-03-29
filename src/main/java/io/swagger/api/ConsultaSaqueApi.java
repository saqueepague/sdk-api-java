/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.5).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package io.swagger.api;

import io.swagger.model.ConsultaSaqueReq;
import io.swagger.model.ConsultaSaqueResp;
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
@Api(value = "consultaSaque", description = "the consultaSaque API")
public interface ConsultaSaqueApi {

    @ApiOperation(value = "", nickname = "consultaSaquePost", notes = "Operação de consulta para saque. Efetuada para autenticar cliente, retornando valor de saque, moeda e dados adicionais.", response = ConsultaSaqueResp.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Retorno com sucesso ou com Erro de negócio.", response = ConsultaSaqueResp.class),
        @ApiResponse(code = 400, message = "Bad Request ou Erro interno ao qual inviabilizou uma resposta."),
        @ApiResponse(code = 401, message = "Acesso não autorizado.") })
    @RequestMapping(value = "/consultaSaque",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.POST)
    ResponseEntity<ConsultaSaqueResp> consultaSaquePost(@ApiParam(value = "Requisição de consulta de saque." ,required=true )  @Valid @RequestBody ConsultaSaqueReq body,@ApiParam(value = "Tipo de autenticação requerida." ,required=true) @RequestHeader(value="authenticationType", required=true) String authenticationType,@ApiParam(value = "Identificação do cliente." ,required=true) @RequestHeader(value="clientId", required=true) String clientId,@ApiParam(value = "Chave para validação do acesso ao serviço." ,required=true) @RequestHeader(value="token", required=true) String token);

}

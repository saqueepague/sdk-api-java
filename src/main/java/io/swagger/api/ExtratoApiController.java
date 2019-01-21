package io.swagger.api;

import io.swagger.model.ExtratoReq;
import io.swagger.model.ExtratoResp;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2019-01-18T19:37:26.329Z")

@Controller
public class ExtratoApiController implements ExtratoApi {

    private static final Logger log = LoggerFactory.getLogger(ExtratoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ExtratoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ExtratoResp> extratoPost(@ApiParam(value = "Tipo de autenticação requerida." ,required=true) @RequestHeader(value="authenticationType", required=true) String authenticationType,@ApiParam(value = "Identificação do cliente." ,required=true) @RequestHeader(value="clientId", required=true) String clientId,@ApiParam(value = "Chave para validação do acesso ao serviço." ,required=true) @RequestHeader(value="token", required=true) String token,@ApiParam(value = "Requisição de operação de extrato." ,required=true )  @Valid @RequestBody ExtratoReq body) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<ExtratoResp>(objectMapper.readValue("{  \"InfExtrato\" : {    \"recibo\" : \"                EXTRATO DE CONTA               @                036200005433591                @               13/10/2018  20:24               @                 BANCO: BANCO                  @                AGENCIA: 4029                  @              CONTA: 0082348296                @           DATA INICIAL: 12/10/2018            @           VALOR INICIAL: R$ 100,00            @            MOVIMENTACAO: R$ -50,00            @              VALOR FINAL: R$ 50,00            @             DATA FINAL: 13/10/2018            \"  },  \"InfTransacao\" : {    \"cdProc\" : \"029100\",    \"mensagemCliente\" : \"Não foi possível validar o cartão.\",    \"nsu\" : \"000080247206\",    \"codMoeda\" : \"986\",    \"codOperadora\" : \"00000000914\",    \"dataLocal\" : \"1122\",    \"errorMessage\" : \"Cartão inválido.\",    \"valor\" : \"5000\",    \"horaLocal\" : \"151032\",    \"nsuResposta\" : \"820\",    \"dataHora\" : \"1122151032\"  },  \"Cripto\" : {    \"hash\" : \"hash\"  },  \"Terminal\" : {    \"codEstab\" : \"000000000742673\",    \"tipo\" : \"008\",    \"id\" : \"05100004\"  }}", ExtratoResp.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<ExtratoResp>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<ExtratoResp>(HttpStatus.NOT_IMPLEMENTED);
    }

}

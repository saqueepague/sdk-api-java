package io.swagger.api;

import io.swagger.model.TransacConf;
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
import java.util.Map;
@Controller
public class EfetuarCompraCartaoPresenteConfApiController implements EfetuarCompraCartaoPresenteConfApi {

    private static final Logger log = LoggerFactory.getLogger(EfetuarCompraCartaoPresenteConfApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public EfetuarCompraCartaoPresenteConfApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> efetuarCompraCartaoPresenteConfPost(@ApiParam(value = "requisição de Confirmação de operação de Depósito." ,required=true )  @Valid @RequestBody TransacConf body,@ApiParam(value = "Tipo de autenticação requerida." ,required=true) @RequestHeader(value="authenticationType", required=true) String authenticationType,@ApiParam(value = "identificação do cliente." ,required=true) @RequestHeader(value="clientId", required=true) String clientId,@ApiParam(value = "Chave para validação do acesso ao serviço." ,required=true) @RequestHeader(value="token", required=true) String token) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}

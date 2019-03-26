package io.swagger.api;

import io.swagger.model.ConsultaTitulosCapitalizacaoReq;
import io.swagger.model.ConsultaTitulosCapitalizacaoResp;
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
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2019-03-26T17:53:50.941Z[GMT]")
@Controller
public class ConsultaTitulosCapitalizacaoApiController implements ConsultaTitulosCapitalizacaoApi {

    private static final Logger log = LoggerFactory.getLogger(ConsultaTitulosCapitalizacaoApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public ConsultaTitulosCapitalizacaoApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<ConsultaTitulosCapitalizacaoResp> consultaTitulosCapitalizacaoPost(@ApiParam(value = "Requisição de consulta produtos de títulos de capitalização." ,required=true )  @Valid @RequestBody ConsultaTitulosCapitalizacaoReq body,@ApiParam(value = "Tipo de autenticação requerida." ,required=true) @RequestHeader(value="authenticationType", required=true) String authenticationType,@ApiParam(value = "Identificação do cliente." ,required=true) @RequestHeader(value="clientId", required=true) String clientId,@ApiParam(value = "Chave para validação do acesso ao serviço." ,required=true) @RequestHeader(value="token", required=true) String token) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<ConsultaTitulosCapitalizacaoResp>(HttpStatus.NOT_IMPLEMENTED);
    }

}

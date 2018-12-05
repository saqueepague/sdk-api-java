package io.swagger.api;

import io.swagger.model.IdentificacaoReq;
import io.swagger.model.IdentificacaoResp;

import java.util.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class IdentificacaoApiControllerIntegrationTest {

    @Autowired
    private IdentificacaoApi api;

    @Test
    public void identificacaoPostTest() throws Exception {
        IdentificacaoReq body = new IdentificacaoReq();
        String authenticationType = "authenticationType_example";
        String clientId = "clientId_example";
        String token = "token_example";
        ResponseEntity<IdentificacaoResp> responseEntity = api.identificacaoPost(body, authenticationType, clientId, token);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}

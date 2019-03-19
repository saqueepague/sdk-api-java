package io.swagger.api;

import io.swagger.model.ConsultaTitulosCapitalizacaoReq;
import io.swagger.model.ConsultaTitulosCapitalizacaoResp;

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
public class ConsultaTitulosCapitalizacaoApiControllerIntegrationTest {

    @Autowired
    private ConsultaTitulosCapitalizacaoApi api;

    @Test
    public void consultaTitulosCapitalizacaoPostTest() throws Exception {
        ConsultaTitulosCapitalizacaoReq body = new ConsultaTitulosCapitalizacaoReq();
        String authenticationType = "authenticationType_example";
        String clientId = "clientId_example";
        String token = "token_example";
        ResponseEntity<ConsultaTitulosCapitalizacaoResp> responseEntity = api.consultaTitulosCapitalizacaoPost(body, authenticationType, clientId, token);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}

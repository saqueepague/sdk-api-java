package io.swagger.api;

import io.swagger.model.ConsultaPrePagoReq;
import io.swagger.model.ConsultaPrePagoResp;

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
public class ConsultaPrePagoApiControllerIntegrationTest {

    @Autowired
    private ConsultaPrePagoApi api;

    @Test
    public void consultaPrePagoPostTest() throws Exception {
        ConsultaPrePagoReq body = new ConsultaPrePagoReq();
        String authenticationType = "authenticationType_example";
        String clientId = "clientId_example";
        String token = "token_example";
        ResponseEntity<ConsultaPrePagoResp> responseEntity = api.consultaPrePagoPost(body, authenticationType, clientId, token);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}

package io.swagger.api;

import io.swagger.model.EmprestimoReq;
import io.swagger.model.EmprestimoResp;

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
public class EmprestimoApiControllerIntegrationTest {

    @Autowired
    private EmprestimoApi api;

    @Test
    public void emprestimoPostTest() throws Exception {
        EmprestimoReq body = new EmprestimoReq();
        String authenticationType = "authenticationType_example";
        String clientId = "clientId_example";
        String token = "token_example";
        ResponseEntity<EmprestimoResp> responseEntity = api.emprestimoPost(body, authenticationType, clientId, token);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}

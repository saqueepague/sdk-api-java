package io.swagger.api;

import io.swagger.model.ExtratoReq;
import io.swagger.model.ExtratoResp;

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
public class ExtratoApiControllerIntegrationTest {

    @Autowired
    private ExtratoApi api;

    @Test
    public void extratoPostTest() throws Exception {
        ExtratoReq body = new ExtratoReq();
        String authenticationType = "authenticationType_example";
        String clientId = "clientId_example";
        String token = "token_example";
        ResponseEntity<ExtratoResp> responseEntity = api.extratoPost(body, authenticationType, clientId, token);
        assertEquals(HttpStatus.NOT_IMPLEMENTED, responseEntity.getStatusCode());
    }

}

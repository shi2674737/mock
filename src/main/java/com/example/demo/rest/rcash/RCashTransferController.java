package com.example.demo.rest.rcash;

import com.fasterxml.jackson.core.JsonParser;
import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transfer")
public class RCashTransferController {

    @Data
    class Response {
        private Results results;
    }

    @Data
    class Results {
        private String result_code;
        private TransferResponse data;
    }

    @Data
    class TransferResponse {
        private String from_authentication_status;
        private String from_funds_transfer_point;
        private String from_prepaid_payment_point;
    }

    @PostMapping("/mock")
    public Response mock() {
        return getCase1();
    }

    public Response getCase1() {
        Response response = new Response();
        Results results = new Results();
        TransferResponse acceptResponse = new TransferResponse();
        acceptResponse.setFrom_authentication_status("1");
//        acceptResponse.setFrom_funds_transfer_point("10");
//        acceptResponse.setFrom_prepaid_payment_point("10");
        results.setData(acceptResponse);
        results.setResult_code("R0000000");
        response.setResults(results);
        return response;
    }

}

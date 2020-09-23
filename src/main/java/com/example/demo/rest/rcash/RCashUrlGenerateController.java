package com.example.demo.rest.rcash;

import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/url")
public class RCashUrlGenerateController {

    @Data
    class Response {
        private Results results;
    }

    @Data
    class Results {
        private String result_code;
        private UrlResponse data;
    }

    @Data
    class UrlResponse {
        private String authentication_status;
        private String funds_transfer_point;
        private String prepaid_payment_point;
    }

    @PostMapping("/mock")
    public Response case1() {
        Response response = new Response();
        Results results = new Results();
        UrlResponse acceptResponse = new UrlResponse();
        acceptResponse.setAuthentication_status("0");
//        acceptResponse.setFunds_transfer_point("10");
//        acceptResponse.setPrepaid_payment_point("10");
        results.setData(acceptResponse);
        results.setResult_code("R0000000");
        response.setResults(results);
        return response;
    }

}

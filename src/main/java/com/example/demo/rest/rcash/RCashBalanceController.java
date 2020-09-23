package com.example.demo.rest.rcash;

import lombok.Data;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/balance")
public class RCashBalanceController {

    @Data
    class Response {
        private Results results;
    }

    @Data
    class Results {
        private String result_code;
        private BalanceResponse data;
    }

    @Data
    class BalanceResponse {
        private String user_status;
        private String restriction_status;
        private String user_balance;
        private String prepaid_payment_balance;
        private String funds_transfer_balance;
        private String ekyc_completed_datetime;

        //以下四个用来判断状态
        private String authentication_status;
        private String re_ekyc_flg;
        private String ekyc_application_status;
        private String ekyc_rejected_flg;
    }

    @PostMapping("/mock")
    public Response mock() {
        return getCase1();
    }

    public Response getCase1() {
        Response response = new Response();
        Results results = new Results();
        BalanceResponse balanceResponse = new BalanceResponse();
        balanceResponse.setAuthentication_status("1");
        balanceResponse.setRe_ekyc_flg("1");
        balanceResponse.setEkyc_application_status("0");
        balanceResponse.setEkyc_rejected_flg("1");

        balanceResponse.setUser_status("1");
        balanceResponse.setRestriction_status("0");

        balanceResponse.setUser_balance("100");
        balanceResponse.setFunds_transfer_balance("40");
        balanceResponse.setPrepaid_payment_balance("60");
        balanceResponse.setEkyc_completed_datetime("20200818120000");
        results.setData(balanceResponse);
        results.setResult_code("R0000000");
        response.setResults(results);
        return response;
    }

}

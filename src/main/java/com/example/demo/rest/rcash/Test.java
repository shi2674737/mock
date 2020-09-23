package com.example.demo.rest.rcash;

import org.springframework.util.StringUtils;

import java.math.BigDecimal;

public class Test {
    public static void main(String[] args) {
        System.out.println(new BigDecimal(555).multiply(new BigDecimal(0.3)).longValue());

    }
}
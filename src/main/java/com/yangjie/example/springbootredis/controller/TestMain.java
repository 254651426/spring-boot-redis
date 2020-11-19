package com.yangjie.example.springbootredis.controller;

import com.yangjie.SPIService;
import sun.misc.Service;

import java.util.Iterator;

public class TestMain {

    public static void main(String[] args) {
        Iterator<SPIService> providers = Service.providers(SPIService.class);
        while (providers.hasNext()) {
            SPIService ser = providers.next();
            ser.show();
        }
    }
}

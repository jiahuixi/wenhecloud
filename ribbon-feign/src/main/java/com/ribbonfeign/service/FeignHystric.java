package com.ribbonfeign.service;

import org.springframework.stereotype.Component;

/**
 * @author jiahuixi
 * @date 2019/6/5 11:40
 */
@Component
public class FeignHystric implements  FeignService{
    @Override
    public String sayHiFromClientOne(String name) {
        return "sorry "+name;
    }
}

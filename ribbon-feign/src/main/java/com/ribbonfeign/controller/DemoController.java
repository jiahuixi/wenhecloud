package com.ribbonfeign.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ribbonfeign.service.FeignService;
import com.ribbonfeign.service.RibbonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author jiahuixi
 * @date 2019/6/5 11:16
 */
@RestController
public class DemoController {
    @Autowired
    RibbonService ribbonService;
    @Autowired
    FeignService  feignService;
    @GetMapping(value = "/ribbon-hi")
    public String hi(@RequestParam String name) {
        return ribbonService.hiService(name);
    }
    //这个是分割线-------------------

    @GetMapping(value = "/feign-hi")
    public String sayHi(@RequestParam String name) {
        return feignService.sayHiFromClientOne( name );
    }

}

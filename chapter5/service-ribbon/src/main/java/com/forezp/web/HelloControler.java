package com.forezp.web;

import com.forezp.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by fangzhipeng on 2017/4/6.
 */
@RestController
public class HelloControler {
    @Autowired
    HelloService helloService;

    @Value("${server.port}")
    String port;

    @RequestMapping(value = "/hi")
    public String hi(@RequestParam String name){
        return helloService.hiService(name);
    }
    @RequestMapping("/hii")
    public String home(@RequestParam String name) {
        return "hi12 "+name+",i am from port:" +port;
    }

}

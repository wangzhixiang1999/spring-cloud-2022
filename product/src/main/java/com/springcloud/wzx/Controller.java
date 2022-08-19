package com.springcloud.wzx;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Controller {


    @GetMapping(value = "query/get")
    public String getIphoneMsg(Long id){
        return null;
    }
}

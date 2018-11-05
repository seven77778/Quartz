package com.rate;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by lsh on 2018/11/5.
 *
 * @author lsh
 * @date 2018/11/05
 */
@RestController
public class HelloControl {

    @RequestMapping("/hello")
    public String hello(){
        return "hello lsh ";
    }
}

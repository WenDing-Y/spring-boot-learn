package com.spring.test;

/**
 * @author lei shuiyu
 * @date 2018/11/11 16:17
 */
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/app")
public class TestController {

    @RequestMapping("/test")
    @ResponseBody
    public String testDemo() {
        return "Hello World!";
    }

}


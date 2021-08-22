package com.zt.boot.controller;

import com.zt.boot.pojo.LoginForm;
import com.zt.boot.pojo.ResponseTransfer;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@RestController
public class HelloController {

    @RequestMapping("/hello")
    public String handler01() {
        return "Hello, Spring Boot 2!";
    }

    // https://www.baeldung.com/spring-request-response-body
    @PostMapping("/request")
    public ResponseEntity postController(@RequestBody LoginForm loginForm) {
        // 验证用户名密码
        System.out.println(loginForm);
        return ResponseEntity.ok(HttpStatus.OK);
    }

    // https://www.baeldung.com/spring-request-response-body
    @PostMapping("/response")
    @ResponseBody
    public ResponseTransfer postResponseController(@RequestBody LoginForm loginForm) {
        // 验证用户名密码
        System.out.println(loginForm);
        return new ResponseTransfer("Thanks For Posting!!!");
    }

    @PostMapping(value = "/content_json", produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public ResponseTransfer postResponseJsonContent(@RequestBody LoginForm loginForm) {
        return new ResponseTransfer("JSON Content!");
    }

    @PostMapping(value = "/content_xml", produces = MediaType.APPLICATION_XML_VALUE+";charset=UTF-8")
    @ResponseBody
    public ResponseTransfer postResponseXmlContent(@RequestBody LoginForm loginForm) {
        return new ResponseTransfer("XML Content!");
    }
}

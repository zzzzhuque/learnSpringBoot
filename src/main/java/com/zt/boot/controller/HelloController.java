package com.zt.boot.controller;

import com.zt.boot.beans.FooFormatter;
import com.zt.boot.beans.FooService;
import com.zt.boot.pojo.LoginForm;
import com.zt.boot.pojo.ResponseTransfer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
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

    // https://www.baeldung.com/spring-requestmapping
    @RequestMapping(value = "/ex/foos", method = RequestMethod.GET)
    @ResponseBody
    public String getFoosBySimplePath() {
        return "Get some Foos";
    }

    @RequestMapping(value = "/ex/foos", method = RequestMethod.POST)
    @ResponseBody
    public String postFoos() {
        return "Post some Foos";
    }

    @RequestMapping(value = "/ex/foos", headers = "key=val", method = RequestMethod.GET)
    @ResponseBody
    public String getFoosWithHeader() {
        return "Get some Foos with Header";
    }

    // https://blog.csdn.net/woheniccc/article/details/79804600
    @Value("${server.port}")
    private String port;

    // ResponseBody返回序列化json数据，若返回String则直接处理为text
    @RequestMapping(value = "/value", method = RequestMethod.GET)
    @ResponseBody
    public String getValuePort() {
        return port;
    }

    // ResponseBody返回序列化json数据，若返回String则直接处理为text
    @RequestMapping(value = "/setAccMonitor")
    @ResponseBody
    private String testGetManyParams(Long taskAccumulateNum, Long monitorTimeLength, Long taskSuccessNum,
                                     Boolean isMonitor, Long businessId) {
        System.out.println("" + taskAccumulateNum + " " + monitorTimeLength + " " + taskSuccessNum + " " + isMonitor + " " + businessId);
        return "OK";
    }

    // 使用fooService不能new，否则这个对象不属于spring容器管理
    @Autowired
    private FooService fooService;

    // https://www.baeldung.com/spring-autowire
    @RequestMapping(value = "/autowired")
    @ResponseBody
    private String getAutowired() {
        System.out.println(fooService.fooFormatter.formatter);
        FooService.testStatic();
        return "OK";
    }
}

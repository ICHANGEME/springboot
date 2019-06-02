package org.newit.microservice.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.annotation.WebServlet;

@SpringBootApplication
@Controller
public class Application {


    private String newit;
    @RequestMapping("/customValue")
    public String customValue() {

        return null;
    }
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        return "Hello world";
    }

    @RequestMapping("/index")
    public String index() {
        return "index";
    }

    @RequestMapping("/currentTime")
    @ResponseBody
    public MyTime currentTime() {
        MyTime myTime = new MyTime();
        myTime.setCurrentTime(System.currentTimeMillis());
        return myTime;
    }


    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }


}

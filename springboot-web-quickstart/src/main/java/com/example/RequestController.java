package com.example;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RequestController {
    @RequestMapping("/request")
    public String request(HttpServletRequest request){
        // 1. 获取请求参数name.age
        String name = request.getParameter("name");

        // 2. 获取请求路径uri和url
        String uri = request.getRequestURI();
        String url = request.getRequestURL().toString();

        // 3. 获取请求头 user-agent
        String userAgent = request.getHeader("User-Agent");

        // 4. 获取请求方式
        String method = request.getMethod();

        // 5. 获取请求的查询字符串
        String queryString = request.getQueryString();

        System.out.println("name: "+name);
        System.out.println("uri: "+uri);
        System.out.println("url: "+url);
        System.out.println("userAgent: "+userAgent);
        System.out.println("method: "+method);
        System.out.println("queryString: "+queryString);
        System.out.println("===================");
        return "request success";
    }
}

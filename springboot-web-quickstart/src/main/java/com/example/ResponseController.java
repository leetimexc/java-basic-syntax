package com.example;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class ResponseController {

    /*
     * 方式一： HttpServetResponse 设置响应数据
     */
    @RequestMapping("/response")
    public void response(HttpServletResponse response) throws IOException {
        // 1. 设置相应状态码
        response.setStatus(401);
        // 2. 设置相应头
        response.setHeader("name","itcast");
        // 3. 设置响应体
        response.getWriter().write("<h1>hello response</h1>");
    }

    /*
     * 方法二： spring方法 ResponseEntity
     */
    @RequestMapping("/response2")
    public ResponseEntity<String> response2(){
        return ResponseEntity.status(401)
                .header("name","java-web")
                .body("<h1>hello response2</h1>");
    }
}

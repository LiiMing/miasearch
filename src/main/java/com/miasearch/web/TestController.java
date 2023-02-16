package com.miasearch.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @project: mia-search
 * @description: test
 * @author: 李明
 * @create: 2023-02-16 15:14
 **/
@RestController
public class TestController {


    @GetMapping("test")
    public String test(){
        var text = """
                sasd
                fsaffafffa
                wdadadadd
                """;

        var exp = switch (text) {
            case "A" -> "";
            case "B" -> "b";
            case "c" -> {
                System.out.println("ccc");
                yield  "s";
            }
            default -> "c";
        };

        return "hello world";
    }


}

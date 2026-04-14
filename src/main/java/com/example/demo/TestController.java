package com.example.demo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.*;

@Tag(name = "Test", description = "検証用エンドポイント")
@RestController
public class TestController {
    @Operation(summary = "挨拶を返します", description = "この説明文を書き換えてプッシュするとドキュメントが変わります")
    @GetMapping("/hello")
    public String hello() {
        return "Hello World";
    }
}

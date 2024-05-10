package com.wenqiuhan.springdoc;

import org.springdoc.core.annotations.ParameterObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 闻秋寒<wenqiuhanya @ qq.com>
 * @date 2024-05-09 14:10:23
 * @since 1.0.0
 */
@RestController
@RequestMapping("api/test")
public class TestController {

    @GetMapping("")
    public String test(@ParameterObject Student student) {
        return "ok";
    }


}

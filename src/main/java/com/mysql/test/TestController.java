package com.mysql.test;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by jiawei on 17/9/25.
 */
@Controller
@Slf4j
public class TestController {
    @Autowired
    private TestMapper testMapper;

    @RequestMapping("/test")
    @ResponseBody
    public TestModel test() {
        TestModel one = this.testMapper.getOne(1);
        log.info("select result is {}", one.getName());
        return one;
    }
}

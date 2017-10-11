package com.springboot.mybatis.city;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description://TODO
 * @User: 62102.
 * @Contact: wechat: 13810414691
 * @Time: 2017/9/25.
 */
@Controller
public class CityController {
    @RequestMapping(value = "/add")
    public City add() {
        return new City();
    }
}

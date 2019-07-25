package com.taotao.portal.controller;

import com.taotao.portal.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.converter.json.GsonFactoryBean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.io.IOException;
import java.util.*;

/**
 * https://blog.csdn.net/a1405/article/details/86664660
 *
 * https://www.cnblogs.com/DDgougou/p/9283219.html
 * 展示首页
 * @title PageController.java
 * <p>description</p>
 * <p>company: www.itheima.com</p>
 * @author ljh 
 * @version 1.0
 */
@Controller
public class TestController {
    @RequestMapping(value = "test")
    public String test(Model  model){
        model.addAttribute("x",24);
        model.addAttribute("y","bbb");
        User user = new User();
        user.setAge(24);
        user.setName("战三");
        user.setSalary(4500);
        model.addAttribute("user", user);

        List<User> users = new ArrayList<>();
        users.add(new User("王五",32,6200));
        users.add(new User("赵柳",46,8500));
        model.addAttribute("users", users);


        Map<String,String> map = new HashMap<>();
        map.put("a","AAA");
        map.put("b","BBB");
        map.put("c","CCC");
        model.addAttribute("map",map);

        Date date = new Date();
        model.addAttribute("date",date);
        model.addAttribute("hello","你好");
        return "test";
    }

}

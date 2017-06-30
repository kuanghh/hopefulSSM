package com.khh.web.controller;

import com.khh.web.cache.RedisClusterCache;
import com.khh.web.domain.User;
import com.khh.web.service.interface_.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by Administrator on 2017/6/30.
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;

    @Resource
    private RedisClusterCache redisClusterCache;


    @ResponseBody
    @RequestMapping(value = "/select.action", method = RequestMethod.GET)
    public String select(int id) {
        User user = redisClusterCache.getCache(String.valueOf(id), User.class);
        if(user == null){
            user = userService.findById(id);
            redisClusterCache.putCache(String.valueOf(id),user);
        }else{
            System.out.println("从缓存拿到了数据");
        }
        return user.toString();
    }

    @ResponseBody
    @RequestMapping(value = "/add.action", method = RequestMethod.GET)
    public String add() {
        User user = new User(7,"haohua7",27);
        int isOk = userService.insertUser(user);
        return isOk == 0 ? "shibai" : "chenggong";
    }
}

package com.skyline.exception.controller;

import com.skyline.exception.entity.User;
import com.skyline.exception.util.R;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.skyline.exception.service.ExceptionService;

import java.text.ParseException;
import java.util.Map;

/**
 * @author zhangkepeng
 * @Email skyline_1993@163.com
 * @date 2019/5/5
 */
@RestController
public class ExceptionController {

    private Logger logger = LoggerFactory.getLogger(ExceptionController.class);

    @Autowired
    private ExceptionService exceptionService;

    @RequestMapping("/getUser")
    public R getUser(Integer id) {

        User user = null;
        try {
            user = exceptionService.getUser(id);
        } catch (ParseException e) {
            logger.error("获取用户[{}]信息失败", id);
            return R.error("获取用户信息失败");
        }
        return R.ok().put("data", user);
    }


    public void test() {
        System.out.println("分界线");
    }

    public void test2() {
        System.out.println("333333333333");
    }


    public void test3() {
        System.out.println("------------分界线-------------");
    }

    public void test4() {
        System.out.println("aaaaaaaaaaaaa");
    }
}

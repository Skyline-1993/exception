package com.skyline.exception.service.impl;

import com.skyline.exception.entity.User;
import com.skyline.exception.service.ExceptionService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author zhangkepeng
 * @email skyline_1993@163.com
 * @date 2019/6/28
 */
@Service
public class ExceptionServiceImpl implements ExceptionService {

    private Logger logger = LoggerFactory.getLogger(ExceptionServiceImpl.class);

    @Override
    public User getUser(int id) /*throws ParseException*/ {

        User user = new User();
        user.setId(001);
        user.setAge(22);
        user.setUserName("skyline");
        user.setNickName("天涯");
        user.setMobile("188********");

        boolean test = user.getEmail().equals("test");
        System.out.println(test);

        System.out.println("exception after");

        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        logger.info("test content");
        // 将字符串格式的日期格式化为Date类型的日期
        try {
            date = dateFormat.parse("201904-03");
        } catch (ParseException e) {
            e.printStackTrace();
        }

        return user;
    }
}

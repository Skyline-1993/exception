package com.skyline.exception.service;

import com.skyline.exception.entity.User;

import java.text.ParseException;

/**
 * @author zhangkepeng
 * @email skyline_1993@163.com
 * @date 2019/6/28
 */
public interface ExceptionService {

    /**
     * 获取用户信息
     * @param id 用户id
     * @return 用户对象
     * @throws ParseException
     */
    User getUser(int id) throws ParseException;
}

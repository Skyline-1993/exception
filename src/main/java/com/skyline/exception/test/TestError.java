package com.skyline.exception.test;

/**
 * Error:错误，无法解决的问题，代码不能这样写。
 * 如：内存溢出错误(OutOfMemoryError)
 *
 * @author zhangkepeng
 * @Email skyline_1993@163.com
 * @Date 2019/4/3
 */
public class TestError {

    /**
     * 给arr数组分配的内存空间太大，导致内存溢出
     */
    public static void main(String[] args) {
        int[] arr = new int[1024 * 1024 * 1024];
    }
}

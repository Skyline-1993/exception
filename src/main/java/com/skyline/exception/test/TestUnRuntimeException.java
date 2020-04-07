package com.skyline.exception.test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 非运行时异常：编译时报错，需要手动try/catch
 * 指的不是某一个exception，而是Exception的非RuntimeException的其他子类。
 *
 * @author zhangkepeng
 * @Email skyline_1993@163.com
 * @Date 2019/4/2
 */
public class TestUnRuntimeException {

    /**
     * 非运行时异常：需要手动try/catch,或者throws
     * 常见的非运行时异常有：解析异常(ParseException)
     */
    public static void testUnRuntimeException() {
//        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        //将字符串格式的日期格式化为Date类型的日期
//        Date date = dateFormat.parse("2019-04-03");
//        System.out.println(date);
    }

    /**
     * 解决办法一: try/catch：当前解决  try/catch后就可以编译成功了(因为我们解决了异常问题)
     */
    public static void solveUnRuntimeException1() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = null;
        try {
            // 将字符串格式的日期格式化为Date类型的日期
            date = dateFormat.parse("201904-03");
            // try代码块中异常之后的代码不再运行
            System.out.println("After the exception");
        } catch (ParseException e) {
            System.out.println("now is UnRuntimeException");
            e.printStackTrace();
        }

        System.out.println(date);
    }

    /**
     * 解决办法二: throws：使用者解决，即调用的对象来try/catch解决异常。若调用的对象没有进行try/catch来解决异常，那么该对象不能通过编译。
     * try/catch后就可以编译成功了(因为我们解决了异常问题)
     */
    public static void solveUnRuntimeException2() throws ParseException {
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        // 将字符串格式的日期格式化为Date类型的日期
        Date date = dateFormat.parse("2019-0403");
        System.out.println(date);
    }

    public static void main(String[] args) /*throws ParseException*/ {
//        solveUnRuntimeException1();

        // 非运行期异常(编译期异常)：如果一直使用throws抛出异常来解决异常，最终虚拟机会抛出异常对象，终止程序执行。
        try {
            solveUnRuntimeException2();
        } catch (ParseException e) {
            System.out.println("test");
        }
        System.out.println("complete");

    }
}

package com.skyline.exception.test;

/**
 * RuntimeException:运行时异常。编译时没有问题，但在运行时会出现异常，出现异常后会终止代码运行。
 * RuntimeException是Exception的子类，Exception的其他子类统称为非运行时异常。
 *
 * @author zhangkepeng
 * @Email skyline_1993@163.com
 * @Date 2019/3/20
 */
public class TestRuntimeException {

    /**
     * 运行时异常：代码编译时不会异常，但在运行时会出现异常，出现异常后当前线程会终止运行。
     * 常见的运行时异常有：数据越界越界(ArrayIndexOutOfBoundsException)、空指针异常()···
     */
    public static void testRuntimeException() {
        int[] arr = {4, 5, 2, 6};
        System.out.println(arr[4]);
        // 出现异常后当前线程会终止运行
        System.out.println("runtimeException is complete");
    }

    /**
     * 解决办法: try/catch或throws  try/catch后就可以执行后面的代码了(因为我们解决了异常问题)
     *      空指针异常也可以使用if提前判断：
     * <p>
     * 但是：try代码块中异常之后的代码不再运行
     */
    public static void solveRuntimeException() {
        int[] arr = {4, 5, 2, 6};
        try {
            System.out.println(arr[4]);
            // try代码块中异常之后的代码不再运行
            System.out.println("After the exception");
        } catch (Exception e) {
            System.out.println("now is runtimeException");
            e.printStackTrace();
        }

        // 解决了异常后，try/catch代码块后面的程序会继续执行
        System.out.println("runtimeException is complete");
    }

    public static void solveRuntimeException2() {
        String str = null;
        if (str != null){
            boolean test = str.equals("test");
        }
//        System.out.println(test);
        // 解决了异常后，try/catch代码块后面的程序会继续执行
        System.out.println("runtimeException is complete");
    }

    public static void solveRuntimeException3() throws Exception {
        int[] arr = {4, 5, 2, 6};
        System.out.println(arr[4]);

        // 解决了异常后，try/catch代码块后面的程序会继续执行
        System.out.println("runtimeException is complete");
    }

    public static void main(String[] args) {
        // testRuntimeException();
//        solveRuntimeException();
        try {
            solveRuntimeException3();
        } catch (Exception e) {
            System.out.println("After the exception");
        }
    }
}

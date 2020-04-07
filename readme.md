# Exception

## 1、异常

异常机制是指**当程序出现错误**后，程序如何处理。具体来说，异常机制提供了程序退出的安全通道。当出现错误后，程序执行的流程发生改变，程序的控制权转移到异常处理器。

![异常类型树](D:\MyCode\git\exception\异常类结构.jpg)

注意：异常可能是以Error结尾的。

## 2、运行时异常
**运行时异常**： RuntimeException，是Exception的直接子类。

**特点**：编译时不会报错，在程序运行时会抛出异常，代码中需要开发者仔细检查来避免这类异常。

常见的运行时异常有：

| 异常类                    | 名称         | 举例                                |
| ------------------------- | ------------ | ----------------------------------- |
| ArithmeticException       | 算术异常     | 1/0                                 |
| NullPointerException      | 空指针异常   | obj.toString();   --->当obj是null时 |
| IndexOutOfBoundsException | 索引越界异常 |                                     |
| ClassCastException        | 类转换异常   |                                     |

## 3、非运行时异常

**非运行时异常**：也称Checked异常。Exception除了RuntimeException子类，其他子类都是非运行时异常。

**特点**：编译时就会报错，需要使用try/catch或者throws在开发时处理的异常。

常见的非运行时异常有：

| 异常类               | 名称     | 举例                                            |
| -------------------- | -------- | :---------------------------------------------- |
| IOException          | 算术异常 | new FileInputStream(path);   --->当path不存在时 |
| InterruptedException | 中断异常 | Thread.sleep(3000);                             |

## 4、Error

在异常之外，还会有一类错误Error

异常和错误的区别是：异常能被程序本身可以处理，错误是无法处理。

如：OutOfMemoryError，内存溢出

StackOverflowError，堆栈溢出等。
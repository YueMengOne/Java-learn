# Java 学习笔记

## 一、环境配置

### Window 环境

#### 1 下载JDK

下载官网：[Java Downloads | Oracle 中国](https://www.oracle.com/cn/java/technologies/downloads/)
默认安装的地址（其中的一个）：

- C:\Program Files (x86)\Java
- C:\Program Files\Java

#### 2 配置环境变量

> 找不到系统变量？[点这查找配置环境](#99 找到配置环境)

1. 在系统变量添加 JAVA_HOME
   ➡

#### 99 找到配置环境

1. 简洁方法
   Windows键打开【开始菜单】➡搜索【系统变量】
2. 详细方法
   1. Win 7-10
      ➡Windows键打开【开始菜单】
      ➡搜索【控制面板】
      ➡进入【控制面板】后，右上角查看方式改为【类别】
      ➡进入【系统与安全】
      ➡【系统】
      ➡左边找到【系统变量】
   2. Win 11
      ➡进入【设置】
      ➡【系统】
      ➡【系统信息】
      ➡在相关链接找到【高级系统设置】
      ➡右下角【环境变量】

## 二、基础语法

### 01 注释

- 单行注释
  ```java
  // 单行注释
  ```

- 多行注释
  ```java
  /*
  多行注释
  */
  ```

- 文档注释
  ```java
  /**
  文档注释
  */
  ```

### 02 字面量

```java
// 整数
System.out.println(10);
System.out.println(-10);

// 浮点数
System.out.println(10.0);
System.out.println(-3.14);

// 字符串
System.out.println("Hello World");
System.out.println("中文");

// 字符
System.out.println('a');
System.out.println('男');

// 布尔
System.out.println(true);
System.out.println(false);
```

### 03 变量

1. 定义变量
   ```java
   // 数据类型 变量名 = 数据值
   int a, b, c;         // 声明三个int型整数：a、b、c。
   int d = 3, e, f = 5; // 声明三个整数并赋予初值。
   byte z = 22;         // 声明并初始化z。
   double pi = 3.14159; // 声明了pi。
   char x = 'x';        // 变量x的值是字符'x'。
   ```

2. 使用变量

   - 打印输出
     ```java
     int a = 10;
     System.out.println(a);
     ```

   - 参与计算
     ```java
     int a = 10;
     int b = 5;
     System.out.println(a+b);
     ```

   - 修改记录到值
     ```java
     int a = 10;
     int b = 5;
     int c = a + b;
     ```

3. 使用场景

   - 重复使用某个值
   - 某个数据经常发生变化

4. 注意事项

   1. 一个变量只能存一个值
   2. 变量名不允许重复定义
   3. 在一条语句中可以定义多个变量
   4. 变量在使用之前必须要赋值

5. 算法案例
   ```java
   public class ab_VariableTest {
       // 主入口
       public static void main(String[] args) {
           // 一开始没有乘客
           int count = 0;
           // 第一站：上去一位乘客
           count = count + 1;
           // 第二站：上去两位乘客，下来一位乘客
           count = count + 2 - 1;
           // 第三站：上去两位乘客，下来一位乘客
           count = count + 2 - 1;
           // 第四站：下来一位乘客
           count = count - 1;
           // 第五站：上去一位乘客
           count = count + 1;
           // 请问：到了终点站有多少位乘客
           System.out.println("到了终点站还有：" + count + " 名乘客");
       }
   }
   ```

### 04 数据类型

整数和小数取值范围大小关系：
$$
double>fkoat>long>int>short>byte
$$

1. 基本数据类型 - 四类八种

   1. 整数

      - byte
        ```java
        byte a = 10;
        System.out.println(a);
        ```

      - short
        ```java
        short b = 20;
        System.out.println(b);
        ```

      - int
        ```java
        int c = 30;
        System.out.println(c);
        ```

      - long

        > ⚠️ 需要加入 L 标识

        ```java
        long d = 9999999999L;
        System.out.println(d);
        ```

   2. 浮点数

      - float

        > ⚠️ 需要加入 F 标识

        ```java
        float e = 3.14F;
        System.out.println(e);
        ```

      - double
        ```java
        double f = 3.14;
        System.out.println(f);
        ```

   3. 字符

      - char
        ```java
        char g = '月';
        System.out.println(g);
        ```

   4. 布尔

      - boolean
        ```java
        boolean h = true;
        System.out.println(h);
        ```

2. 引用数据类型

### 05 标识符

1. 标识符命名规范 --- 硬性要求
   - 所有的标识符都应该以**字母（A-Z或者a-z）,美元符（$）、或者下划线（_）**开始
   - 首字符之后可以是**字母（A-Z 或者 a-z）,美元符（$）、下划线（_）**或**数字**的任何字符组合
   - 关键字不能用作标识符
   - 标识符是**大小写敏感**的
2. 标识符命名规范 --- 软性要求
   - 小驼峰命名法：方法、变量
     - 标识符是一个单词的时候，全部小写：
       name
     - 标识符是多个单词组成的时候，第一个单词首字母小写，其他单词首字母大写：
       firstName
   - 大坨峰命名法：类名
     - 标识符是一个单词的时候，首字母大写：
       Student
     - 标识符是多个单词组成的时候，每个单词首字母大写：
       GoodStudent
   - 每个变量都应该**见名知意**

### 06 运算符

#### 01 算数运算符

>1. 整数参与计算，结果只能得到整数
>2. 小数参与计算，结果有可能是不精确的。如果需要精确计算，那么需要。。。

- 加减
  - 加
    - 数字相加：
      数字进行运算时，数据类型不一样不能运算，需要**转成**一样的，才能运算
      - 隐式转换（自动类型提升） - 小 ➡️ 大
        - byte、short、chat 在运算时，都会直接提升为 int ，然后再运算
        - 取值范围小的会提升为大的再计算
      - 强制转换
        - 数据类型 变量名 = 数据类型 （变量名｜计算公式）
    - 字符串相加：
      将前后数据进行拼接，并产生一个新的字符串
      - 从左到右，逐个执行
    - 字符相加：
      对应 Ascii 码表转为数字后再计算
- 乘除
- 取模（取余）

#### 02 自增自减运算符

- ++
  - a++（先用后加）
  - ++a（先加后用）
- --

#### 03 赋值运算符

- =
- +=
  将左边和右边相加，然后把结果赋值到左边
- -=
- *=
- /=
- %=

#### 04 关系运算符

- ==
- !=
- \>
- \>=
- <
- <=

#### 05 逻辑运算符

- &  并且（两边都为真，结果才是真）
- |  或者（两边值都为假，结果才是假）
- ^  异或（不同为真，相同为假）
- !  非（取反）

> 短路逻辑运算符
> 当前者能判定出结果时，直接输出结果，跳过后者判断
>
> - &&  当前者为假时，直接判定为假
> - ||     当前者为真时，直接判定为真

#### 06 三元运算符

- ?
  ```java
  a == b ? "True" : "False"
  关系表达式 ? 表达式1 : 表达式2
  ```

  

  >- 首先计算关系表达式的值
  >- 如果值为true，表达式1的值就是运算结果
  >- 如果值为false，表达式2的值就是运算结果

#### 07 运算符优先级

1. 小括号优先所有

### 07 流程控制语句

#### 01 顺序结构

#### 02 分支结构

##### 01 if 语句

```
if (关系表达式1){
	语句体1;
} else if (关系表达式2){
	语句体2;
}  else if (关系表达式3){
	语句体3;
}  else (关系表达式4){
	语句体4;
} 
```

##### 02 switch 语句

```
switch(表达式){
	case 值1:
		语句体1;
		break;
	case 值2:
		语句体2;
		break;
	default:
		语句体n;
		break;
}
```



#### 03 循环结构

##### 01 for 循环

```
for(初始化语句;条件判断语句;条件控制语句){
循环体语句;
}
```

##### 02 while 循环

```
初始化语句;
while(条件判断语句){
	循环体语句;
	条件控制语句;
}
```

##### 03 do...while

```
初始化语句;
do{
	循环体语句;
	条件控制语句;
}while(条件判断语句);
```

##### 04 高级应用

1. 死循环

   1. for 死循环
      ```java
      for (;;){
      	System.out.println("死循环");
      }
      ```

   2. while 死循环
      ```java
      while (true){
                  System.out.println("死循环");
              }
      ```

2. 跳转控制语句












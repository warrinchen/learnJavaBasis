package org.example.OverrideAndHide;

import java.util.Date;

public class Father {

    public String name;
    public int age;
    public String address;
    public Date createTime;
    public static int v1 = 1;
    public static int v2 = 2;
    public  int v3 = 3;
    public  int v4 = 4;
//    private int v5 = 5;

    // Overload
    // 构造函数的重载
    public Father(){
        this.name = "null name";
        this.age = 22;
        this.address = "null address";
        this.createTime = new Date();
    }
    public Father(String name, int age, String address) {
        this();
        this.name = name;
        this.age = age;
        this.address = address;
    }

    protected static void work(){
        System.out.println("I'm Father, working forever!");
    }

    // 普通函数的重载
    // 在同一个类的同一个作用域内，同名函数的参数个数和类型至少一个不同，而与返回值和参数名称无关。
    // 在声明时，函数名和参数个数名称相同则视为同一个函数
//    public void say(){
//        System.out.println(666);
//    }
    public int say(){
        System.out.println("This is a Father class.");
        return 0;
    }
    public void say(String name){
        System.out.println("This is a Father class."
                + "And my name is" + name);
    }
    public void say(String name, String address){
        System.out.println("This is a Father class."
                + "My name is" + name + ". And my address is " + address);
    }
    public final void say(String name, int age){
        System.out.println("This is a Father class."
                + "My name is" + name + ". And I'm " + age + "years old.");
    }
}

package org.example.OverrideAndHide;

public class Son extends Father{
    public String firstName;
    public String lastName;

    // 子类属性和父类非private属性重名时触发隐藏，在子类中其修饰符和类型任意改变
    // private属性不能被覆盖因为子类无法访问
    public static int v1 = 11;
    public int v2 = 21;
    public static int v3 = 31;
    public final long v4 = 41;

    public Son() {
        this.firstName = "null firstName";
        this.lastName = "null lastName";
    }

    // static修饰的子类和父类方法名、参数相同时触发隐藏，权限不能缩小，返回值类型不能变
    public static void work(){
        System.out.println("I'm Son, will working forever!");
    }

    @Override
    // 子类覆盖父类中的方法。父类的构造函数、private方法不能被覆盖（构造函数需要用以构造其所属的类）
    // 触发覆盖时， 即子类方法名与参数和父类中的相同时，返回值类型必须一致，权限必须不缩小
    public int say(){
        System.out.println("This is a Son class.");
        return 1;
    }
}

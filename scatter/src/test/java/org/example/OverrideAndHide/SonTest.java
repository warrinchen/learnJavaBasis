package org.example.OverrideAndHide;

import org.junit.Test;

public class SonTest {

    @Test
    public void say() {
        Father father = new Father();
        Son son = new Son();
        son.say();
        Father.work();
        father.work(); // object并不提示work()方法
        Son.work();
        son.work();
        Father becameFather = son;
        becameFather.work(); // 被隐藏的方法，在子类被强制转换成父类后，调用的是父类中的方法
        becameFather.say();  // 被覆盖的方法，在子类被强制转换成父类后，调用的还是子类自身的方法

        System.out.println(father.v1); //属性
        System.out.println(father.v2);
        System.out.println(father.v3);
        System.out.println(father.v4);

        System.out.println(son.v1);
        System.out.println(son.v2);
        System.out.println(son.v3);
        System.out.println(son.v4);

        System.out.println(becameFather.v1);
        System.out.println(becameFather.v2);
        System.out.println(becameFather.v3);
        System.out.println(becameFather.v4);
    }
}
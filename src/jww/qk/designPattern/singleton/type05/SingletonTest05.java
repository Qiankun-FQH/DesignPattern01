package jww.qk.designPattern.singleton.type05;

import jww.qk.designPattern.singleton.type01.Singleton;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -15:54
 * @title 双重检查
 **/
public class SingletonTest05
{
    public static void main(String[] args){
        Singleton singleton =
                Singleton.getInstance();
        Singleton singleton2 =
                Singleton.getInstance();

        System.out.println(singleton == singleton2);
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());
    }
}


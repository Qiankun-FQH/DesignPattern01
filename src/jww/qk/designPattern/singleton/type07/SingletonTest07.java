package jww.qk.designPattern.singleton.type07;


/**
 * @author Qiankun
 * @date 2020/2/17 0017 -15:54
 * @title 懒汉式
 **/
public class SingletonTest07
{
    public static void main(String[] args){
        Singleton singleton =
                Singleton.INSTANCE;
        Singleton singleton2 =
                Singleton.INSTANCE;

        System.out.println(singleton == singleton2);
        System.out.println(singleton.hashCode());
        System.out.println(singleton2.hashCode());
    }
}


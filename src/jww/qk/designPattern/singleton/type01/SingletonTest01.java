package jww.qk.designPattern.singleton.type01;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -15:54
 * @title 饿汉式
 **/
public class SingletonTest01 {
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


package jww.qk.designPattern.singleton.type06;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -16:06
 * @title 静态内部类
 **/
public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){}

    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }

    public static synchronized Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }

}

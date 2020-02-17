package jww.qk.designPattern.singleton.type01;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -15:55
 * @title 饿汉式（静态常量）
 **/
public class Singleton {
    private Singleton(){

    }

    private final static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}

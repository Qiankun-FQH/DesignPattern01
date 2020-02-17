package jww.qk.designPattern.singleton.type02;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -15:55
 * @title 饿汉式（静态代码块）
 **/
public class Singleton {
    private  static Singleton instance;

    private Singleton(){

        instance = new Singleton();
    }

    public static Singleton getInstance() {
        return instance;
    }
}

package jww.qk.designPattern.singleton.type05;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -16:06
 * @title 双重检查（线程安全，效率高）
 **/
public class Singleton {

    private static volatile Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null)
                    instance = new Singleton();
            }
        }
        return instance;
    }

}

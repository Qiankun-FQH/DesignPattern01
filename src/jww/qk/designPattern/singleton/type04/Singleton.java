package jww.qk.designPattern.singleton.type04;

/**
 * @author Qiankun
 * @date 2020/2/17 0017 -16:06
 * @title 懒汉式（线程安全）
 **/
public class Singleton {

    private static  Singleton instance;

    private Singleton(){}

    public static synchronized Singleton getInstance(){
        if(instance == null){
            instance = new Singleton();
        }
        return instance;
    }

}

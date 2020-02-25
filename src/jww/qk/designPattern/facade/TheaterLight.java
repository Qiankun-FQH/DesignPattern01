package jww.qk.designPattern.facade;

/**
 * @author Administrator
 * @date 2020-${MONTER}-25 14:47
 * @title
 **/
public class TheaterLight {
    private static TheaterLight instance =
            new TheaterLight();

    public static TheaterLight getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("TheaterLight 打开");
    }
    public void off(){
        System.out.println("TheaterLight 关闭");
    }
    public void play(){
        System.out.println("TheaterLight playing");
    }

    public void pause(){
        System.out.println("TheaterLight 暂停");
    }
}

package jww.qk.designPattern.facade;

/**
 * @author Administrator
 * @date 2020-${MONTER}-25 14:47
 * @title
 **/
public class DVDPlayer {
    private static DVDPlayer instance =
            new DVDPlayer();

    public static DVDPlayer getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("dvd 打开");
    }
    public void off(){
        System.out.println("dvd 关闭");
    }
    public void play(){
        System.out.println("dvd playing");
    }

    public void pause(){
        System.out.println("dvd 暂停");
    }
}

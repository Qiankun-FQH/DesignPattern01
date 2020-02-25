package jww.qk.designPattern.facade;

/**
 * @author Administrator
 * @date 2020-${MONTER}-25 14:47
 * @title
 **/
public class Stereo {
    private static Stereo instance =
            new Stereo();

    public static Stereo getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("Stereo 打开");
    }
    public void off(){
        System.out.println("Stereo 关闭");
    }
    public void play(){
        System.out.println("Stereo playing");
    }

    public void pause(){
        System.out.println("Stereo 暂停");
    }
}

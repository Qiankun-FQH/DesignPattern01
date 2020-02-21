package jww.qk.designPattern.bridge.simple;

/**
 * @author Qiankun
 * @date 2020/2/21 0021 -10:30
 * @title
 **/
public class Vivo implements Brand {
    @Override
    public void open() {
        System.out.println("Vivo开机");
    }

    @Override
    public void close() {
        System.out.println("Vivo关机");
    }

    @Override
    public void call() {
        System.out.println("Vivo打电话");
    }
}

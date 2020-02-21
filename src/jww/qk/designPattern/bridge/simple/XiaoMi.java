package jww.qk.designPattern.bridge.simple;

/**
 * @author Qiankun
 * @date 2020/2/21 0021 -10:29
 * @title
 **/
public class XiaoMi implements Brand {

    @Override
    public void open() {
        System.out.println("小米开机");
    }

    @Override
    public void close() {
        System.out.println("小米关机");
    }

    @Override
    public void call() {
        System.out.println("小米打电话");
    }
}

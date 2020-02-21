package jww.qk.designPattern.bridge.simple;

/**
 * @author Qiankun
 * @date 2020/2/21 0021 -10:32
 * @title
 **/
public class FoldedPhone extends Phone {
    public FoldedPhone(Brand brand) {
        super(brand);
    }

    public void open(){
        super.open();
        System.out.println("折叠样式手机");
    }
    public void close(){
        super.close();
        System.out.println("折叠样式手机");
    }
    public void call(){
        super.call();
        System.out.println("折叠样式手机");

    }
}

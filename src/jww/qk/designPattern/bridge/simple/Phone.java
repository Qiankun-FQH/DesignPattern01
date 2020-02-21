package jww.qk.designPattern.bridge.simple;

/**
 * @author Qiankun
 * @date 2020/2/21 0021 -10:31
 * @title
 **/
public abstract class Phone {
    private Brand brand;

    public Phone(Brand brand) {
        this.brand = brand;
    }

    protected void open(){
        this.brand.open();
    };
    protected void close(){
        this.brand.close();
    };
    protected void call(){
        this.brand.call();
    };
}

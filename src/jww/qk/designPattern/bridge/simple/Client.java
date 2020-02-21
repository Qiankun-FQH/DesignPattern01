package jww.qk.designPattern.bridge.simple;

/**
 * @author Qiankun
 * @date 2020/2/21 0021 -10:36
 * @title
 **/
public class Client {
    public static void main(String[] args){
        FoldedPhone phone = new FoldedPhone(
                new XiaoMi()
        );

        phone.open();
        phone.close();
        phone.call();

        phone = new FoldedPhone(
                new Vivo()
        );

        phone.open();
        phone.close();
        phone.call();

        UpRightPhone phone1 = new UpRightPhone(new Vivo());

        phone1.open();
        phone1.close();
        phone1.call();
    }
}

package jww.qk.designPattern.adapter.objectAdapter;

/**
 * @author Qiankun
 * @date 2020/2/21 0021 -9:38
 * @title
 **/
public class Client {
    public static void main(String[] args){
        Phone phone = new Phone();

        phone.charging(
                new VoltageAdapter(
                        new Voltaget220V()
                ));
    }
}

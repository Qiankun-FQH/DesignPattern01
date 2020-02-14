package jww.qk.principle.inversion;

/**
 * @author Qiankun
 * @date 2020/2/14 0014 -14:21
 **/
public class Improve_Person {
    /**
     * 接受消息
     */
    public void receive(Improve_IReceiver email){
        System.out.println(email.getInfo());
    }
}

package jww.qk.principle.inversion;

/**
 * @author Qiankun
 * @date 2020/2/14 0014 -14:10
 **/
public class Person {
    /**
     * 接受消息
     */
    public void receive(Email email){
        System.out.println(email.getInfo());
    }
}

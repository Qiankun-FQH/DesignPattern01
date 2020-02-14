package jww.qk.principle.inversion;

/**
 * @author Qiankun
 * @date 2020/2/14 0014 -14:09
 * @title 依赖倒转原则
 **/
public class DependecyInversion {
    public static void main(String[] args){
        Person person = new Person();
        person.receive(new Email());
    }
}

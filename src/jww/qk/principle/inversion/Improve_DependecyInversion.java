package jww.qk.principle.inversion;

/**
 * @author Qiankun
 * @date 2020/2/14 0014 -14:09
 * @title 依赖倒转原则
 **/
public class Improve_DependecyInversion {
    public static void main(String[] args){
        Improve_Person person = new Improve_Person();
        person.receive(new Improve_Email());

        Improve_Person person1 = new Improve_Person();
        person1.receive(new WeiXin());
    }
}

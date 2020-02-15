package jww.qk.principle.liskov;

/**
 * @author Qiankun
 * @date 2020/2/15 0015 -18:47
 * @title 里氏替换原则
 **/
public class Liskov {
    public static void main(String[] args){
        A a = new A();
        System.out.println("11 - 3 = " + a.jian(11, 3));
        System.out.println("1-8=" + a.jian(1,8));

        System.out.println("----------------------");
        B b = new B();
        System.out.println("11-3="+b.jian(11,3));
        System.out.println("1-8="+b.jian(1,8));
        System.out.println("11+3="+b.jian(11,3));

    }
}

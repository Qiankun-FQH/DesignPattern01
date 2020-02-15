package jww.qk.principle.liskov;

/**
 * @author Qiankun
 * @date 2020/2/15 0015 -18:47
 * @title 里氏替换原则
 **/
public class ImproveLiskov {
    public static void main(String[] args){
        Improve_A a = new Improve_A();
        System.out.println("11 - 3 = " + a.jian(11, 3));
        System.out.println("1-8=" + a.jian(1,8));

        System.out.println("----------------------");
        Improve_B b = new Improve_B();
        System.out.println("11-3=" + b.jian(11,3));
        System.out.println("1-8="+b.jian(1,8));
        System.out.println("11+3="+b.jian(11,3));
        // System.out.println("11+3="+b.fun3(11,3));

    }
}

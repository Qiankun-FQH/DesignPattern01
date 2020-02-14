package jww.qk.principle.segregation;

/**
 * @author Qiankun
 * @date 2020/2/14 0014 -13:39
 * @title 接口隔离原则
 **/
public class Improve_Segregation01 {
    public static void main(String[] args){
        /**
         * Improve_A Improve_B Improve_C Improve_D
         * Improve_Inteface01_Inf01
         * Improve_Inteface01_Inf02
         * Improve_Inteface01_Inf03
         */
        Improve_A a = new Improve_A();
        a.depend01(new Improve_B());
        a.depend02(new Improve_B());
        a.depend03(new Improve_B());

        Improve_C c = new Improve_C();
        c.depend01(new Improve_D());
        c.depend02(new Improve_D());
        c.depend03(new Improve_D());
    }
}

package jww.qk.principle.segregation;

/**
 * @author Qiankun
 * @date 2020/2/14 0014 -13:28
 **/
public class Improve_A {
    public void depend01(Improve_Interface_Inf01 i){
        i.operation01();
    }
    public void depend02(Improve_Interface_Inf02 i){
        i.operation02();
    }
    public void depend03(Improve_Interface_Inf02 i){
        i.operation03();
    }
}

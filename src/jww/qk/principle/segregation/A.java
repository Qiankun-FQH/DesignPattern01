package jww.qk.principle.segregation;

/**
 * @author Qiankun
 * @date 2020/2/14 0014 -13:28
 **/
public class A {
    public void depend01(Interface01 i){
        i.operation01();
    }
    public void depend02(Interface01 i){
        i.operation02();
    }
    public void depend03(Interface01 i){
        i.operation03();
    }
}

package jww.qk.principle.liskov;

/**
 * @author Qiankun
 * @date 2020/2/15 0015 -18:48
 **/
public class B  extends A{
    public int jian(int a,int b){
        return a - b + 1;
    }
    public int add(int a, int b){
        return jian(a, b) + 9;
    }
}

package jww.qk.principle.liskov;

/**
 * @author Qiankun
 * @date 2020/2/15 0015 -18:48
 **/
public class Improve_B extends Base{
    private A a = new A();

    public int jian(int a,int b){
        return a - b + 1;
    }

    public int add(int a, int b){
        return jian(a, b) + 9;
    }

    public int fun3(int a, int b){
        return this.a.jian(a,b);
    }
}

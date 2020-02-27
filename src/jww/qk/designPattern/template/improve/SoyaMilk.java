package jww.qk.designPattern.template.improve;

/**
 * @author Administrator
 * @date 2020-02-27 16:00
 * @title
 **/
public abstract class SoyaMilk {

    final void make(){
        select();
        if(isUser()){
            add();
        }
        soak();
    }

    void select(){
        System.out.println("开始");
    }
    abstract void add();

    void soak(){
        System.out.println("结束");
    }

    boolean isUser(){
        return true;
    }

}

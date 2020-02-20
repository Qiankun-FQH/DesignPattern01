package jww.qk.designPattern.build.exercise;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -9:51
 * @title
 **/
public  interface DoFoodBuilder {
    DoFood doFood = new DoFood();

    public abstract void xicai();

    public abstract void qiecai();

    public abstract void chaocai();

    public abstract void chengcai();

    public  DoFood doFood();
}

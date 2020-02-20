package jww.qk.designPattern.build.exercise;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -9:54
 * @title
 **/
public class DoFoodDirector{

    DoFoodBuilder doFoodBuilder = null;


    public void setDoFoodBuilder(DoFoodBuilder doFoodBuilder) {
        this.doFoodBuilder = doFoodBuilder;
    }

    public DoFood doFoodBuilder(){
        doFoodBuilder.xicai();
        doFoodBuilder.qiecai();
        doFoodBuilder.chaocai();
        doFoodBuilder.chengcai();
        return doFoodBuilder.doFood();
    }

}

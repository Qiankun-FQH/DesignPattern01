package jww.qk.designPattern.build.exercise;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -10:05
 * @title
 **/
public class Client {

    public static void main(String[] args){

        ChaoQingCaiFood chaoQingCaiFood = new ChaoQingCaiFood();

        DoFoodDirector doFoodDirector = new DoFoodDirector();

        doFoodDirector.setDoFoodBuilder(chaoQingCaiFood);

        doFoodDirector.doFoodBuilder();

    }

}

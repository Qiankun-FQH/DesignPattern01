package jww.qk.designPattern.build.exercise;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -9:59
 * @title
 **/
public class ChaoQingCaiFood implements DoFoodBuilder {
    //DoFood doFood = new DoFood();

    @Override
    public void xicai() {
        System.out.println("洗青菜");

    }

    @Override
    public void qiecai() {
        System.out.println("切青菜");
    }

    @Override
    public void chaocai() {
        System.out.println("炒青菜");
    }

    @Override
    public void chengcai() {
        System.out.println("盛青菜");
    }

    @Override
    public DoFood doFood() {
        return null;
    }


}

package jww.qk.designPattern.build.improve;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -9:28
 * @title
 **/
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println("5米\t");
    }

    @Override
    public void buildWalls() {
        System.out.println("10米\t");
    }

    @Override
    public void roofed() {
        System.out.println("普通米\t");
    }
}

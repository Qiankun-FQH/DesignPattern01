package jww.qk.designPattern.build.improve;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -9:14
 * @title
 **/
public abstract class HouseBuilder {

    protected House house = new  House();

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public House buildHouse(){
        return house;
    }
}

package jww.qk.designPattern.build.simple;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -9:14
 * @title
 **/
public abstract class AbstactHouse {

    public abstract void buildBasic();
    public abstract void buildWalls();
    public abstract void roofed();

    public void build(){
        buildBasic();
        buildWalls();
        roofed();
    }
}

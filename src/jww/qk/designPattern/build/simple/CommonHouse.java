package jww.qk.designPattern.build.simple;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -9:15
 * @title
 **/
public class CommonHouse extends AbstactHouse{
    @Override
    public void buildBasic() {
        System.out.println("普通房子打地基");

                
    }

    @Override
    public void buildWalls() {
        System.out.println("普通房子盖房");

    }

    @Override
    public void roofed() {
        System.out.println("普通房子盖屋顶");

    }
}

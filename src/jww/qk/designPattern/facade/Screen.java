package jww.qk.designPattern.facade;

/**
 * @author Administrator
 * @date 2020-${MONTER}-25 14:47
 * @title
 **/
public class Screen {
    private static Screen instance =
            new Screen();

    public static Screen getInstance() {
        return instance;
    }

    public void up(){
        System.out.println("Screen up");
    }
    public void down(){
        System.out.println("Screen down");
    }


}

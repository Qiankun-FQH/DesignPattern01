package jww.qk.designPattern.facade;

/**
 * @author Administrator
 * @date 2020-${MONTER}-25 14:47
 * @title
 **/
public class Popcorn {
    private static Popcorn instance =
            new Popcorn();

    public static Popcorn getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("popcorn on");
    }
    public void off(){
        System.out.println("popcorn ff");
    }
    public void pop(){
        System.out.println("popcorn poping");
    }


}

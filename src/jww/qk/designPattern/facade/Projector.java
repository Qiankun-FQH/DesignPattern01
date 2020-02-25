package jww.qk.designPattern.facade;

/**
 * @author Administrator
 * @date 2020-${MONTER}-25 14:47
 * @title
 **/
public class Projector {
    private static Projector instance =
            new Projector();

    public static Projector getInstance() {
        return instance;
    }

    public void on(){
        System.out.println("Projector on");
    }
    public void off(){
        System.out.println("Projector ff");
    }
    public void focus(){
        System.out.println("Projector focus");
    }


}

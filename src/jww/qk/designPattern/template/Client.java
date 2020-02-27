package jww.qk.designPattern.template;

/**
 * @author Administrator
 * @date 2020-02-27 16:07
 * @title
 **/
public class Client {
    public static void main(String[] args){

        SoyaMilk redSoyaMilk = new RedSoyaMilk();
        redSoyaMilk.make();
        System.out.println("----");
        SoyaMilk penutSoyaMilk = new PenutSoyaMilk();
        penutSoyaMilk.make();
    }
}

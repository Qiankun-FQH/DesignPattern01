package jww.qk.designPattern.template.improve;

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

        SoyaMilk milk2 = new Milk2();
        milk2.make();
    }
}

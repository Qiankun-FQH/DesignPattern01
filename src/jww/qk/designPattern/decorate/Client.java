package jww.qk.designPattern.decorate;

/**
 * @author Qiankun
 * @date 2020/2/23 0023 -8:50
 * @title
 **/
public class Client {
    public static void main(String[] args){
        Drink order = new LongBlack();
        System.out.println("feiyong1 = " + order.cost());

        order = new Milk(order);
        System.out.println("feiyong1 = " + order.cost());

        order = new Chocolate(order);
        System.out.println("feiyong1 = " + order.cost());

        order = new Chocolate(order);
        System.out.println("feiyong1 = " + order.cost());

        Drink decaf = new Decaf();
        decaf = new Milk(decaf);
        decaf = new Soy(decaf);
        System.out.println("费用：" + decaf.cost());
        System.out.println("描述：" + decaf.getDes());



    }
}

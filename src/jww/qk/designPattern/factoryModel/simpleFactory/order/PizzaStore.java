package jww.qk.designPattern.factoryModel.simpleFactory.order;

/**
 * @author Qiankun
 * @date 2020/2/19 0019 -14:32
 * @title
 **/
public class PizzaStore {
    public static void main(String[] args){
        //OrderPizza pizza = new OrderPizza();
        //OrderPizza orderPizza = new OrderPizza(new SimpleFactory());

       // new OrderPizza(new SimpleFactory());

        new OrderPizza2();
        System.out.println("退出");
        

    }
}

package jww.qk.designPattern.factoryModel.simpleFactory.order;

import jww.qk.designPattern.factoryModel.simpleFactory.pizza.CheesePizza;
import jww.qk.designPattern.factoryModel.simpleFactory.pizza.GreekPizza;
import jww.qk.designPattern.factoryModel.simpleFactory.pizza.PepperPizza;
import jww.qk.designPattern.factoryModel.simpleFactory.pizza.Pizza;

/**
 * @author Qiankun
 * @date 2020/2/19 0019 -14:41
 * @title
 **/
public class SimpleFactory {
    public Pizza createPizza(String orderType){
        Pizza  pizza = null;
        System.out.println("使用简单工厂模式");

            if (orderType.equals("greek")) {
				pizza = new GreekPizza();
				pizza.setName(" 希腊披萨 ");
                System.out.println("希腊");
			} else if (orderType.equals("cheese")) {
				pizza = new CheesePizza();
				pizza.setName(" 奶酪披萨 ");
                System.out.println("奶酪");
			} else if (orderType.equals("pepper")) {
				pizza = new PepperPizza();
				pizza.setName("胡椒披萨");
                System.out.println("胡椒");
			} else if(orderType.equals("china")){
                pizza = new PepperPizza();
                pizza.setName("中国披萨");
            }
            return pizza;
    }
}

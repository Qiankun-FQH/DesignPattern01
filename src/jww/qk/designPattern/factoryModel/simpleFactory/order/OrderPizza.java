package jww.qk.designPattern.factoryModel.simpleFactory.order;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


import jww.qk.designPattern.factoryModel.simpleFactory.pizza.Pizza;

public class OrderPizza {

    // 构造器
//	public OrderPizza() {
//		Pizza pizza = null;
//		String orderType; // 订购披萨的类型
//		do {
//			orderType = getType();
//			if (orderType.equals("greek")) {
//				pizza = new GreekPizza();
//				pizza.setName(" 希腊披萨 ");
//			} else if (orderType.equals("cheese")) {
//				pizza = new CheesePizza();
//				pizza.setName(" 奶酪披萨 ");
//			} else if (orderType.equals("pepper")) {
//				pizza = new PepperPizza();
//				pizza.setName("胡椒披萨");
//			} else {
//				break;
//			}
//			//输出pizza 制作过程
//			pizza.prepare();
//			pizza.bake();
//			pizza.cut();
//			pizza.box();
//
//		} while (true);
//	}





    // 写一个方法，可以获取客户希望订购的披萨种类
    private String getType() {
        try {
            BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("input pizza 种类:");
            String str = strin.readLine();
            return str;
        } catch (IOException e) {
            e.printStackTrace();
            return "";
        }
    }

    SimpleFactory simpleFactory;

    Pizza pizza = null;

    public OrderPizza(SimpleFactory simpleFactory){

    	setSimpleFactory(simpleFactory);

	}
    public void setSimpleFactory(SimpleFactory simpleFactory){
    	String orderType = "";
    	this.simpleFactory = simpleFactory;

    	do{
    		orderType = getType();
    		pizza = this.simpleFactory.createPizza(orderType);
    		if(pizza != null){
    			pizza.prepare();
    			pizza.bake();
    			pizza.cut();
    			pizza.box();
			}else{
				System.out.println("失败");
				break;
			}
		}while(true);
	}

}

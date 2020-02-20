package jww.qk.designPattern.factoryModel.simpleFactory.order;

import jww.qk.designPattern.factoryModel.simpleFactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author Qiankun
 * @date 2020/2/19 0019 -15:12
 * @title
 **/
public class OrderPizza2 {

    private SimpleFactory simpleFactory = new SimpleFactory();

    private Pizza pizza;

    public OrderPizza2(){
        String orderType = "";

        do{
            orderType = getType();
            pizza = simpleFactory.createPizza(orderType);
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
}

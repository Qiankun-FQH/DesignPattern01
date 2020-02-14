package jww.qk.principle.singleresponsibility;

/**
 * @author Qiankun
 * @date 2020/2/13 0013 -21:48
 * @title 单一职责原则
 **/
public class SingleResponsibility01 {
    public static void main(String[] args){

        /**
         * 方式一 违反单一职责原则
         */
        Vehicle vehicle = new Vehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        vehicle.run("飞机");


    }
}

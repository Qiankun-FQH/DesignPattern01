package jww.qk.principle.singleresponsibility;

/**
 * @author Qiankun
 * @date 2020/2/13 0013 -21:56
 * @title 单一职责原则
 **/
public class SingleResponsibility02 {
    public static void main(String[] args){
        RoadVehicle roadVehicle = new RoadVehicle();
        roadVehicle.run("摩托车");
        roadVehicle.run("汽车");

        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");

        WaterVehicle waterVehicle = new WaterVehicle();
        waterVehicle.run("船");
    }
}

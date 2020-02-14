package jww.qk.principle.singleresponsibility;

/**
 * @author Qiankun
 * @date 2020/2/13 0013 -22:04
 * @title 单一职责原则
 **/
public class SingleResponsibility03 {

    public static void main(String[] args){
        Vihicle02 vihicle02 = new Vihicle02();
        vihicle02.run("汽车");
        vihicle02.runAir("飞机");
        vihicle02.runWater("船");

    }
}


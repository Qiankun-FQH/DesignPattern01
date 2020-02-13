package jww.qk.principle.singleresponsibility;

/**
 * @author Qiankun
 * @date 2020/2/13 0013 -22:05
 **/
public class Vihicle02 {
        /**
         * 路上运行
         */
        public void run(String vehicle){
            System.out.println(vehicle + "在公路上运行");
        }
    /**
     * 天上运行
     */
    public void runAir(String vehicle){
        System.out.println(vehicle + "在天上运行");
    }
    /**
     * 天上运行
     */
    public void runWater(String vehicle){
        System.out.println(vehicle + "在水里运行");
    }
}

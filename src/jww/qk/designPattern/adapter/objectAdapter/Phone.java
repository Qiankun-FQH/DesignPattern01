package jww.qk.designPattern.adapter.objectAdapter;

/**
 * @author Qiankun
 * @date 2020/2/21 0021 -9:32
 * @title
 **/
public class Phone{
    public void charging(IVoltage5V iVoltage5V){
        if(iVoltage5V.output5V() == 5)
                 System.out.println(iVoltage5V.output5V() +"充电");
        else if(iVoltage5V.output5V() != 5)
            System.out.println("不能充电");
    }

}

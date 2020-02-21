package jww.qk.designPattern.adapter.classAdapter;

/**
 * @author Qiankun
 * @date 2020/2/21 0021 -9:32
 * @title
 **/
public class VoltageAdapter extends Voltaget220V implements IVoltage5V{

    @Override
    public int output5V() {
        int src = output();
        int dstV = src / 44;
        return dstV;
    }
}

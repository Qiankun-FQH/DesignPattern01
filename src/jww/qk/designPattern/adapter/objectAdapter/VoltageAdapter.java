package jww.qk.designPattern.adapter.objectAdapter;

/**
 * @author Qiankun
 * @date 2020/2/21 0021 -9:32
 * @title
 **/
public class VoltageAdapter implements IVoltage5V {

    private Voltaget220V v;

    public VoltageAdapter(Voltaget220V v) {
        this.v = v;
    }

    @Override
    public int output5V() {
        int dst = 0;

        if(null != v){
            int src = v.output220V();
            System.out.println("进行适配");
            dst = src / 44;
            System.out.println("适配完成");
        }
        return dst;
    }
}

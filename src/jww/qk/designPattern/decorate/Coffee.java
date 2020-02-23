package jww.qk.designPattern.decorate;

/**
 * @author Qiankun
 * @date 2020/2/23 0023 -8:41
 * @title
 **/
public class Coffee extends Drink{


    @Override
    public float cost() {
        return super.getPrice();
    }
}

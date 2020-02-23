package jww.qk.designPattern.decorate;

/**
 * @author Qiankun
 * @date 2020/2/23 0023 -8:48
 * @title
 **/
public class Milk extends  Decorate{


    public Milk(Drink obj) {
        super(obj);
        setDes(" 牛奶 ");
        setPrice(2.0f);
    }
}

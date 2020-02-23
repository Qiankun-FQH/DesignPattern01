package jww.qk.designPattern.decorate;

/**
 * @author Qiankun
 * @date 2020/2/23 0023 -8:48
 * @title
 **/
public class Chocolate extends  Decorate{


    public Chocolate(Drink obj) {
        super(obj);
        setDes(" 巧克力 ");
        setPrice(3.0f);
    }
}

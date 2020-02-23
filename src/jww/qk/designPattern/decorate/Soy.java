package jww.qk.designPattern.decorate;

/**
 * @author Qiankun
 * @date 2020/2/23 0023 -8:48
 * @title
 **/
public class Soy extends  Decorate{


    public Soy(Drink obj) {
        super(obj);
        setDes(" 豆浆 ");
        setPrice(1.5f);
    }
}

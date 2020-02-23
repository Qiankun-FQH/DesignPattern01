package jww.qk.designPattern.decorate;

/**
 * @author Qiankun
 * @date 2020/2/23 0023 -8:44
 * @title
 **/
public class Decorate extends Drink {

    private Drink obj;

    public Decorate(Drink obj) {
        this.obj = obj;
    }

    @Override
    public float cost() {
        return super.getPrice() + obj.cost();
    }

    @Override
    public String getDes() {
        return super.des + " " +
                super.getPrice()
                + " && " +
                obj.getDes();
    }
}

package jww.qk.designPattern.decorate;

/**
 * @author Qiankun
 * @date 2020/2/23 0023 -8:37
 * @title
 **/
public abstract class Drink {

    public String des;
    private float price = 0.0f;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDes() {
        return des;

    }

    public void setDes(String des) {
        this.des = des;
    }

    public abstract float cost();
}

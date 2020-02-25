package jww.qk.designPattern.flyweight;

/**
 * @author Administrator
 * @date 2020-${MONTER}-25 15:25
 * @title
 **/
public class ConcreteWebSite extends WebSite {


    private String type = "";

    public ConcreteWebSite(String type) {
        this.type = type;
    }

    @Override
    public void use(User user) {
        System.out.println(user + "    Web : " + type);
    }
}

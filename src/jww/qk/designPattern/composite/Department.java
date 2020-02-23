package jww.qk.designPattern.composite;

/**
 * @author Qiankun
 * @date 2020/2/23 0023 -9:25
 * @title
 **/
public class Department extends OranizationComponent{


    public Department(String name, String des) {
        super(name, des);
    }

    @Override
    protected void print() {
        System.out.println(getName());
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();

    }


}

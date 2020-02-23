package jww.qk.designPattern.composite;

import java.rmi.Remote;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Qiankun
 * @date 2020/2/23 0023 -9:20
 * @title
 **/
public class University extends OranizationComponent {

    List<OranizationComponent> oranizationComponents
            = new ArrayList<>();

    public University(String name, String des) {
        super(name, des);
    }

    @Override
    protected void add(OranizationComponent o) {
        oranizationComponents.add(o);
    }

    @Override
    protected void remove(OranizationComponent o) {
        oranizationComponents.remove(o);
    }

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public String getDes() {
        return super.getDes();
    }


    @Override
    protected void print() {
        System.out.println("--------------"+getName()+"-----");
        for(OranizationComponent a : oranizationComponents)
        {
            a.print();
        }
    }
}

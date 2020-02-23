package jww.qk.designPattern.composite;

/**
 * @author Qiankun
 * @date 2020/2/23 0023 -9:17
 * @title
 **/
public abstract class OranizationComponent {
    private String name;
    private String des;

    protected void add(OranizationComponent o){
        throw new UnsupportedOperationException();

    }
    protected void remove(OranizationComponent o){
        throw new UnsupportedOperationException();

    }

    public OranizationComponent(String name, String des) {
        this.name = name;
        this.des = des;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    protected abstract void print();

}

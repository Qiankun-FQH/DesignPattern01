package jww.qk.designPattern.proxy.dynamic_proxy;

/**
 * @author Administrator
 * @date 2020-${MONTER}-27 15:24
 * @title
 **/
public class TeacherDao implements  ITeacherDao {

    @Override
    public void teach() {
        System.out.println("授课");
    }
}

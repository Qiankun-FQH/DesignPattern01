package jww.qk.designPattern.proxy.static_proxy;

/**
 * @author Administrator
 * @date 2020-${MONTER}-27 15:07
 * @title
 **/
public class TeacherDao implements ITeacherDao{
    public void teach(){
        System.out.println("老师授课中。。。");
    }
}

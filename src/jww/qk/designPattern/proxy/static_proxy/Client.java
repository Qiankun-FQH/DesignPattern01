package jww.qk.designPattern.proxy.static_proxy;

/**
 * @author Administrator
 * @date 2020-${MONTER}-27 15:14
 * @title
 **/
public class Client {
    public static void main(String[] args){
        ITeacherDao dao = new TeacherDao();

        dao.teach();
        TeacherDaoProxy teacherDaoProxy = new TeacherDaoProxy(dao);

        teacherDaoProxy.teach();
    }
}

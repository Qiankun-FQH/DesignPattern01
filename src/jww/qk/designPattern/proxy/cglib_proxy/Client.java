package jww.qk.designPattern.proxy.cglib_proxy;

/**
 * @author Administrator
 * @date 2020-02-27 15:41
 * @title
 **/
public class Client {
    public static void main(String[] args){
        TeacherDao dao = new TeacherDao();
        TeacherDao proxyFactory =(TeacherDao) new ProxyFactory(dao).getProxyInstance();

        proxyFactory.teacher();
    }
}

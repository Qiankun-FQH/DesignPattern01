package jww.qk.designPattern.proxy.dynamic_proxy;

/**
 * @author Administrator
 * @date 2020-${MONTER}-27 15:30
 * @title
 **/
public class Client {
    public static void main(String[] args){
      ITeacherDao target =
                        new TeacherDao();
        Object proxyInstance = new ProxyFactory(target).getProxyInstance();
        ITeacherDao teacherDao = (ITeacherDao) proxyInstance;
        teacherDao.teach();
     //   System.out.println(teacherDao);
    }
}

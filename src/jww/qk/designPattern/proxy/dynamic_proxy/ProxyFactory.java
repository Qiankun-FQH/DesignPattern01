package jww.qk.designPattern.proxy.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @author Administrator
 * @date 2020-${MONTER}-27 15:24
 * @title
 **/
public class ProxyFactory  {
    private Object target;

    public ProxyFactory(Object target) {
        this.target = target;
    }

    public Object getProxyInstance(){
        return Proxy.newProxyInstance(
                target.getClass().getClassLoader(),
                target.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("JDK代理开始");
                        Object invoke = method.invoke(target, args);
                        System.out.println("JDK代理结束");
                        return invoke;
                    }
                });
    }

    public Object get(){
        return Proxy.newProxyInstance(
              target.getClass().getClassLoader(),
              target.getClass().getInterfaces(),
              new InvocationHandler(){
                  @Override
                  public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                      System.out.println("JDK代理开始");
                      Object invoke = method.invoke(target, args);
                      System.out.println("JDK代理结束");
                      return invoke;
                  }
              }
        );
    }
}
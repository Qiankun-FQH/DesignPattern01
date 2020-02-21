package jww.qk.designPattern.adapter.interfaceAdapter;

import java.util.Optional;

/**
 * @author Qiankun
 * @date 2020/2/21 0021 -9:59
 * @title
 **/
public class Client {
    public static void main(String[] args){
        AbsInterface absInterface = new AbsInterface(){
            @Override
            public void operation1() {
                System.out.println("实现方法一");
            }
        };
        absInterface.operation2();
    }
}

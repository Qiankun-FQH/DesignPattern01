package jww.qk.principle.inversion;

import jww.qk.principle.segregation.A;

public class Extra_DependencyPass {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        /**
         * 通过接口传递实现依赖
         */
//        HUAWEI huawei = new HUAWEI();
//        Apple apple = new Apple();
//        OpenAndClose openAndClose = new OpenAndClose();
//        openAndClose.open(huawei);
//        openAndClose.close(huawei);
//        openAndClose.open(apple);
//        openAndClose.close(apple);
        /**
         * 通过构造方法传递实现依赖
         */
//        HUAWEI huawei = new HUAWEI();
//        OpenAndClose openAndClose = new OpenAndClose(huawei);
//        openAndClose.open();
//        openAndClose.close();
//        Apple apple = new Apple();
//        OpenAndClose openAndClose1 = new OpenAndClose(apple);
//        openAndClose1.open();
//        openAndClose1.close();
        /**
         * 通过setter方法传递实现依赖
         */
        HUAWEI huawei = new HUAWEI();
        Apple apple = new Apple();
        OpenAndClose openAndClose = new OpenAndClose();
        /*不能*/       //openAndClose.open();
        /*返回空指针*/  //openAndClose.close();
        openAndClose.setTv(huawei);
        openAndClose.open();
        openAndClose.close();

        openAndClose.setTv(apple);
        openAndClose.open();
        openAndClose.close();

    }

}

// 方式1： 通过接口传递实现依赖
// 开关的接口
// interface IOpenAndClose {
//    public void open(ITV tv);
//
//    public void close(ITV tv);
//}
//
// interface ITV {
//     public void play();
//     public void close();
// }
//// 实现接口
// class OpenAndClose implements IOpenAndClose{
//    public void open(ITV tv){
//         tv.play();
//    }
//
//    @Override
//    public void close(ITV tv) {
//        tv.close();
//    }
//}
 class HUAWEI implements ITV{

    @Override
    public void play() {
        System.out.println("打开华为电视");
    }

    @Override
    public void close() {
        System.out.println("关闭华为电视");
    }
}
class Apple implements ITV{

    @Override
    public void play() {
        System.out.println("打开苹果电视");
    }

    @Override
    public void close() {
        System.out.println("关闭苹果电视");
    }
}

// 方式2: 通过构造方法依赖传递
// interface IOpenAndClose {
//    public void open(); //抽象方法
//    public void close();
// }
// interface ITV { //ITV接口
//    public void play();
//    public void close();
// }
// class OpenAndClose implements IOpenAndClose{
//    public ITV tv;
//    public OpenAndClose(ITV tv){
//        this.tv = tv;
//    }
//     public void open(){
//         this.tv.play();
//    }
//
//     @Override
//     public void close() {
//         this.tv.close();
//     }
// }

// 方式3 , 通过setter方法传递
interface IOpenAndClose {
    public void open(); // 抽象方法

    public void setTv(ITV tv);

    public void close();
}

interface ITV { // ITV接口
    public void play();
    public void close();
}

class OpenAndClose implements IOpenAndClose {
    private ITV tv;

    public void setTv(ITV tv) {
        this.tv = tv;
    }

    @Override
    public void close() {
        this.tv.close();
    }

    public void open() {
        this.tv.play();
    }
}
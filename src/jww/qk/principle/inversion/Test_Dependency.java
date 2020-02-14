package jww.qk.principle.inversion;



/**
 * @author Qiankun
 * @date 2020/2/14 0014 -16:06
 **/
public class Test_Dependency {
    public static void main(String[] args){
//        Key key = new Key();
//        Lock lock2 = new Lock();
//        Lock lock  = new Lock();
//        lock.opened(key);
//        lock2.opened(key);

//        Key key = new Key();
//        Lock lock = new Lock(key);
//        lock.opened();

        Key key = new Key();
        Lock lock  = new Lock();

        lock.setKey(key);
        lock.opened();


    }
}
//第一种方法
//interface ILock{
//    public void opened(IKey key);
//    public void close();
//}
//interface IKey{
//    public void open();
//}
//class Lock implements ILock{
//
//    @Override
//    public void opened(IKey key) {
//        key.open();
//    }
//
//    @Override
//    public void close() {
//
//    }
//}
class Key implements IKey{

    @Override
    public void open() {
        System.out.println("打开锁");
    }
}
class Key2 implements IKey{

    @Override
    public void open() {
        System.out.println("打开锁2");
    }
}
//第二种方法
//interface ILock{
//    public void opened();
//}
//interface IKey{
//    public void open();
//}
//class Key implements IKey{
//
//    @Override
//    public void open() {
//        System.out.println("打开锁");
//    }
//}
//class Lock implements ILock{
//
//    private IKey key;
//
//    public Lock(IKey key) {
//        this.key = key;
//    }
//
//    @Override
//    public void opened() {
//        this.key.open();
//    }
//}
//第三种方法
interface ILock {
    public void opened(); // 抽象方法

    public void setKey(IKey key);
}

interface IKey { // ITV接口
    public void open();
}

class Lock implements ILock {
    private IKey key;

    @Override
    public void opened() {
        this.key.open();
    }

    @Override
    public void setKey(IKey key) {
          this.key = key;
    }
}
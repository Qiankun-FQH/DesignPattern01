package jww.qk.designPattern.prototype.improve;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -8:48
 * @title
 **/
public class SheepTest {

    public static void main(String[] args){
        Sheep sheep = new Sheep("tom", 1, "白");
        sheep.sheepFriend = new Sheep("jack", 2, "黑");

        Sheep clone =(Sheep) sheep.clone();
        Sheep clone2 =(Sheep) sheep.clone();
        Sheep clone3 =(Sheep) sheep.clone();
        Sheep clone4 =(Sheep) sheep.clone();
        Sheep clone5 =(Sheep) sheep.clone();
        Sheep clone6 =(Sheep) sheep.clone();

        System.out.println(sheep);
        System.out.println(clone);
        System.out.println(clone2);
        System.out.println(clone3);
        System.out.println(clone4);
        System.out.println(clone5);
        System.out.println(clone6);
    }
}

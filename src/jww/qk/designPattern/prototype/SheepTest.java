package jww.qk.designPattern.prototype;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -8:42
 * @title
 **/
public class SheepTest {
    public static void main(String[] args){
        Sheep sheep = new Sheep("tom", 1, "白");


        Sheep sheep2 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep3 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep4 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());
        Sheep sheep5 = new Sheep(sheep.getName(), sheep.getAge(), sheep.getColor());




    }
}

package jww.qk.designPattern.prototype.improve;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -8:40
 * @title
 **/
public class Sheep implements Cloneable{
    private String name;
    private int age;
    private String color;
    private String address = "蒙古";
    public Sheep sheepFriend;

    public Sheep(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Sheep{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", address='" + address + '\'' +
                ", sheepFriend=" + sheepFriend +
                '}';
    }

    protected Object clone()  {

        Sheep sheep = null;
        try{
            sheep =(Sheep) super.clone();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }


        //Object clone = super.clone();
        return sheep;
    }
}

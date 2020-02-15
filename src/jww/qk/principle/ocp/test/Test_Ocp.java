package jww.qk.principle.ocp.test;

/**
 * @author Qiankun
 * @date 2020/2/15 0015 -19:44
 **/
public class Test_Ocp {
    public static void main(String[] args){
        Person person = new Person();
        person.IntroduceAnimal(new Cat());
        person.IntroduceAnimal(new Dog());
        person.IntroduceAnimal(new Pig());
    }
}

abstract class Animal{
    String animalName;

    public abstract void description();

}

class Person{
    public void IntroduceAnimal(Animal animal){
        animal.description();
    }
}

class Dog extends Animal{

    Dog(){
        animalName = "WWJ  DOG";
    }


    @Override
    public void description() {
        System.out.println("我的名字是"+animalName);
    }
}
class Cat extends Animal{

    Cat(){
        animalName = "QK  CAT";
    }


    @Override
    public void description() {
        System.out.println("我的名字是"+animalName);
    }
}
class Pig extends Animal{

    Pig(){
        animalName = "QQ PIG";
    }


    @Override
    public void description() {
        System.out.println("我的名字是"+animalName);
    }
}
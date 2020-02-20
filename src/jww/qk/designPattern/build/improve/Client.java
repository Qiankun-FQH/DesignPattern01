package jww.qk.designPattern.build.improve;

/**
 * @author Qiankun
 * @date 2020/2/20 0020 -9:32
 * @title
 **/
public class Client {
    public static void main(String[] args){


        HighHouse highHouse = new HighHouse();


        HouseDirector director = new HouseDirector(highHouse);

        director.constructHouse();


    }
}

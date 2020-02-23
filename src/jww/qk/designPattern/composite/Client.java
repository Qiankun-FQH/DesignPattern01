package jww.qk.designPattern.composite;

/**
 * @author Qiankun
 * @date 2020/2/23 0023 -9:26
 * @title
 **/
public class Client {
    public static void main(String[] args){
        University university = new University("清华", "中国顶级大学");
        College computerCollege = new College("计算机学院", "计算机学院");
        College yicCllege = new College("医学院", "医学院");

        computerCollege.add(new Department("软件工程", "软件工程"));
        computerCollege.add(new Department("信息安全", "信息安全"));
        computerCollege.add(new Department("计算机科学与技术", "计算机科学与技术"));

        yicCllege.add(new Department("a", "a"));
        yicCllege.add(new Department("b", "b"));


        university.add(computerCollege);
        university.add(yicCllege);

        university.print();

    }
}

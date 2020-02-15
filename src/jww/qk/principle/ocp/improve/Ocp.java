package jww.qk.principle.ocp.improve;

/**
 * @author Qiankun
 * @date 2020/2/15 0015 -19:20
 * @title 开闭原则
 **/
public class Ocp {
   public static void main(String[] args){
       GraphicEditor graphicEditor = new GraphicEditor();
       graphicEditor.drawShape(new Rectangle());
       graphicEditor.drawShape(new Rectangle());
       graphicEditor.drawShape(new Triangle());
       graphicEditor.drawShape(new Other());
   }

}

class GraphicEditor {
    public void drawShape(Shape shape){
        shape.draw();
    }
}

abstract class Shape {
    int m_type;
    public abstract void draw();
}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("绘制矩形");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制圆形");
    }
}

class Triangle extends Shape {

    @Override
    public void draw() {
        System.out.println("绘制三角形");
    }
}
class Other extends Shape{

    @Override
    public void draw() {
        System.out.println("绘制其他");
    }
}
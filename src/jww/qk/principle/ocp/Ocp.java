package jww.qk.principle.ocp;

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
   }
}

class GraphicEditor {
    public void drawShape(Shape s){
        if (s.m_type == 1)
        drawRectangle(s);
    else if (s.m_type == 2)
        drawCircle(s);
    else if(s.m_type == 3)
        drawTriangle(s);
    }

    public void drawTriangle(Shape s) {
        System.out.println(" 三角形 ");
    }

    public void drawRectangle(Shape r) {
        System.out.println(" 矩形 ");
    }
    public void drawCircle(Shape r) {
        System.out.println(" 圆形 ");
    }
}
class Shape {
    int m_type;
}
class Rectangle extends Shape {
    Rectangle() {
        super.m_type = 1;
    }
}
class Circle extends Shape {
    Circle() {
        super.m_type = 2;
    }
}
class Triangle extends Shape{
    Triangle(){
        super.m_type = 3;
    }
}
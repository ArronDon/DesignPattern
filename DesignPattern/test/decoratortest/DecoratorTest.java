package decoratortest;

import decorator.Circle;
import decorator.Rectangle;
import decorator.RedShapeDecorator;
import decorator.Shape;

/**
* @author arron
* 2016年9月9日下午7:47:14
* desc:null
*/
public class DecoratorTest {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Shape circle = new Circle();
        Shape redCircle = new RedShapeDecorator(new Circle());
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        System.out.println("Circle with normal border");
        circle.draw();
        
        System.out.println("\nCircle of red border");
        redCircle.draw();
        
        System.out.println("\nRectangle of red border");
        redRectangle.draw();
    }

}

package decorator;
/**
* @author arron
* 2016年9月9日下午7:42:37
* desc:null
*/
public class RedShapeDecorator extends ShapeDecorator{

    public RedShapeDecorator(Shape decoratedShape) {
        super(decoratedShape);
        // TODO Auto-generated constructor stub
    }
    public void draw(){
        decoratedShape.draw();
        setRedBorder(decoratedShape);
    }
    private void setRedBorder(Shape decoratedShape){
        System.out.println("Border Color: Red");
    }

}

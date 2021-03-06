package decorator;

/**
 * @author arron 
 * 2016年9月9日下午7:34:06
 * desc:装饰模式是在不必改变原类文件和使用继承的情况下，动态的扩展一个对象的功能。
 *      它是通过创建一个包装对象，也就是装饰来包裹真实的对象。
 */
public interface Shape {
    void draw();
}

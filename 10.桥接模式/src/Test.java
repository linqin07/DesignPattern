/**
 * @Description:
 * @author: LinQin
 * @date: 2021/06/07
 */
public class Test {
    public static void main(String[] args) {
        Color white = new White();
        Color black = new Black();
        Color gray = new Gray();

        Shape shape = new Circle();
        shape.setColor(white);
        shape.draw();

        Shape square = new Square();
        square.setColor(black);
        square.draw();

        Shape rectangle = new Rectangle();
        rectangle.setColor(gray);
        rectangle.draw();
    }
}

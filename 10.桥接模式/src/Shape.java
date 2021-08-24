/**
 * @Description:
 * @author: LinQin
 * @date: 2021/06/07
 */
public abstract class Shape {
    protected Color color;
    abstract void draw();

    public void setColor(Color color) {
        this.color = color;
    }
}

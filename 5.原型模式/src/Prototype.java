/**
 * @Description:
 * @author: LinQin
 * @date: 2021/06/03
 */
public class Prototype implements Cloneable {
    private String name;

    public Prototype(String name) {
        this.name = name;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }
}

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/19
 */
public interface List {
    Iterator iterator();

    Object get(int index);

    int getSize();

    void add(Object obj);
}

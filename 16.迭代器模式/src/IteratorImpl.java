
/**
 * @Description: 迭代器模式
 * @author: LinQin
 * @date: 2021/07/19
 */
public class IteratorImpl implements Iterator {
    private List list;
    private int index;

    public IteratorImpl(List list) {
        index = 0;
        this.list = list;
    }

    @Override
    public Object next() {
        Object obj = list.get(index);
        index++;
        return obj;
    }

    @Override
    public void first() {
        index = 0;   }

    @Override
    public void last() {
        index = list.getSize() - 1;
    }

    @Override
    public boolean hasNext() {
        return index < list.getSize();
    }
}

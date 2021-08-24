/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/19
 */
public class Test {
    public static void main(String[] args) {
        List list = new ListImpl();
        list.add(1);
        list.add(2);
        list.add(3);

        // 第一种迭代方式
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        // 第二中迭代
        for (int i = 0; i < list.getSize(); i++) {
            System.out.println(list.get(i));
        }
    }
}

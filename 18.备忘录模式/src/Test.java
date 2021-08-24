/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/19
 */
public class Test {
    public static void main(String[] args) {
        Man man = new Man();
        man.setState("开会中");
        man.showText();

        Caretaker caretaker = new Caretaker();
        caretaker.setText(man.createText());

        //状态修改
        man.setState("吃饭中");
        man.showText();

        // 设置备忘录中的状态
        man.setText(caretaker.getText());
        man.showText();
    }
}

/**
 * @Description: 人状态
 * @author: LinQin
 * @date: 2021/07/19
 */
public class Man {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public void setText(Text text) {
        state = text.getState();
    }

    // 提供创建备忘录方法
    public Text createText() {
        return new Text(state);
    }
    public void showText() {
        System.out.println(state);
    }
}

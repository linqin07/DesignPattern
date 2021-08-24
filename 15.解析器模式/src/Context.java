import java.util.ArrayList;
import java.util.List;

/**
 * @Description:
 * @author: LinQin
 * @date: 2021/07/19
 */
public class Context {
    private String content;
    private List<Expression> list = new ArrayList<Expression>();

    public String getContent() {
        return this.content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public void add(Expression eps) {
        list.add(eps);
    }

    public List<Expression> getList() {
        return list;
    }
}

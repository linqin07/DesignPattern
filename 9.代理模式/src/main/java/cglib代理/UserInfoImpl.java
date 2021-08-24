package cglib代理;

/**
 * Description:
 * author: LinQin
 * date: 2018/08/20
 */
public class UserInfoImpl {
    public void queryUser() {
        System.out.println("未实现接口的类queryUser");
        updateUser();
    }

    public void updateUser() {
        System.out.println("未实现接口的类updateUser");
    }
}

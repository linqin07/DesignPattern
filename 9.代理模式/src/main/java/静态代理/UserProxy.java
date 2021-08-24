package 静态代理;

/**
 * Description:
 * author: LinQin
 * date: 2018/08/17
 */
public class UserProxy implements UserInfo {

    private UserInfo userImpl;

    public UserProxy(UserInfo userImpl) {
        this.userImpl = userImpl;
    }

    @Override
    public void queryUser() {
        System.out.println("代理queryUser");
        userImpl.queryUser();
    }

    @Override
    public void updateUser() {
        System.out.println("代理updateUser");
        userImpl.updateUser();
    }
}

package cglib代理;

/**
 * Description:
 * author: LinQin
 * date: 2018/08/20
 */
public class Test {
    public static void main(String[] args) {
        UserCglibProxy cglibProxy = new UserCglibProxy();
        UserInfoImpl instance = (UserInfoImpl) cglibProxy.getInstance(new UserInfoImpl());
        instance.queryUser();
    }
}

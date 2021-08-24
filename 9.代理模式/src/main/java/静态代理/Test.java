package 静态代理;

/**
 * Description:
 * author: LinQin
 * date: 2018/08/17
 */
public class Test {
    public static void main(String[] args) {
        UserImpl userImpl = new UserImpl();
        UserInfo userProxy = new UserProxy(userImpl);
        userProxy.queryUser();
        userProxy.updateUser();
    }
}


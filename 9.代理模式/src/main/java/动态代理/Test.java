package 动态代理;

import java.lang.reflect.Proxy;

/**
 * Description:
 * author: LinQin
 * date: 2018/08/17
 */
public class Test {
    public static void main(String[] args) {
        UserImpl user = new UserImpl();
        UserHandler userHandler = new UserHandler(user);

        UserInfo userProxy = (UserInfo) Proxy.newProxyInstance(ClassLoader.getSystemClassLoader(),
                new Class[]{UserInfo.class}, userHandler);
        userProxy.queryUser();
    }
}

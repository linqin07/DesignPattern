package 动态代理.动态代理的特性;

import java.lang.reflect.Proxy;

/**
 * Description:
 * author: LinQin
 * date: 2018/08/20
 */
public class Test {
    /**
     * 当实现类里面有嵌套的代码时，嵌套的不会被代理，仅仅是相当代码复制。在spring事务的传播特性里面很容易掉坑。
     *
     * @param args
     */
    public static void main(String[] args) {

        UserHandler userHandler = new UserHandler(new UserImpl());
        UserInfo userInfoProxy = (UserInfo) Proxy
                .newProxyInstance(ClassLoader.getSystemClassLoader(), new Class[]{UserInfo.class}, userHandler);
        userInfoProxy.queryUser();
    }
}

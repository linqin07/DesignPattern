package 动态代理.动态代理的特性;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description:
 * author: LinQin
 * date: 2018/08/20
 */
public class UserHandler implements InvocationHandler {

    private UserImpl userImpl;

    public UserHandler(UserImpl userImpl) {
        this.userImpl = userImpl;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("事务前");
        proxy = method.invoke(userImpl, args);
        System.out.println("事务后");
        return proxy;
    }
}

package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Description:
 * author: LinQin
 * date: 2018/08/17
 */
public class UserHandler implements InvocationHandler {

    private UserInfo userInfo;

    public UserHandler(UserInfo userInfo) {
        this.userInfo = userInfo;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object object = null;
        //方法开始前做一些事情
        System.out.println("动态代理执行方法前");
        if ("queryUser".equals(method.getName())) {
            //激活调用的方法
            object = method.invoke(userInfo, args);
        }
        //方法结束后做一些事情
        System.out.println("动态代理执行后");
        return object;
    }
}

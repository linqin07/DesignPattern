package 动态代理.动态代理的特性;

/**
 * Description:
 * author: 林钦
 * date: 2018/08/17
 */
public class UserImpl implements UserInfo {
    @Override
    public void queryUser() {
        System.out.println("查询用户");
        updateUser();
    }

    @Override
    public void updateUser() {
        System.out.println("更新用户");
    }
}

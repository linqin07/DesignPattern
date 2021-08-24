package java.com.service;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.com.util.SpringBeanFactory;
import java.util.Map;

/**
 * @Description:
 * @author: LinQin
 * @date: 2019/02/11
 */
@Component
public class UsbSelector {

    public USB getInstance(String data) throws ClassNotFoundException {
        // 获取枚举关系列表
        Map<String, Object> allClazz = UsbList.getAllClazz();

        String clazz = (String) allClazz.get(data);
        if (StringUtils.isEmpty(clazz)) {
            System.out.println("没有该实现类！");
        }

        //根据维护列表里面的选择对应的实现类
        USB usb = (USB) SpringBeanFactory.getBean(Class.forName(clazz));
        return usb;
    }
}

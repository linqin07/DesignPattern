package java.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.com.service.Computer;
import java.com.service.USB;
import java.com.service.UsbSelector;

/**
 * @Description:
 * @author: LinQin
 * @date: 2019/02/11
 */
@RestController
public class TestController {
    @Autowired
    private Computer computer;

    @Autowired
    private UsbSelector usbSelector;

    @RequestMapping("/test")
    public String test(String data) throws ClassNotFoundException {
        USB instance = usbSelector.getInstance(data);
        computer.setUsb(instance);

        return computer.readData(data);
    }


    /**
     * 另外一种实现方式，不是使用枚举来维护列表，每个实现类内加上一个判断类型的方法，是自己类型就返回 true，注入是使用 list 集合
     * 这样直接循环，循环内先判断，对的执行下面的实现方法。
     */
}

package java.com.service;

import org.springframework.stereotype.Component;

/**
 * @Description:
 * @author: LinQin
 * @date: 2019/02/11
 */
@Component
public class Computer {

    private USB usb;

    public void setUsb(USB usb) {
        this.usb = usb;
    }

    public String readData(String data) {
        return usb.readData(data);
    }
}

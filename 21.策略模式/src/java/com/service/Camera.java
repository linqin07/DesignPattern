package java.com.service;

import org.springframework.stereotype.Service;

import java.com.service.USB;

/**
 * @Description:
 * @author: LinQin
 * @date: 2019/02/11
 */
@Service
public class Camera implements USB {
    @Override
    public String readData(String data) {
        System.out.println("Camera");
        return data;
    }
}

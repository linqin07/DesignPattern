package java.com.service;

import org.springframework.stereotype.Service;

import java.com.service.USB;

/**
 * @Description:
 * @author: LinQin
 * @date: 2019/02/11
 */
@Service
public class Mouse implements USB {
    @Override
    public String readData(String data) {
        System.out.println("Mouse");
        return data;
    }
}

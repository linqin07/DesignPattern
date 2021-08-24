package java.com.service;

import java.util.HashMap;
import java.util.Map;

/**
 * Description:
 * author: 林钦
 * date: 2019/02/11
 */
public enum UsbList {
    CAMERA("1", "照相机设备", "com.service.Camera"),
    KEYBOARD("2", "键盘设备", "com.service.Keyboard"),
    MOUSE("3", "鼠标设备", "com.service.Mouse");

    /**
     * 对应关系数字
     */
    private String num;
    /**
     * 描述
     */
    private String description;
    /**
     * 实现类
     */
    private String implClass;

    UsbList(String num, String description, String implClass) {
        this.num = num;
        this.description = description;
        this.implClass = implClass;
    }

    /**
     * 获取枚举维护列表的全部结果
     *
     * @return
     */
    public static Map<String, Object> getAllClazz() {
        Map<String, Object> map = new HashMap<>();
        for (UsbList emum : UsbList.values()) {
            map.put(emum.getNum(), emum.getImplClass());
        }

        return map;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImplClass() {
        return implClass;
    }

    public void setImplClass(String implClass) {
        this.implClass = implClass;
    }
}


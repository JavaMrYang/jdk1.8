package com.source.test.enumration;

/**
 * @Author LiuYang
 * @Date 2019/5/30/030  15:33
 * @Version 1.0
 **/
public enum ColorEnum {
    RED(1,"红色"),GREEN(2,"绿色"),YELLOW(3,"黄色")
    ;

    ColorEnum(int id, String value) {
        this.id = id;
        this.value = value;
    }

    private int id;

    private String value;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}

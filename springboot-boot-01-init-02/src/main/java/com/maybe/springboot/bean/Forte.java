package com.maybe.springboot.bean;

/**
 * @Title: Forte
 * @Description:
 * @Auther:maybe
 * @create 2019/6/27 11:15
 */
public class Forte {

    private String name;
    private Integer time;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Forte{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
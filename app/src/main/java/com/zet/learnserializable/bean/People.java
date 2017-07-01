package com.zet.learnserializable.bean;

import java.io.Serializable;

/**
 * Created by Zet on 2017/7/1.
 * 人，实体类
 * 序列化方式，Serializable
 * 实现起来很简单，直接实现类实现即可
 */

public class People implements Serializable {
    /**
     * 名称
     */
    private String name;
    /**
     * 性别
     */
    private String gender;
    /**
     * 年龄
     */
    private int age;

    public People(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public People() {
    }

    @Override
    public String toString() {
        return "People{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

package com.zet.learnserializable.bean;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Zet on 2017/7/1.
 * 动物，实体类
 * 序列化方式，Parcelable
 * 实现起来稍显复杂，除了实现接口，还要写方法，不过呢，as会自动实现的
 */

public class Animal implements Parcelable {

    public static final String TYPE_FIY = "fly";
    public static final String TYPE_Foot = "foot";

    /**
     * 体重
     */
    private long weight;
    /**
     * 种类
     */
    private String kind;
    /**
     * 年龄
     */
    private int age;

    public Animal(long weight, String kind, int age) {
        this.weight = weight;
        this.kind = kind;
        this.age = age;
    }

    public Animal() {
    }

    @Override
    public String toString() {
        return "Animal{" +
                "weight=" + weight +
                ", kind='" + kind + '\'' +
                ", age=" + age +
                '}';
    }

    protected Animal(Parcel in) {
        weight = in.readLong();
        kind = in.readString();
        age = in.readInt();
    }

    public static final Creator<Animal> CREATOR = new Creator<Animal>() {
        @Override
        public Animal createFromParcel(Parcel in) {
            return new Animal(in);
        }

        @Override
        public Animal[] newArray(int size) {
            return new Animal[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(weight);
        dest.writeString(kind);
        dest.writeInt(age);
    }

    public long getWeight() {
        return weight;
    }

    public void setWeight(long weight) {
        this.weight = weight;
    }

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}

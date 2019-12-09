package com.yiwa.serializable;

import java.io.Serializable;

public class Person implements Serializable {

    private static final long serialVersionUID = -5510866195515312498L;
    private String name=null;
    private transient Integer age=null;
    private Gender gender=null;

    public Person(){
        System.out.println("none-arg constructor");
    }
    public Person(String name, Integer age,Gender gender ){
        System.out.println("arg-constructor");
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}

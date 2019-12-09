package com.yiwa.serializable;

import java.io.*;

public class SimpleSerial {
    public static void main(String[] args) throws Exception{
        File file=new File("person.out");
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream(file));
        Person person=new Person("Join",101,Gender.MALE);
        objectOutputStream.writeObject(person);
        objectOutputStream.close();

        ObjectInputStream in=new ObjectInputStream(new FileInputStream(file));
        Object person1=in.readObject();
        in.close();
        System.out.println(person1);
    }
}

package com.yiwa.create_type;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class SerializablePrototype implements Serializable {
    private static final long serialVersion=1l;
    private int i;
    private transient int notClone;

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    public int getNotClone() {
        return notClone;
    }

    public void setNotClone(int notClone) {
        this.notClone = notClone;
    }

    public void writeToFile(String path) throws Exception{
        FileOutputStream outStream=new FileOutputStream(path);
        ObjectOutputStream objectOutputStream=new ObjectOutputStream(outStream);
        objectOutputStream.writeObject(this);
        outStream.close();
    }
}

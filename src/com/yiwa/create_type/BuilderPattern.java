package com.yiwa.create_type;
//产品
class MyDate{
    String date;
}
//抽象生成器
interface IDateBuilder{
    IDateBuilder builder(int y,int m,int d);
    String date();
}
class DateBuilder1 implements IDateBuilder{
    private MyDate myDate;
    public DateBuilder1(MyDate myDate){
        this.myDate=myDate;
    }
    @Override
    public IDateBuilder builder(int y, int m, int d) {
        myDate.date=y+"-"+m+"-"+d;
        return this;
    }

    @Override
    public String date() {
        return myDate.date;
    }
}

class IDateBuilder2 implements IDateBuilder{
    private MyDate myDate;
    public IDateBuilder2(MyDate myDate){
        this.myDate=myDate;
    }

    @Override
    public IDateBuilder builder(int y, int m, int d) {
        myDate.date=y+"/"+m+"/"+d;
        return this;
    }

    @Override
    public String date() {
        return myDate.date;
    }
}

class Derector{
    private IDateBuilder builder;
    public Derector(IDateBuilder iDateBuilder){
        this.builder=iDateBuilder;
    }
    public String getDate(int y,int m,int d){
        builder.builder(y,m,d);
        return builder.date();
    }
}
public class BuilderPattern {
    public static void main(String[] args) {
        MyDate myDate=new MyDate();
        IDateBuilder builder;
        builder=new DateBuilder1(myDate);
//        System.out.println(builder.date());
        Derector derector=new Derector(builder);
        System.out.println(derector.getDate(2018,3,6));

        builder=new IDateBuilder2(myDate).builder(2018,12,12);
        System.out.println(builder.date());
    }

}

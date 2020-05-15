package com.yiwa.action_type.viewPattern;

public class Main {
//观察者模式
    public static void main(String[] args) {
        Transporter transporter=new Transporter();

        Police police=new Police();
        Security security=new Security();
        Thief thief=new Thief();

        transporter.addWatcher(police);
        transporter.addWatcher(security);
        transporter.addWatcher(thief);

        transporter.notifyWatcher();
    }
}

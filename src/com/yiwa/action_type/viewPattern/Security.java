package com.yiwa.action_type.viewPattern;

/**
 * 具体观察者保镖
 */
public class Security implements Watcher {
    @Override
    public void update() {
        System.out.println("运输车有行动，保安贴身保护");
    }
}

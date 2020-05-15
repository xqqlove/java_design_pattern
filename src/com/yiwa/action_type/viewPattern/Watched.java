package com.yiwa.action_type.viewPattern;

public interface Watched {
    /**
     * 添加观察者
     * @param watcher
     */
    public void addWatcher(Watcher watcher);

    /**
     * 移除观察者
     * @param watcher
     */
    public void removeWatcher(Watcher watcher);

    /**
     * 通知观察者
     * @param watcher
     */
    public void notifyWatcher();
}

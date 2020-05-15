package com.yiwa.action_type.viewPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者运输车
 */
public class Transporter implements Watched {

    private List<Watcher> list = new ArrayList<>();


    @Override
    public void addWatcher(Watcher watcher) {
        list.add(watcher);
    }

    @Override
    public void removeWatcher(Watcher watcher) {
        list.remove(watcher);
    }

    @Override
    public void notifyWatcher() {
      for (Watcher o:list){
          o.update();
      }
    }
}

package com.zt.boot.Service.schedule;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PreloadContext {

    @Autowired
    private List<CacheTask> cacheTaskList;

    public void preload() {
        for (CacheTask cacheTask : cacheTaskList) {
            //立即执行
            cacheTask.run();
            //定时执行
            cacheTask.schedule();
        }
    }
}

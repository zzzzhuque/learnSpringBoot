package com.zt.boot.Service.schedule;

import org.springframework.stereotype.Component;

@Component
public class DspCacheTask extends CacheTask{
    @Override
    public void completeTask() {
        System.out.println("DspCacheTask");
    }
}

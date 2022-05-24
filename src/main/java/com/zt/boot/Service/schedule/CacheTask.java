package com.zt.boot.Service.schedule;

import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

public abstract class CacheTask extends TimerTask {
    @Override
    public void run() {
        System.out.println("Timer task started at:" + new Date());
        completeTask();
        System.out.println("Timer task finished at:" + new Date());
    }

    protected Timer timer = new Timer("Timer_" + getClass().getSimpleName(), true);

    /**
     * 定时运行
     */
    public void schedule() {
        timer.schedule(this, getScheduleDelay(), getSchedulePeriod());
    }

    /**
     * 获取首次执行延迟时间，单位毫秒，默认2s
     *
     * @return
     */
    protected long getScheduleDelay() {
        return 10000L;
    }

    /**
     * 获取执行周期时间，单位毫秒，默认1分钟
     *
     * @return
     */
    protected long getSchedulePeriod() {
        return 10000L;
    }

    public abstract void completeTask();
}

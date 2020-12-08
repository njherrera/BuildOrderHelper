package com.mucholabs;

import java.util.Timer;
import java.util.TimerTask;

public class Scheduler {

    Timer buildOrderTimer;

    public Scheduler(){
        this.buildOrderTimer = new Timer();
    }

    public void processBuildOrder(BuildOrder order){
        for(Event action : order.getBuildOrder()){
            TimerTask buildAction = new TimerTask() {
                @Override
                public void run() {
                    System.out.println(action.getAction());
                }
            };
            buildOrderTimer.schedule(buildAction, action.getTime() * 1000);
        }
    }
}

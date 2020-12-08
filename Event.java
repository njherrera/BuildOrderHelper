package com.mucholabs;

public class Event {

    private int time;
    private int supplyCount;
    private String action;

    public Event(String timeString, int count, String givenAction){
        this.time = convertStringTimeToInt(timeString);
        this.supplyCount = count;
        this.action = givenAction;
    }

    public int getTime(){
        return this.time;
    }

    public int getSupplyCount(){
        return this.supplyCount;
    }

    public String getAction(){
        return this.action;
    }

    public int convertStringTimeToInt(String time){
        int timeInSeconds = 0;
        String[] digits = time.split(":");
        timeInSeconds += (Integer.parseInt(digits[0].trim()) * 60);
        timeInSeconds += Integer.parseInt(digits[1].trim());
        return timeInSeconds;
    }

    public String toString(){
        String str = "Time: " + this.time + " seconds; " + "Supply count: " + this.supplyCount + ": Action: " + this.action;
        return str;
    }
}

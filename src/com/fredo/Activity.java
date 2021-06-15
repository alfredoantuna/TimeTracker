package com.fredo;
import java.time.Clock;
import java.util.function.ToDoubleBiFunction;

public class Activity {
    private String name;
    private int time;
    //TODO
    //How many times have we logged to this
    //private int timesLogged;
    //private array eachlog;

    //To keep track of current set point or -1 if not currently logging
    //private int setLog;

    public Activity(String inName){
       name = inName;
    }
    public int getTime(){
        return this.time;
    }
    public String getName(){
        return this.name;
    }
    @Override
    public String toString() {
        return name + String.valueOf(time);
    }
    public boolean equals(Activity other){
        return this.name.equals(other.name);
    }
}

package com.acorn.inheritance;

public class TV {
    private boolean power;
    private int volumn;
    private int size;
    
    public TV() { }

    public TV(boolean power, int volumn, int size) {
    	this.power = power;
    	this.volumn = volumn;
    	this.size = size;
    }
    
    public boolean getPower() { return power; }

    public void setPower(boolean power) {
        this.power = power;
    }

    public int getVolumn() { return volumn; }

    public int getSize() { return size; }

    public void setSize(int size) {
         this.size = size;
    }

    public void watch() {
        String sOnOff = power ? "Have fun" : "Switch on";
        System.out.println(sOnOff);
    }

}
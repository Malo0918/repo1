package com.itheima.homoWorlk;

public class washingMachine extends electric{

    private String motorType;//电机类型
    private String washingCapacity;//洗涤容量

    public washingMachine(String brand, String mode1, String color, int price) {
        super(brand, mode1, color, price);
    }

    public washingMachine() {
    }

    public String getMotorType() {
        return motorType;
    }

    public void setMotorType(String motorType) {
        this.motorType = motorType;
    }

    public String getWashingCapacity() {
        return washingCapacity;
    }

    public void setWashingCapacity(String washingCapacity) {
        this.washingCapacity = washingCapacity;
    }
}




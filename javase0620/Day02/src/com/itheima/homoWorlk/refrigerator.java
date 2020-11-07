package com.itheima.homoWorlk;

public class refrigerator extends electric{

    public String doorStyle;//门款式，

    public String refrigerationMode;//制冷方式


    public refrigerator(String brand, String mode1, String color, int price, String doorStyle, String refrigerationMode) {
        super(brand, mode1, color, price);
        this.doorStyle = doorStyle;
        this.refrigerationMode = refrigerationMode;
    }
    public refrigerator() {
    }

    public String getDoorStyle() {
        return doorStyle;
    }

    public void setDoorStyle(String doorStyle) {
        this.doorStyle = doorStyle;
    }

    public String getRefrigerationMode() {
        return refrigerationMode;
    }

    public void setRefrigerationMode(String refrigerationMode) {
        this.refrigerationMode = refrigerationMode;
    }
}

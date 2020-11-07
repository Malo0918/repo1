package com.itheima.homoWorlk;

public abstract class electric {
    private String brand;
    private String mode1;
    private String color;
    private  int price;



    public electric(String brand, String mode1, String color, int price) {
        this.brand = brand;
        this.mode1 = mode1;
        this.color = color;
        this.price = price;
    }

    public electric() {
    }

    public String getPinpai() {
        return brand;
    }

    public void setPinpai(String pinpai) {
        this.brand = pinpai;
    }

    public String getXinghao() {
        return mode1;
    }

    public void setXinghao(String xinghao) {
        this.mode1 = xinghao;
    }

    public String getColoer() {
        return color;
    }

    public void setColoer(String color) {
        this.color = color;
    }

    public int getManny() {
        return price;
    }

    public void setManny(int price) {
        this.price = price;
    }

    //public abstract void doorStyle();
    //public abstract void refrigerationMode();

}

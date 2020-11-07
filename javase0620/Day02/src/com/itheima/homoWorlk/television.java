package com.itheima.homoWorlk;

public class television extends electric {

    private String screenSize;
    private String resolutionRatio;

    public String getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(String screenSize) {
        this.screenSize = screenSize;
    }

    public String getResolutionRatio() {
        return resolutionRatio;
    }

    public void setResolutionRatio(String resolutionRatio) {
        this.resolutionRatio = resolutionRatio;
    }

    public television(String brand, String mode1, String color, int price) {

        super(brand, mode1, color, price);
    }

    public television() {
    }

    ;

}

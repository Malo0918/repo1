package com.itheima.homeWorlk04;

public class Demo {
    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.notice("工作日报");

        Manager manager = new Manager("002","马佳宝",19,1200.5);
        manager.notice("会议内容123");
        manager.show();



    }
}

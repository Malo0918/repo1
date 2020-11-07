package com.itheima.homeWorlk04;

public abstract class Member {
    private String id ;
    private String name;
    private int age;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Member() {
    }

    public Member(String id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public  void notice(String content){
        System.out.println("通知： ");
        setContent(content);
        System.out.println("\t必胜环球科技有限公司");
    }

    public abstract void setContent(String content);
}

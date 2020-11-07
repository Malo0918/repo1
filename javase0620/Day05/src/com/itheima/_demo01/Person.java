package com.itheima._demo01;

import java.util.Objects;

/*



 */
public class Person extends Object {
    private String name;
    private int age;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Object1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

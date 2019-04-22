package com.restep.memento;

/**
 * 备忘录类
 *
 * @author restep
 * @date 2019/4/22
 */
public class EmpMemento {
    private String name;
    private int age;
    private double salary;


    public EmpMemento(Emp e) {
        this.name = e.getName();
        this.age = e.getAge();
        this.salary = e.getSalary();
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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

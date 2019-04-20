package com.restep.prototype;

import java.util.Date;

/**
 * 浅克隆
 *
 * @author restep
 * @date 2019/4/20
 */
public class ShallowSheepTest {
    public static void main(String[] args) throws Exception {
        Date date = new Date(12312321331L);
        ShallowSheep ss1 = new ShallowSheep("浅克隆", date);
        System.out.println(ss1);
        System.out.println(ss1.getName());
        System.out.println(ss1.getBirthday());

        ShallowSheep ss2 = (ShallowSheep) ss1.clone();
        System.out.println(ss2);
        System.out.println(ss2.getName());
        System.out.println(ss2.getBirthday());

        date.setTime(23432432423L);
        System.out.println(ss1.getBirthday());
        System.out.println(ss2.getBirthday());
    }
}

class ShallowSheep implements Cloneable {
    private String name;
    private Date birthday;

    public ShallowSheep() {

    }

    public ShallowSheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
}

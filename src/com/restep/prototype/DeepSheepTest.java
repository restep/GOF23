package com.restep.prototype;

import java.util.Date;

/**
 * @author restep
 * @date 2019/4/20
 */
public class DeepSheepTest {
    public static void main(String[] args) throws Exception {
        Date date = new Date(12312321331L);
        DeepSheep ds1 = new DeepSheep("深复制", date);
        DeepSheep ds2 = (DeepSheep) ds1.clone();

        System.out.println(ds1);
        System.out.println(ds1.getName());
        System.out.println(ds1.getBirthday());
        System.out.println();

        System.out.println(ds2);
        System.out.println(ds2.getName());
        System.out.println(ds2.getBirthday());
        System.out.println();

        date.setTime(23432432423L);
        System.out.println(ds1.getBirthday());
        System.out.println(ds2.getBirthday());
    }
}

class DeepSheep implements Cloneable {
    private String name;
    private Date birthday;

    public DeepSheep() {

    }

    public DeepSheep(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object obj = super.clone();

        //如下代码实现深复制(deep Clone)
        DeepSheep ds = (DeepSheep) obj;
        //把属性也进行克隆
        ds.birthday = (Date) this.birthday.clone();

        return obj;
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

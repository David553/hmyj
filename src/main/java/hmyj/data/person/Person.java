/**
 * @(#)person.java, Mar 08, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hmyj.data.person;

import hmyj.data.constant.Hometown;

/**
 * @author xiechao01
 */
public abstract class Person {

    private int ID;
    private String name;
    private int age;
    private Hometown hometown;

    public int getID() {
        return this.ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Hometown getHometown() {
        return this.hometown;
    }

    public void setHometown(Hometown hometown) {
        this.hometown = hometown;
    }
}
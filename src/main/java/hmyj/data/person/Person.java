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

    protected int getID() {
        return this.ID;
    }

    protected void setID(int ID) {
        this.ID = ID;
    }

    protected int getAge() {
        return this.age;
    }

    protected void setAge(int age) {
        this.age = age;
    }

    protected String getName() {
        return this.name;
    }

    protected void setName(String name) {
        this.name = name;
    }

    protected Hometown getHometown() {
        return this.hometown;
    }

    protected void setHometown(Hometown hometown) {
        this.hometown = hometown;
    }
}
/**
 * @(#)matrial.java, Mar 08, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hmyj.data.material;

/**
 * @author xiechao01
 */
public abstract class Matrial {

    private int price;

    protected int getPrice() {
        return this.price;
    }

    protected void setPrice(int price) {
        this.price = price;
    }

    //TODO: 范型的枚举类型
}
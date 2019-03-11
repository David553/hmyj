/**
 * @(#)province.java, Mar 08, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hmyj.data.constant;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * @author xiechao01
 */
public enum Province {

    UNKNOWN(0, "unknown"),
    HUBEI(1, "hubei"),
    GUANGDONG(2, "guangdong");

    private final int value;

    private final String name;

    Province(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Province findByInt(int value) {
        for (Province item : Province.values()) {
            if (item.value == value) {
                return item;
            }
        }

        return null;
    }

    @JsonCreator
    public static Province findByString(String name) {
        for (Province item : Province.values()) {
            if (item.name.equals(name)) {
                return item;
            }
        }

        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.name;
    }

    public int toInt() {
        return this.value;
    }
}

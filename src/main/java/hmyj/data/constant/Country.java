/**
 * @(#)Country.java, Mar 08, 2019.
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
public enum Country {

    UNKNOWN(0, "unknown"),
    CHINESE(1, "china"),
    AFRICAN(2, "african");

    private int value;

    private String name;

    Country(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public static Country findByInt(int value) {
        for (Country item : Country.values()) {
            if (item.value == value) {
                return item;
            }
        }

        return null;
    }

    @JsonCreator
    public static Country findByString(String name) {
        for (Country item : Country.values()) {
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

/**
 * @(#)cloth.java, Mar 08, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hmyj.data.material;

import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

/**
 * @author xiechao01
 */
@Component
public class Cloth extends Matrial {

    private static final String CLOTH = "cloth";

    public Cloth getClothByName(String name) throws IllegalArgumentException {

        try {
            if (Cloth.CLOTH.equals(name)) {
                return this;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("illegal argument for getClothByName " + e);
        }
        return null;
    }
}
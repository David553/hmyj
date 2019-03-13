/**
 * @(#)producer.java, Mar 08, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hmyj.data.person;

import hmyj.data.material.Cloth;
import hmyj.data.material.Matrial;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author xiechao01
 */
@Component
public class Producer extends Person {

    private Cloth cloth;

    @Autowired
    public void butMaterial(Cloth cloth) {
        this.cloth = cloth;
        System.out.println("buy this cloth need :" + cloth.getPurchaseCost());
    }
}
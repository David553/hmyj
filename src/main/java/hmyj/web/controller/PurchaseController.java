/**
 * @(#)PurchaseController.java, Mar 11, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hmyj.web.controller;

import hmyj.data.material.Cloth;
import hmyj.data.person.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiechao01
 */

@RestController
public class PurchaseController {

    @Autowired
    private Cloth cloth;

    @PostMapping("/{material}")
    public boolean purchaseMaterial(@PathVariable String cloth, @RequestBody Producer producer) {
        System.out.println(String.format("{} purchase {}", producer.getName(), cloth));
        //if(Cloth.getClothByName(cloth))
        return true;
    }
}
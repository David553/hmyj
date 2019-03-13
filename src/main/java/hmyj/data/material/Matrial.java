/**
 * @(#)matrial.java, Mar 08, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hmyj.data.material;

import org.springframework.stereotype.Component;

/**
 * @author xiechao01
 */
@Component
public abstract class Matrial {

    //购买成本
    private int purchaseCost;

    private int transferCost;

    public int getPurchaseCost() {
        return this.purchaseCost;
    }

    public void setPurchaseCost(int purchaseCost) {
        this.purchaseCost = purchaseCost;
    }

    public int getTransferCost() {
        return this.transferCost;
    }

    public void setTransferCost(int transferCost) {
        this.transferCost = transferCost;
    }

    //TODO: 范型的枚举类型---在每个matrial类中分别做更合适
}
/**
 * @(#)test.java, Mar 13, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */

import hmyj.configure.MaterialConfig;
import hmyj.configure.PersonConfig;
import hmyj.data.material.Cloth;
import hmyj.data.person.Producer;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.TestCase.assertNotNull;

/**
 * @author xiechao01
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MaterialConfig.class, PersonConfig.class})
public class test {

    @Autowired
    private Cloth cloth;

    @Autowired
    private Producer producer;

    @Test
    public void producerNotNull(){
        assertNotNull(cloth);
    }

    @Test
    public void testProducerBuyCloth() {
        cloth.setPurchaseCost(100);
        producer.butMaterial(cloth);

    }

}
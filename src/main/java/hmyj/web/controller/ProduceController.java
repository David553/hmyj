/**
 * @(#)SignIn.java, Mar 08, 2019.
 * <p>
 * Copyright 2019 fenbi.com. All rights reserved.
 * FENBI.COM PROPRIETARY/CONFIDENTIAL. Use is subject to license terms.
 */
package hmyj.web.controller;

import hmyj.data.material.Cloth;
import hmyj.data.person.Producer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author xiechao01
 */
@RestController
public class SignInController {

    @GetMapping("/testURL")
    public String makeCloth(){
        Producer producer=new Producer();

        Cloth cloth=new Cloth();

        return " make cloth";
    }


}
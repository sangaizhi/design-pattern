package org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product;

import org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product.base.Sayable;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class Repeater implements Sayable{

    @Override
    public void say() {
        System.out.println("我是一只复读机，saying... saying...");
    }
}

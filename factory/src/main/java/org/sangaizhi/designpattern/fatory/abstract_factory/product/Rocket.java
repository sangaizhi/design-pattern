package org.sangaizhi.designpattern.fatory.abstract_factory.product;

import org.sangaizhi.designpattern.fatory.abstract_factory.product.base.Flyable;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class Rocket implements Flyable {
    @Override
    public void fly() {
        System.out.println("我是一支火箭，flying...");
    }
}

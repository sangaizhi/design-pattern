package org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product;

import org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product.base.Flyable;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class Aircraft implements Flyable {
    @Override
    public void fly() {
        System.out.println("我是一架飞机，flying...");
    }
}

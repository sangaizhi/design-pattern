package org.sangaizhi.designpattern.fatory_pattern.simple_factory;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class Bmw implements Car {
    @Override
    public void drive() {
        System.out.println("我开的是Bmw");
    }
}

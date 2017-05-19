package org.sangaizhi.designpattern.fatory.simple_factory;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class Benz implements Car {
    @Override
    public void drive() {
        System.out.println("我开的是Benz");
    }
}

package org.sangaizhi.designpattern.fatory.factory_method.product;

import org.sangaizhi.designpattern.fatory.factory_method.product.base.Vehicle;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class Ship implements Vehicle {
    @Override
    public void tripMode(double speed) {
        System.out.println("我是一艘轮船，当前航行速度为：" + speed + "节/时");
    }
}

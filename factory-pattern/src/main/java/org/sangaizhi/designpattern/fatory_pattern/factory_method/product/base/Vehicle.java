package org.sangaizhi.designpattern.fatory_pattern.factory_method.product.base;

/**
 * 交通工具
 * created by sangaizhi on 2017/5/19.
 */
public interface Vehicle {

    double speed = 0D;
    /**
     * 出行方式
     */
    void tripMode(double speed);
}

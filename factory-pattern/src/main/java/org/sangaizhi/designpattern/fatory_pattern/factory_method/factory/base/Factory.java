package org.sangaizhi.designpattern.fatory_pattern.factory_method.factory.base;

import org.sangaizhi.designpattern.fatory_pattern.factory_method.product.base.Vehicle;

/**
 * 工厂：工厂方法模式定义了一个创建对象的接口，但由子类决定要实例化哪一个。
 * @author sangaizhi
 * @date 2017/5/19
 */
public abstract class Factory {
    /**
     * 生产交通工具
     * @return
     */
    public abstract Vehicle createVehicle();
}

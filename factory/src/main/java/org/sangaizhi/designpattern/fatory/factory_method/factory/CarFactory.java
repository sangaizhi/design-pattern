package org.sangaizhi.designpattern.fatory.factory_method.factory;

import org.sangaizhi.designpattern.fatory.factory_method.factory.base.Factory;
import org.sangaizhi.designpattern.fatory.factory_method.product.Car;
import org.sangaizhi.designpattern.fatory.factory_method.product.base.Vehicle;

/**
 * 造车的场子
 * @author sangaizhi
 * @date 2017/5/19
 */
public class CarFactory extends Factory {
    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
}

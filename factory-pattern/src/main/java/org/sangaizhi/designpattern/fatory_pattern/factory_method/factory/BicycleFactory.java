package org.sangaizhi.designpattern.fatory_pattern.factory_method.factory;

import org.sangaizhi.designpattern.fatory_pattern.factory_method.factory.base.Factory;
import org.sangaizhi.designpattern.fatory_pattern.factory_method.product.Bicycle;
import org.sangaizhi.designpattern.fatory_pattern.factory_method.product.base.Vehicle;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class BicycleFactory extends Factory {
    @Override
    public Vehicle createVehicle() {
        return new Bicycle();
    }
}

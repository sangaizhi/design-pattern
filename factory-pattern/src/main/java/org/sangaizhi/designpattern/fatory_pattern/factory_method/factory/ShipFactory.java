package org.sangaizhi.designpattern.fatory_pattern.factory_method.factory;

import org.sangaizhi.designpattern.fatory_pattern.factory_method.factory.base.Factory;
import org.sangaizhi.designpattern.fatory_pattern.factory_method.product.Ship;
import org.sangaizhi.designpattern.fatory_pattern.factory_method.product.base.Vehicle;

/**
 * 造船厂
 * @author sangaizhi
 * @date 2017/5/19
 */
public class ShipFactory extends Factory {
    @Override
    public Vehicle createVehicle() {
        return new Ship();
    }
}

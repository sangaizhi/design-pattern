package org.sangaizhi.designpattern.fatory.factory_method.factory;

import org.sangaizhi.designpattern.fatory.factory_method.factory.base.Factory;
import org.sangaizhi.designpattern.fatory.factory_method.product.Airplane;
import org.sangaizhi.designpattern.fatory.factory_method.product.base.Vehicle;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class AirplaneFactory extends Factory {

	@Override
	public Vehicle createVehicle() {
		return new Airplane();
	}
}

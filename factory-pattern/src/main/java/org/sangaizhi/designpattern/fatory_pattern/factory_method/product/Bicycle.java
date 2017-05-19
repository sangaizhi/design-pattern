package org.sangaizhi.designpattern.fatory_pattern.factory_method.product;

import org.sangaizhi.designpattern.fatory_pattern.factory_method.product.base.Vehicle;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class Bicycle implements Vehicle {

	@Override
	public void tripMode(double speed) {
		System.out.println("我是一辆自行车，当前的行驶速度是：" + speed + "km/h");
	}
}

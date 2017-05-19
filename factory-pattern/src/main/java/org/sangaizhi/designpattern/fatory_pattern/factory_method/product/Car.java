package org.sangaizhi.designpattern.fatory_pattern.factory_method.product;

import org.sangaizhi.designpattern.fatory_pattern.factory_method.product.base.Vehicle;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class Car implements Vehicle {

	@Override
	public void tripMode(double speed) {
		System.out.println("我是一辆汽车，当前行驶速度是：" + speed + "km/h");
	}
}

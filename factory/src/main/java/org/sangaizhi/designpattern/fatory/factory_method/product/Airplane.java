package org.sangaizhi.designpattern.fatory.factory_method.product;

import org.sangaizhi.designpattern.fatory.factory_method.product.base.Vehicle;

/**
 * 飞机
 * 
 * @author sangaizhi
 * @date 2017/5/19
 */
public class Airplane implements Vehicle {

    private double speed;

	@Override
	public void tripMode(double speed) {
		System.out.println("我是一架飞机，当前飞行速度是：" + speed + "km/h");
	}
}

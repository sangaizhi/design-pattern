package org.sangaizhi.designpattern.fatory.factory_method;

import org.sangaizhi.designpattern.fatory.factory_method.factory.*;
import org.sangaizhi.designpattern.fatory.factory_method.factory.base.Factory;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class Client {

	public static void main(String[] args) {
		System.out.println("开始造飞机了");
		Factory factory = new AirplaneFactory();
		factory.createVehicle().tripMode(500D);

		System.out.println("开始在汽车了");
		factory = new CarFactory();
		factory.createVehicle().tripMode(110D);

		System.out.println("开始造船了");
		factory = new ShipFactory();
		factory.createVehicle().tripMode(50D);

		// 现在又要生产自行车，那么需要增加一条产品线（即车间或者工厂）
		System.out.println("开始造自行车了");
		factory = new BicycleFactory();
		factory.createVehicle().tripMode(30D);

	}
}

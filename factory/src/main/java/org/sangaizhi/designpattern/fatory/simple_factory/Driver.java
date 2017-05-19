package org.sangaizhi.designpattern.fatory.simple_factory;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class Driver {

	private Car car;

	public Driver(Car car) {
		this.car = car;
	}

	public void driveCar() {
		this.car.drive();
	}
}

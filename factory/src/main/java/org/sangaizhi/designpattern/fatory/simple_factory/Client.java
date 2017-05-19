package org.sangaizhi.designpattern.fatory.simple_factory;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class Client {
    public static void main(String[] args) {
        Driver driver = new Driver(new Benz());
        driver.driveCar();
    }
}

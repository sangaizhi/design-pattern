package org.sangaizhi.designpattern.fatory.abstract_factory.factory;

import org.sangaizhi.designpattern.fatory.abstract_factory.factory.base.Factory;
import org.sangaizhi.designpattern.fatory.abstract_factory.product.Pencil;
import org.sangaizhi.designpattern.fatory.abstract_factory.product.Repeater;
import org.sangaizhi.designpattern.fatory.abstract_factory.product.Rocket;
import org.sangaizhi.designpattern.fatory.abstract_factory.product.base.Flyable;
import org.sangaizhi.designpattern.fatory.abstract_factory.product.base.Sayable;
import org.sangaizhi.designpattern.fatory.abstract_factory.product.base.Writeable;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class FactoryB extends Factory {
    @Override
    public Flyable createFlyable() {
        return new Rocket();
    }

    @Override
    public Sayable createSayable() {
        return new Repeater();
    }

    @Override
    public Writeable createWriteable() {
        return new Pencil();
    }
}

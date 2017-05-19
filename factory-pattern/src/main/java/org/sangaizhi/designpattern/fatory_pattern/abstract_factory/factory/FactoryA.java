package org.sangaizhi.designpattern.fatory_pattern.abstract_factory.factory;

import org.sangaizhi.designpattern.fatory_pattern.abstract_factory.factory.base.Factory;
import org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product.Aircraft;
import org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product.FountainPen;
import org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product.SoundBox;
import org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product.base.Flyable;
import org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product.base.Soundable;
import org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product.base.Writeable;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class FactoryA extends Factory {
    @Override
    public Flyable createFlyable() {
        return new Aircraft();
    }

    @Override
    public Soundable createSayable() {
        return new SoundBox();
    }

    @Override
    public Writeable createWriteable() {
        return new FountainPen();
    }
}

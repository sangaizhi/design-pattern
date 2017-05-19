package org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product;

import org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product.base.Soundable;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class SoundBox implements Soundable {
    @Override
    public void say() {
        System.out.println("我是一台音箱，saying...");
    }
}

package org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product;

import org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product.base.Writeable;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class Pencil implements Writeable {
    @Override
    public void write() {
        System.out.println("我是一只铅笔， writing...");
    }
}

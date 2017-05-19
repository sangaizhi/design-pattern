package org.sangaizhi.designpattern.fatory.abstract_factory.product;

import org.sangaizhi.designpattern.fatory.abstract_factory.product.base.Writeable;

/**
 * @author sangaizhi
 * @date 2017/5/19
 */
public class FountainPen implements Writeable {
    @Override
    public void write() {
        System.out.println("我是一支钢笔，writing...");
    }
}

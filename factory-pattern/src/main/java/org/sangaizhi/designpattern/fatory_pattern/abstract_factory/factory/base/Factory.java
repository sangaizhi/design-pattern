package org.sangaizhi.designpattern.fatory_pattern.abstract_factory.factory.base;

import org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product.base.Flyable;
import org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product.base.Sayable;
import org.sangaizhi.designpattern.fatory_pattern.abstract_factory.product.base.Writeable;

/**
 * 为创建一组相关或相互依赖的对象提供一个接口，而且无需指定他们的具体类。同样在下面的结构图中，
 * 我们可以更好地解释这一定义。我们的抽象工厂中包含一系列的去构造一个抽象产品的方法，而具体产品的实现则是放在了具体工厂（工厂A和B）中进行。
 * created by sangaizhi on 2017/5/19.
 */
public abstract class Factory {

    public abstract Flyable createFlyable();

    public abstract Sayable createSayable();

    public abstract Writeable createWriteable();

}

/**
 * 文件名称: Singleton3
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/18 23:09
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.singleton;

/**
 * 饿汉模式，
 * 这种方式基于 classloader 机制避免了多线程的同步问题，不过，instance在类装载时就实例化，
 * 虽然导致类装载的原因有很多种，在单例模式中大多数都是调用getInstance()方法，
 * 但是也不能确定有其它的方式（或者其他的静态方法）导致类记载，这时候初始化instance 显然没有达到 lazy loading 的效果
 *
 * @name Singleton3
 * @author sangaizhi
 * @date 2017/5/18  23:09
 * @version 1.0
 */
public class Singleton3 {
    private static Singleton3 instance = new Singleton3();
    private Singleton3(){}
    public static Singleton3 getInstance(){
        return  instance;
    }
}

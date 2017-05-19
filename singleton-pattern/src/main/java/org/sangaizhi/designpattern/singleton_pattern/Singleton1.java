/**
 * 文件名称: Singleton1
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/18 22:54
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.singleton_pattern;

/**
 * 懒汉单例模式，线程不安全.
 * 如果线程 A 执行到 null == instance 时判断为 true，那么此时就会去 new 一个 Singleton1；但是在 instance 还没初始化完成之前，
 * 线程B 也执行到 null == instance ，此时线程B 也判断为true,也会去执行 new Signletons1,
 * 最终就会产生多个 Singleton1 的实例
 *
 * @name Singleton1
 * @author sangaizhi
 * @date 2017/5/18  22:54
 * @version 1.0
 */
public class Singleton1{

    private static Singleton1 instance;
    private Singleton1(){}
    public static Singleton1 getInstance(){
        if(null == instance){
            instance = new Singleton1();
        }
        return instance;
    }

}

/**
 * 文件名称: Singleton4
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/18 23:23
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.singleton_pattern;

/**
 * 懒汉模式的变种，还是在类初始化的时候是假话instance
 * @name Singleton4
 * @author sangaizhi
 * @date 2017/5/18  23:23
 * @version 1.0
 */
public class Singleton4 {
    private static Singleton4 instance = null;
    static {
        instance = new Singleton4();
    }
    private Singleton4(){}
    public static Singleton4 getInstance(){
        return instance;
    }
}

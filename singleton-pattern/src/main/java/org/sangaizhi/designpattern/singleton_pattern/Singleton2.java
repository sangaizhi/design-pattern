/**
 * 文件名称: Singleton2
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/18 23:06
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.singleton_pattern;

/**
 * 懒汉模式，线程安全
 * 但是效率低下， 99% 的情况先不需要同步
 *
 * @name Singleton2
 * @author sangaizhi
 * @date 2017/5/18  23:06
 * @version 1.0
 */
public class Singleton2 {

    private static Singleton2 instance;
    private Singleton2(){}
    public static synchronized Singleton2 getInstance(){
        if(null == instance){
            instance = new Singleton2();
        }
        return instance;
    }
}

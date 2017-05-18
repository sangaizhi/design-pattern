/**
 * 文件名称: Singleton7
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/18 23:30
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.singleton;

/**
 * @name Singleton7
 * @author sangaizhi
 * @date 2017/5/18  23:30
 * @version 1.0
 */
public class Singleton7 {

    private volatile static Singleton7 instance;
    private Singleton7(){}
    public static Singleton7 getInstance(){
        if(instance == null){
            synchronized (Singleton7.class){
                if(null == instance){
                    instance = new Singleton7();
                }
            }
        }
        return instance;
    }
}

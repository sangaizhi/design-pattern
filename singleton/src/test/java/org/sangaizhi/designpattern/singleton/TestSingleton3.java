/**
 * 文件名称: TestSingleton3
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/18 23:18
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.singleton;

/**
 * @name TestSingleton3
 * @author sangaizhi
 * @date 2017/5/18  23:18
 * @version 1.0
 */
public class TestSingleton3 {
    public static void main(String[] args) {
        try {
            Class clazz =  Class.forName("org.sangaizhi.designpattern.singleton.Singleton3");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}

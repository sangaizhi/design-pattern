/**
 * 文件名称: Client
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 21:43
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;

/**
 * @name Client
 * @author sangaizhi
 * @date 2017/5/20  21:43
 * @version 1.0
 */
public class Client {
    public static void main(String[] args) {
        IGamePlayer iGamePlayer = new GamePlayer("张三");
        InvocationHandler handler = new GamePlayerHandler(iGamePlayer);
        ClassLoader classLoader = iGamePlayer.getClass().getClassLoader();
        IGamePlayer proxy = DynamicProxy.newProxyInstance(classLoader, iGamePlayer.getClass().getInterfaces(), handler);
        proxy.login("zhangsan","123");
        proxy.killBoss();
        proxy.upgrade();

    }
}

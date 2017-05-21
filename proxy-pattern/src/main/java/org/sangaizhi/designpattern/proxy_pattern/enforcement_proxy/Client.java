/**
 * 文件名称: Client
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 21:12
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.proxy_pattern.enforcement_proxy;

/**
 * @name Client
 * @author sangaizhi
 * @date 2017/5/20  21:12
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // test1();
        // test2();
        test3();
    }

    /**
     * 直接调用真实角色
     */
    public static void test1(){
        GamePlayer gamePlayer = new GamePlayer("张三");
        gamePlayer.login("zhangsan","123");
        gamePlayer.killBoss();
        gamePlayer.upgrade();
    }

    /**
     * 直接使用代理类访问
     */
    public static void test2(){
        GamePlayerProxy gamePlayerProxy = new GamePlayerProxy(new GamePlayer("张三"));
        gamePlayerProxy.login("zhangsan","123");
        gamePlayerProxy.killBoss();
        gamePlayerProxy.upgrade();
    }

    /**
     * 使用真实角色的代理类
     */
    public static void test3(){
        GamePlayer gamePlayer = new GamePlayer("张三");
        IGamePlayer gamePlayerProxy = gamePlayer.getProxy();
        gamePlayer.login("zhangsan ", "123");
        gamePlayerProxy.killBoss();
        gamePlayer.upgrade();


    }
}

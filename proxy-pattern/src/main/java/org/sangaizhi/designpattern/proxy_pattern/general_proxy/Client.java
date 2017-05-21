/**
 * 文件名称: Client
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 20:39
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.proxy_pattern.general_proxy;

/**
 * @name Client
 * @author sangaizhi
 * @date 2017/5/20  20:39
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        // 定义玩家的代理
        GamePlayerProxy playerProxy = new GamePlayerProxy("张三");
        playerProxy.login("zhangsan","12");
        playerProxy.killBoss();
        playerProxy.upgrade();



    }}

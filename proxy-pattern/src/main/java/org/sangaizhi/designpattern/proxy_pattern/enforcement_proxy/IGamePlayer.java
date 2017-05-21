/**
 * 文件名称: IGamePlayer
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 21:03
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.proxy_pattern.enforcement_proxy;

/**
 * @Name IGamePlayer
 * @Author sangaizhi
 * @Date 2017/5/20  21:03
 * @Version 1.0
 */
public interface IGamePlayer {

    void login(String user, String password);

    void killBoss();

    void upgrade();

    /**
     * 得到真实角色的代理对象
     * @return
     */
    IGamePlayer getProxy();


}

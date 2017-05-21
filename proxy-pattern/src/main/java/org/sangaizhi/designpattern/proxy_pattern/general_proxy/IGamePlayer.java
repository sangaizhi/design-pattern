/**
 * 文件名称: IGamePlayer
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 20:29
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.proxy_pattern.general_proxy;

/**
 * 抽象主题角色：游戏玩家
 * @name IGamePlayer
 * @author sangaizhi
 * @date 2017/5/20  20:29
 * @version 1.0
 */
public interface IGamePlayer {
    /**
     * 登录
     * @param user
     * @param password
     */
    void login(String user, String password);

    /**
     * 打怪
     */
    void killBoss();

    /**
     * 升级
     */
    void upgrade();
}

/**
 * 文件名称: GamePlayerProxy
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 21:09
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.proxy_pattern.enforcement_proxy;

/**
 * @name GamePlayerProxy
 * @author sangaizhi
 * @date 2017/5/20  21:09
 * @version 1.0
 */
public class GamePlayerProxy implements IGamePlayer {

    private IGamePlayer iGamePlayer;

    public GamePlayerProxy(IGamePlayer iGamePlayer){
        this.iGamePlayer = iGamePlayer;
    }

    @Override
    public void login(String user, String password) {
        this.iGamePlayer.login(user, password);
    }

    @Override
    public void killBoss() {
        this.iGamePlayer.killBoss();
    }

    @Override
    public void upgrade() {
        this.iGamePlayer.upgrade();
    }

    /**
     * 代理的代理还没有，就是自己
     * @return
     */
    @Override
    public IGamePlayer getProxy() {
        return null;
    }
}

/**
 * 文件名称: GamePlayer
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 21:05
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.proxy_pattern.enforcement_proxy;

/**
 * 真实角色，需要管理自己的代理
 * @name GamePlayer
 * @author sangaizhi
 * @date 2017/5/20  21:05
 * @version 1.0
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    private IGamePlayer iGamePlayer = null;

    public GamePlayer(String name){
        this.name = name;
    }

    public boolean isProxy(){
        return null != iGamePlayer;
    }

    @Override
    public void login(String user, String password) {
        if(isProxy()){
            System.out.println("登录名为"+ user +"用户登录，昵称：" + this.name);
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void killBoss() {
        if(isProxy()){
            System.out.println(this.name +"正在打怪");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public void upgrade() {
        if(isProxy()){
            System.out.println(this.name +"升級了");
        }else{
            System.out.println("请使用指定的代理访问");
        }
    }

    @Override
    public IGamePlayer getProxy() {
        iGamePlayer = new GamePlayerProxy(this);
        return iGamePlayer;
    }
}

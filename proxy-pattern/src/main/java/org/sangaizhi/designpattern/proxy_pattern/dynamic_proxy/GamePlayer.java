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
package org.sangaizhi.designpattern.proxy_pattern.dynamic_proxy;

/**
 * 真实角色，需要管理自己的代理
 * @name GamePlayer
 * @author sangaizhi
 * @date 2017/5/20  21:05
 * @version 1.0
 */
public class GamePlayer implements IGamePlayer {

    private String name;


    public GamePlayer(String name){
        this.name = name;
    }


    @Override
    public void login(String user, String password) {
            System.out.println("登录名为"+ user +"用户登录，昵称：" + this.name);
    }

    @Override
    public void killBoss() {
            System.out.println(this.name +"正在打怪");
    }

    @Override
    public void upgrade() {
            System.out.println(this.name + "升级了");
    }

}

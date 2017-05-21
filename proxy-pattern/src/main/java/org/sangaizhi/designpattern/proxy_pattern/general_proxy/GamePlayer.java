/**
 * 文件名称: GamePlayer
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 20:34
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.proxy_pattern.general_proxy;

/**
 * @name GamePlayer
 * @author sangaizhi
 * @date 2017/5/20  20:34
 * @version 1.0
 */
public class GamePlayer implements IGamePlayer {

    private String name;

    /**
     *
     * @param iGamePlayer IGamePlayer 的实例，判断是否能创建
     * @param name
     * @throws Exception
     */
    public GamePlayer(IGamePlayer iGamePlayer, String name) throws Exception {
        if(null == iGamePlayer){
            throw new Exception("不能创建真实的角色");
        }else{
            this.name= name;
        }
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
        System.out.println(this.name +"升級了");
    }
}

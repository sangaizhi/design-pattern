/**
 * 文件名称: GamePlayerHandler
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 21:30
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.proxy_pattern.dynamic_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理处理
 * @name GamePlayerHandler
 * @author sangaizhi
 * @date 2017/5/20  21:30
 * @version 1.0
 */
public class GamePlayerHandler implements InvocationHandler {

    // 被代理的实例
    Object obj;

    /**
     * 构造方法确定需要代理谁
     * @param obj
     */
    public GamePlayerHandler(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(obj, args);
    }
}

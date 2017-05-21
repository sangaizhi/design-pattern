/**
 * 文件名称: DynamicProxy
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 22:33
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.proxy_pattern.aop_sample.aopalliance.aop;

import org.sangaizhi.designpattern.proxy_pattern.aop_sample.aopalliance.Advice;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

/**
 * @name DynamicProxy
 * @author sangaizhi
 * @date 2017/5/20  22:33
 * @version 1.0
 */
public class DynamicProxy<T> {

    /**
     * 重新生成一个对象：代理对象，
     * @param advice 要代理的对象
     * @return
     */
    public static <T> T newProxyInstance(Advice advice){
        ClassLoader classLoader = advice.getClass().getClassLoader();
        // 要代理对象实现的所有接口，目的是实现接口中的所有方法（都是空的），这些方法将由 handler 接管
        Class<?>[] interfaces = advice.getClass().getInterfaces();
        InvocationHandler handler = new MyInvocationHandle(advice);
        return (T) Proxy.newProxyInstance(classLoader, interfaces, handler);
    }
}

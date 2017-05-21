/**
 * 文件名称: MyInvocationHandle
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 22:03
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.proxy_pattern.aop_sample.aopalliance.aop;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @name MyInvocationHandle
 * @author sangaizhi
 * @date 2017/5/20  22:03
 * @version 1.0
 */
public class MyInvocationHandle implements InvocationHandler {

    private Object obj;

    public MyInvocationHandle(Object obj){
        this.obj = obj;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(obj, args);
    }
}

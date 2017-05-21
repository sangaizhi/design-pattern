/**
 * 文件名称: BeforeAdvice
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 21:58
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.proxy_pattern.aop_sample.aopalliance.aop;

import org.sangaizhi.designpattern.proxy_pattern.aop_sample.aopalliance.Advice;

/**
 * @Name BeforeAdvice
 * @Author sangaizhi
 * @Date 2017/5/20  21:58
 * @Version 1.0
 */
public interface BeforeAdvice extends Advice {
    void before();
}

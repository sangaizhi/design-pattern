/**
 * 文件名称: AbstractColleague
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/21 13:54
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.mediator_pattern.note;

/**
 * @name AbstractColleague
 * @author sangaizhi
 * @date 2017/5/21  13:54
 * @version 1.0
 */
public class AbstractColleague {

    protected AbstractMediator mediator;
    public AbstractColleague(AbstractMediator mediator){
         this.mediator = mediator;
     }


}

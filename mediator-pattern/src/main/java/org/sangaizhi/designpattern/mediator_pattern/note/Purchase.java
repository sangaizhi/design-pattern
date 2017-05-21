/**
 * 文件名称: Purchase
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/21 13:57
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.mediator_pattern.note;

/**
 * @name Purchase
 * @author sangaizhi
 * @date 2017/5/21  13:57
 * @version 1.0
 */
public class Purchase extends  AbstractColleague {
    public Purchase(AbstractMediator mediator) {
        super(mediator);
    }

    public void buy(int num){
        System.out.println("采购，需采购数量为：" + num);
        super.mediator.execute("purchase.buy", num);
    }

    public void refuseBuy(){
        System.out.println("停止采购");
    }
}

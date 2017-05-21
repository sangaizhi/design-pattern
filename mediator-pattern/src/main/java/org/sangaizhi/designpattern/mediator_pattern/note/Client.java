/**
 * 文件名称: Client
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/21 14:30
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.mediator_pattern.note;

/**
 * @name Client
 * @author sangaizhi
 * @date 2017/5/21  14:30
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        AbstractMediator mediator = new Mediator();
        // 采购
        Purchase purchase = new Purchase(mediator);
        purchase.buy(100);

        Sale sale = new Sale(mediator);
        sale.sell(50);

        Stock stock = new Stock(mediator);
        stock.clear();
    }

}

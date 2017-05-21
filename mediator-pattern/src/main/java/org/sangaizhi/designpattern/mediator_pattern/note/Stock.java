/**
 * 文件名称: Stock
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
 * 库存类，
 * @name Stock
 * @author sangaizhi
 * @date 2017/5/21  13:57
 * @version 1.0
 */
public class Stock extends AbstractColleague{


    public Stock(AbstractMediator mediator) {
        super(mediator);
    }

    private static int STOCK_NUM = 100;

    // 加库存
    public void increase(int number){
        STOCK_NUM = STOCK_NUM + number;
        System.out.println("加库存，库存数量为：" + STOCK_NUM);
    }

    // 减库存
    public void decrease(int number){
        STOCK_NUM = STOCK_NUM - number;
        System.out.println("减库存，库存数量为：" + STOCK_NUM);
    }

    public int getStockNumber(){
        return STOCK_NUM;
    }

    // 清库存
    public void clear(){
        System.out.println("清库存，库存数量为：" + STOCK_NUM);

        // 通知中介者要清库存了，赶紧销售
        super.mediator.execute("stock.clear", STOCK_NUM);
    }
}

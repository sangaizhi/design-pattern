/**
 * 文件名称: Mediator
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/21 13:55
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.mediator_pattern.note;

import java.util.Objects;

/**
 * @name Mediator
 * @author sangaizhi
 * @date 2017/5/21  13:55
 * @version 1.0
 */
public class Mediator extends AbstractMediator {
    @Override
    public void execute(String str, Object... args) {
        if(Objects.equals("purchase.buy", str)){
            this.buy((Integer) args[0]);
        }else if(Objects.equals(str, "sale.sell")){
            this.sell((Integer) args[0]);
        }else if(Objects.equals(str, "sale.offSale")){
            this.offSale();
        }else if(Objects.equals(str, "stock.clear")){
            this.clear();
        }
    }

    private void buy(int number){
        int sellNumber = super.sale.getSellStatus();
        if(sellNumber > 80){
            System.out.println("采购，实际采购数量为：" + number);
            this.stock.increase(number);
        }else{
            int newNumber = number / 2;
            System.out.println("采购，实际采购数量为：" + newNumber);
            this.stock.increase(newNumber);
        }
    }

    private void sell(int number){
        if(super.stock.getStockNumber() < number){
            // 库存不足，
            super.purchase.buy(number);
        }
        super.stock.decrease(number);
    }

    private void offSale(){
        System.out.println("折扣销售，可销售数量为：" + super.stock.getStockNumber());
    }

    private void clear(){
        super.sale.offSale();
        super.purchase.refuseBuy();
    }

}

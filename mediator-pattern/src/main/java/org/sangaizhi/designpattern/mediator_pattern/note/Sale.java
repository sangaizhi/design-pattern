/**
 * 文件名称: Sale
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/21 13:56
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.mediator_pattern.note;

import java.util.Random;

/**
 * 销售类
 * @name Sale
 * @author sangaizhi
 * @date 2017/5/21  13:56
 * @version 1.0
 */
public class Sale extends AbstractColleague {
    public Sale(AbstractMediator mediator) {
        super(mediator);
    }

    //销售
    public void sell(int number){
        System.out.println("销售，销售数量为：" + number);
        super.mediator.execute("sale.sell", number);
    }


    // 获取销售情况
    public int getSellStatus(){
        Random random = new Random(System.currentTimeMillis());
        int sellNumber = random.nextInt(100);
        System.out.println("销售，销售情况是：" + sellNumber);
        return sellNumber;
    }

    // 折扣销售
    public void offSale(){
        super.mediator.execute("sale.offSale");
    }


}

/**
 * 文件名称: BenzBuilder
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 15:15
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.builder_pattern.builder;

import org.sangaizhi.designpattern.builder_pattern.model.BenzCarModel;
import org.sangaizhi.designpattern.builder_pattern.model.CarModel;

import java.util.List;

/**
 * benz 建造者
 * @name BenzBuilder
 * @author sangaizhi
 * @date 2017/5/20  15:15
 * @version 1.0
 */
public class BenzBuilder extends CarBuilder {
    private CarModel benzCarModel = new BenzCarModel();
    @Override
    public void setSequence(List<String> sequence) {
        this.benzCarModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.benzCarModel;
    }
}

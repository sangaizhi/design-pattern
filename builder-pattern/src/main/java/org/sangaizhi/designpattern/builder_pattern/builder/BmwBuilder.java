/**
 * 文件名称: BmwBuilder
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 15:18
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.builder_pattern.builder;

import org.sangaizhi.designpattern.builder_pattern.model.BmwCarModel;
import org.sangaizhi.designpattern.builder_pattern.model.CarModel;

import java.util.List;

/**
 * bmw 建造者
 * @name BmwBuilder
 * @author sangaizhi
 * @date 2017/5/20  15:18
 * @version 1.0
 */
public class BmwBuilder extends CarBuilder {
    private CarModel bmwCarModel = new BmwCarModel();
    @Override
    public void setSequence(List<String> sequence) {
        this.bmwCarModel.setSequence(sequence);
    }

    @Override
    public CarModel getCarModel() {
        return this.bmwCarModel;
    }
}

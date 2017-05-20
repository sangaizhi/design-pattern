/**
 * 文件名称: CarBuilder
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 15:13
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.builder_pattern.builder;

import java.util.List;

import org.sangaizhi.designpattern.builder_pattern.model.CarModel;

/**
 * @name CarBuilder
 * @author sangaizhi
 * @date 2017/5/20  15:13
 * @version 1.0
 */
public abstract class CarBuilder {
    public abstract  void setSequence(List<String> sequence);
    public abstract CarModel getCarModel();
}

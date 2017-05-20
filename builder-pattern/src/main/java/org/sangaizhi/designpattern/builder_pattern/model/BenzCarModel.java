/**
 * 文件名称: BenzCarModel
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 15:09
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.builder_pattern.model;

/**
 * @name BenzCarModel
 * @author sangaizhi
 * @date 2017/5/20  15:09
 * @version 1.0
 */
public class BenzCarModel extends CarModel {
    @Override
    public void start() {
        System.out.println("benz 是这样启动的");
    }

    @Override
    public void stop() {
        System.out.println("benz 是这样停止的");
    }

    @Override
    public void alarm() {
        System.out.println("benz 的喇叭是这种声音");
    }

    @Override
    public void engineBoom() {
        System.out.println("benz 的引擎声是这样的");
    }
}

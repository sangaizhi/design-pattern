/**
 * 文件名称: HummerAModel
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 14:24
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.template_method_pattern;

/**
 * 具体模板类，A 模型的悍马
 * @name HummerAModel
 * @author sangaizhi
 * @date 2017/5/20  14:24
 * @version 1.0
 */
public class HummerAModel extends HummerModel {
    @Override
    public void start() {
        System.out.println("悍马 A 开始发动...");
    }

    @Override
    public void stop() {
        System.out.println("悍马 A 停车了...");
    }

    @Override
    public void alarm() {
        System.out.println("悍马 A 鸣笛:滴滴滴...");
    }

    @Override
    public void engineBoom() {
        System.out.println("悍马 A 的引擎声是这样的：磁磁磁");
    }
}

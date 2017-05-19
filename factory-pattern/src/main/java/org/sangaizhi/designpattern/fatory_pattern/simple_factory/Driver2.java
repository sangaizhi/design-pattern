/**
 * 文件名称: Driver2
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/19 23:35
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.fatory_pattern.simple_factory;

/**
 * @name Driver2
 * @author sangaizhi
 * @date 2017/5/19  23:35
 * @version 1.0
 */
public class Driver2 {
    public static <T extends Car> T driveCar(Class<T> clazz){
        Car car = null;
        try{
            car = (Car) Class.forName(clazz.getName()).newInstance();
        }catch (Exception e){

        }
        return (T) car;

    }
}

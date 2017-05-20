/**
 * 文件名称: Client
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 15:25
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.builder_pattern;

/**
 * @name Client
 * @author sangaizhi
 * @date 2017/5/20  15:25
 * @version 1.0
 */
public class Client {

    public static void main(String[] args) {
        Director director = new Director();

        // 模拟 10 辆 A 类型的 benz
        for(int i = 0;i < 10; i++){
            director.getABenzCarModel().run();
            System.out.println("------------------模拟完一辆 A 类型的 benz:" + i);
        }
        System.out.println("------------------所有 A 类型的 benz 都已模拟完");
        // 模拟 3 辆 B 类型的 benz
        for(int i = 0;i < 3; i++){
            director.getBBenzCarModel().run();
            System.out.println("------------------模拟完一辆 B 类型的 benz:" + i);
        }
        System.out.println("------------------所有 B 类型的 benz 都已模拟完");
        // 模拟 10 辆 A 类型的 bmw
        for(int i = 0;i < 10; i++){
            director.getABmwCarModel().run();
            System.out.println("------------------模拟完一辆 A 类型的 bmw:" + i);
        }
        System.out.println("------------------所有 A 类型的 bmw 都已模拟完");
        // 模拟 3 辆 B 类型的 bmw
        for(int i = 0;i < 3; i++){
            director.getBBmwCarModel().run();
            System.out.println("------------------模拟完一辆 B 类型的 bmw:" + i);
        }
        System.out.println("------------------所有 B 类型的 bmw 都已模拟完");
    }
}

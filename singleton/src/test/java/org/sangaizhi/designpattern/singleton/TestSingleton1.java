/**
 * 文件名称: TestSingleton1
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/18 23:04
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.singleton;

import java.util.concurrent.CountDownLatch;

/**
 * @name TestSingleton1
 * @author sangaizhi
 * @date 2017/5/18  23:04
 * @version 1.0
 */
public class TestSingleton1 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+":"+Singleton1.getInstance());
    }

    public static void main(String[] args) {
        CountDownLatch latch = new CountDownLatch(100);
        for(int i = 0; i< 100;i++){
            new Thread(new TestSingleton1(),"thread-" + i).start();
            latch.countDown();
        }
    }
}

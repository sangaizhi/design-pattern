/**
 * 文件名称: Singleton5
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/18 23:25
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.singleton;

/**
 * 这种方式同样利用了classloder的机制来保证初始化instance时只有一个线程，
 * 它跟 Singleton3 和  Singleton4 方式不同的是（很细微的差别）：
 * Singleton3 和 Singleton4 方式是只要Singleton类被装载了，
 * 那么instance就会被实例化（没有达到lazy loading效果），
 * 而这种方式是Singleton类被装载了，instance不一定被初始化。
 * 因为SingletonHolder类没有被主动使用，
 * 只有显示通过调用getInstance方法时，才会显示装载SingletonHolder类，
 * 从而实例化instance。想象一下，如果实例化instance很消耗资源，
 * 我想让他延迟加载，另外一方面，我不希望在Singleton类加载时就实例化，
 * 因为我不能确保Singleton类还可能在其他的地方被主动使用从而被加载，
 * 那么这个时候实例化instance显然是不合适的。
 * 这个时候，这种方式相比 Singleton3 和 Singleton4 方式就显得很合理。
 * @name Singleton5
 * @author sangaizhi
 * @date 2017/5/18  23:25
 * @version 1.0
 */
public class Singleton5 {
    private static class SingletonHolder{
        private final static Singleton5 INSTANCE = new Singleton5();
    }
    private Singleton5(){}
    public static final Singleton5 getInstance(){
        return SingletonHolder.INSTANCE;
    }
}

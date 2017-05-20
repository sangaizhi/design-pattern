/**
 * 文件名称: CarModel
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 15:05
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.builder_pattern.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @name CarModel
 * @author sangaizhi
 * @date 2017/5/20  15:05
 * @version 1.0
 */
public abstract class CarModel {
    // 基本方法的执行顺序
    private List<String> sequence = new ArrayList<>();

    /**
     * 基本方法
     * 首先，这个模型要能够被发动起来，不管是手摇还是电力，
     * 反正是要能够发送起来，那这个实现就要写在实现类里
     */
    public abstract void start();

    /**
     * 基本方法
     * 能发动，还要能停下来
     */
    public abstract  void stop();

    /**
     * 基本方法
     * 喇叭会发出声音，是滴滴叫还是哔哔叫
     */
    public abstract void alarm();

    /**
     * 基本方法
     * 引擎会响，不响就是假的悍马
     */
    public abstract void engineBoom();
    /**
     * 模板方法
     * 既然是车子，就要跑起来
     * 为防止恶意操作，一般的模板方法都要加上 final 关键字，不允许被重写
     */
    public final  void run(){
        for(String actionName : sequence){
            if(Objects.equals(actionName, "start")){
                this.start();
            }else if(Objects.equals(actionName, "stop")){
                this.stop();
            }else if(Objects.equals(actionName, "alarm")){
                this.alarm();
            }else if(Objects.equals(actionName, "engine boom")){
                this.engineBoom();
            }
        }
    }

    public void setSequence(List<String> sequence) {
        this.sequence = sequence;
    }
}

/**
 * 文件名称: Director
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/20 15:19
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.builder_pattern;

import java.util.ArrayList;
import java.util.List;

import org.sangaizhi.designpattern.builder_pattern.builder.BenzBuilder;
import org.sangaizhi.designpattern.builder_pattern.builder.BmwBuilder;
import org.sangaizhi.designpattern.builder_pattern.model.BenzCarModel;
import org.sangaizhi.designpattern.builder_pattern.model.BmwCarModel;

/**
 * 导演类
 * @name Director
 * @author sangaizhi
 * @date 2017/5/20  15:19
 * @version 1.0
 */
public class Director {
    private List<String> sequence = new ArrayList<>();
    private BenzBuilder benzBuilder = new BenzBuilder();
    private BmwBuilder bmwBuilder = new BmwBuilder();
    public BenzCarModel getABenzCarModel(){
        this.sequence.clear();
        sequence.add("start");
        sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzCarModel) this.benzBuilder.getCarModel();
    }

    public BenzCarModel getBBenzCarModel(){
        this.sequence.clear();
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("stop");
        this.benzBuilder.setSequence(sequence);
        return (BenzCarModel) this.benzBuilder.getCarModel();
    }

    public BmwCarModel getABmwCarModel(){
        this.sequence.clear();
        sequence.add("start");
        sequence.add("stop");
        this.bmwBuilder.setSequence(sequence);
        return (BmwCarModel) this.bmwBuilder.getCarModel();
    }

    public BmwCarModel getBBmwCarModel(){
        this.sequence.clear();
        sequence.add("start");
        sequence.add("alarm");
        sequence.add("stop");
        this.bmwBuilder.setSequence(sequence);
        return (BmwCarModel) this.bmwBuilder.getCarModel();
    }

}

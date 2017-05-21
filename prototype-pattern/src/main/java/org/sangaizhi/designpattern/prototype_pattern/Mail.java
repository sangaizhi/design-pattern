/**
 * 文件名称: Mail
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/21 11:39
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.prototype_pattern;

/**
 * @name Mail
 * @author sangaizhi
 * @date 2017/5/21  11:39
 * @version 1.0
 */
public class Mail implements Cloneable {

    private String receiver;

    private String subject;

    // 称谓
    private String appellate;

    private String context;

    private String tail;

    public Mail(AdvTemplate advTemplate){
        this.subject = advTemplate.getAdvSubject();
        this.context = advTemplate.getAdvContext();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppellate() {
        return appellate;
    }

    public void setAppellate(String appellate) {
        this.appellate = appellate;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Mail mail = null;
        try {
            mail = (Mail) super.clone();
        }catch (Exception e){
            e.printStackTrace();
        }
        return mail;
    }
}

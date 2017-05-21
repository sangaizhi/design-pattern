/**
 * 文件名称: Client
 * 系统名称: design-pattern
 * 模块名称:
 * 软件版权:
 * 功能说明:
 * 系统版本: 1.0.0.0
 * 开发人员: sangaizhi
 * 开发时间: 2017/5/21 11:43
 * 审核人员:
 * 相关文档:
 * 修改记录:
 * 修改日期:
 * 修改人员：
 * 修改说明：
 */
package org.sangaizhi.designpattern.prototype_pattern;

import java.util.Random;

/**
 * @name Client
 * @author sangaizhi
 * @date 2017/5/21  11:43
 * @version 1.0
 */
public class Client {

    private static int MAX_COUNT = 6;

    public static void main(String[] args) {
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT){
            mail.setAppellate(getRandString(6)+"先生/女士");
            mail.setReceiver(getRandString(5)+"@"+getRandString(3)+".com");
            sendEmail(mail);
            i++;
        }
    }

    public static void sendEmail(Mail mail){
        System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver()+ "\t发送成功");

    }
    public static String getRandString(int maxLength){
        String sourse = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        StringBuffer stringBuffer = new StringBuffer();
        Random random = new Random();
        for(int i = 0; i < maxLength; i++){
            stringBuffer.append(sourse.charAt(random.nextInt(sourse.length())));
        }
        return stringBuffer.toString();
    }

}

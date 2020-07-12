package com.yicj.dependenceinversion;

/**
 * ClassName: JavaCourse
 * Description: TODO(描述)
 * Date: 2020/7/12 20:35
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class FECourse implements ICourse {
    @Override
    public void studyCourse() {
        System.out.println("Geely在学习前端课程");
    }
}

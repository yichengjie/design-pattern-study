package com.yicj.dependenceinversion;

/**
 * ClassName: Geely
 * Description: TODO(描述)
 * Date: 2020/7/12 20:35
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Geely {

    private ICourse course ;

    // 具体依赖依靠高层模块Test的选择
    public void studyImoocCourse(){

        course.studyCourse();
    }

    public void setCourse(ICourse course) {
        this.course = course;
    }
}

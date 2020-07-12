package com.yicj.singleresponsibility;

/**
 * ClassName: ICourse
 * Description: TODO(描述)
 * Date: 2020/7/12 21:12
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public interface ICourse {
    // 职责1：获取课程信息
    String getCourseName() ;
    byte [] getCourseVideo() ;

    // 职责2：管理课程信息
    void studyCourse() ;
    void refundCourse() ;
}

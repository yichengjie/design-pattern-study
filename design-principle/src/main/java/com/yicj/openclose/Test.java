package com.yicj.openclose;

import lombok.extern.slf4j.Slf4j;

/**
 * ClassName: Test
 * Description: TODO(描述)
 * Date: 2020/7/12 20:01
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
public class Test {

    public static void main(String[] args) {
        ICourse course = new JavaDiscountCourse(96, "Java从零到企业电商开发", 348d) ;
        JavaDiscountCourse javaDiscountCourse = (JavaDiscountCourse) course ;
        log.info("课程Id：{},课程名称：{}，课程原价：{}, 课程价格：{}", course.getId(), course.getName(), javaDiscountCourse.getOriginPrice(), course.getPrice());
    }
}

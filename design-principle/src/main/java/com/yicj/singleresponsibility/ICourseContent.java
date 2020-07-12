package com.yicj.singleresponsibility;

public interface ICourseContent {
    // 职责1：获取课程信息
    String getCourseName() ;
    byte [] getCourseVideo() ;
}

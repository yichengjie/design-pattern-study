package com.yicj.dependenceinversion;

/**
 * ClassName: Test
 * Description: TODO(描述)
 * Date: 2020/7/12 20:38
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Test {
    //    v1
//    public static void main(String[] args) {
//        Geely geely = new Geely() ;
//        geely.studyJavaCourse();
//        geely.studyFECourse();
//        geely.studyPythonCourse();
//    }
//    v2
//    public static void main(String[] args) {
//        Geely geely = new Geely() ;
//        geely.studyImoocCourse(new JavaCourse());
//        geely.studyImoocCourse(new FECourse());
//        geely.studyImoocCourse(new PythonCourse());
//    }
    public static void main(String[] args) {

        Geely geely = new Geely();
        geely.setCourse(new JavaCourse());
        geely.studyImoocCourse();

        geely.setCourse(new PythonCourse());
        geely.studyImoocCourse();
    }
}

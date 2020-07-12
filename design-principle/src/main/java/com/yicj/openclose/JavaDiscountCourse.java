package com.yicj.openclose;

/**
 * ClassName: JavaDiscountCourse
 * Description: TODO(描述)
 * Date: 2020/7/12 20:10
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class JavaDiscountCourse extends JavaCourse {
    public JavaDiscountCourse(Integer id, String name, Double price) {
        super(id, name, price);
    }

    public Double getOriginPrice(){
        return super.getPrice();
    }

    @Override
    public Double getPrice() {
        return super.getPrice() * 0.8;
    }
}

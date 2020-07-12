package com.yicj.openclose;

/**
 * ClassName: JavaCourse
 * Description: TODO(描述)
 * Date: 2020/7/12 19:58
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */

public class JavaCourse implements ICourse {

    private Integer id ;
    private String name ;
    private Double price ;

    public JavaCourse(Integer id, String name, Double price){
        this.id = id ;
        this.name = name ;
        this.price = price ;
    }

    @Override
    public Integer getId() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public Double getPrice() {
        return price;
    }
}

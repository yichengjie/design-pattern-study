package com.yicj.singleresponsibility;

/**
 * ClassName: Test
 * Description: TODO(描述)
 * Date: 2020/7/12 21:06
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public class Test {

    public static void main(String[] args) {

        FlyBird flyBird = new FlyBird() ;
        flyBird.mainMoveMode("大雁");

        WalkBird walkBird = new WalkBird() ;
        walkBird.mainMoveMode("鸵鸟");
    }
}

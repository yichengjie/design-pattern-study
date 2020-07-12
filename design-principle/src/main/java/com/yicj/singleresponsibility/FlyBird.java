package com.yicj.singleresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * ClassName: FlyBird
 * Description: TODO(描述)
 * Date: 2020/7/12 21:04
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
public class FlyBird {
    public void mainMoveMode(String birdName){
        log.info("{}用翅膀飞", birdName);
    }
}

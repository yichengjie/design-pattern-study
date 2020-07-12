package com.yicj.singleresponsibility;

import lombok.extern.slf4j.Slf4j;

/**
 * ClassName: WalkBird
 * Description: TODO(描述)
 * Date: 2020/7/12 21:05
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
@Slf4j
public class WalkBird {

    public void mainMoveMode(String birdName){
        log.info("{}用脚走", birdName);
    }
}

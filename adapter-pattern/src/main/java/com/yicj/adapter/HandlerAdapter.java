package com.yicj.adapter;

import com.yicj.adapter.model.HttpServletRequest;
import com.yicj.adapter.model.HttpServletResponse;
import com.yicj.adapter.model.ModelAndView;

/**
 * ClassName: HandlerAdapter
 * Description: TODO(描述)
 * Date: 2020/7/10 10:14
 *
 * @author yicj(626659321 @ qq.com)
 * 修改记录
 * @version 产品版本信息 yyyy-mm-dd 姓名(邮箱) 修改信息
 */
public interface HandlerAdapter {

    boolean supports(Object handler) ;

    ModelAndView handle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception ;
}

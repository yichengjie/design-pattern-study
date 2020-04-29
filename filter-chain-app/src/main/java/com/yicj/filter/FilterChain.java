package com.yicj.filter;

import java.util.List;

public class FilterChain {
    private List<Filter> list ;

    public FilterChain(List<Filter> list){
        this.list = list ;
    }

    public void doFilter(ServletRequest request, ServletResponse response) {
        int index = ContextHolder.get()  ;
        if (index < list.size()){
            //把下次要执行的filter的index移到下一位
            ContextHolder.set(index +1);
            list.get(index).doFilter(request,response,this);
        }
    }

}

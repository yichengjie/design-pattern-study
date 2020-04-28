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
            ContextHolder.set(index +1);
            Filter filter = list.get(index) ;
            filter.doFilter(request,response,this);
        }
    }

}

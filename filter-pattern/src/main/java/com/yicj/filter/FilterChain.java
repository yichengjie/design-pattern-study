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
            System.out.println("开始执行.["+index+"]..");
            ContextHolder.set(++index);
            Filter filter = list.get(index) ;
            filter.doFilter(request,response,this);
        }
        System.out.println("结束执行."+ContextHolder.get()+"...");
    }

}

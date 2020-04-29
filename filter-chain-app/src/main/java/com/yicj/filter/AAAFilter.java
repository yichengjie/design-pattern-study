package com.yicj.filter;

public class AAAFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {
        System.out.println(Thread.currentThread().getName() + "开始执行.[AAA]..");
        chain.doFilter(request,response);
        System.out.println(Thread.currentThread().getName() + "结束执行.[AAA]...");
    }
}

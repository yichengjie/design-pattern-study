package com.yicj.filter;

public class CCCFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {
        System.out.println("进行了CCC的业务处理");
        chain.doFilter(request,response);
    }
}

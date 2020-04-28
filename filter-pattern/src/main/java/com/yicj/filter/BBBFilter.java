package com.yicj.filter;

public class BBBFilter implements Filter {
    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) {
        System.out.println("进行了BBB的业务处理");
        chain.doFilter(request,response);
    }
}

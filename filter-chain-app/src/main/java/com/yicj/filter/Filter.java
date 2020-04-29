package com.yicj.filter;

public interface Filter {

    void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) ;
}

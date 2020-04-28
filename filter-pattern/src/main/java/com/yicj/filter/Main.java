package com.yicj.filter;


import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Main main = new Main() ;
        main.test();
//        Integer index = ContextHolder.get();
//        System.out.println(index);
//        index = index +1 ;
//        System.out.println(index);
//        ContextHolder.set(index);
//        System.out.println(ContextHolder.get());
    }

    public void test(){
        List<Filter> filters = new ArrayList<>() ;
        filters.add(new AAAFilter()) ;
        filters.add(new BBBFilter()) ;
        filters.add(new CCCFilter()) ;
        FilterChain chain = new FilterChain(filters) ;
        ContextHolder.set(0);
        chain.doFilter(new ServletRequest(),new ServletResponse() );
        ContextHolder.clean();
    }


//    class MyTask implements Runnable{
//
//        private FilterChain chain ;
//
//        public MyTask(FilterChain chain){
//            this.chain = chain ;
//        }
//        @Override
//        public void run() {
//            doExecute(new ServletRequest(),new ServletResponse(),chain);
//        }
//    }

}

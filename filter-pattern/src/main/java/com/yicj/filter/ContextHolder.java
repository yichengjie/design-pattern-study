package com.yicj.filter;

public class ContextHolder {

    private static ThreadLocal<Integer> threadLocal =ThreadLocal.withInitial(() -> 0) ;

    public static void set(Integer index){
        threadLocal.set(index);
    }

    public static Integer get(){
        Integer s = threadLocal.get();
        return s ;
    }

    public static void clean(){
        threadLocal.remove();
    }

}

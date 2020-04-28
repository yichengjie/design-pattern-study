package com.yicj.filter;

import java.util.List;

/**
 * 交集过滤器
 */
public class AndCriteria implements Criteria{

    private Criteria mainCriteria ;
    private Criteria otherCriteria ;

    public AndCriteria(Criteria mainCriteria, Criteria otherCriteria){
        this.mainCriteria = mainCriteria ;
        this.otherCriteria = otherCriteria ;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> list1 = mainCriteria.meetCriteria(persons);
        List<Person> list2 = this.otherCriteria.meetCriteria(list1);
        return list2;
    }
}

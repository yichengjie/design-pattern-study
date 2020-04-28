package com.yicj.filter;

import java.util.List;

public class OrCriteria implements Criteria {

    private Criteria mainCriteria ;
    private Criteria otherCriteria ;

    public OrCriteria(Criteria mainCriteria, Criteria otherCriteria){
        this.mainCriteria = mainCriteria ;
        this.otherCriteria = otherCriteria ;
    }

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> list1 = mainCriteria.meetCriteria(persons);
        List<Person> list2 = otherCriteria.meetCriteria(persons);
        list1.forEach(person -> {
            if (!list2.contains(person)){
                list2.add(person) ;
            }
        });
        return list2;
    }
}

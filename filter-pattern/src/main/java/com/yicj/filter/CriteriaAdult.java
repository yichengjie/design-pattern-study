package com.yicj.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 成年人过滤器
 */
public class CriteriaAdult implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> personList = persons.stream()
            .filter(person -> person.getAge() >= 18)
            .collect(Collectors.toList()) ;
        return personList;
    }
}

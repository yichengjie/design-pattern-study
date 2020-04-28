package com.yicj.filter;

import java.util.List;
import java.util.stream.Collectors;

/**
 * 女性过滤器
 */
public class CriteriaFemale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> collect =  persons.stream()
            .filter(person -> person.getGender().equals(GenderStatus.FEMALE))
            .collect(Collectors.toList());
        return collect;
    }
}

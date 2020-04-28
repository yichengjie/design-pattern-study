package com.yicj.filter;

import java.util.List;

public interface Criteria {

    /**
     * 过滤器
     * @param persons
     * @return
     */
    List<Person> meetCriteria(List<Person> persons);

}

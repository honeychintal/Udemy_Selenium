package com.qa.factory;

import com.qa.model.Modified;
import com.qa.model.Sort;
import com.qa.model.SortList;
import java.util.List;

public class SortListFactory {
    public static SortList createSortList(List<Sort> sort) {
        return SortList.builder()
                .sort(sort)
                .build();
    }
    public static Sort createSort(Modified modified) {
        return Sort.builder()
                .modified(modified)
                .build();
    }
    public static Modified createModified(String order) {
        return Modified.builder()
                .order(order)
                .build();
    }
}

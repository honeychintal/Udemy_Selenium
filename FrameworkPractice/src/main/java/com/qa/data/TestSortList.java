package com.qa.data;

import com.google.common.collect.ImmutableList;
import com.qa.factory.SortListFactory;
import com.qa.model.Modified;
import com.qa.model.Sort;
import com.qa.model.SortList;

public class TestSortList {
	
	public static final Modified MODIFIED = SortListFactory.createModified("desc");
	
	public static final Sort SORT = SortListFactory.createSort(MODIFIED);
	
	public static final SortList SORTL_LIST = SortListFactory.createSortList(ImmutableList.of(SORT));
}

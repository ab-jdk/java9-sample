/*
 * www.qwfys.org Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package sort.impl.merge;

import java.util.Collections;
import java.util.List;

import service.sort.SortService;


/**
 * 
 * 
 * @author lwk
 * @version $Id: MergeSort.java, v 0.1 2018-03-02 02:04:59 lwk Exp$
 */
public class MergeSort implements SortService {

    public <T extends Comparable> List<T> sortList(List<T> list) {
        System.out.println("using MergeSort");
        Collections.sort(list);
        return list;
    }

}

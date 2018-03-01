/*
 * www.qwfys.org Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package sort.impl.bubble;

import java.util.List;

import service.sort.SortService;

/**
 * 
 * 
 * @author lwk
 * @version $Id: BubbleSort.java, v 0.1 2018-03-02 02:00:51 lwk Exp$
 */
public class BubbleSort implements SortService {

    public <T extends Comparable> List<T> sortList(List<T> list) {
        System.out.println("use BubbleSort");
        for (int outer = 0; outer < list.size() - 1; outer++) {
            for (int inner = 0; inner < list.size() - outer - 1; inner++) {
                if (list.get(inner).compareTo(list.get(inner + 1)) > 0) {
                    swap(list, inner);
                }
            }
        }
        return list;
    }

    private <T> void swap(List<T> list, int inner) {
        T temp = list.get(inner);
        list.set(inner, list.get(inner + 1));
        list.set(inner + 1, temp);
    }
}

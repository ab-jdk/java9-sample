/*
 * www.qwfys.org Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package org.qwfys.sample.consumer;

import java.util.ArrayList;
import java.util.List;

import service.sort.SortService;

/**
 * 
 * 
 * @author lwk
 * @version $Id: Main.java, v 0.1 2018-03-02 02:13:38 lwk Exp$
 */
public class Main {

    /**Methods
     * 
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("sort service consumer started.");
        List<Integer> data = new ArrayList<Integer>();
        data.add(5);
        data.add(3);
        data.add(10);
        data.add(2);
        data.add(8);

        SortService sortService = SortService.getProviderInstanceLazy();
        if (sortService != null) {
            sortService.sortList(data);
        }
        System.out.println(data);
        System.out.println("finish");
    }

}

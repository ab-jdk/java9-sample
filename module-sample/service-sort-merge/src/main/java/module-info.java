/*
 * www.qwfys.org Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
/**
 * 
 * 
 * @author lwk
 * @version $Id: module-info.java, v 0.1 2018-03-02 02:04:27 lwk Exp$
 */
module service.sort.merge {
    requires service.sort;
    provides service.sort.SortService with sort.impl.merge.MergeSort;
}
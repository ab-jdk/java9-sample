/*
 * www.qwfys.org Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
/**
 * 
 * 
 * @author lwk
 * @version $Id: module-info.java, v 0.1 2018-03-02 01:58:03 lwk Exp$
 */
module service.sort.bubble {
    requires service.sort;
    provides service.sort.SortService with sort.impl.bubble.BubbleSort;
}
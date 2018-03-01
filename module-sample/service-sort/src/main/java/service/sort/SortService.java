/*
 * www.qwfys.org Inc.
 * Copyright (c) 2004-2018 All Rights Reserved.
 */
package service.sort;

import java.util.List;
import java.util.ServiceLoader;
import java.util.ServiceLoader.Provider;
import java.util.stream.Stream;

/**
 * 
 * 
 * @author lwk
 * @version $Id: SortService.java, v 0.1 2018-03-02 01:56:28 lwk Exp$
 */
public interface SortService {

    public <T extends Comparable> List<T> sortList(List<T> list);

    public static SortService getProviderInstanceLazy() {
        Stream<Provider<SortService>> providers = ServiceLoader.load(SortService.class).stream();
        //provider方法等到get的时候才会实例化
        SortService service = providers.map(Provider::get).findAny().orElse(null);
        return service;
    }

}

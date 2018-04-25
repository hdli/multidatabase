package com.example.multidatabase.db;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 配置动态数据源
 * Created by lihuidong on 2018-4-25.
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return DataSourceHolder.getDataSource();
    }
}

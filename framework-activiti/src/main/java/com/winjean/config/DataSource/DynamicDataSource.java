package com.winjean.config.DataSource;

import org.springframework.jdbc.datasource.lookup.AbstractRoutingDataSource;

/**
 * 项目名称：
 * 类名称：<....>
 * 类描述：<....>
 * 创建人：winjean
 * 创建时间：2018/11/27 15:15
 * 修改人：winjean
 * 修改时间：2018/11/27 15:15
 * 修改备注：
 * 版权所有权：
 *
 * @version V1.0
 */
public class DynamicDataSource extends AbstractRoutingDataSource {

    @Override
    protected Object determineCurrentLookupKey() {
        return  DataSourceContextHolder.getDataSource();
    }
}

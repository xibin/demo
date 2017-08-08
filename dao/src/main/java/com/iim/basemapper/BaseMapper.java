package com.iim.basemapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * Created by xibin on 2017/8/8.
 */
public interface BaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}

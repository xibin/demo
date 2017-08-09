package com.iim.service.base;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by xibin on 2017/8/9.
 */
@Service
public interface IService<T> {

    T selectByKey(Object key);

    int save(T entity);

    int delete(Object key);

    int update(T entity);

    List<T> selectAll();

    List<T> selectByCondition(Object condition);
}

package cn.lhz.common.service;

import cn.lhz.common.entity.BaseEntity;
import com.github.pagehelper.PageInfo;

/**
 * @author Neo
 * @date 2019/12/8 1:06
 */
public interface BaseService<T extends BaseEntity>
{
    int insert(T t);

    int delete(T t);

    int update(T t);

    T selectOne(T t);

    PageInfo<T> page(int pageNum,int pageSize,T t);

    int count(T t);
}
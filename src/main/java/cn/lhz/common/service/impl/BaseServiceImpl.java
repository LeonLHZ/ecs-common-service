package cn.lhz.common.service.impl;

import cn.lhz.common.entity.BaseEntity;
import cn.lhz.common.service.BaseService;
import com.github.pagehelper.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.MyMapper;

/**
 * @author Neo
 * @date 2019/12/8 1:08
 */
@Service
@Transactional(readOnly = true)
public class BaseServiceImpl<T extends BaseEntity,M extends MyMapper<T>> implements BaseService<T>
{
    @Autowired
    private M mapper;
    public BaseServiceImpl()
    {
    }

    @Override
    @Transactional(readOnly = false)
    public int insert(T t)
    {
        return mapper.insert(t);
    }

    @Override
    @Transactional(readOnly = false)
    public int delete(T t)
    {
        return mapper.delete(t);
    }

    @Override
    @Transactional(readOnly = false)
    public int update(T t)
    {
        return mapper.updateByPrimaryKey(t);
    }

    @Override
    public T selectOne(T t)
    {
        return mapper.selectOne(t);
    }

    @Override
    public PageInfo<T> page(int pageNum, int pageSize,T t)
    {
        PageHelper pageHelper = new PageHelper();
        PageHelper.startPage(pageNum, pageSize);

        PageInfo<T> pageInfo = new PageInfo<>(mapper.select(t));
        return pageInfo;
    }

    @Override
    public int count(T t)
    {
        return mapper.selectCount(t);
    }
}

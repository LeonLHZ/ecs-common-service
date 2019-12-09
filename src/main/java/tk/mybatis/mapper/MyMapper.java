package tk.mybatis.mapper;

/**
 * @author Neo
 * @date 2019/12/5 21:14
 */

import cn.lhz.common.entity.BaseEntity;
import cn.lhz.common.utils.RedisCache;
import org.apache.ibatis.annotations.CacheNamespace;
import tk.mybatis.mapper.common.*;

/**
 * 自己的 Mapper
 * 特别注意，该接口不能被扫描到，否则会出错
 * <p>Title: MyMapper</p>
 * <p>Description: </p>
 *
 * @author Lusifer
 * @version 1.0.0
 * @date 2018/5/29 0:57
 */
@CacheNamespace(implementation = RedisCache.class)
public interface MyMapper<T extends BaseEntity> extends Mapper<T>, MySqlMapper<T>
{
}

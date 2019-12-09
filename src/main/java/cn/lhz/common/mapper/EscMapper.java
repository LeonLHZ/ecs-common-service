package cn.lhz.common.mapper;

import cn.lhz.common.entity.Esc;
import tk.mybatis.mapper.MyMapper;

public interface EscMapper extends MyMapper<Esc>{

    int addEsc(Esc esc);

    int updateEsc(Esc esc);

    int deleteEsc(String escId);

}
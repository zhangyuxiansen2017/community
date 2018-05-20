package cn.zhangguimin.community.dao;

import cn.zhangguimin.community.po.NotifyPo;
import cn.zhangguimin.community.po.NotifyPoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface NotifyPoMapper {
    long countByExample(NotifyPoExample example);

    int deleteByExample(NotifyPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(NotifyPo record);

    int insertSelective(NotifyPo record);

    List<NotifyPo> selectByExample(NotifyPoExample example);

    NotifyPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") NotifyPo record, @Param("example") NotifyPoExample example);

    int updateByExample(@Param("record") NotifyPo record, @Param("example") NotifyPoExample example);

    int updateByPrimaryKeySelective(NotifyPo record);

    int updateByPrimaryKey(NotifyPo record);
}
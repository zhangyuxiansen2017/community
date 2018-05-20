package cn.zhangguimin.community.dao;

import cn.zhangguimin.community.po.ChannelPo;
import cn.zhangguimin.community.po.ChannelPoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ChannelPoMapper {
    long countByExample(ChannelPoExample example);

    int deleteByExample(ChannelPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ChannelPo record);

    int insertSelective(ChannelPo record);

    List<ChannelPo> selectByExample(ChannelPoExample example);

    ChannelPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ChannelPo record, @Param("example") ChannelPoExample example);

    int updateByExample(@Param("record") ChannelPo record, @Param("example") ChannelPoExample example);

    int updateByPrimaryKeySelective(ChannelPo record);

    int updateByPrimaryKey(ChannelPo record);
}
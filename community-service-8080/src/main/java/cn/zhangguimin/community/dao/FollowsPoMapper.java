package cn.zhangguimin.community.dao;

import cn.zhangguimin.community.po.FollowsPo;
import cn.zhangguimin.community.po.FollowsPoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FollowsPoMapper {
    long countByExample(FollowsPoExample example);

    int deleteByExample(FollowsPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FollowsPo record);

    int insertSelective(FollowsPo record);

    List<FollowsPo> selectByExample(FollowsPoExample example);

    FollowsPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FollowsPo record, @Param("example") FollowsPoExample example);

    int updateByExample(@Param("record") FollowsPo record, @Param("example") FollowsPoExample example);

    int updateByPrimaryKeySelective(FollowsPo record);

    int updateByPrimaryKey(FollowsPo record);
}
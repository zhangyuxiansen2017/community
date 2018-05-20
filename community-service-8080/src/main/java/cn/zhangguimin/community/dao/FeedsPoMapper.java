package cn.zhangguimin.community.dao;

import cn.zhangguimin.community.po.FeedsPo;
import cn.zhangguimin.community.po.FeedsPoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FeedsPoMapper {
    long countByExample(FeedsPoExample example);

    int deleteByExample(FeedsPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FeedsPo record);

    int insertSelective(FeedsPo record);

    List<FeedsPo> selectByExample(FeedsPoExample example);

    FeedsPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FeedsPo record, @Param("example") FeedsPoExample example);

    int updateByExample(@Param("record") FeedsPo record, @Param("example") FeedsPoExample example);

    int updateByPrimaryKeySelective(FeedsPo record);

    int updateByPrimaryKey(FeedsPo record);
}
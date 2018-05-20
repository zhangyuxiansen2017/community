package cn.zhangguimin.community.dao;

import cn.zhangguimin.community.po.LogsPo;
import cn.zhangguimin.community.po.LogsPoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface LogsPoMapper {
    long countByExample(LogsPoExample example);

    int deleteByExample(LogsPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(LogsPo record);

    int insertSelective(LogsPo record);

    List<LogsPo> selectByExample(LogsPoExample example);

    LogsPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") LogsPo record, @Param("example") LogsPoExample example);

    int updateByExample(@Param("record") LogsPo record, @Param("example") LogsPoExample example);

    int updateByPrimaryKeySelective(LogsPo record);

    int updateByPrimaryKey(LogsPo record);
}
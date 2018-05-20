package cn.zhangguimin.community.dao;

import cn.zhangguimin.community.po.ConfigPo;
import cn.zhangguimin.community.po.ConfigPoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface ConfigPoMapper {
    long countByExample(ConfigPoExample example);

    int deleteByExample(ConfigPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(ConfigPo record);

    int insertSelective(ConfigPo record);

    List<ConfigPo> selectByExample(ConfigPoExample example);

    ConfigPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") ConfigPo record, @Param("example") ConfigPoExample example);

    int updateByExample(@Param("record") ConfigPo record, @Param("example") ConfigPoExample example);

    int updateByPrimaryKeySelective(ConfigPo record);

    int updateByPrimaryKey(ConfigPo record);
}
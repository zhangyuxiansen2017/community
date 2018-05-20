package cn.zhangguimin.community.dao;

import cn.zhangguimin.community.po.OpenOauthPo;
import cn.zhangguimin.community.po.OpenOauthPoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface OpenOauthPoMapper {
    long countByExample(OpenOauthPoExample example);

    int deleteByExample(OpenOauthPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(OpenOauthPo record);

    int insertSelective(OpenOauthPo record);

    List<OpenOauthPo> selectByExample(OpenOauthPoExample example);

    OpenOauthPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") OpenOauthPo record, @Param("example") OpenOauthPoExample example);

    int updateByExample(@Param("record") OpenOauthPo record, @Param("example") OpenOauthPoExample example);

    int updateByPrimaryKeySelective(OpenOauthPo record);

    int updateByPrimaryKey(OpenOauthPo record);
}
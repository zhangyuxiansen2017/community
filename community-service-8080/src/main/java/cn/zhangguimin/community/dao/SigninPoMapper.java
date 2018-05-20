package cn.zhangguimin.community.dao;

import cn.zhangguimin.community.po.SigninPo;
import cn.zhangguimin.community.po.SigninPoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface SigninPoMapper {
    long countByExample(SigninPoExample example);

    int deleteByExample(SigninPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SigninPo record);

    int insertSelective(SigninPo record);

    List<SigninPo> selectByExample(SigninPoExample example);

    SigninPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SigninPo record, @Param("example") SigninPoExample example);

    int updateByExample(@Param("record") SigninPo record, @Param("example") SigninPoExample example);

    int updateByPrimaryKeySelective(SigninPo record);

    int updateByPrimaryKey(SigninPo record);
}
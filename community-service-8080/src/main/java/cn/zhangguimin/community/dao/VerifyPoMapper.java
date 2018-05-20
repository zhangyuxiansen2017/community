package cn.zhangguimin.community.dao;

import cn.zhangguimin.community.po.VerifyPo;
import cn.zhangguimin.community.po.VerifyPoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface VerifyPoMapper {
    long countByExample(VerifyPoExample example);

    int deleteByExample(VerifyPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(VerifyPo record);

    int insertSelective(VerifyPo record);

    List<VerifyPo> selectByExample(VerifyPoExample example);

    VerifyPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") VerifyPo record, @Param("example") VerifyPoExample example);

    int updateByExample(@Param("record") VerifyPo record, @Param("example") VerifyPoExample example);

    int updateByPrimaryKeySelective(VerifyPo record);

    int updateByPrimaryKey(VerifyPo record);
}
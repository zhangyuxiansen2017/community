package cn.zhangguimin.community.dao;

import cn.zhangguimin.community.po.FavorsPo;
import cn.zhangguimin.community.po.FavorsPoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface FavorsPoMapper {
    long countByExample(FavorsPoExample example);

    int deleteByExample(FavorsPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(FavorsPo record);

    int insertSelective(FavorsPo record);

    List<FavorsPo> selectByExample(FavorsPoExample example);

    FavorsPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") FavorsPo record, @Param("example") FavorsPoExample example);

    int updateByExample(@Param("record") FavorsPo record, @Param("example") FavorsPoExample example);

    int updateByPrimaryKeySelective(FavorsPo record);

    int updateByPrimaryKey(FavorsPo record);
}
package cn.zhangguimin.community.dao;

import cn.zhangguimin.community.po.MenuPo;
import cn.zhangguimin.community.po.MenuPoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface MenuPoMapper {
    long countByExample(MenuPoExample example);

    int deleteByExample(MenuPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(MenuPo record);

    int insertSelective(MenuPo record);

    List<MenuPo> selectByExample(MenuPoExample example);

    MenuPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") MenuPo record, @Param("example") MenuPoExample example);

    int updateByExample(@Param("record") MenuPo record, @Param("example") MenuPoExample example);

    int updateByPrimaryKeySelective(MenuPo record);

    int updateByPrimaryKey(MenuPo record);
}
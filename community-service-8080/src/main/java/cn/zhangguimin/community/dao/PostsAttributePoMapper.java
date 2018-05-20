package cn.zhangguimin.community.dao;

import cn.zhangguimin.community.po.PostsAttributePo;
import cn.zhangguimin.community.po.PostsAttributePoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PostsAttributePoMapper {
    long countByExample(PostsAttributePoExample example);

    int deleteByExample(PostsAttributePoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PostsAttributePo record);

    int insertSelective(PostsAttributePo record);

    List<PostsAttributePo> selectByExampleWithBLOBs(PostsAttributePoExample example);

    List<PostsAttributePo> selectByExample(PostsAttributePoExample example);

    PostsAttributePo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PostsAttributePo record, @Param("example") PostsAttributePoExample example);

    int updateByExampleWithBLOBs(@Param("record") PostsAttributePo record, @Param("example") PostsAttributePoExample example);

    int updateByExample(@Param("record") PostsAttributePo record, @Param("example") PostsAttributePoExample example);

    int updateByPrimaryKeySelective(PostsAttributePo record);

    int updateByPrimaryKeyWithBLOBs(PostsAttributePo record);

    int updateByPrimaryKey(PostsAttributePo record);
}
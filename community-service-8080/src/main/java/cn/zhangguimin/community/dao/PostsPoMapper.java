package cn.zhangguimin.community.dao;

import cn.zhangguimin.community.po.PostsPo;
import cn.zhangguimin.community.po.PostsPoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface PostsPoMapper {
    long countByExample(PostsPoExample example);

    int deleteByExample(PostsPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(PostsPo record);

    int insertSelective(PostsPo record);

    List<PostsPo> selectByExample(PostsPoExample example);

    PostsPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") PostsPo record, @Param("example") PostsPoExample example);

    int updateByExample(@Param("record") PostsPo record, @Param("example") PostsPoExample example);

    int updateByPrimaryKeySelective(PostsPo record);

    int updateByPrimaryKey(PostsPo record);
}
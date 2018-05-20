package cn.zhangguimin.community.dao;

import cn.zhangguimin.community.po.CommentsPo;
import cn.zhangguimin.community.po.CommentsPoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
@Mapper
public interface CommentsPoMapper {
    long countByExample(CommentsPoExample example);

    int deleteByExample(CommentsPoExample example);

    int deleteByPrimaryKey(Long id);

    int insert(CommentsPo record);

    int insertSelective(CommentsPo record);

    List<CommentsPo> selectByExample(CommentsPoExample example);

    CommentsPo selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") CommentsPo record, @Param("example") CommentsPoExample example);

    int updateByExample(@Param("record") CommentsPo record, @Param("example") CommentsPoExample example);

    int updateByPrimaryKeySelective(CommentsPo record);

    int updateByPrimaryKey(CommentsPo record);
}
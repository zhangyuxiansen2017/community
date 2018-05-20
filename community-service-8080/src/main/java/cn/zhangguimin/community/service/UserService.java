package cn.zhangguimin.community.service;

import java.util.List;

import cn.zhangguimin.community.po.UserPo;
import cn.zhangguimin.community.vo.UserVo;

public interface UserService {
	public Integer add(UserPo po);

	public Integer deleteUser(Long id);

	public UserVo updateUser(UserPo po);

	public List<UserVo> list();

	public UserVo get(Integer id);
}

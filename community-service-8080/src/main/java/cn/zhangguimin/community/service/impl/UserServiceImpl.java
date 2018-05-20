package cn.zhangguimin.community.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;
import cn.zhangguimin.community.dao.UserPoMapper;
import cn.zhangguimin.community.po.UserPo;
import cn.zhangguimin.community.service.UserService;
import cn.zhangguimin.community.utils.BeanMapUtils;
import cn.zhangguimin.community.vo.UserVo;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	private UserPoMapper mapper;

	public Integer add(UserPo po) {
		Integer i = mapper.insertSelective(po);
		return i;
	}

	@CacheEvict(value = "user", key = "#id")
	public Integer deleteUser(Long id) {
		Integer i = mapper.deleteByPrimaryKey(id);
		return i;
	}

	@CachePut(value = "user", key = "#result.id")
	public UserVo updateUser(UserPo po) {
		mapper.updateByPrimaryKeySelective(po);
		return BeanMapUtils.copy(po);
	}

	public List<UserVo> list() {
		List<UserPo> po = mapper.selectByExample(null);
		List<UserVo> vo = new ArrayList<>();
		po.forEach(p -> {
			vo.add(BeanMapUtils.copy(p));
		});
		return vo;
	}
	@Cacheable(value="user",key="#id")
	public UserVo get(Integer id) {
		UserPo po=mapper.selectByPrimaryKey(1l);
		return BeanMapUtils.copy(po);
	}
}

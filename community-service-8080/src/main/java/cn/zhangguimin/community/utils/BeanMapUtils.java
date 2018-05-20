package cn.zhangguimin.community.utils;

import org.springframework.beans.BeanUtils;
import cn.zhangguimin.community.po.UserPo;
import cn.zhangguimin.community.vo.UserVo;

public class BeanMapUtils {
	public static String[] USER_IGNORE = new String[] { "loginName", "", "password", "roleId", "status", "type",
			"created" };

	public static String[] POST_IGNORE_LIST = new String[] { "markdown", "content" };

	public static UserVo copy(UserPo po) {
		if (po == null) {
			return null;
		}
		UserVo vo = new UserVo();
		BeanUtils.copyProperties(po, vo, USER_IGNORE);

		/*
		 * if (level > 0) { List<RolePO> rolePOs = po.getRoles(); List<Role> roles = new
		 * ArrayList<Role>(); for (RolePO rolePo : rolePOs) { Role role = copy(rolePo);
		 * roles.add(role); } ret.setRoles(roles); }
		 */
		return vo;
	}

}

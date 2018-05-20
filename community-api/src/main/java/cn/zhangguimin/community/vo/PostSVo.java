package cn.zhangguimin.community.vo;

import java.io.Serializable;

import cn.zhangguimin.community.po.ChannelPo;
import cn.zhangguimin.community.po.PostsAttributePo;
import cn.zhangguimin.community.po.PostsPo;

public class PostSVo extends PostsPo implements Serializable {
	private static final long serialVersionUID = 1L;
	private UserVo userVo;
	private ChannelPo channelPo;
	private PostsAttributePo attributePo;

	public UserVo getUserVo() {
		return userVo;
	}

	public void setUserVo(UserVo userVo) {
		this.userVo = userVo;
	}

	public ChannelPo getChannelPo() {
		return channelPo;
	}

	public void setChannelPo(ChannelPo channelPo) {
		this.channelPo = channelPo;
	}

	public PostsAttributePo getAttributePo() {
		return attributePo;
	}

	public void setAttributePo(PostsAttributePo attributePo) {
		this.attributePo = attributePo;
	}

}

package cn.zhangguimin.community.vo;

import java.io.Serializable;
import java.util.Date;

public class UserVo implements Serializable {
	private static final long serialVersionUID = 1L;

	private Long id;

	private String userName;

	private String mobile;

	private String email;

	private String avatar;

	private Date lastLogin;

	private Integer gender;

	private Integer comments;
	
	private Integer activeEmail;

	private Integer fans;

	private Integer favors;

	private Integer follows;

	private Integer posts;

	private Date signature;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getActiveEmail() {
		return activeEmail;
	}

	public void setActiveEmail(Integer activeEmail) {
		this.activeEmail = activeEmail;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAvatar() {
		return avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	public Date getLastLogin() {
		return lastLogin;
	}

	public void setLastLogin(Date lastLogin) {
		this.lastLogin = lastLogin;
	}

	public Integer getGender() {
		return gender;
	}

	public void setGender(Integer gender) {
		this.gender = gender;
	}

	public Integer getComments() {
		return comments;
	}

	public void setComments(Integer comments) {
		this.comments = comments;
	}

	public Integer getFans() {
		return fans;
	}

	public void setFans(Integer fans) {
		this.fans = fans;
	}

	public Integer getFavors() {
		return favors;
	}

	public void setFavors(Integer favors) {
		this.favors = favors;
	}

	public Integer getFollows() {
		return follows;
	}

	public void setFollows(Integer follows) {
		this.follows = follows;
	}

	public Integer getPosts() {
		return posts;
	}

	public void setPosts(Integer posts) {
		this.posts = posts;
	}

	public Date getSignature() {
		return signature;
	}

	public void setSignature(Date signature) {
		this.signature = signature;
	}
}

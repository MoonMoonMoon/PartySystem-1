package cn.edu.cqu.party.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * 管理员表
 * @author RongchenLiu
 *
 */
@Entity
public class Admin {
	/**
	 * 逻辑主键，自增长
	 */
	@Id
	@GeneratedValue
	private Long id;
	/**
	 * 登录账号
	 */
	@Column(nullable=false,unique=true,length=50)
	private String account;
	/**
	 * 密码
	 */
	@Column(nullable=false,length=50)
	private String pwd;
	/**
	 * 权限
	 */
	@Column(nullable=false)
	private int authority;
	/**
	 * 姓名
	 */
	@Column(nullable=false,length=50)
	private String name;
	/**
	 * 职位
	 */
	@Column(nullable=false,length=50)
	private String postion;
	/**
	 * 学校
	 */
	@ManyToOne(optional=false)
	private School school;
	/**
	 * 学院
	 */
	@ManyToOne(optional=false)
	private College college;
	
	public School getSchool() {
		return school;
	}
	public void setSchool(School school) {
		this.school = school;
	}
	public College getCollege() {
		return college;
	}
	public void setCollege(College college) {
		this.college = college;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAccount() {
		return account;
	}
	public void setAccount(String account) {
		this.account = account;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	public int getAuthority() {
		return authority;
	}
	public void setAuthority(int authority) {
		this.authority = authority;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPostion() {
		return postion;
	}
	public void setPostion(String postion) {
		this.postion = postion;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((account == null) ? 0 : account.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Admin other = (Admin) obj;
		if (account == null) {
			if (other.account != null)
				return false;
		} else if (!account.equals(other.account))
			return false;
		return true;
	}
	
	
}

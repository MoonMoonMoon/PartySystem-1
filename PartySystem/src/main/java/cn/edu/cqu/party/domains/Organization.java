package cn.edu.cqu.party.domains;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
/**
 * 组织表
 * @author RongchenLiu
 *
 */
@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = { "children_id","name"}) })
public class Organization {
	/**
	 * 逻辑主键，自增长
	 */
	@Id
	@GeneratedValue
	private Long id;
	/**
	 * 组织名
	 */
	@Column(nullable=false,unique=true,length=50)
	private String name;
	/**
	 * 兄弟节点
	 */
	@ManyToOne(optional=false)
	private Organization brother;
	/**
	 * 孩子节点
	 */
	@ManyToOne(optional=false)
	private Organization children;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Organization getBrother() {
		return brother;
	}
	public void setBrother(Organization brother) {
		this.brother = brother;
	}
	public Organization getChildren() {
		return children;
	}
	public void setChildren(Organization children) {
		this.children = children;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((children == null) ? 0 : children.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Organization other = (Organization) obj;
		if (children == null) {
			if (other.children != null)
				return false;
		} else if (!children.equals(other.children))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}

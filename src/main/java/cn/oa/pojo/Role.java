package cn.oa.pojo;

import java.util.Date;

public class Role{

    /**
     * 主键
     */
	private Long roleId;
    /**
     * 角色名称
     */
	private String roleName;
    /**
     * 状态(0正常，1锁定)
     */
	private Integer status;
    /**
     * 上级角色
     */
	private Long pid;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 最后修改时间
     */
	private Date updateTime;
	
	public Long getRoleId() {
		return roleId;
	}
	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Long getPid() {
		return pid;
	}
	public void setPid(Long pid) {
		this.pid = pid;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "Role [roleId=" + roleId + ", roleName=" + roleName + ", status=" + status + ", pid=" + pid
				+ ", createTime=" + createTime + ", updateTime=" + updateTime + "]";
	}

	
}


package cn.oa.pojo;
import java.util.Date;

/**
 * <p>
 * 权限表
 * </p>
 *
 * @author 金延春
 * @since 2017-10-15
 */
public class Rights {

    /**
     * 权限ID主键
     */
	private Long rightId;
    /**
     * 权限名称
     */
	private String rightName;
    /**
     * 权限地址
     */
	private String rightSite;
    /**
     * 上级权限
     */
	private Long pid;
    /**
     * 权限类型（0菜单，1按钮）
     */
	private Integer type;
    /**
     * 是否锁定（0正常，1锁定）
     */
	private Integer isLock;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 最后修改时间
     */
	private Date updateTime;


	public Long getRightId() {
		return rightId;
	}

	public void setRightId(Long rightId) {
		this.rightId = rightId;
	}

	public String getRightName() {
		return rightName;
	}

	public void setRightName(String rightName) {
		this.rightName = rightName;
	}

	public String getRightSite() {
		return rightSite;
	}

	public void setRightSite(String rightSite) {
		this.rightSite = rightSite;
	}

	public Long getPid() {
		return pid;
	}

	public void setPid(Long pid) {
		this.pid = pid;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public Integer getIsLock() {
		return isLock;
	}

	public void setIsLock(Integer isLock) {
		this.isLock = isLock;
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
		return "Rights{" +
			"rightsId=" + rightId +
			", rightsName=" + rightName +
			", rightsSite=" + rightSite +
			", pid=" + pid +
			", type=" + type +
			", isLock=" + isLock +
			", createTime=" + createTime +
			", updateTime=" + updateTime +
			"}";
	}
}

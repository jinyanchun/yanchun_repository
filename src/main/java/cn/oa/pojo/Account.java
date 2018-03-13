package cn.oa.pojo;

import java.util.Date;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * <p>
 * 账户表
 * </p>
 *
 * @author 金延春
 * @since 2017-10-15
 */
public class Account{

    /**
     * 主键ID
     */
    private Long accountId;
    /**
     * 账户名
     */
	private String accountName;
    /**
     * 昵称
     */
	private String nickName;
    /**
     * 头像
     */
	private String headUrl;
    /**
     * 创建时间
     */
	private Date createTime;
    /**
     * 最后修改时间
     */
	private Date updateTime;
    /**
     * 是否锁定(0否，1是)
     */
	private Integer isLock;
    /**
     * 密码
     */
	private String password;
    /**
     * 性别（0未知，1男，2女）
     */
	private Integer sex;
	
	public Long getAccountId() {
		return accountId;
	}
	public void setAccountId(Long accountId) {
		this.accountId = accountId;
	}
	public String getAccountName() {
		return accountName;
	}
	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getHeadUrl() {
		return headUrl;
	}
	public void setHeadUrl(String headUrl) {
		this.headUrl = headUrl;
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
	public Integer getIsLock() {
		return isLock;
	}
	public void setIsLock(Integer isLock) {
		this.isLock = isLock;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Integer getSex() {
		return sex;
	}
	public void setSex(Integer sex) {
		this.sex = sex;
	}
	@Override
	public String toString() {
		return "Account [accountId=" + accountId + ", accountName=" + accountName + ", nickName=" + nickName
				+ ", headUrl=" + headUrl + ", createTime=" + createTime + ", updateTime=" + updateTime + ", isLock="
				+ isLock + ", password=" + password + ", sex=" + sex + "]";
	}
}

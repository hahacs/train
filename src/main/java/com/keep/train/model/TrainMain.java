package com.keep.train.model;

import java.util.Date;

public class TrainMain {

	/**主键 */
	private String autoId;
	/**训练id */
	private String projcetNo;
	/**训练项目 */
	private String projectName;
	/**描述 */
	private String description;
	/**备注 */
	private String remark;
	/**创建时间 */
	private Date createTime;
	/**更新时间 */
	private Date updateTime;
	
	public String getAutoId() {
		return autoId;
	}
	public void setAutoId(String autoId) {
		this.autoId = autoId;
	}
	public String getProjcetNo() {
		return projcetNo;
	}
	public void setProjcetNo(String projcetNo) {
		this.projcetNo = projcetNo;
	}
	public String getProjectName() {
		return projectName;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
	
}

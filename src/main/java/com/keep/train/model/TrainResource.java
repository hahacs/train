package com.keep.train.model;

public class TrainResource {

	private String autoId;
	private String projcetNo;
	private int type;
	private String path;
	private String remark;
	
	public String getProjcetNo() {
		return projcetNo;
	}
	public void setProjcetNo(String projcetNo) {
		this.projcetNo = projcetNo;
	}
	
	public String getAutoId() {
		return autoId;
	}
	public void setAutoId(String autoId) {
		this.autoId = autoId;
	}
	public int getType() {
		return type;
	}
	public void setType(int type) {
		this.type = type;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	
}

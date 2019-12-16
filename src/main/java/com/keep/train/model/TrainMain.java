package com.keep.train.model;

import java.util.Date;

public class TrainMain {

	private String id;
	private String trainTitle; 
	private String trainContent; 
	private String trainType; 
	private Long trainTimes; 
	private String trainAllTime; 
	private Date lastTrainTime; 
	private Date date_created; 
	private String remark; 
	private String planFlag;
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getTrainTitle() {
		return trainTitle;
	}
	public void setTrainTitle(String trainTitle) {
		this.trainTitle = trainTitle;
	}
	public String getTrainContent() {
		return trainContent;
	}
	public void setTrainContent(String trainContent) {
		this.trainContent = trainContent;
	}
	public String getTrainType() {
		return trainType;
	}
	public void setTrainType(String trainType) {
		this.trainType = trainType;
	}
	public Long getTrainTimes() {
		return trainTimes;
	}
	public void setTrainTimes(Long trainTimes) {
		this.trainTimes = trainTimes;
	}
	public String getTrainAllTime() {
		return trainAllTime;
	}
	public void setTrainAllTime(String trainAllTime) {
		this.trainAllTime = trainAllTime;
	}
	public Date getLastTrainTime() {
		return lastTrainTime;
	}
	public void setLastTrainTime(Date lastTrainTime) {
		this.lastTrainTime = lastTrainTime;
	}
	public Date getDate_created() {
		return date_created;
	}
	public void setDate_created(Date date_created) {
		this.date_created = date_created;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPlanFlag() {
		return planFlag;
	}
	public void setPlanFlag(String planFlag) {
		this.planFlag = planFlag;
	}
	
	
	
}

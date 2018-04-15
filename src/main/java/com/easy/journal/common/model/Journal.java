package com.easy.journal.common.model;

import java.sql.Date;

public class Journal {
	
	private String uuid;
	
	private int belongWeek;
	
	private String creatorUUID;
	
	private String taskType;
	
	private String functionDescription;
	
	private Date PlanDate;
	
	private int schedule1;
	
	private int schedule2;
	
	private int schedule3;
	
	private int schedule4;
	
	private int schedule5;
	
	private int schedule6;
	
	private int schedule7;
	
	private java.util.Date createTime;
	
	private java.util.Date updateTime;
	
	private String column1;
	
	private String column2;

	
	/**
	 * setter and getter
	 */
	public int getBelongWeek() {
		return belongWeek;
	}

	public void setBelongWeek(int belongWeek) {
		this.belongWeek = belongWeek;
	}

	public String getColumn1() {
		return column1;
	}

	public void setColumn1(String column1) {
		this.column1 = column1;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getCreatorUUID() {
		return creatorUUID;
	}

	public void setCreatorUUID(String creatorUUID) {
		this.creatorUUID = creatorUUID;
	}

	public String getTaskType() {
		return taskType;
	}

	public void setTaskType(String taskType) {
		this.taskType = taskType;
	}

	public String getFunctionDescription() {
		return functionDescription;
	}

	public void setFunctionDescription(String functionDescription) {
		this.functionDescription = functionDescription;
	}

	public Date getPlanDate() {
		return PlanDate;
	}

	public void setPlanDate(Date planDate) {
		PlanDate = planDate;
	}

	public int getSchedule1() {
		return schedule1;
	}

	public void setSchedule1(int schedule1) {
		this.schedule1 = schedule1;
	}

	public int getSchedule2() {
		return schedule2;
	}

	public void setSchedule2(int schedule2) {
		this.schedule2 = schedule2;
	}

	public int getSchedule3() {
		return schedule3;
	}

	public void setSchedule3(int schedule3) {
		this.schedule3 = schedule3;
	}

	public int getSchedule4() {
		return schedule4;
	}

	public void setSchedule4(int schedule4) {
		this.schedule4 = schedule4;
	}

	public int getSchedule5() {
		return schedule5;
	}

	public void setSchedule5(int schedule5) {
		this.schedule5 = schedule5;
	}

	public int getSchedule6() {
		return schedule6;
	}

	public void setSchedule6(int schedule6) {
		this.schedule6 = schedule6;
	}

	public int getSchedule7() {
		return schedule7;
	}

	public void setSchedule7(int schedule7) {
		this.schedule7 = schedule7;
	}

	public java.util.Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(java.util.Date createTime) {
		this.createTime = createTime;
	}

	public java.util.Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(java.util.Date updateTime) {
		this.updateTime = updateTime;
	}

	public String getColumn2() {
		return column2;
	}

	public void setColumn2(String column2) {
		this.column2 = column2;
	}
	
	
	
}

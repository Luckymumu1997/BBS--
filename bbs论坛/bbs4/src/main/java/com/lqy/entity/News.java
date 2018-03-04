package com.lqy.entity;

import java.io.Serializable;
import java.util.Date;

public class News implements Serializable{
	private Integer id;
	private String title;
	private String content;
	private Date publishDate;
	private Integer browseCount;
	private Integer userId;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getPublishDate() {
		return publishDate;
	}
	public void setPublishDate(Date publishDate) {
		this.publishDate = publishDate;
	}
	public Integer getBrowseCount() {
		return browseCount;
	}
	public void setBrowseCount(Integer browseCount) {
		this.browseCount = browseCount;
	}
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	

}

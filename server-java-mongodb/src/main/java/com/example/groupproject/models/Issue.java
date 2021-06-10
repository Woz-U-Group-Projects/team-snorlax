package com.example.groupproject.models;

import org.springframework.data.annotation.Id;

public class Issue {

	@Id
	private int  id;
	private String title;
	private String description;
	private String date;
	private String status;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getStatus() {
		return  status;
	}
	public void setStatus(String status) {
		this.status = status;
	}

	
	
}

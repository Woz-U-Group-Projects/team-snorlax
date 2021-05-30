package com.example.groupproject.models;

import org.springframework.data.annotation.Id;

public class Issue {

	@Id
	private String id;
	private String name;
	private boolean complete;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public boolean isComplete() {
		return complete;
	}
	public void setComplete(boolean complete) {
		this.complete = complete;
	}
	
	
}

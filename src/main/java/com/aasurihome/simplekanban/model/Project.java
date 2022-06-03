package com.aasurihome.simplekanban.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Project {
	
	private int id; 
	private User user; 
	private String name;
	private String description;
	private List<Task> tasks;
	
	// TODO: temporary code for id-generation, not thread-safe, to be replaced
	private static int projectIdCounter = 0;
	
	public Project(User user, String name, String description) {
		this.id = ++projectIdCounter;
		this.user = user;
		this.name = name;
		this.description = description;
		this.tasks = new ArrayList<Task>();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Task> getTasks() {
		return Collections.unmodifiableList(tasks);
	}
	
	public void addTask(Task task) {
		tasks.add(task);
	}
}

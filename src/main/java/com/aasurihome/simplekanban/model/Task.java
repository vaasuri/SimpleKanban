package com.aasurihome.simplekanban.model;

public class Task {

	public enum Status {
		UNKNOWN(0),
		TODO(1),
		STARTED(2),
		COMPLETED(3);
		
		private int value;
		
		private Status(int value) {
			this.value = value;
		}
		
		public int getValue() {
			return value;
		}
	}
	
	private int id;
	private String description;
	private Status status;
	private Project project;

	// TODO: temporary code for id-generation, not thread-safe, to be replaced	
	private static int taskIdCounter = 0;
		
	public Task(Project project, String description, Status status) {
		this.id = ++taskIdCounter;
		this.project = project;
		this.description = description;
		this.status = status;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}

	public Project getProject() {
		return project;
	}

	public void setProject(Project project) {
		this.project = project;
	}
	
}

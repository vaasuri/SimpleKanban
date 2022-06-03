package com.aasurihome.simplekanban.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User {
	
	private List<Project> projects;
	
	public User() {
		this.projects = new ArrayList<Project>(); 
	}

	public List<Project> getProjects() {
		return Collections.unmodifiableList(projects);
	}

	public void addProject(Project project) {
		this.projects.add(project);
	}
}

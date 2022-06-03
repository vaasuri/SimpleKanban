package com.aasurihome.simplekanban.service;

import java.util.List;

import com.aasurihome.simplekanban.model.Project;
import com.aasurihome.simplekanban.model.User;

public interface ProjectService {
	
	List<Project> getProjects(User user);

	Project createProject(User user, String name, String description);

	Project getProject(User user, int projectId);
	
	Project saveProject(Project project);
}

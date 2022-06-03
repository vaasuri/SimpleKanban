package com.aasurihome.simplekanban.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aasurihome.simplekanban.model.Project;
import com.aasurihome.simplekanban.model.User;
import com.aasurihome.simplekanban.service.ProjectService;

@Service
public class InMemoryProjectService implements ProjectService {

	@Override
	public List<Project> getProjects(User user) {
		return user.getProjects();
	}

	@Override
	public Project createProject(User user, String name, String description) {
		Project project = new Project(user, name, description);
		user.addProject(project);
		return project;
	}

	@Override
	public Project getProject(User user, int projectId) {
		List<Project> projects = user.getProjects();
		for (Project project : projects) {
			if (project.getId() == projectId)
				return project;
		}
		return null;
	}

	@Override
	public Project saveProject(Project project) {
		// no-op in an in-memory implementation
		return project;
	}

}

package com.aasurihome.simplekanban.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aasurihome.simplekanban.model.Project;
import com.aasurihome.simplekanban.model.Task;
import com.aasurihome.simplekanban.model.Task.Status;
import com.aasurihome.simplekanban.service.TaskService;

@Service
public class InMemoryTaskService implements TaskService {

	@Override
	public Task createTask(Project project, String description, Status status) {
		Task task = new Task(project, description, status);
		project.addTask(task);
		return task;
	}

	@Override
	public Task getTask(Project project, int taskId) {
		List<Task> tasks = project.getTasks();
		for (Task task : tasks) {
			if (task.getId() == taskId)
				return task;
		}
		return null;
	}

	@Override
	public Task saveTask(Task task) {
		// no-op for an in-memory implementation
		return task;
	}
}

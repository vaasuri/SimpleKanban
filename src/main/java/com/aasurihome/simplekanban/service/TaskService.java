package com.aasurihome.simplekanban.service;

import com.aasurihome.simplekanban.model.Project;
import com.aasurihome.simplekanban.model.Task;

public interface TaskService {

	Task createTask(Project project, String description, Task.Status status);
	
	Task getTask(Project project, int taskId);
	
	Task saveTask(Task task);
}

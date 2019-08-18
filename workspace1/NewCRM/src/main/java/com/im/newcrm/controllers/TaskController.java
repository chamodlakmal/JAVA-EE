package com.im.newcrm.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.im.newcrm.entities.Task;


@RestController
@CrossOrigin(origins="*",allowedHeaders="*",maxAge=3600)
public class TaskController {
	@Autowired
	private com.im.newcrm.repositories.TaskRepository taskRepository;
	
	

	
	@GetMapping("/tasks")
	public List<com.im.newcrm.entities.Task> getTask()
	{
		return taskRepository.findAll();
	}
	@GetMapping("/task/{id}")
	public com.im.newcrm.entities.Task getTask(@PathVariable Long id)
	{
		return taskRepository.findById(id).get();
	}
	@DeleteMapping("/task/{id}")
	public boolean deleteTask(@PathVariable Long id)
	{
		taskRepository.deleteById(id);
		return true;
	}
	@PostMapping("/task")
	public Task createTask(Task task)
	{
		return taskRepository.save(task);
	}
	
	@PutMapping("/task")
	public Task updateTask(Task task)
	{
		return taskRepository.save(task);
	}

}

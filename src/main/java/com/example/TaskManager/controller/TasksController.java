package com.example.TaskManager.controller;

import com.example.TaskManager.model.Task;
import com.example.TaskManager.service.TasksService;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class TasksController
{
    private TasksService tasksService;

     public TasksController()
     {
         this.tasksService = new TasksService();
     }

    @GetMapping("/tasks")
    public ArrayList<Task> showAllTasks()
    {
        return tasksService.showAllTasks();
    }

    @GetMapping("/task")
    public String searchTask(@RequestParam int index)
    {
        return tasksService.searchTask(index);
    }

    @PostMapping("/task/add")
    public String addTask(@RequestParam String title, @RequestParam String description, @RequestParam boolean completed)
    {
        return tasksService.addTask(title, description, completed);
    }

    @PutMapping("/task/complete")
    public String isCompleted(@RequestParam int index)
    {
        return tasksService.isCompleted(index);
    }

    @DeleteMapping("/task/delete")
    public String deleteTask(@RequestParam int id)
    {
        return tasksService.deleteTask(id);
    }

    @GetMapping("/tasks/completed")
    public ArrayList<Task> showCompletedTasks()
    {
        return tasksService.showCompletedTasks();
    }


}

package com.example.TaskManager.service;

import com.example.TaskManager.model.Task;

import java.util.ArrayList;

public class TasksService
{
    private ArrayList<Task> tasks = new ArrayList<>();

    //show all the tasks
    public ArrayList<Task> showAllTasks()
    {
        return tasks;
    }

    //return a single task by id
    public String searchTask(int index)
    {
        if(index<0 || index>tasks.size())
        {
            return "this Task doesn't exist";
        }
        else
        {
            return tasks.get(index).getInfos();
        }
    }

    //add a new task to the list of tasks
    public String addTask(String title, String description, boolean completed)
    {
        Task newTask = new Task(0,"*","*",false);
        if(title == null || description == null)
        {
            return "missing information!";
        }
        else
        {
            newTask.setId(tasks.size());
            newTask.setTitle(title);
            newTask.setDescription(description);
            newTask.setCompleted(completed);
            tasks.add(newTask);
            return newTask.getInfos();
        }
    }

    //mark a task as done
    public String isCompleted(int index)
    {
        if(index<0 || index>=tasks.size())
        {
            return String.format("the index is wrong! \n choose an in dex between 0 ans %d",tasks.size());
        }
        tasks.get(index).setCompleted(true);
        return "the task is already done";
    }

    //delete task by id
    public String deleteTask(int index)
    {
        if(index<0 || index>tasks.size())
        {
            return String.format("the index is wrong! \n choose an in dex between 0 ans %d",tasks.size());
        }
        tasks.remove(index);
        return "deletion done succesfully";
    }

    //return completed tasks
    public ArrayList<Task> showCompletedTasks()
    {
        ArrayList<Task> completedTasks = new ArrayList<>();
        for(int i = 0; i <tasks.size(); i++)
        {
            if(tasks.get(i).isCompleted())
            {
                completedTasks.add(tasks.get(i));
            }
        }
        return completedTasks;
    }
}

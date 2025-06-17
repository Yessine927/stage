package com.example.TaskManager.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task
{
    private int id;
    private String title;
    private String description;
    private boolean completed;

    public String getInfos()
    {
        return String.format("%d | \n title : %s \n description : %s \n completed : %b",this.id,this.title,this.description,this.completed);
    }
}

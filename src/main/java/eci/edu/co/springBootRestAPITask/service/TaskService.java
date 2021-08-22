package eci.edu.co.springBootRestAPITask.service;

import eci.edu.co.springBootRestAPITask.data.Task;

import java.util.List;

public interface TaskService
{
    public Task create(Task task);
    public Task findById(String id);
    public List<Task> all();
    public void deleteById(String id);
    public Task update(Task task, String id);
}

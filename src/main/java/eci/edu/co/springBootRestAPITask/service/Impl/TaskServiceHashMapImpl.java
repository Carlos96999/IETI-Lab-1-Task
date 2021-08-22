package eci.edu.co.springBootRestAPITask.service.Impl;

import eci.edu.co.springBootRestAPITask.data.Task;
import eci.edu.co.springBootRestAPITask.service.TaskService;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Service
public class TaskServiceHashMapImpl implements TaskService
{
    private HashMap<String, Task> tasks;

    public TaskServiceHashMapImpl()
    {
        tasks = new HashMap();
    }

    @Override
    public Task create(Task task) {
        return tasks.put(task.getId(), task);
    }

    @Override
    public Task findById(String id) {
        return tasks.get(id);
    }

    @Override
    public List<Task> all() {
        return new ArrayList<Task>(tasks.values());
    }

    @Override
    public void deleteById(String id) {
        tasks.remove(id);
    }

    @Override
    public Task update(Task task, String id) {
        return tasks.put(id, task);
    }
}

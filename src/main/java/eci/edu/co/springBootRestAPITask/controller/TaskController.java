package eci.edu.co.springBootRestAPITask.controller;

import eci.edu.co.springBootRestAPITask.data.Task;
import eci.edu.co.springBootRestAPITask.dto.TaskDto;
import eci.edu.co.springBootRestAPITask.service.TaskService;
import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/v1/task")
public class TaskController
{
    private final TaskService taskService;

    public TaskController(TaskService taskService) {
        this.taskService = taskService;
    }

    @GetMapping
    @ResponseBody
    public ResponseEntity<List<Task>> all()
    {
        return ResponseEntity.status(HttpStatus.OK).body(taskService.all());
    }

    @GetMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Task> findById(@PathVariable String id)
    {
        return ResponseEntity.status(HttpStatus.OK).body(taskService.findById(id));
    }

    @PostMapping
    @ResponseBody
    public ResponseEntity<Task> create(@RequestBody TaskDto taskDto)
    {
        return ResponseEntity.status(HttpStatus.OK).body(taskService.create(new Task(taskDto)));
    }

    @PutMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Task> update(@RequestBody TaskDto taskDto, @PathVariable String id) {
        return ResponseEntity.status(HttpStatus.OK).body(taskService.update(new Task(taskDto, id), id));
    }

    @DeleteMapping("/{id}")
    @ResponseBody
    public ResponseEntity<Boolean> delete(@PathVariable String id)
    {
        try{
            taskService.deleteById(id);
            return ResponseEntity.status(HttpStatus.OK).body(true);
        } catch(Exception e){
            return ResponseEntity.status(HttpStatus.OK).body(false);
        }
    }

}

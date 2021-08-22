package eci.edu.co.springBootRestAPITask.data;

import eci.edu.co.springBootRestAPITask.collections.Status;

public class Task
{
    private String id;
    private String name;
    private Status status;
    private String assignedTo;
    private String dueDate;
    private String created;

    public Task(String id, String name, Status status, String assignedTo, String dueDate, String created)
    {
        this.id = id;
        this.name = name;
        this.status = status;
        this.assignedTo = assignedTo;
        this.dueDate = dueDate;
        this.created = created;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public String getAssignedTo() {
        return assignedTo;
    }

    public void setAssignedTo(String assignedTo) {
        this.assignedTo = assignedTo;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }
}

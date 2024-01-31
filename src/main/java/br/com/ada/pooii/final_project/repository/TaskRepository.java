package br.com.ada.pooii.final_project.repository;

import br.com.ada.pooii.final_project.model.BaseTask;

import java.util.ArrayList;
import java.util.List;

public class TaskRepository {

    private List<BaseTask<?>> tasks;

    public TaskRepository() {
        this.tasks = new ArrayList<>();
    }

    public boolean addTask(BaseTask<?> task) {
        return tasks.add(task);
    }

    public List<BaseTask<?>> getAllTasks() {
        return new ArrayList<>(tasks);
    }
    public void setAllTasks(List<BaseTask<?>> tasks) {
        this.tasks = new ArrayList<>(tasks);
    }

}

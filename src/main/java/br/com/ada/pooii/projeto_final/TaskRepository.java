package br.com.ada.pooii.projeto_final;

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

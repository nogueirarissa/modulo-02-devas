package br.com.ada.pooii.final_project.service;

import br.com.ada.pooii.final_project.model.BaseTask;
import br.com.ada.pooii.final_project.model.PersonalTask;
import br.com.ada.pooii.final_project.model.StudyTask;
import br.com.ada.pooii.final_project.model.WorkTask;
import br.com.ada.pooii.final_project.repository.TaskRepository;

import java.util.*;

public class TaskService <T> {

    //Dependency inversion
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }


    public boolean createTask(String title, String description, String deadline, String taskType, String tag) {
        switch (taskType.toLowerCase()) {
            case "personal":
                return taskRepository.addTask(new PersonalTask(title, description, deadline, taskType, tag));
            case "work":
                return taskRepository.addTask(new WorkTask(title, description, deadline, tag));
            case "study":
                return taskRepository.addTask(new StudyTask(title, description, deadline, tag));
            default:
                System.out.println("Invalid task type. Supported types: personal, work, study");
                return false;
        }
    }

    public void updateTask(String title, String description, String deadline, String taskType) {
        List<BaseTask<?>> tasks = taskRepository.getAllTasks();

        tasks.stream()
                .filter(task -> task.getTitle().equals(title) && task.getTaskType().equals(taskType))
                .findFirst()
                .ifPresent(existingTask -> {
                    existingTask.setDescription(description);
                    existingTask.setDeadline(deadline);
                });
    }

    public boolean deleteTask(int index) {
        List<BaseTask<?>> tasks = taskRepository.getAllTasks();

        if (index >= 0 && index < tasks.size()) {
            BaseTask<?> removedTask = tasks.remove(index);
            System.out.println("Chosen task to deletion: " + removedTask.getTitle() + " " + tasks.isEmpty());
            taskRepository.setAllTasks(tasks);
            return true;
        } else {
            System.out.println("Invalid index. Task not found or couldn't be deleted.");
            return false;
        }

    }
    public List<String> viewAllTasksWithIndex() {
        List<BaseTask<?>> allTasks = taskRepository.getAllTasks();
        List<String> taskDetails = new ArrayList<>();

        if (allTasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            for (int i = 0; i < allTasks.size(); i++) {
                BaseTask<?> task = allTasks.get(i);
                String taskInfo = "Id: " + i + " - Title: " + task.getTitle() + ", Description: " + task.getDescription();
                taskDetails.add(taskInfo);
            }
        }

        return taskDetails;
    }
    public List<String> viewAllTasks() {
        List<BaseTask<?>> allTasks = taskRepository.getAllTasks();
        List<String> taskDetails = new ArrayList<>();

        if (allTasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            for (BaseTask<?> task : allTasks) {
                String taskInfo = "Title: " + task.getTitle() + ", Description: " + task.getDescription();
                taskDetails.add(taskInfo);
            }
        }

        return taskDetails;
    }

    public <U> List<BaseTask<U>> searchTasksByTag(String tag, Class<U> taskType) {
        if (tag == null || taskType == null) {
            // Handle null parameters if needed
            return Collections.emptyList();
        }

        List<BaseTask<?>> allTasks = taskRepository.getAllTasks();
        List<BaseTask<U>> tasksWithTag = new ArrayList<>();

        for (BaseTask<?> task : allTasks) {
            // Check both tag and taskType
            if (tag.equalsIgnoreCase(task.getTag()) && taskType.isInstance(task.getTaskType())) {
                tasksWithTag.add((BaseTask<U>) task);
            }
        }

        return tasksWithTag;
    }

    }

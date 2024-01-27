package br.com.ada.pooii.projeto_final;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public boolean deleteTask(String title, String taskType) {
        List<BaseTask<?>> tasks = taskRepository.getAllTasks();

        for (BaseTask<?> task : tasks) {
            if (task.getTitle().equals(title) && task.getTaskType().equals(taskType)) {
                tasks.remove(task);
                return true; // Task found and deleted
            }
        }

        return false; // Task not found or couldn't be deleted
    }

    public List<String> viewAllTasks() {
        List<BaseTask<?>> allTasks = taskRepository.getAllTasks();
        List<String> taskDetails = new ArrayList<>();

        if (allTasks.isEmpty()) {
            System.out.println("No tasks found.");
        } else {
            //System.out.println("All Tasks:");
            for (BaseTask<?> task : allTasks) {
                String taskInfo = "Title: " + task.getTitle() + ", Description: " + task.getDescription();
                taskDetails.add(taskInfo);

            }
        }

        return taskDetails;
    }

    public <U> List<BaseTask<U>> searchTasksByTag(String tag, Class<String> taskType) {
        if (tag == null || taskType == null) {
            // Handle null parameters if needed
            return Collections.emptyList();
        }

        List<BaseTask<?>> allTasks = taskRepository.getAllTasks();
        List<BaseTask<U>> tasksWithTag = new ArrayList<>();

        for (BaseTask<?> task : allTasks) {
            // Case-insensitive tag comparison
            if (taskType.isInstance(task) && tag.equalsIgnoreCase(task.getTag())) {
                tasksWithTag.add((BaseTask<U>) task);
            }
        }

        return tasksWithTag;
    }

    }

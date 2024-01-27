package br.com.ada.pooii.projeto_final;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskRepository {
        private List<BaseTask<?>> tasks;

        public TaskRepository() {
            this.tasks = new ArrayList<>();
        }

        public boolean addTask(BaseTask<?> task) {
            return tasks.add(task);
        }

        public boolean updateTask(String title, String description, String deadline, String taskType) {
            for (BaseTask<?> task : tasks) {
                if (task.getTitle().equals(title) && task.getTaskType().equals(taskType)) {
                    task.setDescription(description);
                    task.setDeadline(deadline);
                    return true; // Task found and updated
                }
            }
            return false; // Task not found or couldn't be updated
        }

        public boolean deleteTask(String title, String taskType) {
            return tasks.removeIf(task -> task.getTitle().equals(title) && task.getTaskType().equals(taskType));
        }

        public List<BaseTask<?>> getAllTasks() {
            return new ArrayList<>(tasks);
        }

    public <T> List<T> searchTasksByTag(String tag, Class<T> taskType) {
        System.out.println("Calling searchTasksByTag"); // Add this line for debugging

        return tasks.stream()
                .filter(task -> taskType.isInstance(task) && tag.equalsIgnoreCase(task.getTag()))
                .map(taskType::cast)
                .collect(Collectors.toList());
    }
    }



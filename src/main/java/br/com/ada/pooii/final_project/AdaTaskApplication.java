package br.com.ada.pooii.final_project;

import br.com.ada.pooii.final_project.controller.TaskController;
import br.com.ada.pooii.final_project.repository.TaskRepository;
import br.com.ada.pooii.final_project.service.TaskService;

public class AdaTaskApplication {

    public static void main(String[] args) {
        TaskRepository taskRepository = new TaskRepository();
        TaskService<String> taskService = new TaskService<>(taskRepository);
        TaskController taskController = new TaskController(taskService);


        taskController.startApp();
    }
}

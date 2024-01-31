package br.com.ada.pooii.projeto_final;

import br.com.ada.pooii.projeto_final.controller.TaskController;
import br.com.ada.pooii.projeto_final.repository.TaskRepository;
import br.com.ada.pooii.projeto_final.service.TaskService;

public class AdaTaskApplication {

    public static void main(String[] args) {
        TaskRepository taskRepository = new TaskRepository();
        TaskService<String> taskService = new TaskService<>(taskRepository);
        TaskController taskController = new TaskController(taskService);


        taskController.startApp();
    }
}

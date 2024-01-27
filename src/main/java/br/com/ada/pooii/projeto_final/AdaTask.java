package br.com.ada.pooii.projeto_final;

public class AdaTask {

    public static void main(String[] args) {
        TaskRepository taskRepository = new TaskRepository();
        TaskService taskService = new TaskService(taskRepository);
        TaskController taskController = new TaskController(taskService);


        taskController.startApp();
    }
}

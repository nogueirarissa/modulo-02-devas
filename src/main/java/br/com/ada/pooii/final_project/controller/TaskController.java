package br.com.ada.pooii.final_project.controller;

import br.com.ada.pooii.final_project.console.Console;
import br.com.ada.pooii.final_project.service.TaskService;
import br.com.ada.pooii.final_project.model.BaseTask;

import java.util.List;
import java.util.Scanner;

public class TaskController <T> implements Console {

    private TaskService<T> taskService;

    public TaskController(TaskService<T> taskService) {
        this.taskService = taskService;
    }

    public void startApp() {
        String choice;

        do {
            displayMenu();
            choice = getUserInput("Enter your choice");

            switch (choice) {
                case "1" -> createTask();
                case "2" -> updateTask();
                case "3" -> deleteTask();
                case "4" -> viewAllTasks();
                case "5" -> searchTasksByTag();
                case "6" -> System.out.println("Exiting AdaTask App. See you soon!");
                default -> System.out.println("Invalid choice :( \nPlease try again.");
            }

        } while (!choice.equals("5"));
    }

    //Creates a Task
    public void createTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter task details:");

        System.out.print("Title: ");
        String title = scanner.nextLine();

        System.out.print("Description: ");
        String description = scanner.nextLine();

        System.out.print("Deadline: ");
        String deadline = scanner.nextLine();

        System.out.print("Task Type (personal, work, study): ");
        String taskType = scanner.nextLine();

        System.out.print("Tag: ");
        String tag = scanner.nextLine();

        boolean created = taskService.createTask(title, description, deadline, taskType, tag);

        if (created) {
            System.out.println("Task created successfully!");
        } else {
            System.out.println("Error creating the task. Please try again.");
        }

    }

    //Updates a Task
    public void updateTask() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter task details for update:");

        System.out.print("Title of the task you wish to change: ");
        String title = scanner.nextLine();

        System.out.print("New Description: ");
        String newDescription = scanner.nextLine();

        System.out.print("New Deadline: ");
        String newDeadline = scanner.nextLine();

        System.out.print("Task Type (personal, work, study): ");
        String taskType = scanner.nextLine();

        // Call TaskService to update the task
        taskService.updateTask(title, newDescription, newDeadline, taskType);
        System.out.println("Task updated successfully!");
    }

    //Delete a Task

    public void deleteTask() {
        Scanner scanner = new Scanner(System.in);

        viewAllTasksWithIndex(); // Display tasks with indices

        System.out.println("Enter the index of the task to delete:");

        try {
            int index = Integer.parseInt(scanner.nextLine());

            // Call TaskService to delete the task
            boolean deleted = taskService.deleteTask(index);

            if (deleted) {
                System.out.println("Task deleted successfully!");
            } else {
                System.out.println("Invalid index. Task not found or couldn't be deleted.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid index.");
        }
    }

    private void viewAllTasksWithIndex() {
        List<String> taskDetails = taskService.viewAllTasksWithIndex();

        if (!taskDetails.isEmpty()) {
            System.out.println("Task Details with Index:");
            for (String taskInfo : taskDetails) {
                System.out.println(taskInfo);
            }
        }
    }

    private void viewAllTasks() {
        List<String> taskDetails = taskService.viewAllTasks();

        if (!taskDetails.isEmpty()) {
            System.out.println("Task Details:");
            for (String taskInfo : taskDetails) {
                System.out.println(taskInfo);
            }
        }
    }


    private void searchTasksByTag() {
        String tag = getUserInput("Enter the tag to search for");
        String taskType = getUserInput("Enter the task type (personal, work, study)");

        switch (taskType.toLowerCase()) {
            case "personal", "work", "study" -> {
                List<BaseTask<String>> tasksWithTag = taskService.searchTasksByTag(tag, String.class);
                displayTasks(tasksWithTag);
            }
            default -> System.out.println("Invalid task type. Supported types: personal, work, study");
        }
    }


        private <T > void displayTasks (List < BaseTask < T >> tasks) {
            if (!tasks.isEmpty()) {
                System.out.println("Tasks with the specified tag:");
                for (BaseTask<T> task : tasks) {
                    System.out.println("Title: " + task.getTitle() + ", Description: " + task.getDescription() +
                            ", Deadline: " + task.getDeadline() + ", Tag: " + task.getTag());
                }
            } else {
                System.out.println("No tasks found with the specified tag.");
            }
        }
    }

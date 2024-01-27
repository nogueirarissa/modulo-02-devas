package br.com.ada.pooii.projeto_final;

import java.util.Scanner;

public interface Console {
    Scanner scan = new Scanner(System.in);

    default void displayMenu() {
        System.out.println("================= AdaTask =================");
        System.out.println("=== Your Task Management App by Console ===");
        System.out.println("1. Create Task");
        System.out.println("2. Update Task");
        System.out.println("3. Delete Task");
        System.out.println("4. View All Tasks");
        System.out.println("5. Search Tasks by Tag");
        System.out.println("6. Exit");
        System.out.println("===========================================");
    }

    default String getUserInput(String prompt) {
        System.out.print(prompt + ": ");
        return scan.nextLine();
    }
}

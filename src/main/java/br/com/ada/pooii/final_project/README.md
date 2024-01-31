# AdaTask - Your Task Management App by Console

## Introduction

Welcome to AdaTask, a console-based task management application. This project provides a simple yet effective way to manage your tasks with support for personal, work, and study-related tasks.

## Table of Contents

1. [Project Overview](#project-overview)
2. [How to Run](#how-to-run)
3. [Class Structure](#class-structure)
4. [Usage](#usage)
5. [Contributing](#contributing)
6. [License](#license)

## Project Overview

This Java project, AdaTask, focuses on managing tasks through a console interface. It utilizes a layered architecture with separate classes for tasks, repositories, services, controllers, and the main application class.

## How to Run

1. Clone the project to your local machine:

   ````bash
   git clone https://github.com/nogueirarissa/modulo-02-devas
   
2. Navigate to the project directory:
   ````bash
   cd [the path of the directory such as C:/Users/YourUsername/...]/src/main/java/br/com/ada/pooii/final_project
   
3. Compile and run the main application:
   ````bash
   javac AdaTaskApplication.java
   java -cp out br.com.ada.pooii.final_project.AdaTaskApplication
   
5. If you have the IntelliJ in your computer:
   ````bash
   cd [the path of the directory such as C:/Users/YourUsername/...]/src/main/java/br/com/ada/pooii/final_project
   idea64.exe .
   ````
6. Navigate to the /src/main/java/br/com/ada/pooii/final_project -> AdaTaskApplication. Right-click in the run, or press ctrl + shift + F10.
   
8. Follow the on-screen menu to interact with the application.

# Class Structure

The project is structured into several packages:

**model:** Contains the BaseTask, PersonalTask, StudyTask, and WorkTask classes representing different types of tasks.

**repository:** Houses the TaskRepository class for storing and managing tasks.

**service:** Contains the TaskService class handling the business logic related to tasks.

**controller:** Includes the TaskController class for interacting with users through the console.

**console:** Defines the Console interface, providing methods for displaying a menu and getting user input.

**final_project:** The main package with the AdaTaskApplication class serves as the entry point.

# Usage
Follow the on-screen menu in the console interface to:

- Create tasks with different types (personal, work, study).
- Update task details.
- Delete tasks.
- View all tasks.
- Search tasks by tag.

# Contributing
Contributions are welcome! Feel free to open issues for bug reports or feature requests. Pull requests are encouraged.

# License
This project is licensed under the MIT License. Feel free to use, modify, and distribute it as per the license terms.
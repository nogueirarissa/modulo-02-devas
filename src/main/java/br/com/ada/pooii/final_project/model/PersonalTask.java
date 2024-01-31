package br.com.ada.pooii.final_project.model;


public class PersonalTask extends BaseTask <String> {
    public PersonalTask(String title, String description, String deadline, String taskType, String tag) {
        super(title, description, deadline, taskType, tag);
    }
}


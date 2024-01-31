package br.com.ada.pooii.projeto_final.model;


public class PersonalTask extends BaseTask <String> {
    public PersonalTask(String title, String description, String deadline, String taskType, String tag) {
        super(title, description, deadline, taskType, tag);
    }
}


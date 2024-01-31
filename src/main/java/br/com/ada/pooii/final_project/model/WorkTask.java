package br.com.ada.pooii.final_project.model;

public class WorkTask extends BaseTask <String>{

    public WorkTask(String title, String description, String deadline, String tag) {
        super(title, description, deadline, "work", tag);
    }
}

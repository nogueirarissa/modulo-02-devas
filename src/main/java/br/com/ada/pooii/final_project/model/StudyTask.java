package br.com.ada.pooii.final_project.model;

public class StudyTask extends BaseTask <String>{
    public StudyTask(String title, String description, String deadline, String tag) {
        super(title, description, deadline, "study", tag);
    }
}

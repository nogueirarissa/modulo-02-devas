package br.com.ada.pooii.projeto_final;

public class StudyTask extends BaseTask <String>{
    public StudyTask(String title, String description, String deadline, String tag) {
        super(title, description, deadline, "study", tag);
    }
}

package br.com.ada.pooii.projeto_final;

public class WorkTask extends BaseTask <String>{

    public WorkTask(String title, String description, String deadline, String tag) {
        super(title, description, deadline, "work", tag);
    }
}

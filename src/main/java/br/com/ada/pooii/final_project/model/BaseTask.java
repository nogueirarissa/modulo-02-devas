package br.com.ada.pooii.final_project.model;

public class BaseTask <T>  {
    private String title;
    private String description;
    private String deadline;
    private T taskType;
    private String tag;

    public BaseTask(String title, String description, String deadline, T taskType, String tag) {
        this.title = title;
        this.description = description;
        this.deadline = deadline;
        this.taskType = taskType;
        this.tag = tag;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeadline() {
        return deadline;
    }

    public void setDeadline(String deadline) {
        this.deadline = deadline;
    }

    public T getTaskType() {
        return taskType;
    }

    public void setTaskType(T taskType) {
        this.taskType = taskType;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }
    public String getTaskTypeAsString() {
        return String.valueOf(taskType);
    }
}

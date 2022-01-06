package practice;

public class TaskBuilder {
    private Integer id;
    private String summary;
    private String description;
    private String dueDate;

    public TaskBuilder(Integer id, String summary, String description, String dueDate) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.dueDate = dueDate;
    }

    public TaskBuilder() {
    }

    public TaskBuilder setId(Integer id) {
        this.id = id;
        return this;
    }

    public TaskBuilder setSummary(String summary) {
        this.summary = summary;
        return this;
    }

    public TaskBuilder setDescription(String description) {
        this.description = description;
        return this;
    }


    public TaskBuilder setDueDate(String dueDate) {
        this.dueDate = dueDate;
        return this;
    }

    public Task build() {
        return new Task(id, summary, description, dueDate);
    }
}

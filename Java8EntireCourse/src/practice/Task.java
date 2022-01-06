package practice;

public class Task {
    private Integer id;
    private String summary;
    private String description;
    private String dueDate;

    public Task(Integer id, String summary, String description, String dueDate) {
        this.id = id;
        this.summary = summary;
        this.description = description;
        this.dueDate = dueDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    @Override
    public String toString() {
        return "Task id" + " " + id + "    " + "Summary" + " " + summary + "    " + "Description" + " " + description + "    " + "Duedate" + " " + dueDate;
    }
}

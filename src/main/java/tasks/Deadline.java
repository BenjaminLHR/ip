package tasks;

public class Deadline extends Task {
    private String taskName;
    private String time;
    private String taskSymbol = "D";

    public Deadline(String taskName, String time) {
        this.taskName = taskName;
        this.time = time;
    }

    @Override
    public String toString() {
        String statusIcon = getStatusIcon();
        return String.format("[%s][%s] %s (by: %s)", taskSymbol, statusIcon, taskName, date);
    }

}

package stepik.naive_task_management;

public class Task {
    private final long number;
    private final int priority;

    public Task(long number, int priority) {
        this.number = number;
        this.priority = priority;
    }

    public long getNumber() {
        return number;
    }

    public int getPriority() {
        return priority;
    }

    @Override
    public String toString() {
        return "Task{" +
                "number=" + number +
                ", priority=" + priority +
                '}';
    }
}

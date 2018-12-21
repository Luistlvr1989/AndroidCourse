package pe.utec.cs.androidcourse.models;

public class Task {
    public String title;
    public Long time;

    public Task(String title) {
        this.title = title;
        this.time = System.currentTimeMillis();
    }
}

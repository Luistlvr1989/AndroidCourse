package pe.utec.cs.androidcourse.ui.main;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;

import java.util.List;

import pe.utec.cs.androidcourse.models.Task;

public class TasksAdapter extends RecyclerView.Adapter<TaskViewHolder> {
    private final List<Task> tasks;

    TasksAdapter(List<Task> tasks) {
        this.tasks = tasks;
    }

    @NonNull
    @Override
    public TaskViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return TaskViewHolder.create(parent);
    }

    @Override
    public void onBindViewHolder(@NonNull TaskViewHolder holder, int position) {
        Task task = tasks.get(position);
        holder.bindTo(task);
    }

    @Override
    public int getItemCount() {
        return tasks.size();
    }

    void addNewTask(Task task) {
        tasks.add(task);
        notifyDataSetChanged();
    }
}

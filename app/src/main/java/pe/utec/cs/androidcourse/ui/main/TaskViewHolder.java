package pe.utec.cs.androidcourse.ui.main;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.text.SimpleDateFormat;

import pe.utec.cs.androidcourse.R;
import pe.utec.cs.androidcourse.models.Task;

class TaskViewHolder extends RecyclerView.ViewHolder {
    static TaskViewHolder create(ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.row_task, parent, false);
        return new TaskViewHolder(view);
    }

    private TextView tvTitle;
    private TextView tvTime;

    private TaskViewHolder(View itemView) {
        super(itemView);

        tvTitle = itemView.findViewById(R.id.tvTitle);
        tvTime = itemView.findViewById(R.id.tvTime);
    }

    void bindTo(Task task) {
        tvTitle.setText(task.title);
        // TODO transformar millis a fecha (SimpleDateFormat)
        // tvTime.setText(task.time);
    }
}

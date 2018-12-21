package pe.utec.cs.androidcourse.ui.main;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.RecyclerView;
import android.view.View;

import java.util.ArrayList;
import java.util.List;

import pe.utec.cs.androidcourse.R;
import pe.utec.cs.androidcourse.models.Task;

@SuppressLint("LogNotTimber")
public class MainActivity extends AppCompatActivity implements MainContract.View {
    private static final String TAG = MainActivity.class.getSimpleName();

    private MainPresenter presenter;

    private RecyclerView rvTasks;
    private FloatingActionButton fabAdd;

    private TasksAdapter adapter;
    private List<Task> tasks = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new MainPresenter(this);
        setupUI();
    }

    private void setupUI() {
        rvTasks = findViewById(R.id.rvTasks);
        fabAdd = findViewById(R.id.fabAdd);

        adapter = new TasksAdapter(tasks);

        setupTasks();

        fabAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO mostrar diálogo para ingresar texto simple
                //adapter.addNewTask(new Task("New Title"));
                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Nueva tarea")
                        .setView(R.layout.activity_main)
                        .setMessage(R.string.text_message_add_task)
                        .setNegativeButton(android.R.string.cancel, null)
                        .setCancelable(false)
                        .show();
            }
        });
    }

    private void setupTasks() {
        rvTasks.hasFixedSize();
        rvTasks.setAdapter(adapter);
    }

    @Override
    public void updateText(String text) {

    }
}
